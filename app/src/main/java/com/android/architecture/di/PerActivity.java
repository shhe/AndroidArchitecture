package com.android.architecture.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author shhe
 * @Date 2020/11/7 上午11:25
 * @Description:
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
