package com.sreekar.yardsale.models;

import com.google.firebase.database.IgnoreExtraProperties;

/*
This is the basic layout for the comment object.
 */

@IgnoreExtraProperties
public class Comment {

    public String uid;
    public String author;
    public String text;

    public Comment() {
        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)
    }

    public Comment(String uid, String author, String text) {
        this.uid = uid;
        this.author = author;
        this.text = text;
    }

}
