package com.blackhub.bronline.neizzir.fragments.help;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.C3715R;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import com.blackhub.bronline.neizzir.video.VideoPlayerManager;
import com.google.android.material.card.MaterialCardView;
import com.helpshift.proactive.InAppViewConstants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HelpFragment.kt */
/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
@Metadata(m4415d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0002+,B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J$\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J \u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002JP\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\bH\u0002J4\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0002J4\u0010 \u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0002J4\u0010!\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010#\u001a\u00020\rH\u0002J$\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016¨\u0006-"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/help/HelpFragment;", "Landroidx/fragment/app/Fragment;", "()V", "copyToClipboard", "", "ctx", "Landroid/content/Context;", "text", "", "createInfoCard", "Landroid/view/View;", CalendarKeys.DAYS_GAME_KEY, "Lkotlin/Function1;", "", "createRippleCircle", "Landroid/graphics/drawable/GradientDrawable;", "size", "createRippleDrawable", "createRoundedBg", "colorHex", "alpha", "", InAppViewConstants.RADIUS, "makeCommandCard", "command", "description", "iconRes", "color", "videoKey", "makeExampleCard", "title", "example", "makeInfoItem", "makeSectionTitle", "Landroid/widget/TextView;", "topMargin", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "saved", "Landroid/os/Bundle;", "CommandItem", "Companion", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
public final class HelpFragment extends Fragment {
    private static final String COLOR_ACCENT = "#00E5CC";
    private static final String COLOR_AIM = "#EF4444";
    private static final String COLOR_BASIC = "#3B82F6";
    private static final String COLOR_BG = "#0A0A0F";
    private static final String COLOR_CARD = "#1A1A1F";
    private static final String COLOR_DAMAGE = "#EF4444";
    private static final String COLOR_DIVIDER = "#2D2D35";
    private static final String COLOR_HINT = "#808080";
    private static final String COLOR_HPBAR = "#10B981";
    private static final String COLOR_INFO = "#F59E0B";
    private static final String COLOR_PURPLE = "#A855F7";
    private static final String COLOR_TEXT = "#FFFFFF";
    private static final String COLOR_VISUAL = "#22C55E";

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saved) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context ctx = requireContext();
        Intrinsics.checkNotNullExpressionValue(ctx, "requireContext(...)");
        final float density = ctx.getResources().getDisplayMetrics().density;
        Function1<Integer, Integer> function1 = new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.neizzir.fragments.help.HelpFragment$onCreateView$dp$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Integer invoke(int v) {
                return Integer.valueOf((int) (v * density));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        };
        ScrollView $this$onCreateView_u24lambda_u240 = new ScrollView(ctx);
        $this$onCreateView_u24lambda_u240.setBackgroundColor(Color.parseColor("#0A0A0F"));
        $this$onCreateView_u24lambda_u240.setFillViewport(true);
        LinearLayout $this$onCreateView_u24lambda_u241 = new LinearLayout(ctx);
        $this$onCreateView_u24lambda_u241.setOrientation(1);
        $this$onCreateView_u24lambda_u241.setPadding(function1.invoke(20).intValue(), function1.invoke(24).intValue(), function1.invoke(20).intValue(), function1.invoke(100).intValue());
        $this$onCreateView_u24lambda_u240.addView($this$onCreateView_u24lambda_u241);
        LinearLayout $this$onCreateView_u24lambda_u242 = new LinearLayout(ctx);
        $this$onCreateView_u24lambda_u242.setOrientation(0);
        $this$onCreateView_u24lambda_u242.setGravity(16);
        LinearLayout header = $this$onCreateView_u24lambda_u242;
        FrameLayout $this$onCreateView_u24lambda_u244 = new FrameLayout(ctx);
        $this$onCreateView_u24lambda_u244.setBackground(createRippleCircle(function1.invoke(40).intValue()));
        $this$onCreateView_u24lambda_u244.setLayoutParams(new LinearLayout.LayoutParams(function1.invoke(40).intValue(), function1.invoke(40).intValue()));
        $this$onCreateView_u24lambda_u244.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.help.HelpFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HelpFragment.onCreateView$lambda$4$lambda$3(this.f$0, view);
            }
        });
        ImageView $this$onCreateView_u24lambda_u245 = new ImageView(ctx);
        $this$onCreateView_u24lambda_u245.setImageResource(C3715R.drawable.neizzir19_ic_arrow_back);
        $this$onCreateView_u24lambda_u245.setColorFilter(-1);
        Integer num = 16;
        $this$onCreateView_u24lambda_u245.setLayoutParams(new FrameLayout.LayoutParams(function1.invoke(24).intValue(), function1.invoke(24).intValue(), 17));
        $this$onCreateView_u24lambda_u244.addView($this$onCreateView_u24lambda_u245);
        TextView $this$onCreateView_u24lambda_u247 = new TextView(ctx);
        $this$onCreateView_u24lambda_u247.setText("Справочник");
        $this$onCreateView_u24lambda_u247.setTextColor(Color.parseColor("#FFFFFF"));
        $this$onCreateView_u24lambda_u247.setTextSize(24.0f);
        $this$onCreateView_u24lambda_u247.setTypeface($this$onCreateView_u24lambda_u247.getTypeface(), 1);
        LinearLayout.LayoutParams $this$onCreateView_u24lambda_u247_u24lambda_u246 = new LinearLayout.LayoutParams(-2, -2);
        $this$onCreateView_u24lambda_u247_u24lambda_u246.setMarginStart(function1.invoke(12).intValue());
        $this$onCreateView_u24lambda_u247.setLayoutParams($this$onCreateView_u24lambda_u247_u24lambda_u246);
        header.addView($this$onCreateView_u24lambda_u244);
        header.addView($this$onCreateView_u24lambda_u247);
        $this$onCreateView_u24lambda_u241.addView(header);
        View infoCard = createInfoCard(ctx, function1);
        $this$onCreateView_u24lambda_u241.addView(infoCard);
        $this$onCreateView_u24lambda_u241.addView(makeSectionTitle(ctx, "Базовые команды", function1, function1.invoke(24).intValue()));
        Iterable basicCommands = CollectionsKt__CollectionsKt.listOf((Object[]) new CommandItem[]{new CommandItem("/hpbar", "включить/отключить кастомную полоску ХП", C3715R.drawable.neizzir11_ic_hpbar, "hpbar2"), new CommandItem("/settime (время)", "установить указанное время", C3715R.drawable.neizzir19_ic_clock, "settime"), new CommandItem("/setskin (ID)", "выдать скин по ID", C3715R.drawable.neizzir19_ic_body, "setskin"), new CommandItem("/setfov (0-200)", "изменить угол обзора", C3715R.drawable.neizzir19_ic_target, "setfov"), new CommandItem("/caspect (X Y)", "настроить растяг экрана", C3715R.drawable.neizzir_ic_rastyag, "caspect"), new CommandItem("/tcp [ID]", "изменить таймус, 0 = выключить присет", C3715R.drawable.neizzir19_ic_clock, "tcp"), new CommandItem("/duckanim", "Вкл/выкл сбив переката", C3715R.drawable.neizzir19_ic_run, "duckanim"), new CommandItem("/ducktime [время]", "Установить время когда сработает сбив переката", C3715R.drawable.neizzir19_ic_clock, "ducktime"), new CommandItem("/fturn", "быстрый поворот", C3715R.drawable.neizzir19_ic_forward, "fturn"), new CommandItem("/timescale", "изменить скорость игры", C3715R.drawable.neizzir19_ic_speed, "timescale")});
        Iterable $this$forEach$iv = basicCommands;
        for (Object element$iv : $this$forEach$iv) {
            CommandItem cmd = (CommandItem) element$iv;
            $this$onCreateView_u24lambda_u241.addView(makeCommandCard(ctx, function1, cmd.getCommand(), cmd.getDescription(), cmd.getIcon(), "#3B82F6", cmd.getVideoKey()));
            infoCard = infoCard;
            header = header;
            num = num;
        }
        Integer num2 = num;
        $this$onCreateView_u24lambda_u241.addView(makeSectionTitle(ctx, "Визуальные настройки", function1, function1.invoke(num2).intValue()));
        Iterable visualCommands = CollectionsKt__CollectionsKt.listOf((Object[]) new CommandItem[]{new CommandItem("/setndist (0-500)", "дальность прорисовки ников", C3715R.drawable.neizzir19_ic_target, "setndist"), new CommandItem("/setdist (0-1000)", "дальность прорисовки объектов", C3715R.drawable.neizzir19_ic_target, "setdist"), new CommandItem("/tracer", "вкл/выкл трайсер пуль", C3715R.drawable.neizzir19_ic_tracer, "tracer"), new CommandItem("/cplate (тип) (ID) (номера) (регион)", "сменить номера на машине", C3715R.drawable.neizzir19_ic_car, "cplate")});
        Iterable $this$forEach$iv2 = visualCommands;
        for (Object element$iv2 : $this$forEach$iv2) {
            CommandItem cmd2 = (CommandItem) element$iv2;
            $this$onCreateView_u24lambda_u241.addView(makeCommandCard(ctx, function1, cmd2.getCommand(), cmd2.getDescription(), cmd2.getIcon(), "#22C55E", cmd2.getVideoKey()));
        }
        $this$onCreateView_u24lambda_u241.addView(makeExampleCard(ctx, function1, "Пример команды /cplate", "/cplate 1 6 777AAA 02\nТип: 1, ID машины: 6, Номера: 777AAA, Регион: 02\n\nID машины можно посмотреть через /dl Network id"));
        $this$onCreateView_u24lambda_u241.addView(makeSectionTitle(ctx, "Редактирование HP Bar", function1, function1.invoke(num2).intValue()));
        int i = 7;
        Iterable hpbarCommands = CollectionsKt__CollectionsKt.listOf((Object[]) new CommandItem[]{new CommandItem("/taghptext", "вкл/выкл текст ХП", C3715R.drawable.neizzir11_ic_hpbar, null), new CommandItem("/taggap [1.2]", "отступ от ника до HP-бара", C3715R.drawable.neizzir11_ic_hpbar, null), new CommandItem("/taghpwth [24]", "ширина HP-бара", C3715R.drawable.neizzir11_ic_hpbar, null), new CommandItem("/taghpht [16]", "высота HP-бара", C3715R.drawable.neizzir11_ic_hpbar, null), new CommandItem("/tagoutl [2]", "толщина бордера HP-бара", C3715R.drawable.neizzir11_ic_hpbar, null), new CommandItem("/tagrad [7]", "скругление углов", C3715R.drawable.neizzir11_ic_hpbar, null), new CommandItem("/tagarmgap [13]", "зазор между HP и Armor", C3715R.drawable.neizzir11_ic_hpbar, null), new CommandItem("/taghpcol <color>", "цвет HP", C3715R.drawable.neizzir19_ic_palette, null), new CommandItem("/taghpbg <color>", "фон HP", C3715R.drawable.neizzir19_ic_palette, null), new CommandItem("/taghpbdr <color>", "рамка HP", C3715R.drawable.neizzir19_ic_palette, null), new CommandItem("/taghptextcol <color>", "цвет текста HP", C3715R.drawable.neizzir19_ic_palette, null), new CommandItem("/tagacol <color>", "цвет Armor", C3715R.drawable.neizzir19_ic_palette, null), new CommandItem("/tagabg <color>", "фон Armor", C3715R.drawable.neizzir19_ic_palette, null)});
        Iterable $this$forEach$iv3 = hpbarCommands;
        for (Object element$iv3 : $this$forEach$iv3) {
            CommandItem cmd3 = (CommandItem) element$iv3;
            $this$onCreateView_u24lambda_u241.addView(makeCommandCard(ctx, function1, cmd3.getCommand(), cmd3.getDescription(), cmd3.getIcon(), "#10B981", cmd3.getVideoKey()));
            i = i;
            density = density;
        }
        $this$onCreateView_u24lambda_u241.addView(makeSectionTitle(ctx, "Damage Informer", function1, function1.invoke(num2).intValue()));
        CommandItem[] commandItemArr = new CommandItem[i];
        String str = null;
        commandItemArr[0] = new CommandItem("/dmgs", "вкл/выкл", C3715R.drawable.neizzir19_ic_damage, null);
        commandItemArr[1] = new CommandItem("/dmgtextsize [1.2]", "изменить размер текста", C3715R.drawable.neizzir19_ic_damage, null);
        commandItemArr[2] = new CommandItem("/dmgtime [3]", "время исчезновения текста", C3715R.drawable.neizzir19_ic_damage, null);
        commandItemArr[3] = new CommandItem("/dmgspeed [0.35]", "скорость движения текста", C3715R.drawable.neizzir19_ic_damage, null);
        commandItemArr[4] = new CommandItem("/dmgcolor <color>", "изменить цвет текста", C3715R.drawable.neizzir19_ic_damage, null);
        commandItemArr[5] = new CommandItem("/dmgshadow", "вкл/выкл тени текста", C3715R.drawable.neizzir19_ic_damage, null);
        commandItemArr[6] = new CommandItem("/dmgsha [102]", "изменить альфа тени", C3715R.drawable.neizzir19_ic_damage, null);
        Iterable damageCommands = CollectionsKt__CollectionsKt.listOf((Object[]) commandItemArr);
        Iterable $this$forEach$iv4 = damageCommands;
        for (Object element$iv4 : $this$forEach$iv4) {
            CommandItem cmd4 = (CommandItem) element$iv4;
            $this$onCreateView_u24lambda_u241.addView(makeCommandCard(ctx, function1, cmd4.getCommand(), cmd4.getDescription(), cmd4.getIcon(), "#EF4444", cmd4.getVideoKey()));
            str = str;
        }
        String str2 = str;
        $this$onCreateView_u24lambda_u241.addView(makeSectionTitle(ctx, "Тренировка прицеливания", function1, function1.invoke(num2).intValue()));
        Iterable aimCommands = CollectionsKt__CollectionsKt.listOf((Object[]) new CommandItem[]{new CommandItem("/aimhelp", "все команды для тренировки", C3715R.drawable.neizzir9_ic_help, "aimhelp"), new CommandItem("/aimtrain [on/off]", "режим тренировки", C3715R.drawable.neizzir19_ic_target, str2), new CommandItem("/aimconfig [имя]", "создать/выбрать конфиг", C3715R.drawable.neizzir19_ic_settings, str2), new CommandItem("/aimtraininfo", "информация о конфиге", C3715R.drawable.neizzir19_ic_info, str2), new CommandItem("/aimtrainlist", "список конфигов", C3715R.drawable.neizzir15_ic_commands, str2), new CommandItem("/aimtrainremove [имя]", "удалить конфиг", C3715R.drawable.neizzir19_ic_close, str2), new CommandItem("/aimsaveconfig", "сохранить конфиг", C3715R.drawable.neizzir19_ic_check, str2), new CommandItem("/aimaddtarget", "добавить мишень", C3715R.drawable.neizzir19_ic_target, str2), new CommandItem("/aimsethp", "задать HP мишеней", C3715R.drawable.neizzir11_ic_hpbar, str2), new CommandItem("/aimdamage on/off", "информатор урона", C3715R.drawable.neizzir19_ic_damage, str2)});
        Iterable $this$forEach$iv5 = aimCommands;
        for (Object element$iv5 : $this$forEach$iv5) {
            CommandItem cmd5 = (CommandItem) element$iv5;
            $this$onCreateView_u24lambda_u241.addView(makeCommandCard(ctx, function1, cmd5.getCommand(), cmd5.getDescription(), cmd5.getIcon(), "#EF4444", cmd5.getVideoKey()));
        }
        $this$onCreateView_u24lambda_u241.addView(makeSectionTitle(ctx, "Полезная информация", function1, function1.invoke(num2).intValue()));
        Iterable infoItems = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m4423to("Установка сборок", "Меню → Установить → выберите ZIP или папку 1NEIZZIR/Assembly. Доступ ко всем файлам нужен только для папки. Если доступ уже выдан, сборка из папки также устанавливается при нажатии «Играть»."), TuplesKt.m4423to("Установка .so модулей", "Модули загружаются из 1NEIZZIR/Modules/"), TuplesKt.m4423to("Папка 1NEIZZIR", "Зайдите в меню → открыть com.br.top, выдайте разрешения и перезапустите")});
        Iterable $this$forEach$iv6 = infoItems;
        for (Object element$iv6 : $this$forEach$iv6) {
            Pair pair = (Pair) element$iv6;
            String title = (String) pair.component1();
            String desc = (String) pair.component2();
            $this$onCreateView_u24lambda_u241.addView(makeInfoItem(ctx, function1, title, desc));
        }
        return $this$onCreateView_u24lambda_u240;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$4$lambda$3(HelpFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getParentFragmentManager().popBackStack();
    }

    private final View createInfoCard(Context ctx, Function1<? super Integer, Integer> dp) {
        MaterialCardView card = new MaterialCardView(ctx);
        card.setRadius(dp.invoke(16).intValue());
        card.setCardElevation(0.0f);
        card.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        card.setStrokeWidth(0);
        LinearLayout.LayoutParams $this$createInfoCard_u24lambda_u2415_u24lambda_u2414 = new LinearLayout.LayoutParams(-1, -2);
        $this$createInfoCard_u24lambda_u2415_u24lambda_u2414.topMargin = dp.invoke(20).intValue();
        card.setLayoutParams($this$createInfoCard_u24lambda_u2415_u24lambda_u2414);
        LinearLayout content = new LinearLayout(ctx);
        content.setOrientation(0);
        content.setGravity(16);
        content.setPadding(dp.invoke(16).intValue(), dp.invoke(14).intValue(), dp.invoke(16).intValue(), dp.invoke(14).intValue());
        FrameLayout iconBg = new FrameLayout(ctx);
        iconBg.setBackground(createRoundedBg("#A855F7", 0.15f, dp.invoke(12).intValue()));
        iconBg.setLayoutParams(new LinearLayout.LayoutParams(dp.invoke(44).intValue(), dp.invoke(44).intValue()));
        ImageView $this$createInfoCard_u24lambda_u2418 = new ImageView(ctx);
        $this$createInfoCard_u24lambda_u2418.setImageResource(C3715R.drawable.neizzir9_ic_help);
        $this$createInfoCard_u24lambda_u2418.setColorFilter(Color.parseColor("#A855F7"));
        $this$createInfoCard_u24lambda_u2418.setLayoutParams(new FrameLayout.LayoutParams(dp.invoke(24).intValue(), dp.invoke(24).intValue(), 17));
        iconBg.addView($this$createInfoCard_u24lambda_u2418);
        LinearLayout texts = new LinearLayout(ctx);
        texts.setOrientation(1);
        LinearLayout.LayoutParams $this$createInfoCard_u24lambda_u2420_u24lambda_u2419 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$createInfoCard_u24lambda_u2420_u24lambda_u2419.setMarginStart(dp.invoke(14).intValue());
        texts.setLayoutParams($this$createInfoCard_u24lambda_u2420_u24lambda_u2419);
        TextView $this$createInfoCard_u24lambda_u2421 = new TextView(ctx);
        $this$createInfoCard_u24lambda_u2421.setText("Команды лаунчера");
        $this$createInfoCard_u24lambda_u2421.setTextColor(Color.parseColor("#FFFFFF"));
        $this$createInfoCard_u24lambda_u2421.setTextSize(16.0f);
        $this$createInfoCard_u24lambda_u2421.setTypeface($this$createInfoCard_u24lambda_u2421.getTypeface(), 1);
        TextView $this$createInfoCard_u24lambda_u2422 = new TextView(ctx);
        $this$createInfoCard_u24lambda_u2422.setText("Нажмите на команду, чтобы скопировать");
        $this$createInfoCard_u24lambda_u2422.setTextColor(Color.parseColor("#808080"));
        $this$createInfoCard_u24lambda_u2422.setTextSize(12.0f);
        texts.addView($this$createInfoCard_u24lambda_u2421);
        texts.addView($this$createInfoCard_u24lambda_u2422);
        content.addView(iconBg);
        content.addView(texts);
        card.addView(content);
        return card;
    }

    private final TextView makeSectionTitle(Context ctx, String text, Function1<? super Integer, Integer> dp, int topMargin) {
        TextView $this$makeSectionTitle_u24lambda_u2424 = new TextView(ctx);
        $this$makeSectionTitle_u24lambda_u2424.setText(text);
        $this$makeSectionTitle_u24lambda_u2424.setTextColor(Color.parseColor("#808080"));
        $this$makeSectionTitle_u24lambda_u2424.setTextSize(13.0f);
        $this$makeSectionTitle_u24lambda_u2424.setTypeface($this$makeSectionTitle_u24lambda_u2424.getTypeface(), 1);
        LinearLayout.LayoutParams $this$makeSectionTitle_u24lambda_u2424_u24lambda_u2423 = new LinearLayout.LayoutParams(-2, -2);
        $this$makeSectionTitle_u24lambda_u2424_u24lambda_u2423.topMargin = topMargin;
        $this$makeSectionTitle_u24lambda_u2424_u24lambda_u2423.bottomMargin = dp.invoke(12).intValue();
        $this$makeSectionTitle_u24lambda_u2424.setLayoutParams($this$makeSectionTitle_u24lambda_u2424_u24lambda_u2423);
        return $this$makeSectionTitle_u24lambda_u2424;
    }

    static /* synthetic */ View makeCommandCard$default(HelpFragment helpFragment, Context context, Function1 function1, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        String str5;
        if ((i2 & 64) == 0) {
            str5 = str4;
        } else {
            str5 = null;
        }
        return helpFragment.makeCommandCard(context, function1, str, str2, i, str3, str5);
    }

    private final View makeCommandCard(final Context ctx, Function1<? super Integer, Integer> dp, final String command, final String description, int iconRes, String color, final String videoKey) {
        MaterialCardView $this$makeCommandCard_u24lambda_u2428 = new MaterialCardView(ctx);
        $this$makeCommandCard_u24lambda_u2428.setRadius(dp.invoke(16).intValue());
        $this$makeCommandCard_u24lambda_u2428.setCardElevation(0.0f);
        $this$makeCommandCard_u24lambda_u2428.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        $this$makeCommandCard_u24lambda_u2428.setStrokeWidth(0);
        $this$makeCommandCard_u24lambda_u2428.setClickable(true);
        $this$makeCommandCard_u24lambda_u2428.setFocusable(true);
        LinearLayout.LayoutParams $this$makeCommandCard_u24lambda_u2428_u24lambda_u2425 = new LinearLayout.LayoutParams(-1, -2);
        $this$makeCommandCard_u24lambda_u2428_u24lambda_u2425.bottomMargin = dp.invoke(8).intValue();
        $this$makeCommandCard_u24lambda_u2428.setLayoutParams($this$makeCommandCard_u24lambda_u2428_u24lambda_u2425);
        $this$makeCommandCard_u24lambda_u2428.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.help.HelpFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HelpFragment.makeCommandCard$lambda$28$lambda$26(this.f$0, ctx, command, view);
            }
        });
        $this$makeCommandCard_u24lambda_u2428.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.help.HelpFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return HelpFragment.makeCommandCard$lambda$28$lambda$27(this.f$0, ctx, command, description, view);
            }
        });
        LinearLayout content = new LinearLayout(ctx);
        content.setOrientation(1);
        LinearLayout $this$makeCommandCard_u24lambda_u2430 = new LinearLayout(ctx);
        $this$makeCommandCard_u24lambda_u2430.setOrientation(0);
        $this$makeCommandCard_u24lambda_u2430.setGravity(16);
        $this$makeCommandCard_u24lambda_u2430.setPadding(dp.invoke(14).intValue(), dp.invoke(12).intValue(), dp.invoke(14).intValue(), dp.invoke(12).intValue());
        FrameLayout $this$makeCommandCard_u24lambda_u2431 = new FrameLayout(ctx);
        $this$makeCommandCard_u24lambda_u2431.setBackground(createRoundedBg(color, 0.15f, dp.invoke(10).intValue()));
        $this$makeCommandCard_u24lambda_u2431.setLayoutParams(new LinearLayout.LayoutParams(dp.invoke(36).intValue(), dp.invoke(36).intValue()));
        ImageView $this$makeCommandCard_u24lambda_u2432 = new ImageView(ctx);
        $this$makeCommandCard_u24lambda_u2432.setImageResource(iconRes);
        $this$makeCommandCard_u24lambda_u2432.setColorFilter(Color.parseColor(color));
        $this$makeCommandCard_u24lambda_u2432.setLayoutParams(new FrameLayout.LayoutParams(dp.invoke(20).intValue(), dp.invoke(20).intValue(), 17));
        $this$makeCommandCard_u24lambda_u2431.addView($this$makeCommandCard_u24lambda_u2432);
        LinearLayout $this$makeCommandCard_u24lambda_u2434 = new LinearLayout(ctx);
        $this$makeCommandCard_u24lambda_u2434.setOrientation(1);
        LinearLayout.LayoutParams $this$makeCommandCard_u24lambda_u2434_u24lambda_u2433 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$makeCommandCard_u24lambda_u2434_u24lambda_u2433.setMarginStart(dp.invoke(12).intValue());
        $this$makeCommandCard_u24lambda_u2434.setLayoutParams($this$makeCommandCard_u24lambda_u2434_u24lambda_u2433);
        TextView $this$makeCommandCard_u24lambda_u2435 = new TextView(ctx);
        $this$makeCommandCard_u24lambda_u2435.setText(command);
        $this$makeCommandCard_u24lambda_u2435.setTextColor(Color.parseColor(color));
        $this$makeCommandCard_u24lambda_u2435.setTextSize(14.0f);
        $this$makeCommandCard_u24lambda_u2435.setTypeface(Typeface.MONOSPACE, 1);
        TextView $this$makeCommandCard_u24lambda_u2436 = new TextView(ctx);
        $this$makeCommandCard_u24lambda_u2436.setText(description);
        $this$makeCommandCard_u24lambda_u2436.setTextColor(Color.parseColor("#B0FFFFFF"));
        $this$makeCommandCard_u24lambda_u2436.setTextSize(12.0f);
        $this$makeCommandCard_u24lambda_u2434.addView($this$makeCommandCard_u24lambda_u2435);
        $this$makeCommandCard_u24lambda_u2434.addView($this$makeCommandCard_u24lambda_u2436);
        ImageView $this$makeCommandCard_u24lambda_u2437 = new ImageView(ctx);
        $this$makeCommandCard_u24lambda_u2437.setImageResource(C3715R.drawable.neizzir19_ic_copy);
        $this$makeCommandCard_u24lambda_u2437.setColorFilter(Color.parseColor("#808080"));
        $this$makeCommandCard_u24lambda_u2437.setLayoutParams(new LinearLayout.LayoutParams(dp.invoke(20).intValue(), dp.invoke(20).intValue()));
        $this$makeCommandCard_u24lambda_u2430.addView($this$makeCommandCard_u24lambda_u2431);
        $this$makeCommandCard_u24lambda_u2430.addView($this$makeCommandCard_u24lambda_u2434);
        $this$makeCommandCard_u24lambda_u2430.addView($this$makeCommandCard_u24lambda_u2437);
        content.addView($this$makeCommandCard_u24lambda_u2430);
        if (videoKey != null) {
            View $this$makeCommandCard_u24lambda_u2439 = new View(ctx);
            $this$makeCommandCard_u24lambda_u2439.setBackgroundColor(Color.parseColor("#2D2D35"));
            LinearLayout.LayoutParams $this$makeCommandCard_u24lambda_u2439_u24lambda_u2438 = new LinearLayout.LayoutParams(-1, dp.invoke(1).intValue());
            $this$makeCommandCard_u24lambda_u2439_u24lambda_u2438.setMarginStart(dp.invoke(14).intValue());
            $this$makeCommandCard_u24lambda_u2439_u24lambda_u2438.setMarginEnd(dp.invoke(14).intValue());
            $this$makeCommandCard_u24lambda_u2439.setLayoutParams($this$makeCommandCard_u24lambda_u2439_u24lambda_u2438);
            content.addView($this$makeCommandCard_u24lambda_u2439);
            LinearLayout $this$makeCommandCard_u24lambda_u2441 = new LinearLayout(ctx);
            $this$makeCommandCard_u24lambda_u2441.setOrientation(0);
            $this$makeCommandCard_u24lambda_u2441.setGravity(17);
            $this$makeCommandCard_u24lambda_u2441.setPadding(dp.invoke(14).intValue(), dp.invoke(8).intValue(), dp.invoke(14).intValue(), dp.invoke(8).intValue());
            $this$makeCommandCard_u24lambda_u2441.setClickable(true);
            $this$makeCommandCard_u24lambda_u2441.setFocusable(true);
            $this$makeCommandCard_u24lambda_u2441.setBackground(createRippleDrawable());
            $this$makeCommandCard_u24lambda_u2441.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.neizzir.fragments.help.HelpFragment$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HelpFragment.makeCommandCard$lambda$41$lambda$40(ctx, videoKey, view);
                }
            });
            ImageView $this$makeCommandCard_u24lambda_u2442 = new ImageView(ctx);
            $this$makeCommandCard_u24lambda_u2442.setImageResource(C3715R.drawable.neizzir19_ic_play_video);
            $this$makeCommandCard_u24lambda_u2442.setColorFilter(Color.parseColor("#808080"));
            $this$makeCommandCard_u24lambda_u2442.setLayoutParams(new LinearLayout.LayoutParams(dp.invoke(18).intValue(), dp.invoke(18).intValue()));
            TextView $this$makeCommandCard_u24lambda_u2444 = new TextView(ctx);
            $this$makeCommandCard_u24lambda_u2444.setText("Видео обзор");
            $this$makeCommandCard_u24lambda_u2444.setTextColor(Color.parseColor("#808080"));
            $this$makeCommandCard_u24lambda_u2444.setTextSize(13.0f);
            $this$makeCommandCard_u24lambda_u2444.setTypeface($this$makeCommandCard_u24lambda_u2444.getTypeface(), 1);
            LinearLayout.LayoutParams $this$makeCommandCard_u24lambda_u2444_u24lambda_u2443 = new LinearLayout.LayoutParams(-2, -2);
            $this$makeCommandCard_u24lambda_u2444_u24lambda_u2443.setMarginStart(dp.invoke(8).intValue());
            $this$makeCommandCard_u24lambda_u2444.setLayoutParams($this$makeCommandCard_u24lambda_u2444_u24lambda_u2443);
            $this$makeCommandCard_u24lambda_u2441.addView($this$makeCommandCard_u24lambda_u2442);
            $this$makeCommandCard_u24lambda_u2441.addView($this$makeCommandCard_u24lambda_u2444);
            content.addView($this$makeCommandCard_u24lambda_u2441);
        }
        $this$makeCommandCard_u24lambda_u2428.addView(content);
        return $this$makeCommandCard_u24lambda_u2428;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void makeCommandCard$lambda$28$lambda$26(HelpFragment this$0, Context ctx, String command, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ctx, "$ctx");
        Intrinsics.checkNotNullParameter(command, "$command");
        this$0.copyToClipboard(ctx, command);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean makeCommandCard$lambda$28$lambda$27(HelpFragment this$0, Context ctx, String command, String description, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ctx, "$ctx");
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(description, "$description");
        this$0.copyToClipboard(ctx, command + " — " + description);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void makeCommandCard$lambda$41$lambda$40(Context ctx, String $videoKey, View it) {
        Intrinsics.checkNotNullParameter(ctx, "$ctx");
        VideoPlayerManager.INSTANCE.showVideo(ctx, $videoKey);
    }

    private final View makeExampleCard(Context ctx, Function1<? super Integer, Integer> dp, String title, String example) {
        MaterialCardView card = new MaterialCardView(ctx);
        card.setRadius(dp.invoke(16).intValue());
        card.setCardElevation(0.0f);
        card.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        card.setStrokeWidth(dp.invoke(1).intValue());
        card.setStrokeColor(Color.parseColor("#00E5CC"));
        LinearLayout.LayoutParams $this$makeExampleCard_u24lambda_u2446_u24lambda_u2445 = new LinearLayout.LayoutParams(-1, -2);
        $this$makeExampleCard_u24lambda_u2446_u24lambda_u2445.bottomMargin = dp.invoke(12).intValue();
        $this$makeExampleCard_u24lambda_u2446_u24lambda_u2445.topMargin = dp.invoke(4).intValue();
        card.setLayoutParams($this$makeExampleCard_u24lambda_u2446_u24lambda_u2445);
        LinearLayout content = new LinearLayout(ctx);
        content.setOrientation(1);
        content.setPadding(dp.invoke(14).intValue(), dp.invoke(12).intValue(), dp.invoke(14).intValue(), dp.invoke(12).intValue());
        TextView $this$makeExampleCard_u24lambda_u2448 = new TextView(ctx);
        $this$makeExampleCard_u24lambda_u2448.setText(title);
        $this$makeExampleCard_u24lambda_u2448.setTextColor(Color.parseColor("#00E5CC"));
        $this$makeExampleCard_u24lambda_u2448.setTextSize(13.0f);
        $this$makeExampleCard_u24lambda_u2448.setTypeface($this$makeExampleCard_u24lambda_u2448.getTypeface(), 1);
        TextView $this$makeExampleCard_u24lambda_u2450 = new TextView(ctx);
        $this$makeExampleCard_u24lambda_u2450.setText(example);
        $this$makeExampleCard_u24lambda_u2450.setTextColor(Color.parseColor("#B0FFFFFF"));
        $this$makeExampleCard_u24lambda_u2450.setTextSize(12.0f);
        $this$makeExampleCard_u24lambda_u2450.setTypeface(Typeface.MONOSPACE);
        LinearLayout.LayoutParams $this$makeExampleCard_u24lambda_u2450_u24lambda_u2449 = new LinearLayout.LayoutParams(-2, -2);
        $this$makeExampleCard_u24lambda_u2450_u24lambda_u2449.topMargin = dp.invoke(8).intValue();
        $this$makeExampleCard_u24lambda_u2450.setLayoutParams($this$makeExampleCard_u24lambda_u2450_u24lambda_u2449);
        content.addView($this$makeExampleCard_u24lambda_u2448);
        content.addView($this$makeExampleCard_u24lambda_u2450);
        card.addView(content);
        return card;
    }

    private final View makeInfoItem(Context ctx, Function1<? super Integer, Integer> dp, String title, String description) {
        MaterialCardView card = new MaterialCardView(ctx);
        card.setRadius(dp.invoke(16).intValue());
        card.setCardElevation(0.0f);
        card.setCardBackgroundColor(Color.parseColor("#1A1A1F"));
        card.setStrokeWidth(0);
        LinearLayout.LayoutParams $this$makeInfoItem_u24lambda_u2452_u24lambda_u2451 = new LinearLayout.LayoutParams(-1, -2);
        $this$makeInfoItem_u24lambda_u2452_u24lambda_u2451.bottomMargin = dp.invoke(8).intValue();
        card.setLayoutParams($this$makeInfoItem_u24lambda_u2452_u24lambda_u2451);
        LinearLayout content = new LinearLayout(ctx);
        content.setOrientation(0);
        content.setGravity(16);
        content.setPadding(dp.invoke(14).intValue(), dp.invoke(12).intValue(), dp.invoke(14).intValue(), dp.invoke(12).intValue());
        FrameLayout iconBg = new FrameLayout(ctx);
        iconBg.setBackground(createRoundedBg("#F59E0B", 0.15f, dp.invoke(10).intValue()));
        iconBg.setLayoutParams(new LinearLayout.LayoutParams(dp.invoke(36).intValue(), dp.invoke(36).intValue()));
        ImageView $this$makeInfoItem_u24lambda_u2455 = new ImageView(ctx);
        $this$makeInfoItem_u24lambda_u2455.setImageResource(C3715R.drawable.neizzir19_ic_info);
        $this$makeInfoItem_u24lambda_u2455.setColorFilter(Color.parseColor("#F59E0B"));
        $this$makeInfoItem_u24lambda_u2455.setLayoutParams(new FrameLayout.LayoutParams(dp.invoke(20).intValue(), dp.invoke(20).intValue(), 17));
        iconBg.addView($this$makeInfoItem_u24lambda_u2455);
        LinearLayout $this$makeInfoItem_u24lambda_u2457 = new LinearLayout(ctx);
        $this$makeInfoItem_u24lambda_u2457.setOrientation(1);
        LinearLayout.LayoutParams $this$makeInfoItem_u24lambda_u2457_u24lambda_u2456 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        $this$makeInfoItem_u24lambda_u2457_u24lambda_u2456.setMarginStart(dp.invoke(12).intValue());
        $this$makeInfoItem_u24lambda_u2457.setLayoutParams($this$makeInfoItem_u24lambda_u2457_u24lambda_u2456);
        TextView $this$makeInfoItem_u24lambda_u2458 = new TextView(ctx);
        $this$makeInfoItem_u24lambda_u2458.setText(title);
        $this$makeInfoItem_u24lambda_u2458.setTextColor(Color.parseColor("#FFFFFF"));
        $this$makeInfoItem_u24lambda_u2458.setTextSize(14.0f);
        $this$makeInfoItem_u24lambda_u2458.setTypeface($this$makeInfoItem_u24lambda_u2458.getTypeface(), 1);
        TextView $this$makeInfoItem_u24lambda_u2459 = new TextView(ctx);
        $this$makeInfoItem_u24lambda_u2459.setText(description);
        $this$makeInfoItem_u24lambda_u2459.setTextColor(Color.parseColor("#B0FFFFFF"));
        $this$makeInfoItem_u24lambda_u2459.setTextSize(12.0f);
        $this$makeInfoItem_u24lambda_u2457.addView($this$makeInfoItem_u24lambda_u2458);
        $this$makeInfoItem_u24lambda_u2457.addView($this$makeInfoItem_u24lambda_u2459);
        content.addView(iconBg);
        content.addView($this$makeInfoItem_u24lambda_u2457);
        card.addView(content);
        return card;
    }

    private final void copyToClipboard(Context ctx, String text) {
        ClipboardManager cm = (ClipboardManager) ContextCompat.getSystemService(ctx, ClipboardManager.class);
        if (cm != null) {
            cm.setPrimaryClip(ClipData.newPlainText("command", text));
        }
        Toast.makeText(ctx, "✓ Скопировано: " + text, 0).show();
    }

    private final GradientDrawable createRoundedBg(String colorHex, float alpha, float radius) {
        int color = Color.parseColor(colorHex);
        GradientDrawable $this$createRoundedBg_u24lambda_u2460 = new GradientDrawable();
        $this$createRoundedBg_u24lambda_u2460.setShape(0);
        $this$createRoundedBg_u24lambda_u2460.setCornerRadius(radius);
        $this$createRoundedBg_u24lambda_u2460.setColor(Color.argb((int) (255 * alpha), Color.red(color), Color.green(color), Color.blue(color)));
        return $this$createRoundedBg_u24lambda_u2460;
    }

    private final GradientDrawable createRippleCircle(int size) {
        GradientDrawable $this$createRippleCircle_u24lambda_u2461 = new GradientDrawable();
        $this$createRippleCircle_u24lambda_u2461.setShape(1);
        $this$createRippleCircle_u24lambda_u2461.setColor(Color.parseColor("#2D2D35"));
        return $this$createRippleCircle_u24lambda_u2461;
    }

    private final GradientDrawable createRippleDrawable() {
        GradientDrawable $this$createRippleDrawable_u24lambda_u2462 = new GradientDrawable();
        $this$createRippleDrawable_u24lambda_u2462.setShape(0);
        $this$createRippleDrawable_u24lambda_u2462.setCornerRadius(0.0f);
        $this$createRippleDrawable_u24lambda_u2462.setColor(0);
        return $this$createRippleDrawable_u24lambda_u2462;
    }

    /* JADX INFO: compiled from: HelpFragment.kt */
    @Metadata(m4415d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, m4416d2 = {"Lcom/blackhub/bronline/neizzir/fragments/help/HelpFragment$CommandItem;", "", "command", "", "description", "icon", "", "videoKey", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getCommand", "()Ljava/lang/String;", "getDescription", "getIcon", "()I", "getVideoKey", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m4417k = 1, m4418mv = {1, 9, 0}, m4420xi = 48)
    private static final /* data */ class CommandItem {
        private final String command;
        private final String description;
        private final int icon;
        private final String videoKey;

        public static /* synthetic */ CommandItem copy$default(CommandItem commandItem, String str, String str2, int i, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = commandItem.command;
            }
            if ((i2 & 2) != 0) {
                str2 = commandItem.description;
            }
            if ((i2 & 4) != 0) {
                i = commandItem.icon;
            }
            if ((i2 & 8) != 0) {
                str3 = commandItem.videoKey;
            }
            return commandItem.copy(str, str2, i, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getVideoKey() {
            return this.videoKey;
        }

        public final CommandItem copy(String command, String description, int icon, String videoKey) {
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(description, "description");
            return new CommandItem(command, description, icon, videoKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommandItem)) {
                return false;
            }
            CommandItem commandItem = (CommandItem) other;
            return Intrinsics.areEqual(this.command, commandItem.command) && Intrinsics.areEqual(this.description, commandItem.description) && this.icon == commandItem.icon && Intrinsics.areEqual(this.videoKey, commandItem.videoKey);
        }

        public int hashCode() {
            return (((((this.command.hashCode() * 31) + this.description.hashCode()) * 31) + Integer.hashCode(this.icon)) * 31) + (this.videoKey == null ? 0 : this.videoKey.hashCode());
        }

        public String toString() {
            return "CommandItem(command=" + this.command + ", description=" + this.description + ", icon=" + this.icon + ", videoKey=" + this.videoKey + ')';
        }

        public CommandItem(String command, String description, int icon, String videoKey) {
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(description, "description");
            this.command = command;
            this.description = description;
            this.icon = icon;
            this.videoKey = videoKey;
        }

        public /* synthetic */ CommandItem(String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, i, (i2 & 8) != 0 ? null : str3);
        }

        public final String getCommand() {
            return this.command;
        }

        public final String getDescription() {
            return this.description;
        }

        public final int getIcon() {
            return this.icon;
        }

        public final String getVideoKey() {
            return this.videoKey;
        }
    }
}
