package com.android.architecture.app;

import android.app.Application;
import android.util.Log;

import com.android.architecture.data.DataManager;
import com.android.architecture.di.component.ApplicationComponent;
import com.android.architecture.di.component.DaggerApplicationComponent;
import com.android.architecture.di.module.ApplicationModule;

import javax.inject.Inject;

/**
 * @author shhe
 * @Date 2020/11/7 上午11:09
 * @Description:
 */
public class CustomApplication extends Application {

    public static final String TAG = "CustomApplication";

    @Inject
    DataManager mDataManager;

    protected ApplicationComponent mApplicationComponent;

    private static CustomApplication sApplication;

    public static <T extends CustomApplication> T getInstance() {
        return (T) sApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        sApplication = this;

        mApplicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        mApplicationComponent.inject(this);

        Log.i(TAG, "mDataManager!=null   " + (mDataManager!=null));
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}
