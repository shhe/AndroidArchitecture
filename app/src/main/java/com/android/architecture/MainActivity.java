package com.android.architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.android.architecture.app.CustomApplication;
import com.android.architecture.data.DataManager;
import com.android.architecture.di.component.ActivityComponent;
import com.android.architecture.di.component.DaggerActivityComponent;
import com.android.architecture.di.module.ActivityModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Inject
    DataManager mDataManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent activityComponent = DaggerActivityComponent
                .builder()
//                .activityModule(new ActivityModule())
                .applicationComponent(CustomApplication.getInstance()
                        .getApplicationComponent())
                .build();
        activityComponent.inject(this);

        Log.i(TAG, "mDataManager != null   "+(mDataManager != null));
    }
}