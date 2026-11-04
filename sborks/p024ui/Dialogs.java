package com.blackhub.bronline.neizzir.fragments.sborks.p024ui;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.p008ui.PlayerView;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import com.blackhub.bronline.neizzir.fragments.custom.manager.TCPSettingsManager;
import com.blackhub.bronline.neizzir.network.Endpoint;
import com.blackhub.bronline.neizzir.network.EndpointGroup;
import com.blackhub.bronline.neizzir.network.NetworkRuntime;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import io.ktor.sse.ServerSentEventKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: Dialogs.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007JD\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0007J\u001e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\nH\u0007J\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u00020\u0006H\u0002¨\u0006\u001e"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/Dialogs;", "", "()V", "createDownloadDialog", "Lcom/blackhub/bronline/neizzir/fragments/sborks/ui/DownloadDialogUi;", "context", "Landroid/content/Context;", "showDescriptionDialog", "", "title", "", "description", "showFaqDialog", "folderName", "updateDate", "faqText", "onPlayHitSounds", "Lkotlin/Function0;", "onPlayShootSounds", "showRoutedVideoDialog", "path", "initialEndpoint", "Lcom/blackhub/bronline/neizzir/network/Endpoint;", "showSubscriptionDialog", "telegramLinkRaw", "dpToPx", "", CalendarKeys.DAYS_GAME_KEY, "getBoldFont", "Landroid/graphics/Typeface;", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class Dialogs {
    public static final Dialogs INSTANCE = new Dialogs();

    private Dialogs() {
    }

    private final int dpToPx(Context $this$dpToPx, int dp) {
        return (int) (dp * $this$dpToPx.getResources().getDisplayMetrics().density);
    }

    private final Typeface getBoldFont(Context $this$getBoldFont) {
        return ResourcesCompat.getFont($this$getBoldFont, C3715R.font.montserrat_extra_bold);
    }

    public final DownloadDialogUi createDownloadDialog(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        Typeface boldFont = getBoldFont(context);
        FrameLayout root = new FrameLayout(context);
        root.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        root.setBackgroundColor(Color.parseColor("#B3000000"));
        MaterialCardView card = new MaterialCardView(context);
        FrameLayout.LayoutParams $this$createDownloadDialog_u24lambda_u243_u24lambda_u242 = new FrameLayout.LayoutParams(-1, -2);
        $this$createDownloadDialog_u24lambda_u243_u24lambda_u242.gravity = 17;
        $this$createDownloadDialog_u24lambda_u243_u24lambda_u242.setMarginStart(INSTANCE.dpToPx(context, 24));
        $this$createDownloadDialog_u24lambda_u243_u24lambda_u242.setMarginEnd(INSTANCE.dpToPx(context, 24));
        card.setLayoutParams($this$createDownloadDialog_u24lambda_u243_u24lambda_u242);
        card.setRadius(INSTANCE.dpToPx(context, 20));
        card.setCardElevation(INSTANCE.dpToPx(context, 8));
        card.setCardBackgroundColor(Color.parseColor("#121217"));
        card.setStrokeWidth(INSTANCE.dpToPx(context, 1));
        card.setStrokeColor(Color.parseColor("#1AFFFFFF"));
        LinearLayout $this$createDownloadDialog_u24lambda_u244 = new LinearLayout(context);
        $this$createDownloadDialog_u24lambda_u244.setOrientation(1);
        $this$createDownloadDialog_u24lambda_u244.setPadding(INSTANCE.dpToPx(context, 24), INSTANCE.dpToPx(context, 24), INSTANCE.dpToPx(context, 24), INSTANCE.dpToPx(context, 24));
        LinearLayout headerLayout = new LinearLayout(context);
        headerLayout.setOrientation(0);
        headerLayout.setGravity(16);
        MaterialCardView iconContainer = new MaterialCardView(context);
        iconContainer.setLayoutParams(new LinearLayout.LayoutParams(INSTANCE.dpToPx(context, 48), INSTANCE.dpToPx(context, 48)));
        iconContainer.setRadius(INSTANCE.dpToPx(context, 12));
        iconContainer.setCardElevation(0.0f);
        iconContainer.setCardBackgroundColor(Color.parseColor("#1A00E5CC"));
        ImageView $this$createDownloadDialog_u24lambda_u248 = new ImageView(context);
        FrameLayout.LayoutParams $this$createDownloadDialog_u24lambda_u248_u24lambda_u247 = new FrameLayout.LayoutParams(INSTANCE.dpToPx(context, 24), INSTANCE.dpToPx(context, 24));
        $this$createDownloadDialog_u24lambda_u248_u24lambda_u247.gravity = 17;
        $this$createDownloadDialog_u24lambda_u248.setLayoutParams($this$createDownloadDialog_u24lambda_u248_u24lambda_u247);
        $this$createDownloadDialog_u24lambda_u248.setImageResource(C3715R.drawable.neizzir20_ic_download);
        $this$createDownloadDialog_u24lambda_u248.setColorFilter(Color.parseColor("#00E5CC"));
        iconContainer.addView($this$createDownloadDialog_u24lambda_u248);
        LinearLayout $this$createDownloadDialog_u24lambda_u2410 = new LinearLayout(context);
        $this$createDownloadDialog_u24lambda_u2410.setOrientation(1);
        LinearLayout.LayoutParams $this$createDownloadDialog_u24lambda_u2410_u24lambda_u249 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$createDownloadDialog_u24lambda_u2410_u24lambda_u249.setMarginStart(INSTANCE.dpToPx(context, 14));
        $this$createDownloadDialog_u24lambda_u2410.setLayoutParams($this$createDownloadDialog_u24lambda_u2410_u24lambda_u249);
        TextView $this$createDownloadDialog_u24lambda_u2411 = new TextView(context);
        $this$createDownloadDialog_u24lambda_u2411.setText("Загрузка сборки");
        $this$createDownloadDialog_u24lambda_u2411.setTextColor(-1);
        $this$createDownloadDialog_u24lambda_u2411.setTextSize(18.0f);
        $this$createDownloadDialog_u24lambda_u2411.setTypeface(boldFont);
        TextView $this$createDownloadDialog_u24lambda_u2412 = new TextView(context);
        $this$createDownloadDialog_u24lambda_u2412.setText("Пожалуйста, подождите...");
        $this$createDownloadDialog_u24lambda_u2412.setTextColor(Color.parseColor(TCPSettingsManager.COLOR_HINT));
        $this$createDownloadDialog_u24lambda_u2412.setTextSize(12.0f);
        $this$createDownloadDialog_u24lambda_u2410.addView($this$createDownloadDialog_u24lambda_u2411);
        $this$createDownloadDialog_u24lambda_u2410.addView($this$createDownloadDialog_u24lambda_u2412);
        headerLayout.addView(iconContainer);
        headerLayout.addView($this$createDownloadDialog_u24lambda_u2410);
        $this$createDownloadDialog_u24lambda_u244.addView(headerLayout);
        View $this$createDownloadDialog_u24lambda_u2414 = new View(context);
        LinearLayout.LayoutParams $this$createDownloadDialog_u24lambda_u2414_u24lambda_u2413 = new LinearLayout.LayoutParams(-1, INSTANCE.dpToPx(context, 1));
        $this$createDownloadDialog_u24lambda_u2414_u24lambda_u2413.topMargin = INSTANCE.dpToPx(context, 20);
        $this$createDownloadDialog_u24lambda_u2414_u24lambda_u2413.bottomMargin = INSTANCE.dpToPx(context, 20);
        $this$createDownloadDialog_u24lambda_u2414.setLayoutParams($this$createDownloadDialog_u24lambda_u2414_u24lambda_u2413);
        $this$createDownloadDialog_u24lambda_u2414.setBackgroundColor(Color.parseColor("#1AFFFFFF"));
        $this$createDownloadDialog_u24lambda_u244.addView($this$createDownloadDialog_u24lambda_u2414);
        TextView $this$createDownloadDialog_u24lambda_u2415 = new TextView(context);
        $this$createDownloadDialog_u24lambda_u2415.setText("Подготовка к загрузке...");
        $this$createDownloadDialog_u24lambda_u2415.setTextColor(-1);
        $this$createDownloadDialog_u24lambda_u2415.setTextSize(14.0f);
        $this$createDownloadDialog_u24lambda_u2415.setGravity(17);
        $this$createDownloadDialog_u24lambda_u244.addView($this$createDownloadDialog_u24lambda_u2415);
        ProgressBar $this$createDownloadDialog_u24lambda_u2417 = new ProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        LinearLayout.LayoutParams $this$createDownloadDialog_u24lambda_u2417_u24lambda_u2416 = new LinearLayout.LayoutParams(-1, INSTANCE.dpToPx(context, 8));
        $this$createDownloadDialog_u24lambda_u2417_u24lambda_u2416.topMargin = INSTANCE.dpToPx(context, 16);
        $this$createDownloadDialog_u24lambda_u2417.setLayoutParams($this$createDownloadDialog_u24lambda_u2417_u24lambda_u2416);
        $this$createDownloadDialog_u24lambda_u2417.setMax(100);
        $this$createDownloadDialog_u24lambda_u2417.setProgress(0);
        $this$createDownloadDialog_u24lambda_u2417.setIndeterminate(false);
        $this$createDownloadDialog_u24lambda_u2417.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#00E5CC")));
        $this$createDownloadDialog_u24lambda_u2417.setProgressBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#1AFFFFFF")));
        $this$createDownloadDialog_u24lambda_u244.addView($this$createDownloadDialog_u24lambda_u2417);
        TextView $this$createDownloadDialog_u24lambda_u2419 = new TextView(context);
        LinearLayout.LayoutParams $this$createDownloadDialog_u24lambda_u2419_u24lambda_u2418 = new LinearLayout.LayoutParams(-1, -2);
        $this$createDownloadDialog_u24lambda_u2419_u24lambda_u2418.topMargin = INSTANCE.dpToPx(context, 8);
        $this$createDownloadDialog_u24lambda_u2419.setLayoutParams($this$createDownloadDialog_u24lambda_u2419_u24lambda_u2418);
        $this$createDownloadDialog_u24lambda_u2419.setText("0%");
        $this$createDownloadDialog_u24lambda_u2419.setTextColor(Color.parseColor("#00E5CC"));
        $this$createDownloadDialog_u24lambda_u2419.setTextSize(24.0f);
        $this$createDownloadDialog_u24lambda_u2419.setTypeface(boldFont);
        $this$createDownloadDialog_u24lambda_u2419.setGravity(17);
        $this$createDownloadDialog_u24lambda_u244.addView($this$createDownloadDialog_u24lambda_u2419);
        MaterialButton $this$createDownloadDialog_u24lambda_u2422 = new MaterialButton(context);
        LinearLayout.LayoutParams $this$createDownloadDialog_u24lambda_u2422_u24lambda_u2420 = new LinearLayout.LayoutParams(-1, INSTANCE.dpToPx(context, 48));
        $this$createDownloadDialog_u24lambda_u2422_u24lambda_u2420.topMargin = INSTANCE.dpToPx(context, 20);
        $this$createDownloadDialog_u24lambda_u2422.setLayoutParams($this$createDownloadDialog_u24lambda_u2422_u24lambda_u2420);
        $this$createDownloadDialog_u24lambda_u2422.setText("Отменить загрузку");
        $this$createDownloadDialog_u24lambda_u2422.setTextColor(Color.parseColor("#EF4444"));
        $this$createDownloadDialog_u24lambda_u2422.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#1AEF4444")));
        $this$createDownloadDialog_u24lambda_u2422.setTextSize(14.0f);
        $this$createDownloadDialog_u24lambda_u2422.setTypeface(boldFont);
        $this$createDownloadDialog_u24lambda_u2422.setAllCaps(false);
        $this$createDownloadDialog_u24lambda_u2422.setCornerRadius(INSTANCE.dpToPx(context, 12));
        $this$createDownloadDialog_u24lambda_u2422.setElevation(0.0f);
        $this$createDownloadDialog_u24lambda_u2422.setStateListAnimator(null);
        $this$createDownloadDialog_u24lambda_u2422.setInsetTop(0);
        $this$createDownloadDialog_u24lambda_u2422.setInsetBottom(0);
        $this$createDownloadDialog_u24lambda_u2422.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda21
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Dialogs.createDownloadDialog$lambda$22$lambda$21(view, motionEvent);
            }
        });
        $this$createDownloadDialog_u24lambda_u244.addView($this$createDownloadDialog_u24lambda_u2422);
        card.addView($this$createDownloadDialog_u24lambda_u244);
        root.addView(card);
        dialog.setContentView(root);
        Window $this$createDownloadDialog_u24lambda_u2423 = dialog.getWindow();
        if ($this$createDownloadDialog_u24lambda_u2423 != null) {
            $this$createDownloadDialog_u24lambda_u2423.setBackgroundDrawable(new ColorDrawable(0));
            $this$createDownloadDialog_u24lambda_u2423.setLayout(-1, -1);
            $this$createDownloadDialog_u24lambda_u2423.addFlags(2);
            $this$createDownloadDialog_u24lambda_u2423.setDimAmount(0.5f);
        }
        return new DownloadDialogUi(dialog, $this$createDownloadDialog_u24lambda_u2417, $this$createDownloadDialog_u24lambda_u2419, $this$createDownloadDialog_u24lambda_u2422);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createDownloadDialog$lambda$22$lambda$21(View v, MotionEvent event) {
        switch (event.getActionMasked()) {
            case 0:
                v.animate().scaleX(0.97f).scaleY(0.97f).setDuration(80L).start();
                break;
            case 1:
            case 3:
                v.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80L).start();
                break;
        }
        return false;
    }

    public final void showSubscriptionDialog(final Context context, String telegramLinkRaw) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(telegramLinkRaw, "telegramLinkRaw");
        final String clean = (String) CollectionsKt___CollectionsKt.lastOrNull(StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.trim((CharSequence) telegramLinkRaw).toString(), new String[]{ServerSentEventKt.SPACE}, false, 0, 6, (Object) null));
        if (clean == null) {
            clean = "";
        }
        if (!StringsKt__StringsJVMKt.startsWith$default(clean, "https://t.me/", false, 2, null)) {
            Toast.makeText(context, "Некорректная ссылка на канал", 0).show();
            return;
        }
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(true);
        Typeface boldFont = getBoldFont(context);
        FrameLayout root = new FrameLayout(context);
        root.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        root.setBackgroundColor(Color.parseColor("#B3000000"));
        root.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dialogs.showSubscriptionDialog$lambda$26$lambda$25(dialog, view);
            }
        });
        MaterialCardView $this$showSubscriptionDialog_u24lambda_u2429 = new MaterialCardView(context);
        FrameLayout.LayoutParams $this$showSubscriptionDialog_u24lambda_u2429_u24lambda_u2427 = new FrameLayout.LayoutParams(-1, -2);
        $this$showSubscriptionDialog_u24lambda_u2429_u24lambda_u2427.gravity = 17;
        $this$showSubscriptionDialog_u24lambda_u2429_u24lambda_u2427.setMarginStart(INSTANCE.dpToPx(context, 24));
        $this$showSubscriptionDialog_u24lambda_u2429_u24lambda_u2427.setMarginEnd(INSTANCE.dpToPx(context, 24));
        $this$showSubscriptionDialog_u24lambda_u2429.setLayoutParams($this$showSubscriptionDialog_u24lambda_u2429_u24lambda_u2427);
        $this$showSubscriptionDialog_u24lambda_u2429.setRadius(INSTANCE.dpToPx(context, 20));
        $this$showSubscriptionDialog_u24lambda_u2429.setCardElevation(INSTANCE.dpToPx(context, 8));
        $this$showSubscriptionDialog_u24lambda_u2429.setCardBackgroundColor(Color.parseColor("#121217"));
        $this$showSubscriptionDialog_u24lambda_u2429.setStrokeWidth(INSTANCE.dpToPx(context, 1));
        $this$showSubscriptionDialog_u24lambda_u2429.setStrokeColor(Color.parseColor("#1AFFFFFF"));
        $this$showSubscriptionDialog_u24lambda_u2429.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dialogs.showSubscriptionDialog$lambda$29$lambda$28(view);
            }
        });
        LinearLayout $this$showSubscriptionDialog_u24lambda_u2430 = new LinearLayout(context);
        $this$showSubscriptionDialog_u24lambda_u2430.setOrientation(1);
        $this$showSubscriptionDialog_u24lambda_u2430.setPadding(INSTANCE.dpToPx(context, 24), INSTANCE.dpToPx(context, 24), INSTANCE.dpToPx(context, 24), INSTANCE.dpToPx(context, 24));
        $this$showSubscriptionDialog_u24lambda_u2430.setGravity(1);
        MaterialCardView iconContainer = new MaterialCardView(context);
        iconContainer.setLayoutParams(new LinearLayout.LayoutParams(INSTANCE.dpToPx(context, 64), INSTANCE.dpToPx(context, 64)));
        iconContainer.setRadius(INSTANCE.dpToPx(context, 32));
        iconContainer.setCardElevation(0.0f);
        iconContainer.setCardBackgroundColor(Color.parseColor("#1A3B82F6"));
        TextView $this$showSubscriptionDialog_u24lambda_u2432 = new TextView(context);
        $this$showSubscriptionDialog_u24lambda_u2432.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        $this$showSubscriptionDialog_u24lambda_u2432.setText("📢");
        $this$showSubscriptionDialog_u24lambda_u2432.setTextSize(28.0f);
        $this$showSubscriptionDialog_u24lambda_u2432.setGravity(17);
        iconContainer.addView($this$showSubscriptionDialog_u24lambda_u2432);
        $this$showSubscriptionDialog_u24lambda_u2430.addView(iconContainer);
        TextView $this$showSubscriptionDialog_u24lambda_u2434 = new TextView(context);
        LinearLayout.LayoutParams $this$showSubscriptionDialog_u24lambda_u2434_u24lambda_u2433 = new LinearLayout.LayoutParams(-2, -2);
        $this$showSubscriptionDialog_u24lambda_u2434_u24lambda_u2433.topMargin = INSTANCE.dpToPx(context, 16);
        $this$showSubscriptionDialog_u24lambda_u2434.setLayoutParams($this$showSubscriptionDialog_u24lambda_u2434_u24lambda_u2433);
        $this$showSubscriptionDialog_u24lambda_u2434.setText("Подписка на канал");
        $this$showSubscriptionDialog_u24lambda_u2434.setTextColor(-1);
        $this$showSubscriptionDialog_u24lambda_u2434.setTextSize(20.0f);
        $this$showSubscriptionDialog_u24lambda_u2434.setTypeface(boldFont);
        $this$showSubscriptionDialog_u24lambda_u2434.setGravity(17);
        $this$showSubscriptionDialog_u24lambda_u2430.addView($this$showSubscriptionDialog_u24lambda_u2434);
        TextView $this$showSubscriptionDialog_u24lambda_u2436 = new TextView(context);
        LinearLayout.LayoutParams $this$showSubscriptionDialog_u24lambda_u2436_u24lambda_u2435 = new LinearLayout.LayoutParams(-2, -2);
        $this$showSubscriptionDialog_u24lambda_u2436_u24lambda_u2435.topMargin = INSTANCE.dpToPx(context, 12);
        $this$showSubscriptionDialog_u24lambda_u2436.setLayoutParams($this$showSubscriptionDialog_u24lambda_u2436_u24lambda_u2435);
        $this$showSubscriptionDialog_u24lambda_u2436.setText("Чтобы скачать сборку, подпишитесь на канал автора с того же аккаунта, с которого был создан ключ.");
        $this$showSubscriptionDialog_u24lambda_u2436.setTextColor(Color.parseColor(TCPSettingsManager.COLOR_HINT));
        $this$showSubscriptionDialog_u24lambda_u2436.setTextSize(14.0f);
        $this$showSubscriptionDialog_u24lambda_u2436.setGravity(17);
        $this$showSubscriptionDialog_u24lambda_u2436.setLineSpacing(INSTANCE.dpToPx(context, 2), 1.0f);
        $this$showSubscriptionDialog_u24lambda_u2430.addView($this$showSubscriptionDialog_u24lambda_u2436);
        MaterialButton $this$showSubscriptionDialog_u24lambda_u2440 = new MaterialButton(context);
        LinearLayout.LayoutParams $this$showSubscriptionDialog_u24lambda_u2440_u24lambda_u2437 = new LinearLayout.LayoutParams(-1, INSTANCE.dpToPx(context, 50));
        $this$showSubscriptionDialog_u24lambda_u2440_u24lambda_u2437.topMargin = INSTANCE.dpToPx(context, 24);
        $this$showSubscriptionDialog_u24lambda_u2440.setLayoutParams($this$showSubscriptionDialog_u24lambda_u2440_u24lambda_u2437);
        $this$showSubscriptionDialog_u24lambda_u2440.setText("Подписаться на канал");
        $this$showSubscriptionDialog_u24lambda_u2440.setTextColor(-1);
        $this$showSubscriptionDialog_u24lambda_u2440.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#3B82F6")));
        $this$showSubscriptionDialog_u24lambda_u2440.setTextSize(14.0f);
        $this$showSubscriptionDialog_u24lambda_u2440.setTypeface(boldFont);
        $this$showSubscriptionDialog_u24lambda_u2440.setAllCaps(false);
        $this$showSubscriptionDialog_u24lambda_u2440.setCornerRadius(INSTANCE.dpToPx(context, 12));
        $this$showSubscriptionDialog_u24lambda_u2440.setElevation(0.0f);
        $this$showSubscriptionDialog_u24lambda_u2440.setStateListAnimator(null);
        $this$showSubscriptionDialog_u24lambda_u2440.setInsetTop(0);
        $this$showSubscriptionDialog_u24lambda_u2440.setInsetBottom(0);
        $this$showSubscriptionDialog_u24lambda_u2440.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dialogs.showSubscriptionDialog$lambda$40$lambda$38(context, clean, dialog, view);
            }
        });
        $this$showSubscriptionDialog_u24lambda_u2440.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda18
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Dialogs.showSubscriptionDialog$lambda$40$lambda$39(view, motionEvent);
            }
        });
        $this$showSubscriptionDialog_u24lambda_u2430.addView($this$showSubscriptionDialog_u24lambda_u2440);
        MaterialButton $this$showSubscriptionDialog_u24lambda_u2444 = new MaterialButton(context);
        LinearLayout.LayoutParams $this$showSubscriptionDialog_u24lambda_u2444_u24lambda_u2441 = new LinearLayout.LayoutParams(-1, INSTANCE.dpToPx(context, 46));
        $this$showSubscriptionDialog_u24lambda_u2444_u24lambda_u2441.topMargin = INSTANCE.dpToPx(context, 10);
        $this$showSubscriptionDialog_u24lambda_u2444.setLayoutParams($this$showSubscriptionDialog_u24lambda_u2444_u24lambda_u2441);
        $this$showSubscriptionDialog_u24lambda_u2444.setText("Отмена");
        $this$showSubscriptionDialog_u24lambda_u2444.setTextColor(Color.parseColor(TCPSettingsManager.COLOR_HINT));
        $this$showSubscriptionDialog_u24lambda_u2444.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#1AFFFFFF")));
        $this$showSubscriptionDialog_u24lambda_u2444.setTextSize(14.0f);
        $this$showSubscriptionDialog_u24lambda_u2444.setAllCaps(false);
        $this$showSubscriptionDialog_u24lambda_u2444.setCornerRadius(INSTANCE.dpToPx(context, 12));
        $this$showSubscriptionDialog_u24lambda_u2444.setElevation(0.0f);
        $this$showSubscriptionDialog_u24lambda_u2444.setStateListAnimator(null);
        $this$showSubscriptionDialog_u24lambda_u2444.setInsetTop(0);
        $this$showSubscriptionDialog_u24lambda_u2444.setInsetBottom(0);
        $this$showSubscriptionDialog_u24lambda_u2444.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda19
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dialogs.showSubscriptionDialog$lambda$44$lambda$42(dialog, view);
            }
        });
        $this$showSubscriptionDialog_u24lambda_u2444.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda20
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Dialogs.showSubscriptionDialog$lambda$44$lambda$43(view, motionEvent);
            }
        });
        $this$showSubscriptionDialog_u24lambda_u2430.addView($this$showSubscriptionDialog_u24lambda_u2444);
        $this$showSubscriptionDialog_u24lambda_u2429.addView($this$showSubscriptionDialog_u24lambda_u2430);
        root.addView($this$showSubscriptionDialog_u24lambda_u2429);
        dialog.setContentView(root);
        Window $this$showSubscriptionDialog_u24lambda_u2445 = dialog.getWindow();
        if ($this$showSubscriptionDialog_u24lambda_u2445 != null) {
            $this$showSubscriptionDialog_u24lambda_u2445.setBackgroundDrawable(new ColorDrawable(0));
            $this$showSubscriptionDialog_u24lambda_u2445.setLayout(-1, -1);
        }
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSubscriptionDialog$lambda$26$lambda$25(Dialog dialog, View it) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSubscriptionDialog$lambda$29$lambda$28(View it) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSubscriptionDialog$lambda$40$lambda$38(Context context, String clean, Dialog dialog, View it) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(clean, "$clean");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(clean)));
        } catch (Exception e) {
        }
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showSubscriptionDialog$lambda$40$lambda$39(View v, MotionEvent event) {
        switch (event.getActionMasked()) {
            case 0:
                v.animate().scaleX(0.97f).scaleY(0.97f).setDuration(80L).start();
                break;
            case 1:
            case 3:
                v.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80L).start();
                break;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSubscriptionDialog$lambda$44$lambda$42(Dialog dialog, View it) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showSubscriptionDialog$lambda$44$lambda$43(View v, MotionEvent event) {
        switch (event.getActionMasked()) {
            case 0:
                v.animate().scaleX(0.97f).scaleY(0.97f).setDuration(80L).start();
                break;
            case 1:
            case 3:
                v.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80L).start();
                break;
        }
        return false;
    }

    public final void showDescriptionDialog(Context context, String title, String description) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(true);
        Typeface boldFont = getBoldFont(context);
        FrameLayout $this$showDescriptionDialog_u24lambda_u2448 = new FrameLayout(context);
        $this$showDescriptionDialog_u24lambda_u2448.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        $this$showDescriptionDialog_u24lambda_u2448.setBackgroundColor(Color.parseColor("#B3000000"));
        $this$showDescriptionDialog_u24lambda_u2448.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dialogs.showDescriptionDialog$lambda$48$lambda$47(dialog, view);
            }
        });
        MaterialCardView card = new MaterialCardView(context);
        FrameLayout.LayoutParams $this$showDescriptionDialog_u24lambda_u2451_u24lambda_u2449 = new FrameLayout.LayoutParams(-1, -2);
        $this$showDescriptionDialog_u24lambda_u2451_u24lambda_u2449.gravity = 17;
        $this$showDescriptionDialog_u24lambda_u2451_u24lambda_u2449.setMarginStart(INSTANCE.dpToPx(context, 24));
        $this$showDescriptionDialog_u24lambda_u2451_u24lambda_u2449.setMarginEnd(INSTANCE.dpToPx(context, 24));
        card.setLayoutParams($this$showDescriptionDialog_u24lambda_u2451_u24lambda_u2449);
        card.setRadius(INSTANCE.dpToPx(context, 20));
        card.setCardElevation(INSTANCE.dpToPx(context, 8));
        card.setCardBackgroundColor(Color.parseColor("#121217"));
        card.setStrokeWidth(INSTANCE.dpToPx(context, 1));
        card.setStrokeColor(Color.parseColor("#1AFFFFFF"));
        card.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dialogs.showDescriptionDialog$lambda$51$lambda$50(view);
            }
        });
        LinearLayout $this$showDescriptionDialog_u24lambda_u2452 = new LinearLayout(context);
        $this$showDescriptionDialog_u24lambda_u2452.setOrientation(1);
        $this$showDescriptionDialog_u24lambda_u2452.setPadding(INSTANCE.dpToPx(context, 24), INSTANCE.dpToPx(context, 24), INSTANCE.dpToPx(context, 24), INSTANCE.dpToPx(context, 24));
        LinearLayout headerLayout = new LinearLayout(context);
        headerLayout.setOrientation(0);
        headerLayout.setGravity(16);
        MaterialCardView iconContainer = new MaterialCardView(context);
        iconContainer.setLayoutParams(new LinearLayout.LayoutParams(INSTANCE.dpToPx(context, 48), INSTANCE.dpToPx(context, 48)));
        iconContainer.setRadius(INSTANCE.dpToPx(context, 12));
        iconContainer.setCardElevation(0.0f);
        iconContainer.setCardBackgroundColor(Color.parseColor("#1A00E5CC"));
        ImageView $this$showDescriptionDialog_u24lambda_u2456 = new ImageView(context);
        FrameLayout.LayoutParams $this$showDescriptionDialog_u24lambda_u2456_u24lambda_u2455 = new FrameLayout.LayoutParams(INSTANCE.dpToPx(context, 24), INSTANCE.dpToPx(context, 24));
        $this$showDescriptionDialog_u24lambda_u2456_u24lambda_u2455.gravity = 17;
        $this$showDescriptionDialog_u24lambda_u2456.setLayoutParams($this$showDescriptionDialog_u24lambda_u2456_u24lambda_u2455);
        $this$showDescriptionDialog_u24lambda_u2456.setImageResource(C3715R.drawable.neizzir20_ic_info);
        $this$showDescriptionDialog_u24lambda_u2456.setColorFilter(Color.parseColor("#00E5CC"));
        iconContainer.addView($this$showDescriptionDialog_u24lambda_u2456);
        LinearLayout $this$showDescriptionDialog_u24lambda_u2458 = new LinearLayout(context);
        $this$showDescriptionDialog_u24lambda_u2458.setOrientation(1);
        LinearLayout.LayoutParams $this$showDescriptionDialog_u24lambda_u2458_u24lambda_u2457 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$showDescriptionDialog_u24lambda_u2458_u24lambda_u2457.setMarginStart(INSTANCE.dpToPx(context, 14));
        $this$showDescriptionDialog_u24lambda_u2458.setLayoutParams($this$showDescriptionDialog_u24lambda_u2458_u24lambda_u2457);
        TextView $this$showDescriptionDialog_u24lambda_u2459 = new TextView(context);
        $this$showDescriptionDialog_u24lambda_u2459.setText(title);
        $this$showDescriptionDialog_u24lambda_u2459.setTextColor(-1);
        $this$showDescriptionDialog_u24lambda_u2459.setTextSize(18.0f);
        $this$showDescriptionDialog_u24lambda_u2459.setTypeface(boldFont);
        $this$showDescriptionDialog_u24lambda_u2459.setMaxLines(2);
        $this$showDescriptionDialog_u24lambda_u2459.setEllipsize(TextUtils.TruncateAt.END);
        TextView $this$showDescriptionDialog_u24lambda_u2460 = new TextView(context);
        $this$showDescriptionDialog_u24lambda_u2460.setText("Описание сборки");
        $this$showDescriptionDialog_u24lambda_u2460.setTextColor(Color.parseColor(TCPSettingsManager.COLOR_HINT));
        $this$showDescriptionDialog_u24lambda_u2460.setTextSize(12.0f);
        $this$showDescriptionDialog_u24lambda_u2458.addView($this$showDescriptionDialog_u24lambda_u2459);
        $this$showDescriptionDialog_u24lambda_u2458.addView($this$showDescriptionDialog_u24lambda_u2460);
        headerLayout.addView(iconContainer);
        headerLayout.addView($this$showDescriptionDialog_u24lambda_u2458);
        $this$showDescriptionDialog_u24lambda_u2452.addView(headerLayout);
        View $this$showDescriptionDialog_u24lambda_u2462 = new View(context);
        LinearLayout.LayoutParams $this$showDescriptionDialog_u24lambda_u2462_u24lambda_u2461 = new LinearLayout.LayoutParams(-1, INSTANCE.dpToPx(context, 1));
        $this$showDescriptionDialog_u24lambda_u2462_u24lambda_u2461.topMargin = INSTANCE.dpToPx(context, 20);
        $this$showDescriptionDialog_u24lambda_u2462_u24lambda_u2461.bottomMargin = INSTANCE.dpToPx(context, 20);
        $this$showDescriptionDialog_u24lambda_u2462.setLayoutParams($this$showDescriptionDialog_u24lambda_u2462_u24lambda_u2461);
        $this$showDescriptionDialog_u24lambda_u2462.setBackgroundColor(Color.parseColor("#1AFFFFFF"));
        $this$showDescriptionDialog_u24lambda_u2452.addView($this$showDescriptionDialog_u24lambda_u2462);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        MaterialCardView $this$showDescriptionDialog_u24lambda_u2465 = new MaterialCardView(context);
        $this$showDescriptionDialog_u24lambda_u2465.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        $this$showDescriptionDialog_u24lambda_u2465.setRadius(INSTANCE.dpToPx(context, 12));
        $this$showDescriptionDialog_u24lambda_u2465.setCardElevation(0.0f);
        $this$showDescriptionDialog_u24lambda_u2465.setCardBackgroundColor(Color.parseColor("#0DFFFFFF"));
        LinearLayout descContent = new LinearLayout(context);
        descContent.setOrientation(1);
        descContent.setPadding(INSTANCE.dpToPx(context, 16), INSTANCE.dpToPx(context, 14), INSTANCE.dpToPx(context, 16), INSTANCE.dpToPx(context, 14));
        TextView $this$showDescriptionDialog_u24lambda_u2468 = new TextView(context);
        String str = description;
        if (str.length() == 0) {
            str = "Описание отсутствует";
        }
        $this$showDescriptionDialog_u24lambda_u2468.setText(str);
        $this$showDescriptionDialog_u24lambda_u2468.setTextColor(Color.parseColor(description.length() == 0 ? "#666666" : "#CCCCCC"));
        $this$showDescriptionDialog_u24lambda_u2468.setTextSize(14.0f);
        $this$showDescriptionDialog_u24lambda_u2468.setLineSpacing(INSTANCE.dpToPx(context, 4), 1.0f);
        descContent.addView($this$showDescriptionDialog_u24lambda_u2468);
        $this$showDescriptionDialog_u24lambda_u2465.addView(descContent);
        scrollView.addView($this$showDescriptionDialog_u24lambda_u2465);
        $this$showDescriptionDialog_u24lambda_u2452.addView(scrollView);
        MaterialButton $this$showDescriptionDialog_u24lambda_u2472 = new MaterialButton(context);
        LinearLayout.LayoutParams $this$showDescriptionDialog_u24lambda_u2472_u24lambda_u2469 = new LinearLayout.LayoutParams(-1, INSTANCE.dpToPx(context, 46));
        $this$showDescriptionDialog_u24lambda_u2472_u24lambda_u2469.topMargin = INSTANCE.dpToPx(context, 20);
        $this$showDescriptionDialog_u24lambda_u2472.setLayoutParams($this$showDescriptionDialog_u24lambda_u2472_u24lambda_u2469);
        $this$showDescriptionDialog_u24lambda_u2472.setText("Закрыть");
        $this$showDescriptionDialog_u24lambda_u2472.setTextColor(Color.parseColor(TCPSettingsManager.COLOR_HINT));
        $this$showDescriptionDialog_u24lambda_u2472.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#1AFFFFFF")));
        $this$showDescriptionDialog_u24lambda_u2472.setTextSize(14.0f);
        $this$showDescriptionDialog_u24lambda_u2472.setAllCaps(false);
        $this$showDescriptionDialog_u24lambda_u2472.setCornerRadius(INSTANCE.dpToPx(context, 12));
        $this$showDescriptionDialog_u24lambda_u2472.setElevation(0.0f);
        $this$showDescriptionDialog_u24lambda_u2472.setStateListAnimator(null);
        $this$showDescriptionDialog_u24lambda_u2472.setInsetTop(0);
        $this$showDescriptionDialog_u24lambda_u2472.setInsetBottom(0);
        $this$showDescriptionDialog_u24lambda_u2472.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dialogs.showDescriptionDialog$lambda$72$lambda$70(dialog, view);
            }
        });
        $this$showDescriptionDialog_u24lambda_u2472.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda13
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Dialogs.showDescriptionDialog$lambda$72$lambda$71(view, motionEvent);
            }
        });
        $this$showDescriptionDialog_u24lambda_u2452.addView($this$showDescriptionDialog_u24lambda_u2472);
        card.addView($this$showDescriptionDialog_u24lambda_u2452);
        $this$showDescriptionDialog_u24lambda_u2448.addView(card);
        dialog.setContentView($this$showDescriptionDialog_u24lambda_u2448);
        Window $this$showDescriptionDialog_u24lambda_u2473 = dialog.getWindow();
        if ($this$showDescriptionDialog_u24lambda_u2473 != null) {
            $this$showDescriptionDialog_u24lambda_u2473.setBackgroundDrawable(new ColorDrawable(0));
            $this$showDescriptionDialog_u24lambda_u2473.setLayout(-1, -1);
        }
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDescriptionDialog$lambda$48$lambda$47(Dialog dialog, View it) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDescriptionDialog$lambda$51$lambda$50(View it) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDescriptionDialog$lambda$72$lambda$70(Dialog dialog, View it) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDescriptionDialog$lambda$72$lambda$71(View v, MotionEvent event) {
        switch (event.getActionMasked()) {
            case 0:
                v.animate().scaleX(0.97f).scaleY(0.97f).setDuration(80L).start();
                break;
            case 1:
            case 3:
                v.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80L).start();
                break;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showRoutedVideoDialog(Context context, final String path, Endpoint initialEndpoint) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(initialEndpoint, "initialEndpoint");
        final Dialog $this$showRoutedVideoDialog_u24lambda_u2474 = new Dialog(context);
        $this$showRoutedVideoDialog_u24lambda_u2474.requestWindowFeature(1);
        $this$showRoutedVideoDialog_u24lambda_u2474.setCancelable(true);
        FrameLayout $this$showRoutedVideoDialog_u24lambda_u2476 = new FrameLayout(context);
        $this$showRoutedVideoDialog_u24lambda_u2476.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        $this$showRoutedVideoDialog_u24lambda_u2476.setBackgroundColor(Color.parseColor("#E6000000"));
        $this$showRoutedVideoDialog_u24lambda_u2476.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dialogs.showRoutedVideoDialog$lambda$76$lambda$75($this$showRoutedVideoDialog_u24lambda_u2474, view);
            }
        });
        MaterialCardView $this$showRoutedVideoDialog_u24lambda_u2479 = new MaterialCardView(context);
        FrameLayout.LayoutParams $this$showRoutedVideoDialog_u24lambda_u2479_u24lambda_u2477 = new FrameLayout.LayoutParams(-1, -2);
        $this$showRoutedVideoDialog_u24lambda_u2479_u24lambda_u2477.gravity = 17;
        $this$showRoutedVideoDialog_u24lambda_u2479_u24lambda_u2477.setMarginStart(INSTANCE.dpToPx(context, 16));
        $this$showRoutedVideoDialog_u24lambda_u2479_u24lambda_u2477.setMarginEnd(INSTANCE.dpToPx(context, 16));
        $this$showRoutedVideoDialog_u24lambda_u2479.setLayoutParams($this$showRoutedVideoDialog_u24lambda_u2479_u24lambda_u2477);
        $this$showRoutedVideoDialog_u24lambda_u2479.setRadius(INSTANCE.dpToPx(context, 20));
        $this$showRoutedVideoDialog_u24lambda_u2479.setCardElevation(INSTANCE.dpToPx(context, 8));
        $this$showRoutedVideoDialog_u24lambda_u2479.setCardBackgroundColor(Color.parseColor("#0A0A0F"));
        $this$showRoutedVideoDialog_u24lambda_u2479.setStrokeWidth(INSTANCE.dpToPx(context, 1));
        $this$showRoutedVideoDialog_u24lambda_u2479.setStrokeColor(Color.parseColor("#1AFFFFFF"));
        $this$showRoutedVideoDialog_u24lambda_u2479.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dialogs.showRoutedVideoDialog$lambda$79$lambda$78(view);
            }
        });
        final PlayerView $this$showRoutedVideoDialog_u24lambda_u2480 = new PlayerView(context);
        $this$showRoutedVideoDialog_u24lambda_u2480.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        $this$showRoutedVideoDialog_u24lambda_u2480.setUseController(true);
        $this$showRoutedVideoDialog_u24lambda_u2480.setBackgroundColor(-16777216);
        $this$showRoutedVideoDialog_u24lambda_u2479.addView($this$showRoutedVideoDialog_u24lambda_u2480);
        $this$showRoutedVideoDialog_u24lambda_u2476.addView($this$showRoutedVideoDialog_u24lambda_u2479);
        $this$showRoutedVideoDialog_u24lambda_u2474.setContentView($this$showRoutedVideoDialog_u24lambda_u2476);
        Window $this$showRoutedVideoDialog_u24lambda_u2481 = $this$showRoutedVideoDialog_u24lambda_u2474.getWindow();
        if ($this$showRoutedVideoDialog_u24lambda_u2481 != null) {
            $this$showRoutedVideoDialog_u24lambda_u2481.setBackgroundDrawable(new ColorDrawable(0));
            $this$showRoutedVideoDialog_u24lambda_u2481.setLayout(-1, -1);
        }
        final ExoPlayer player = new ExoPlayer.Builder(context).build();
        Intrinsics.checkNotNullExpressionValue(player, "build(...)");
        $this$showRoutedVideoDialog_u24lambda_u2480.setPlayer(player);
        final Ref.ObjectRef currentEndpoint = new Ref.ObjectRef();
        currentEndpoint.element = initialEndpoint;
        final Ref.BooleanRef didFallback = new Ref.BooleanRef();
        player.addListener(new Player.Listener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs.showRoutedVideoDialog.2
            @Override // androidx.media3.common.Player.Listener
            public void onPlaybackStateChanged(int playbackState) {
                if (playbackState == 3) {
                    NetworkRuntime.INSTANCE.getRouter().reportSuccess(EndpointGroup.KOLSON, currentEndpoint.element);
                }
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlayerError(PlaybackException error) {
                Endpoint alternate;
                Intrinsics.checkNotNullParameter(error, "error");
                if (didFallback.element || (alternate = NetworkRuntime.INSTANCE.getRouter().alternateEndpoint(EndpointGroup.KOLSON, currentEndpoint.element)) == null) {
                    return;
                }
                didFallback.element = true;
                long position = RangesKt___RangesKt.coerceAtLeast(player.getCurrentPosition(), 0L);
                NetworkRuntime.INSTANCE.getRouter().reportFailure(EndpointGroup.KOLSON, currentEndpoint.element);
                Dialogs.showRoutedVideoDialog$play(currentEndpoint, path, player, alternate, position);
            }
        });
        showRoutedVideoDialog$play(currentEndpoint, path, player, initialEndpoint, 0L);
        $this$showRoutedVideoDialog_u24lambda_u2474.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda14
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Dialogs.showRoutedVideoDialog$lambda$82($this$showRoutedVideoDialog_u24lambda_u2480, player, dialogInterface);
            }
        });
        $this$showRoutedVideoDialog_u24lambda_u2474.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRoutedVideoDialog$lambda$76$lambda$75(Dialog dialog, View it) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRoutedVideoDialog$lambda$79$lambda$78(View it) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showRoutedVideoDialog$play(Ref.ObjectRef<Endpoint> objectRef, String $path, ExoPlayer player, Endpoint endpoint, long positionMs) {
        objectRef.element = endpoint;
        HttpUrl url = NetworkRuntime.INSTANCE.getRouter().urlFor(EndpointGroup.KOLSON, $path, endpoint);
        player.setMediaItem(MediaItem.fromUri(url.getUrl()));
        player.prepare();
        if (positionMs > 0) {
            player.seekTo(positionMs);
        }
        player.setPlayWhenReady(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRoutedVideoDialog$lambda$82(PlayerView playerView, ExoPlayer player, DialogInterface it) {
        Intrinsics.checkNotNullParameter(playerView, "$playerView");
        Intrinsics.checkNotNullParameter(player, "$player");
        playerView.setPlayer(null);
        player.release();
    }

    public final void showFaqDialog(Context context, String folderName, String updateDate, String faqText, final Function0<Unit> onPlayHitSounds, final Function0<Unit> onPlayShootSounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        Intrinsics.checkNotNullParameter(updateDate, "updateDate");
        Intrinsics.checkNotNullParameter(faqText, "faqText");
        Intrinsics.checkNotNullParameter(onPlayHitSounds, "onPlayHitSounds");
        Intrinsics.checkNotNullParameter(onPlayShootSounds, "onPlayShootSounds");
        final Dialog $this$showFaqDialog_u24lambda_u2483 = new Dialog(context);
        $this$showFaqDialog_u24lambda_u2483.requestWindowFeature(1);
        $this$showFaqDialog_u24lambda_u2483.setCancelable(true);
        Typeface boldFont = getBoldFont(context);
        FrameLayout $this$showFaqDialog_u24lambda_u2485 = new FrameLayout(context);
        $this$showFaqDialog_u24lambda_u2485.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        $this$showFaqDialog_u24lambda_u2485.setBackgroundColor(Color.parseColor("#B3000000"));
        $this$showFaqDialog_u24lambda_u2485.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dialogs.showFaqDialog$lambda$85$lambda$84($this$showFaqDialog_u24lambda_u2483, view);
            }
        });
        MaterialCardView $this$showFaqDialog_u24lambda_u2488 = new MaterialCardView(context);
        FrameLayout.LayoutParams $this$showFaqDialog_u24lambda_u2488_u24lambda_u2486 = new FrameLayout.LayoutParams(-1, -2);
        $this$showFaqDialog_u24lambda_u2488_u24lambda_u2486.gravity = 17;
        $this$showFaqDialog_u24lambda_u2488_u24lambda_u2486.setMarginStart(INSTANCE.dpToPx(context, 20));
        $this$showFaqDialog_u24lambda_u2488_u24lambda_u2486.setMarginEnd(INSTANCE.dpToPx(context, 20));
        $this$showFaqDialog_u24lambda_u2488_u24lambda_u2486.topMargin = INSTANCE.dpToPx(context, 40);
        $this$showFaqDialog_u24lambda_u2488_u24lambda_u2486.bottomMargin = INSTANCE.dpToPx(context, 40);
        $this$showFaqDialog_u24lambda_u2488.setLayoutParams($this$showFaqDialog_u24lambda_u2488_u24lambda_u2486);
        $this$showFaqDialog_u24lambda_u2488.setRadius(INSTANCE.dpToPx(context, 20));
        $this$showFaqDialog_u24lambda_u2488.setCardElevation(INSTANCE.dpToPx(context, 8));
        $this$showFaqDialog_u24lambda_u2488.setCardBackgroundColor(Color.parseColor("#121217"));
        $this$showFaqDialog_u24lambda_u2488.setStrokeWidth(INSTANCE.dpToPx(context, 1));
        $this$showFaqDialog_u24lambda_u2488.setStrokeColor(Color.parseColor("#1AFFFFFF"));
        $this$showFaqDialog_u24lambda_u2488.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dialogs.showFaqDialog$lambda$88$lambda$87(view);
            }
        });
        LinearLayout $this$showFaqDialog_u24lambda_u2489 = new LinearLayout(context);
        $this$showFaqDialog_u24lambda_u2489.setOrientation(1);
        $this$showFaqDialog_u24lambda_u2489.setPadding(INSTANCE.dpToPx(context, 20), INSTANCE.dpToPx(context, 20), INSTANCE.dpToPx(context, 20), INSTANCE.dpToPx(context, 20));
        LinearLayout $this$showFaqDialog_u24lambda_u2490 = new LinearLayout(context);
        $this$showFaqDialog_u24lambda_u2490.setOrientation(0);
        $this$showFaqDialog_u24lambda_u2490.setGravity(16);
        MaterialCardView $this$showFaqDialog_u24lambda_u2491 = new MaterialCardView(context);
        $this$showFaqDialog_u24lambda_u2491.setLayoutParams(new LinearLayout.LayoutParams(INSTANCE.dpToPx(context, 48), INSTANCE.dpToPx(context, 48)));
        $this$showFaqDialog_u24lambda_u2491.setRadius(INSTANCE.dpToPx(context, 12));
        $this$showFaqDialog_u24lambda_u2491.setCardElevation(0.0f);
        $this$showFaqDialog_u24lambda_u2491.setCardBackgroundColor(Color.parseColor("#1A00E5CC"));
        ImageView $this$showFaqDialog_u24lambda_u2493 = new ImageView(context);
        FrameLayout.LayoutParams $this$showFaqDialog_u24lambda_u2493_u24lambda_u2492 = new FrameLayout.LayoutParams(INSTANCE.dpToPx(context, 24), INSTANCE.dpToPx(context, 24));
        $this$showFaqDialog_u24lambda_u2493_u24lambda_u2492.gravity = 17;
        $this$showFaqDialog_u24lambda_u2493.setLayoutParams($this$showFaqDialog_u24lambda_u2493_u24lambda_u2492);
        $this$showFaqDialog_u24lambda_u2493.setImageResource(C3715R.drawable.neizzir20_ic_info);
        $this$showFaqDialog_u24lambda_u2493.setColorFilter(Color.parseColor("#00E5CC"));
        $this$showFaqDialog_u24lambda_u2491.addView($this$showFaqDialog_u24lambda_u2493);
        LinearLayout $this$showFaqDialog_u24lambda_u2495 = new LinearLayout(context);
        $this$showFaqDialog_u24lambda_u2495.setOrientation(1);
        LinearLayout.LayoutParams $this$showFaqDialog_u24lambda_u2495_u24lambda_u2494 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$showFaqDialog_u24lambda_u2495_u24lambda_u2494.setMarginStart(INSTANCE.dpToPx(context, 12));
        $this$showFaqDialog_u24lambda_u2495.setLayoutParams($this$showFaqDialog_u24lambda_u2495_u24lambda_u2494);
        TextView $this$showFaqDialog_u24lambda_u2496 = new TextView(context);
        $this$showFaqDialog_u24lambda_u2496.setText(folderName);
        $this$showFaqDialog_u24lambda_u2496.setTextColor(-1);
        $this$showFaqDialog_u24lambda_u2496.setTextSize(16.0f);
        $this$showFaqDialog_u24lambda_u2496.setTypeface(boldFont);
        $this$showFaqDialog_u24lambda_u2496.setMaxLines(2);
        $this$showFaqDialog_u24lambda_u2496.setEllipsize(TextUtils.TruncateAt.END);
        TextView $this$showFaqDialog_u24lambda_u2497 = new TextView(context);
        $this$showFaqDialog_u24lambda_u2497.setText("Описание сборки");
        $this$showFaqDialog_u24lambda_u2497.setTextColor(Color.parseColor(TCPSettingsManager.COLOR_HINT));
        $this$showFaqDialog_u24lambda_u2497.setTextSize(11.0f);
        $this$showFaqDialog_u24lambda_u2495.addView($this$showFaqDialog_u24lambda_u2496);
        $this$showFaqDialog_u24lambda_u2495.addView($this$showFaqDialog_u24lambda_u2497);
        $this$showFaqDialog_u24lambda_u2490.addView($this$showFaqDialog_u24lambda_u2491);
        $this$showFaqDialog_u24lambda_u2490.addView($this$showFaqDialog_u24lambda_u2495);
        $this$showFaqDialog_u24lambda_u2489.addView($this$showFaqDialog_u24lambda_u2490);
        MaterialCardView $this$showFaqDialog_u24lambda_u2499 = new MaterialCardView(context);
        LinearLayout.LayoutParams $this$showFaqDialog_u24lambda_u2499_u24lambda_u2498 = new LinearLayout.LayoutParams(-1, -2);
        $this$showFaqDialog_u24lambda_u2499_u24lambda_u2498.topMargin = INSTANCE.dpToPx(context, 16);
        $this$showFaqDialog_u24lambda_u2499.setLayoutParams($this$showFaqDialog_u24lambda_u2499_u24lambda_u2498);
        $this$showFaqDialog_u24lambda_u2499.setRadius(INSTANCE.dpToPx(context, 10));
        $this$showFaqDialog_u24lambda_u2499.setCardElevation(0.0f);
        $this$showFaqDialog_u24lambda_u2499.setCardBackgroundColor(Color.parseColor("#1A00E5CC"));
        LinearLayout $this$showFaqDialog_u24lambda_u24100 = new LinearLayout(context);
        $this$showFaqDialog_u24lambda_u24100.setOrientation(0);
        $this$showFaqDialog_u24lambda_u24100.setGravity(16);
        $this$showFaqDialog_u24lambda_u24100.setPadding(INSTANCE.dpToPx(context, 12), INSTANCE.dpToPx(context, 10), INSTANCE.dpToPx(context, 12), INSTANCE.dpToPx(context, 10));
        ImageView $this$showFaqDialog_u24lambda_u24101 = new ImageView(context);
        $this$showFaqDialog_u24lambda_u24101.setLayoutParams(new LinearLayout.LayoutParams(INSTANCE.dpToPx(context, 16), INSTANCE.dpToPx(context, 16)));
        $this$showFaqDialog_u24lambda_u24101.setImageResource(C3715R.drawable.neizzir20_ic_calendar);
        $this$showFaqDialog_u24lambda_u24101.setColorFilter(Color.parseColor("#00E5CC"));
        TextView $this$showFaqDialog_u24lambda_u24103 = new TextView(context);
        LinearLayout.LayoutParams $this$showFaqDialog_u24lambda_u24103_u24lambda_u24102 = new LinearLayout.LayoutParams(-2, -2);
        $this$showFaqDialog_u24lambda_u24103_u24lambda_u24102.setMarginStart(INSTANCE.dpToPx(context, 8));
        $this$showFaqDialog_u24lambda_u24103.setLayoutParams($this$showFaqDialog_u24lambda_u24103_u24lambda_u24102);
        $this$showFaqDialog_u24lambda_u24103.setText("Обновлено: " + updateDate);
        $this$showFaqDialog_u24lambda_u24103.setTextColor(Color.parseColor("#00E5CC"));
        $this$showFaqDialog_u24lambda_u24103.setTextSize(12.0f);
        $this$showFaqDialog_u24lambda_u24100.addView($this$showFaqDialog_u24lambda_u24101);
        $this$showFaqDialog_u24lambda_u24100.addView($this$showFaqDialog_u24lambda_u24103);
        $this$showFaqDialog_u24lambda_u2499.addView($this$showFaqDialog_u24lambda_u24100);
        $this$showFaqDialog_u24lambda_u2489.addView($this$showFaqDialog_u24lambda_u2499);
        LinearLayout $this$showFaqDialog_u24lambda_u24105 = new LinearLayout(context);
        $this$showFaqDialog_u24lambda_u24105.setOrientation(0);
        LinearLayout.LayoutParams $this$showFaqDialog_u24lambda_u24105_u24lambda_u24104 = new LinearLayout.LayoutParams(-1, -2);
        $this$showFaqDialog_u24lambda_u24105_u24lambda_u24104.topMargin = INSTANCE.dpToPx(context, 12);
        $this$showFaqDialog_u24lambda_u24105.setLayoutParams($this$showFaqDialog_u24lambda_u24105_u24lambda_u24104);
        MaterialButton $this$showFaqDialog_u24lambda_u24109 = new MaterialButton(context);
        LinearLayout.LayoutParams $this$showFaqDialog_u24lambda_u24109_u24lambda_u24106 = new LinearLayout.LayoutParams(0, INSTANCE.dpToPx(context, 40), 1.0f);
        $this$showFaqDialog_u24lambda_u24109_u24lambda_u24106.setMarginEnd(INSTANCE.dpToPx(context, 6));
        $this$showFaqDialog_u24lambda_u24109.setLayoutParams($this$showFaqDialog_u24lambda_u24109_u24lambda_u24106);
        $this$showFaqDialog_u24lambda_u24109.setText("🎯 Попадания");
        $this$showFaqDialog_u24lambda_u24109.setTextColor(-1);
        $this$showFaqDialog_u24lambda_u24109.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#1A3B82F6")));
        $this$showFaqDialog_u24lambda_u24109.setTextSize(11.0f);
        $this$showFaqDialog_u24lambda_u24109.setAllCaps(false);
        $this$showFaqDialog_u24lambda_u24109.setCornerRadius(INSTANCE.dpToPx(context, 10));
        $this$showFaqDialog_u24lambda_u24109.setElevation(0.0f);
        $this$showFaqDialog_u24lambda_u24109.setStateListAnimator(null);
        $this$showFaqDialog_u24lambda_u24109.setInsetTop(0);
        $this$showFaqDialog_u24lambda_u24109.setInsetBottom(0);
        $this$showFaqDialog_u24lambda_u24109.setPadding(INSTANCE.dpToPx(context, 8), 0, INSTANCE.dpToPx(context, 8), 0);
        $this$showFaqDialog_u24lambda_u24109.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dialogs.showFaqDialog$lambda$109$lambda$107(onPlayHitSounds, view);
            }
        });
        $this$showFaqDialog_u24lambda_u24109.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Dialogs.showFaqDialog$lambda$109$lambda$108(view, motionEvent);
            }
        });
        MaterialButton $this$showFaqDialog_u24lambda_u24113 = new MaterialButton(context);
        LinearLayout.LayoutParams $this$showFaqDialog_u24lambda_u24113_u24lambda_u24110 = new LinearLayout.LayoutParams(0, INSTANCE.dpToPx(context, 40), 1.0f);
        $this$showFaqDialog_u24lambda_u24113_u24lambda_u24110.setMarginStart(INSTANCE.dpToPx(context, 6));
        $this$showFaqDialog_u24lambda_u24113.setLayoutParams($this$showFaqDialog_u24lambda_u24113_u24lambda_u24110);
        $this$showFaqDialog_u24lambda_u24113.setText("🔫 Стрельба");
        $this$showFaqDialog_u24lambda_u24113.setTextColor(-1);
        $this$showFaqDialog_u24lambda_u24113.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#1AEF4444")));
        $this$showFaqDialog_u24lambda_u24113.setTextSize(11.0f);
        $this$showFaqDialog_u24lambda_u24113.setAllCaps(false);
        $this$showFaqDialog_u24lambda_u24113.setCornerRadius(INSTANCE.dpToPx(context, 10));
        $this$showFaqDialog_u24lambda_u24113.setElevation(0.0f);
        $this$showFaqDialog_u24lambda_u24113.setStateListAnimator(null);
        $this$showFaqDialog_u24lambda_u24113.setInsetTop(0);
        $this$showFaqDialog_u24lambda_u24113.setInsetBottom(0);
        $this$showFaqDialog_u24lambda_u24113.setPadding(INSTANCE.dpToPx(context, 8), 0, INSTANCE.dpToPx(context, 8), 0);
        $this$showFaqDialog_u24lambda_u24113.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dialogs.showFaqDialog$lambda$113$lambda$111(onPlayShootSounds, view);
            }
        });
        $this$showFaqDialog_u24lambda_u24113.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda6
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Dialogs.showFaqDialog$lambda$113$lambda$112(view, motionEvent);
            }
        });
        $this$showFaqDialog_u24lambda_u24105.addView($this$showFaqDialog_u24lambda_u24109);
        $this$showFaqDialog_u24lambda_u24105.addView($this$showFaqDialog_u24lambda_u24113);
        $this$showFaqDialog_u24lambda_u2489.addView($this$showFaqDialog_u24lambda_u24105);
        View $this$showFaqDialog_u24lambda_u24115 = new View(context);
        LinearLayout.LayoutParams $this$showFaqDialog_u24lambda_u24115_u24lambda_u24114 = new LinearLayout.LayoutParams(-1, INSTANCE.dpToPx(context, 1));
        $this$showFaqDialog_u24lambda_u24115_u24lambda_u24114.topMargin = INSTANCE.dpToPx(context, 16);
        $this$showFaqDialog_u24lambda_u24115_u24lambda_u24114.bottomMargin = INSTANCE.dpToPx(context, 16);
        $this$showFaqDialog_u24lambda_u24115.setLayoutParams($this$showFaqDialog_u24lambda_u24115_u24lambda_u24114);
        $this$showFaqDialog_u24lambda_u24115.setBackgroundColor(Color.parseColor("#1AFFFFFF"));
        $this$showFaqDialog_u24lambda_u2489.addView($this$showFaqDialog_u24lambda_u24115);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams $this$showFaqDialog_u24lambda_u24117_u24lambda_u24116 = new LinearLayout.LayoutParams(-1, 0);
        $this$showFaqDialog_u24lambda_u24117_u24lambda_u24116.weight = 1.0f;
        scrollView.setLayoutParams($this$showFaqDialog_u24lambda_u24117_u24lambda_u24116);
        MaterialCardView $this$showFaqDialog_u24lambda_u24118 = new MaterialCardView(context);
        $this$showFaqDialog_u24lambda_u24118.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        $this$showFaqDialog_u24lambda_u24118.setRadius(INSTANCE.dpToPx(context, 12));
        $this$showFaqDialog_u24lambda_u24118.setCardElevation(0.0f);
        $this$showFaqDialog_u24lambda_u24118.setCardBackgroundColor(Color.parseColor("#0DFFFFFF"));
        LinearLayout $this$showFaqDialog_u24lambda_u24119 = new LinearLayout(context);
        $this$showFaqDialog_u24lambda_u24119.setOrientation(1);
        $this$showFaqDialog_u24lambda_u24119.setPadding(INSTANCE.dpToPx(context, 14), INSTANCE.dpToPx(context, 12), INSTANCE.dpToPx(context, 14), INSTANCE.dpToPx(context, 12));
        String cleanFaqText = StringsKt__StringsKt.removePrefix(StringsKt__StringsKt.removePrefix(StringsKt__StringsKt.trim((CharSequence) StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(faqText, "▶️Послушать звуки попадания", "", false, 4, (Object) null), "▶️Послувать звуки стрельбы", "", false, 4, (Object) null), "▶️Послушать звуки стрельбы", "", false, 4, (Object) null)).toString(), (CharSequence) "\n"), (CharSequence) "\n");
        TextView $this$showFaqDialog_u24lambda_u24120 = new TextView(context);
        $this$showFaqDialog_u24lambda_u24120.setText(cleanFaqText.length() == 0 ? "Описание отсутствует" : cleanFaqText);
        $this$showFaqDialog_u24lambda_u24120.setTextColor(Color.parseColor(cleanFaqText.length() == 0 ? "#666666" : "#CCCCCC"));
        $this$showFaqDialog_u24lambda_u24120.setTextSize(13.0f);
        $this$showFaqDialog_u24lambda_u24120.setLineSpacing(INSTANCE.dpToPx(context, 3), 1.0f);
        $this$showFaqDialog_u24lambda_u24119.addView($this$showFaqDialog_u24lambda_u24120);
        $this$showFaqDialog_u24lambda_u24118.addView($this$showFaqDialog_u24lambda_u24119);
        scrollView.addView($this$showFaqDialog_u24lambda_u24118);
        int i = context.getResources().getDisplayMetrics().heightPixels / 3;
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        $this$showFaqDialog_u24lambda_u2489.addView(scrollView);
        MaterialButton $this$showFaqDialog_u24lambda_u24125 = new MaterialButton(context);
        LinearLayout.LayoutParams $this$showFaqDialog_u24lambda_u24125_u24lambda_u24122 = new LinearLayout.LayoutParams(-1, INSTANCE.dpToPx(context, 46));
        $this$showFaqDialog_u24lambda_u24125_u24lambda_u24122.topMargin = INSTANCE.dpToPx(context, 16);
        $this$showFaqDialog_u24lambda_u24125.setLayoutParams($this$showFaqDialog_u24lambda_u24125_u24lambda_u24122);
        $this$showFaqDialog_u24lambda_u24125.setText("Закрыть");
        $this$showFaqDialog_u24lambda_u24125.setTextColor(Color.parseColor(TCPSettingsManager.COLOR_HINT));
        $this$showFaqDialog_u24lambda_u24125.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#1AFFFFFF")));
        $this$showFaqDialog_u24lambda_u24125.setTextSize(14.0f);
        $this$showFaqDialog_u24lambda_u24125.setAllCaps(false);
        $this$showFaqDialog_u24lambda_u24125.setCornerRadius(INSTANCE.dpToPx(context, 12));
        $this$showFaqDialog_u24lambda_u24125.setElevation(0.0f);
        $this$showFaqDialog_u24lambda_u24125.setStateListAnimator(null);
        $this$showFaqDialog_u24lambda_u24125.setInsetTop(0);
        $this$showFaqDialog_u24lambda_u24125.setInsetBottom(0);
        $this$showFaqDialog_u24lambda_u24125.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dialogs.showFaqDialog$lambda$125$lambda$123($this$showFaqDialog_u24lambda_u2483, view);
            }
        });
        $this$showFaqDialog_u24lambda_u24125.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.neizzir.fragments.sborks.ui.Dialogs$$ExternalSyntheticLambda8
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Dialogs.showFaqDialog$lambda$125$lambda$124(view, motionEvent);
            }
        });
        $this$showFaqDialog_u24lambda_u2489.addView($this$showFaqDialog_u24lambda_u24125);
        $this$showFaqDialog_u24lambda_u2488.addView($this$showFaqDialog_u24lambda_u2489);
        $this$showFaqDialog_u24lambda_u2485.addView($this$showFaqDialog_u24lambda_u2488);
        $this$showFaqDialog_u24lambda_u2483.setContentView($this$showFaqDialog_u24lambda_u2485);
        Window $this$showFaqDialog_u24lambda_u24126 = $this$showFaqDialog_u24lambda_u2483.getWindow();
        if ($this$showFaqDialog_u24lambda_u24126 != null) {
            $this$showFaqDialog_u24lambda_u24126.setBackgroundDrawable(new ColorDrawable(0));
            $this$showFaqDialog_u24lambda_u24126.setLayout(-1, -1);
        }
        $this$showFaqDialog_u24lambda_u2483.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFaqDialog$lambda$85$lambda$84(Dialog dialog, View it) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFaqDialog$lambda$88$lambda$87(View it) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFaqDialog$lambda$109$lambda$107(Function0 onPlayHitSounds, View it) {
        Intrinsics.checkNotNullParameter(onPlayHitSounds, "$onPlayHitSounds");
        onPlayHitSounds.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showFaqDialog$lambda$109$lambda$108(View v, MotionEvent event) {
        switch (event.getActionMasked()) {
            case 0:
                v.animate().scaleX(0.95f).scaleY(0.95f).setDuration(80L).start();
                break;
            case 1:
            case 3:
                v.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80L).start();
                break;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFaqDialog$lambda$113$lambda$111(Function0 onPlayShootSounds, View it) {
        Intrinsics.checkNotNullParameter(onPlayShootSounds, "$onPlayShootSounds");
        onPlayShootSounds.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showFaqDialog$lambda$113$lambda$112(View v, MotionEvent event) {
        switch (event.getActionMasked()) {
            case 0:
                v.animate().scaleX(0.95f).scaleY(0.95f).setDuration(80L).start();
                break;
            case 1:
            case 3:
                v.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80L).start();
                break;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFaqDialog$lambda$125$lambda$123(Dialog dialog, View it) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showFaqDialog$lambda$125$lambda$124(View v, MotionEvent event) {
        switch (event.getActionMasked()) {
            case 0:
                v.animate().scaleX(0.97f).scaleY(0.97f).setDuration(80L).start();
                break;
            case 1:
            case 3:
                v.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80L).start();
                break;
        }
        return false;
    }
}
