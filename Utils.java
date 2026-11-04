package com.blackhub.bronline.neizzir;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.os.StrictMode;
import android.provider.Settings;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
public class Utils {
    public static String host = "";

    public static void writeFile(Context context, File file, String text, String name) {
        try {
            file.createNewFile();
        } catch (Exception e) {
        }
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return;
        }
        File sdPath = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Alternative/CFG/");
        sdPath.mkdirs();
        File sdFile = new File(sdPath, name);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(sdFile));
            bw.write(text.trim());
            bw.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static String getHwid(Context ctx) {
        return Settings.Secure.getString(ctx.getContentResolver(), "android_id");
    }

    public static String getUser(Context ctx) {
        String hwid = getHwid(ctx);
        String androidid = Build.VERSION.RELEASE;
        String manufacter = Build.MANUFACTURER;
        String user = Build.USER;
        String host2 = Build.HOST;
        String brand = Build.BRAND;
        String heading = "|" + hwid + "-" + manufacter + "-" + brand + "-" + user + "-" + androidid + "-" + host2 + "|";
        return heading;
    }

    public static void initRequest() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

    public static void SetAssets(Context ctx, ImageView img, String path) {
        try {
            InputStream ims = ctx.getAssets().open(path);
            Drawable d = Drawable.createFromStream(ims, null);
            img.setImageDrawable(d);
            ims.close();
        } catch (IOException e) {
        }
    }

    public static Typeface font(Context ctx) {
        return Typeface.createFromAsset(ctx.getAssets(), "muller_bold.ttf");
    }

    public static Typeface font2(Context ctx) {
        return Typeface.createFromAsset(ctx.getAssets(), "Roboto-Regular.ttf");
    }

    /* JADX INFO: renamed from: dp */
    public static int m1421dp(Context context, float dp) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) ((dp * scale) + 0.5f);
    }

    public static String urlRequest(String str) {
        try {
            Request request = new Request.Builder().url(str).get().build();
            Response response = NetworkRuntime.INSTANCE.getApiClient().newCall(request).execute();
            try {
                if (response.getIsSuccessful() && response.body() != null) {
                    String strTrim = response.body().string().trim();
                    if (response != null) {
                        response.close();
                    }
                    return strTrim;
                }
                String str2 = "HTTP " + response.code();
                if (response != null) {
                    response.close();
                }
                return str2;
            } catch (Throwable th) {
                if (response != null) {
                    try {
                        response.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            return e.toString();
        }
    }

    public static void anim(View v, int time) {
        ObjectAnimator animation = ObjectAnimator.ofFloat(v, "alpha", 0.0f, 1.0f);
        animation.setDuration(time);
        animation.start();
    }

    public static void disanim(View v, int time) {
        ObjectAnimator animation = ObjectAnimator.ofFloat(v, "alpha", 1.0f, 0.0f);
        animation.setDuration(time);
        animation.start();
    }

    public static String getFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        }
        return "";
    }

    public static void log(Context ctx, String t) {
        Toast.makeText(ctx, t, 1).show();
    }

    public static String readFromFile(Context contect, File myFile) {
        String aBuffer = "";
        try {
            FileInputStream fIn = new FileInputStream(myFile);
            BufferedReader myReader = new BufferedReader(new InputStreamReader(fIn));
            while (true) {
                String aDataRow = myReader.readLine();
                if (aDataRow == null) {
                    break;
                }
                aBuffer = aBuffer + aDataRow + "\n";
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return aBuffer;
    }
}
