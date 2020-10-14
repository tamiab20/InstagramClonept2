package com.example.instagamclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // register parse model
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("CWw373DsSnRRT0qBacSL7OSU4K4gyXdIHOTN9FBr")
                .clientKey("DIjn0phNY0TJm7sql15lu2cUaX1fLKjn1hgV1qn5")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
