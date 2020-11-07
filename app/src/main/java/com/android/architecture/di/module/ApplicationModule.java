package com.android.architecture.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;

/**
 * @author shhe
 * @Date 2020/11/7 下午1:46
 * @Description:
 */
@Module
public class ApplicationModule {

    public static final String PRE_FILE_NAME = "test_architecture";

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    SharedPreferences provideSharedPreferences() {
        return mApplication.getSharedPreferences(PRE_FILE_NAME, Context.MODE_PRIVATE);
    }
}
