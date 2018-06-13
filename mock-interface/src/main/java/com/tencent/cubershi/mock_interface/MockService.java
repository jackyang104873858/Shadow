package com.tencent.cubershi.mock_interface;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;

import com.tencent.hydevteam.pluginframework.plugincontainer.HostServiceDelegator;

/**
 * Created by tracyluo on 2018/6/5.
 */
public abstract class MockService extends MockContext {
    HostServiceDelegator mHostServiceDelegator;
    Resources mPluginResources;
    MockApplication mPluginApplication;

    public final void setPluginResources(Resources resources) {
        mPluginResources = resources;
    }

    public final void setHostContextAsBase(Context context) {
        attachBaseContext(context);
    }

    public void setContainerService(HostServiceDelegator delegator) {
        mHostServiceDelegator = delegator;
    }

    public void setPluginApplication(MockApplication pluginApplication) {
        mPluginApplication = pluginApplication;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        return -1;
    }

    public void onDestroy() {

    }

    public void onConfigurationChanged(Configuration newConfig) {

    }

    public void onLowMemory() {

    }

    public void onTrimMemory(int level) {

    }

    public boolean onUnbind(Intent intent) {
        return false;
    }

    public void onTaskRemoved(Intent rootIntent) {

    }

    public void onCreate() {

    }

}
