package com.rocks.towtie.fireeasyjavaandroid.fireasy.auth;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import static android.content.ContentValues.TAG;

public class UserFunctionsImpl implements UserFunctions {

    /**
     * Method to create a new user.
     *
     * @param activity activity calling this function
     * @param mAuth authorization session to login to
     * @param email user email
     * @param password user password
     */

    @Override
    public void createNewUser( Activity activity, final FirebaseAuth mAuth, String email, String password )
    {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(activity, new OnCompleteListener<AuthResult>()
                {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task)
                    {
                        if (task.isSuccessful())
                        {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success");
                        }
                        else
                        {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            System.out.println("Success!");
                        }

                        // ...
                    }
                });
    }

    /**
     * Method to sign in an existing user.
     *
     * @param activity activity calling this function
     * @param mAuth authorization session to login to
     * @param email user email
     * @param password user password
     */

    @Override
    public void signInUser(Activity activity, FirebaseAuth mAuth, String email, String password) {
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(activity, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d("Success", "signInWithEmail:onComplete:" + task.isSuccessful());

                        // If sign in fails, display a message to the user. If sign in succeeds
                        // the auth state listener will be notified and logic to handle the
                        // signed in user can be handled in the listener.
                        if (task.isSuccessful()) {
                            Log.w("Fail", "signInWithEmail:success", task.getException());
                        }
                        else {
                            Log.w("Fail", "signInWithEmail:failed", task.getException());
                        }
                        // ...
                    }
                });
    }

    /**
     * Method to delete a currently authenticated user.
     *
     * @param mAuth authorization session
     */

    @Override
    public void deleteUser( FirebaseAuth mAuth ) {
        FirebaseUser user =  mAuth.getCurrentUser();

        user.delete()
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Log.d(TAG, "User account deleted.");
                        }
                    }
                });
    }

    /**
     * Method to send password reset email.
     *
     * @param mAuth authorization session
     * @param email user's email address
     */

    @Override
    public void sendPasswordResetEmail(FirebaseAuth mAuth, String email) {

        mAuth.sendPasswordResetEmail(email)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Log.d(TAG, "Email sent.");
                        }
                    }
                });
    }
}
