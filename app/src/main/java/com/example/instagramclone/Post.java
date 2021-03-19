package com.example.instagramclone;

import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("Post")
public class Post extends ParseObject {

    public static final String Key_Description = "description";
    public static final String Key_Image = "image";
    public static final String Key_User = "user";

    public String getDescription() {
        return getString(Key_Description);
    }

    public void setDescription(String description) {
        put(Key_Description,description);
    }

}
