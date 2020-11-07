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

    public static final String KEY_USER_ID = "userId";

    private SharedPrefsHelper mPrefsHelper;

    @Inject
    public DataManager(SharedPrefsHelper prefsHelper) {
        this.mPrefsHelper = prefsHelper;
    }

    public void saveUserID(String userID) {
        mPrefsHelper.put(KEY_USER_ID, userID);
    }

    public String getUserId() {
        return mPrefsHelper.get(KEY_USER_ID, "");
    }
}
