package com.example.backupdemo;

import android.content.Context;

public class PrefUtils {
    private static final String PREF_USER_NAME = "com.example.backupdemo.PREF_USER_NAME";
    private static final String NAME = "NAME";
    private static final String BACKUP_NAME = "BACKUP_NAME";

    private PrefUtils() {

    }

    public static void setName(Context context, String name) {
        context.getSharedPreferences(PREF_USER_NAME, Context.MODE_PRIVATE)
                .edit()
                .putString(NAME, name)
                .apply();
    }

    public static void setBackupName(Context context, String name) {
        context.getSharedPreferences(PREF_USER_NAME, Context.MODE_PRIVATE)
                .edit()
                .putString(BACKUP_NAME, name)
                .apply();
    }

    public static String getName(Context context) {
        return context.getSharedPreferences(PREF_USER_NAME, Context.MODE_PRIVATE)
                .getString(NAME, "");
    }

    public static String getBackUpName(Context context) {
        return context.getSharedPreferences(PREF_USER_NAME, Context.MODE_PRIVATE)
                .getString(BACKUP_NAME, null);
    }

}
