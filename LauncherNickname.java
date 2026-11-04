package com.blackhub.bronline.neizzir;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: D:\Minecraft\kryak]\classes9.dex */
public final class LauncherNickname {
    private static final String GAME_PREFERENCES = "preferences";
    private static final String KEY = "players_nick";
    private static final String LAUNCHER_PREFERENCES = "neizzir_identity";

    private LauncherNickname() {
    }

    public static void save(Context context, String nickname) {
        String value = nickname == null ? "" : nickname;
        context.getSharedPreferences(LAUNCHER_PREFERENCES, 0).edit().putString("players_nick", value).apply();
        context.getSharedPreferences(GAME_PREFERENCES, 0).edit().putString("players_nick", value).apply();
    }

    public static String loadForEditor(Context context) {
        SharedPreferences own = context.getSharedPreferences(LAUNCHER_PREFERENCES, 0);
        String value = own.contains("players_nick") ? own.getString("players_nick", "") : context.getSharedPreferences(GAME_PREFERENCES, 0).getString("players_nick", "");
        if (value == null) {
            value = "";
        }
        save(context, value);
        return value;
    }

    public static String read(Context context) {
        String value = context.getSharedPreferences(LAUNCHER_PREFERENCES, 0).getString("players_nick", "");
        return value == null ? "" : value;
    }
}
