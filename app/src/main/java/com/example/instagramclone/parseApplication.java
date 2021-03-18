package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class parseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new  Parse.Configuration.Builder(this)
                .applicationId("8LdMNhDvpaNqx0gr8E0pVp8xM3gTtETWEtXOviDq")
                .clientKey("ngJBqvbIPecxNrtiXh8VJDOAGVMll9Wo8JhjPzDb")// should correspond to Application Id env variable// should correspond to Client key env variable
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
