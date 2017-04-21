package org.cocos2dx.cpp;

import android.app.Application;

import io.agora.rtc.RtcEngine;

public class AGApplication extends Application {

    private static final String TAG = "AG_CC_G";

    // PLEASE KEEP THIS App ID IN SAFE PLACE -->
    // Get your own App ID at https://dashboard.agora.io/ -->
    private static final String appId = <#YOUR APP ID#>;

    @Override
    public void onCreate() {
        super.onCreate();

        RtcEngine rtcEngine = RtcEngine.create(getApplicationContext(), appId, null);
    }
}
