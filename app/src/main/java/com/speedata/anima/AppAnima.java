package com.speedata.anima;

import android.app.Application;

/**
 * @author :Reginer in  2018/4/9 15:05.
 * 联系方式:QQ:282921012
 * 功能描述:
 */
public class AppAnima extends Application {

    private static AppAnima sInstance;

    public static AppAnima getInstance() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

}
