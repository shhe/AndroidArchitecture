package com.android.architecture.di.component;

import com.android.architecture.app.CustomApplication;
import com.android.architecture.data.DataManager;
import com.android.architecture.data.SharedPrefsHelper;
import com.android.architecture.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author shhe
 * @Date 2020/11/7 上午11:28
 * @Description:
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(CustomApplication application);

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();
}
