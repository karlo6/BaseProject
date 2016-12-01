package wanda.coffee.utilities;
// Created by jsonjuliane on 12/1/2016.


import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.Map;

public class SharedPrefHandler {
    private final Context mContext;

    public SharedPrefHandler(Context context) {
        mContext = context;
    }

    public static final String SHARED_PREFS_IDENTIFIER = "shared_prefs";

    public void showAllSharedPref() {
        SharedPreferences prefs = mContext.getSharedPreferences(SHARED_PREFS_IDENTIFIER, mContext.MODE_PRIVATE);
        Map<String, ?> keys = prefs.getAll();
        for (Map.Entry<String, ?> entry : keys.entrySet()) {
            Log.e("Map values: ", entry.getKey() + ": " +
                    entry.getValue().toString());
        }
    }

    public void setSharedPref(String identifier, String value) {
        SharedPreferences.Editor editor = mContext.getSharedPreferences(SHARED_PREFS_IDENTIFIER, mContext.MODE_PRIVATE).edit();
        editor.putString(identifier, value);
        editor.commit();
    }

    public String getSharedPref(String identifier) {
        SharedPreferences prefs = mContext.getSharedPreferences(SHARED_PREFS_IDENTIFIER, mContext.MODE_PRIVATE);
        String restoredText = prefs.getString(identifier, null);
        if (restoredText != null) {
            return restoredText;
        } else return null;
    }

    public void removeSharedPref(String identifier) {
        SharedPreferences.Editor editor = mContext.getSharedPreferences(SHARED_PREFS_IDENTIFIER, mContext.MODE_PRIVATE).edit();
        editor.remove(identifier);
        editor.apply();
    }


    public void clear() {
        SharedPreferences.Editor editor = mContext.getSharedPreferences(SHARED_PREFS_IDENTIFIER, mContext.MODE_PRIVATE).edit();
        editor.clear();
        editor.commit();
    }

}