package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class parseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Register Parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new  Parse.Configuration.Builder(this)
                .applicationId("8LdMNhDvpaNqx0gr8E0pVp8xM3gTtETWEtXOviDq")
                .clientKey("ngJBqvbIPecxNrtiXh8VJDOAGVMll9Wo8JhjPzDb")// should correspond to Application Id env variable// should correspond to Client key env variable
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
