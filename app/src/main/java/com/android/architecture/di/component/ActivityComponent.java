package com.android.architecture.di.component;

import com.android.architecture.activity.MainActivity;
import com.android.architecture.di.PerActivity;
import com.android.architecture.di.module.ActivityModule;

import dagger.Component;

/**
 * @author shhe
 * @Date 2020/11/7 下午2:13
 * @Description:
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
}
