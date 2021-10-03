package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("wOcpJ9y417VVuQIgNxsff1amuiYUSeM98BIw27jn")
                .clientKey("jzZT7JNke7vHysa4dcFGZTBdI77tdfcJS3jQrCud")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
