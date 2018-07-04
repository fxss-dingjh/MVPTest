package com.fengxingss.dingjh.mvptest;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        /**
         * 初始化common库
         * 参数1:上下文，不能为空
         * 参数2:设备类型，UMConfigure.DEVICE_TYPE_PHONE为手机、UMConfigure.DEVICE_TYPE_BOX为盒子，默认为手机
         * 参数3:Push推送业务的secret
         */
        UMConfigure.init(this, UMConfigure.DEVICE_TYPE_PHONE, "1fe6a20054bcef865eeb0991ee84525b");

    }
}
