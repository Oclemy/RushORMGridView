package com.tutorials.hp.rushormgridview;

import android.app.Application;
import co.uk.rushorm.android.AndroidInitializeConfig;
import co.uk.rushorm.core.RushCore;

/**
 - Our MainApplication.
 - Derives from android.app.Application.
 - We first intantiate a configuration object and pass it to our static initialize() method of RushCore class.
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        AndroidInitializeConfig config=new AndroidInitializeConfig(getApplicationContext());
        RushCore.initialize(config);
    }
}
