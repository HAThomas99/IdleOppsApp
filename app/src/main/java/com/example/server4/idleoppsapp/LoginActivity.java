package com.example.server4.idleoppsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final Button Login = (Button)findViewById(R.id.button2);
        final Button LoginLink = (Button)findViewById(R.id.LtoR);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(LoginActivity.this, "Please fill out the form.", Toast.LENGTH_LONG).show();
                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
            }
        });
        LoginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, ReigsterActivity.class));
            }
        });
    }
}