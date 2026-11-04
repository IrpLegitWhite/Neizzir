package com.blackhub.bronline.neizzir.fragments.custom.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.res.ResourcesCompat;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import com.blackhub.bronline.neizzir.network.NetworkImages;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.helpshift.proactive.InAppViewConstants;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DialogUtils.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J-\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J(\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00162\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\"\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\"\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\"\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002¨\u0006\u001c"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/custom/util/DialogUtils;", "", "()V", "createDialogContent", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "contentBuilder", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "dpToPx", "", CalendarKeys.DAYS_GAME_KEY, "showGridImageDialog", "files", "", "Ljava/io/File;", "title", "", "(Landroid/content/Context;[Ljava/io/File;Ljava/lang/String;)V", "imageUrls", "", "showImageDialog", "file", InAppViewConstants.IMAGE_URL, "showStyledDialog", "contentView", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class DialogUtils {
    public static final DialogUtils INSTANCE = new DialogUtils();

    private DialogUtils() {
    }

    public static /* synthetic */ void showImageDialog$default(DialogUtils dialogUtils, Context context, File file, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        dialogUtils.showImageDialog(context, file, str);
    }

    public final void showImageDialog(final Context context, final File file, String title) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        LinearLayout contentView = createDialogContent(context, new Function1<LinearLayout, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.DialogUtils$showImageDialog$contentView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LinearLayout linearLayout) {
                invoke2(linearLayout);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LinearLayout createDialogContent) {
                Intrinsics.checkNotNullParameter(createDialogContent, "$this$createDialogContent");
                MaterialCardView imageCard = new MaterialCardView(context);
                Context context2 = context;
                imageCard.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                imageCard.setRadius(DialogUtils.INSTANCE.dpToPx(context2, 12));
                imageCard.setCardElevation(0.0f);
                imageCard.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
                ImageView $this$invoke_u24lambda_u242 = new ImageView(context);
                File file2 = file;
                $this$invoke_u24lambda_u242.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                $this$invoke_u24lambda_u242.setAdjustViewBounds(true);
                $this$invoke_u24lambda_u242.setScaleType(ImageView.ScaleType.FIT_CENTER);
                Bitmap it = BitmapFactory.decodeFile(file2.getAbsolutePath());
                if (it != null) {
                    Intrinsics.checkNotNull(it);
                    $this$invoke_u24lambda_u242.setImageBitmap(it);
                }
                imageCard.addView($this$invoke_u24lambda_u242);
                createDialogContent.addView(imageCard);
            }
        });
        showStyledDialog(context, contentView, title);
    }

    public static /* synthetic */ void showImageDialog$default(DialogUtils dialogUtils, Context context, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        dialogUtils.showImageDialog(context, str, str2);
    }

    public final void showImageDialog(final Context context, final String imageUrl, String title) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        LinearLayout contentView = createDialogContent(context, new Function1<LinearLayout, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.DialogUtils$showImageDialog$contentView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LinearLayout linearLayout) {
                invoke2(linearLayout);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LinearLayout createDialogContent) {
                Intrinsics.checkNotNullParameter(createDialogContent, "$this$createDialogContent");
                MaterialCardView imageCard = new MaterialCardView(context);
                Context context2 = context;
                imageCard.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                imageCard.setRadius(DialogUtils.INSTANCE.dpToPx(context2, 12));
                imageCard.setCardElevation(0.0f);
                imageCard.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
                ImageView $this$invoke_u24lambda_u241 = new ImageView(context);
                $this$invoke_u24lambda_u241.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                $this$invoke_u24lambda_u241.setAdjustViewBounds(true);
                $this$invoke_u24lambda_u241.setScaleType(ImageView.ScaleType.FIT_CENTER);
                NetworkImages.INSTANCE.loadUrl($this$invoke_u24lambda_u241, imageUrl, (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : null, (124 & 16) != 0 ? false : false, (124 & 32) != 0 ? 17301579 : 0, (124 & 64) != 0 ? 17301579 : 0, (124 & 128) != 0 ? null : null, (124 & 256) != 0 ? null : null);
                imageCard.addView($this$invoke_u24lambda_u241);
                createDialogContent.addView(imageCard);
            }
        });
        showStyledDialog(context, contentView, title);
    }

    public static /* synthetic */ void showGridImageDialog$default(DialogUtils dialogUtils, Context context, File[] fileArr, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        dialogUtils.showGridImageDialog(context, fileArr, str);
    }

    public final void showGridImageDialog(final Context context, final File[] files, String title) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(files, "files");
        LinearLayout contentView = createDialogContent(context, new Function1<LinearLayout, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.DialogUtils$showGridImageDialog$contentView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LinearLayout linearLayout) {
                invoke2(linearLayout);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LinearLayout createDialogContent) {
                Intrinsics.checkNotNullParameter(createDialogContent, "$this$createDialogContent");
                ScrollView scrollView = new ScrollView(context);
                Context context2 = context;
                LinearLayout.LayoutParams $this$invoke_u24lambda_u241_u24lambda_u240 = new LinearLayout.LayoutParams(-1, -2);
                $this$invoke_u24lambda_u241_u24lambda_u240.topMargin = DialogUtils.INSTANCE.dpToPx(context2, 8);
                scrollView.setLayoutParams($this$invoke_u24lambda_u241_u24lambda_u240);
                GridLayout gridLayout = new GridLayout(context);
                gridLayout.setColumnCount(3);
                int i = 0;
                gridLayout.setPadding(0, 0, 0, 0);
                File[] fileArr = files;
                Context context3 = context;
                int $i$f$forEach = 0;
                int length = fileArr.length;
                while (i < length) {
                    File file = fileArr[i];
                    int cardSize = DialogUtils.INSTANCE.dpToPx(context3, 90);
                    MaterialCardView $this$invoke_u24lambda_u247_u24lambda_u244 = new MaterialCardView(context3);
                    GridLayout.LayoutParams $this$invoke_u24lambda_u247_u24lambda_u244_u24lambda_u243 = new GridLayout.LayoutParams();
                    $this$invoke_u24lambda_u247_u24lambda_u244_u24lambda_u243.width = cardSize;
                    $this$invoke_u24lambda_u247_u24lambda_u244_u24lambda_u243.height = cardSize;
                    File[] fileArr2 = fileArr;
                    int $i$f$forEach2 = $i$f$forEach;
                    int i2 = length;
                    $this$invoke_u24lambda_u247_u24lambda_u244_u24lambda_u243.setMargins(DialogUtils.INSTANCE.dpToPx(context3, 4), DialogUtils.INSTANCE.dpToPx(context3, 4), DialogUtils.INSTANCE.dpToPx(context3, 4), DialogUtils.INSTANCE.dpToPx(context3, 4));
                    $this$invoke_u24lambda_u247_u24lambda_u244.setLayoutParams($this$invoke_u24lambda_u247_u24lambda_u244_u24lambda_u243);
                    $this$invoke_u24lambda_u247_u24lambda_u244.setRadius(DialogUtils.INSTANCE.dpToPx(context3, 8));
                    $this$invoke_u24lambda_u247_u24lambda_u244.setCardElevation(0.0f);
                    $this$invoke_u24lambda_u247_u24lambda_u244.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
                    ImageView $this$invoke_u24lambda_u247_u24lambda_u246 = new ImageView(context3);
                    $this$invoke_u24lambda_u247_u24lambda_u246.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    $this$invoke_u24lambda_u247_u24lambda_u246.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    Bitmap it = BitmapFactory.decodeFile(file.getAbsolutePath());
                    if (it != null) {
                        Intrinsics.checkNotNull(it);
                        $this$invoke_u24lambda_u247_u24lambda_u246.setImageBitmap(it);
                    }
                    $this$invoke_u24lambda_u247_u24lambda_u244.addView($this$invoke_u24lambda_u247_u24lambda_u246);
                    gridLayout.addView($this$invoke_u24lambda_u247_u24lambda_u244);
                    i++;
                    fileArr = fileArr2;
                    $i$f$forEach = $i$f$forEach2;
                    length = i2;
                }
                scrollView.addView(gridLayout);
                createDialogContent.addView(scrollView);
            }
        });
        showStyledDialog(context, contentView, title);
    }

    public static /* synthetic */ void showGridImageDialog$default(DialogUtils dialogUtils, Context context, List list, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        dialogUtils.showGridImageDialog(context, (List<String>) list, str);
    }

    public final void showGridImageDialog(final Context context, final List<String> imageUrls, String title) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        LinearLayout contentView = createDialogContent(context, new Function1<LinearLayout, Unit>() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.DialogUtils$showGridImageDialog$contentView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LinearLayout linearLayout) {
                invoke2(linearLayout);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LinearLayout createDialogContent) {
                Intrinsics.checkNotNullParameter(createDialogContent, "$this$createDialogContent");
                ScrollView scrollView = new ScrollView(context);
                Context context2 = context;
                LinearLayout.LayoutParams $this$invoke_u24lambda_u241_u24lambda_u240 = new LinearLayout.LayoutParams(-1, -2);
                $this$invoke_u24lambda_u241_u24lambda_u240.topMargin = DialogUtils.INSTANCE.dpToPx(context2, 8);
                scrollView.setLayoutParams($this$invoke_u24lambda_u241_u24lambda_u240);
                GridLayout gridLayout = new GridLayout(context);
                gridLayout.setColumnCount(3);
                gridLayout.setPadding(0, 0, 0, 0);
                Iterable $this$forEach$iv = imageUrls;
                Context context3 = context;
                int $i$f$forEach = 0;
                for (Iterator it = $this$forEach$iv.iterator(); it.hasNext(); it = it) {
                    Object element$iv = it.next();
                    String imageUrl = (String) element$iv;
                    int cardSize = DialogUtils.INSTANCE.dpToPx(context3, 90);
                    MaterialCardView $this$invoke_u24lambda_u246_u24lambda_u244 = new MaterialCardView(context3);
                    GridLayout.LayoutParams $this$invoke_u24lambda_u246_u24lambda_u244_u24lambda_u243 = new GridLayout.LayoutParams();
                    $this$invoke_u24lambda_u246_u24lambda_u244_u24lambda_u243.width = cardSize;
                    $this$invoke_u24lambda_u246_u24lambda_u244_u24lambda_u243.height = cardSize;
                    int $i$f$forEach2 = $i$f$forEach;
                    $this$invoke_u24lambda_u246_u24lambda_u244_u24lambda_u243.setMargins(DialogUtils.INSTANCE.dpToPx(context3, 4), DialogUtils.INSTANCE.dpToPx(context3, 4), DialogUtils.INSTANCE.dpToPx(context3, 4), DialogUtils.INSTANCE.dpToPx(context3, 4));
                    $this$invoke_u24lambda_u246_u24lambda_u244.setLayoutParams($this$invoke_u24lambda_u246_u24lambda_u244_u24lambda_u243);
                    $this$invoke_u24lambda_u246_u24lambda_u244.setRadius(DialogUtils.INSTANCE.dpToPx(context3, 8));
                    $this$invoke_u24lambda_u246_u24lambda_u244.setCardElevation(0.0f);
                    $this$invoke_u24lambda_u246_u24lambda_u244.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
                    ImageView $this$invoke_u24lambda_u246_u24lambda_u245 = new ImageView(context3);
                    $this$invoke_u24lambda_u246_u24lambda_u245.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    $this$invoke_u24lambda_u246_u24lambda_u245.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    NetworkImages.INSTANCE.loadUrl($this$invoke_u24lambda_u246_u24lambda_u245, imageUrl, (124 & 4) != 0 ? null : Integer.valueOf(cardSize), (124 & 8) != 0 ? null : Integer.valueOf(cardSize), (124 & 16) != 0 ? false : true, (124 & 32) != 0 ? 17301579 : 0, (124 & 64) != 0 ? 17301579 : 0, (124 & 128) != 0 ? null : null, (124 & 256) != 0 ? null : null);
                    $this$invoke_u24lambda_u246_u24lambda_u244.addView($this$invoke_u24lambda_u246_u24lambda_u245);
                    gridLayout.addView($this$invoke_u24lambda_u246_u24lambda_u244);
                    $this$forEach$iv = $this$forEach$iv;
                    $i$f$forEach = $i$f$forEach2;
                }
                scrollView.addView(gridLayout);
                createDialogContent.addView(scrollView);
            }
        });
        showStyledDialog(context, contentView, title);
    }

    private final LinearLayout createDialogContent(Context context, Function1<? super LinearLayout, Unit> contentBuilder) {
        LinearLayout $this$createDialogContent_u24lambda_u240 = new LinearLayout(context);
        $this$createDialogContent_u24lambda_u240.setOrientation(1);
        $this$createDialogContent_u24lambda_u240.setPadding(INSTANCE.dpToPx(context, 20), INSTANCE.dpToPx(context, 20), INSTANCE.dpToPx(context, 20), INSTANCE.dpToPx(context, 20));
        $this$createDialogContent_u24lambda_u240.setBackgroundColor(Color.parseColor("#121217"));
        contentBuilder.invoke($this$createDialogContent_u24lambda_u240);
        return $this$createDialogContent_u24lambda_u240;
    }

    private final void showStyledDialog(Context context, LinearLayout contentView, String title) {
        Typeface boldFont;
        try {
            boldFont = ResourcesCompat.getFont(context, C3715R.font.montserrat_extra_bold);
        } catch (Exception e) {
            boldFont = Typeface.DEFAULT_BOLD;
        }
        if (title != null) {
            TextView $this$showStyledDialog_u24lambda_u241 = new TextView(context);
            $this$showStyledDialog_u24lambda_u241.setText(title);
            $this$showStyledDialog_u24lambda_u241.setTextColor(-1);
            $this$showStyledDialog_u24lambda_u241.setTextSize(18.0f);
            $this$showStyledDialog_u24lambda_u241.setTypeface(boldFont);
            $this$showStyledDialog_u24lambda_u241.setPadding(0, 0, 0, INSTANCE.dpToPx(context, 16));
            contentView.addView($this$showStyledDialog_u24lambda_u241, 0);
        }
        MaterialButton $this$showStyledDialog_u24lambda_u243 = new MaterialButton(context);
        LinearLayout.LayoutParams $this$showStyledDialog_u24lambda_u243_u24lambda_u242 = new LinearLayout.LayoutParams(-1, INSTANCE.dpToPx(context, 44));
        $this$showStyledDialog_u24lambda_u243_u24lambda_u242.topMargin = INSTANCE.dpToPx(context, 16);
        $this$showStyledDialog_u24lambda_u243.setLayoutParams($this$showStyledDialog_u24lambda_u243_u24lambda_u242);
        $this$showStyledDialog_u24lambda_u243.setText("Закрыть");
        $this$showStyledDialog_u24lambda_u243.setTextColor(Color.parseColor("#0A0A0F"));
        $this$showStyledDialog_u24lambda_u243.setBackgroundColor(Color.parseColor("#00E5CC"));
        $this$showStyledDialog_u24lambda_u243.setCornerRadius(INSTANCE.dpToPx(context, 12));
        $this$showStyledDialog_u24lambda_u243.setAllCaps(false);
        $this$showStyledDialog_u24lambda_u243.setTypeface(boldFont);
        contentView.addView($this$showStyledDialog_u24lambda_u243);
        final AlertDialog dialog = new AlertDialog.Builder(context).setView(contentView).create();
        Intrinsics.checkNotNullExpressionValue(dialog, "create(...)");
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        $this$showStyledDialog_u24lambda_u243.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.custom.util.DialogUtils$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogUtils.showStyledDialog$lambda$4(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showStyledDialog$lambda$4(AlertDialog dialog, View it) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dpToPx(Context context, int dp) {
        return (int) (dp * context.getResources().getDisplayMetrics().density);
    }
}
