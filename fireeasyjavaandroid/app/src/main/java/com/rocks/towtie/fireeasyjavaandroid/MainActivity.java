package com.rocks.towtie.fireeasyjavaandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;

    private EditText mPasswordView;

    // interface buttons
    private Button createButton;
    private Button loginButton;
    private Button findButton;
    private Button testButton;

    // text view labels
    private TextView passLabel;
    private TextView userLabel;

    // edit texts
    private EditText userEdit, passwordEdit, itemEdit, parentEdit;

    // check box
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
