package com.rocks.towtie.fireeasyjavaandroid.fireasy.auth;

import android.app.Activity;

import com.google.firebase.auth.FirebaseAuth;


/**
 * Created by cody.towstik on 4/3/17.
 */

public interface UserFunctions {

    public void createNewUser( Activity activity, FirebaseAuth mAuth, String email, String password );

    public void signInUser( Activity activity, FirebaseAuth mAuth,  String email, String password );

    public void deleteUser( FirebaseAuth mAuth );

    public void sendPasswordResetEmail( FirebaseAuth mAuth, String email );
}
