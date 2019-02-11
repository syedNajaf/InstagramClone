package com.example.nzaidi.instaclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("JYIMQIpAtrkjKLYw3jUI1l0YRrGFicQgOzHdSJcZ")
                // if defined
                .clientKey("1xRw9vtyeCUSeOP7t9XbW6PPGFWIZr55MkPpbwhs")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
