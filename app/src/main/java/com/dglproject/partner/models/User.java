package com.dglproject.partner.models;
import com.google.firebase.database.IgnoreExtraProperties;
/**
 * Created by Tortuvshin Byambaa on 3/10/2017.
 */

@IgnoreExtraProperties
public class User {
    public String uid;
    public String email;
    public String firebaseToken;

    public User() {
    }

    public User(String uid, String email, String firebaseToken) {
        this.uid = uid;
        this.email = email;
        this.firebaseToken = firebaseToken;
    }
}