package com.ninja.pushdemo.app;

import com.baidu.frontia.FrontiaApplication;

/**
 * Created by ninja_chen on 14-3-14.
 */
public class PushApplication extends FrontiaApplication {
    @Override
    public void onCreate() {
        //必须加上这一句,否则会崩溃
        super.onCreate(); }
}
