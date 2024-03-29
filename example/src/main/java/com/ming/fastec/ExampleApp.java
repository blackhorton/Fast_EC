package com.ming.fastec;

import android.app.Application;

import com.ming.latte.app.Latte;

/**
 * @author Ming
 * on 2019/7/4
 */
public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withApiHost("http://127.0.0.1/")
                .configure();
    }
}
