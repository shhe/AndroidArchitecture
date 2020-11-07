package com.android.architecture.data;

import android.content.SharedPreferences;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author shhe
 * @Date 2020/11/7 上午11:11
 * @Description:
 */
@Singleton
public class SharedPrefsHelper {

    private SharedPreferences mSharedPreferences;

    @Inject
    public SharedPrefsHelper(SharedPreferences preferences) {
        mSharedPreferences = preferences;
    }

    public void put(String key, String value) {
        mSharedPreferences.edit().putString(key, value).apply();
    }
}
