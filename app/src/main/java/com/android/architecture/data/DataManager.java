package com.android.architecture.data;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author shhe
 * @Date 2020/11/7 上午11:10
 * @Description:
 */
@Singleton
public class DataManager {

    private SharedPrefsHelper mPrefsHelper;

    @Inject
    public DataManager(SharedPrefsHelper prefsHelper) {
        this.mPrefsHelper = prefsHelper;
    }
}
