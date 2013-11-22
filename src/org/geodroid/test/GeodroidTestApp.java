package org.geodroid.test;

import android.app.Application;
import android.content.Context;

public class GeodroidTestApp extends Application {

    static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        this.context = this;
    }

    public static Context getContext() {
        return context;
    }
}
