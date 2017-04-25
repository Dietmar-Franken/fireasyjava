package com.rocks.towtie.fireeasyjavaandroid.fireasy.auth;

public class CreateUserImpl implements CreateUser {

    public void createNewUser(String email, String Password)
    {
        System.out.print("Hello");
    }

//    @Override
//    public void createNewUser(String email, String Password) {
//        mAuth.signInWithEmailAndPassword(email, password)
//                .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        Log.d("Success", "signInWithEmail:onComplete:" + task.isSuccessful());
//
//                        // If sign in fails, display a message to the user. If sign in succeeds
//                        // the auth state listener will be notified and logic to handle the
//                        // signed in user can be handled in the listener.
//                        if (!task.isSuccessful()) {
//                            Log.w("Fail", "signInWithEmail:failed", task.getException());
//                            Toast.makeText(LoginActivity.this, R.string.auth_failed,
//                                    Toast.LENGTH_SHORT).show();
//                            InputMethodManager imm = (InputMethodManager)  getSystemService(Context.INPUT_METHOD_SERVICE);
//                            imm.hideSoftInputFromWindow(LoginActivity.this.getCurrentFocus().getWindowToken(), 0);
//
//                        }
//                        else {
//                            switchActivites();
//                        }
//                        // ...
//                    }
//                });
//    }
}
