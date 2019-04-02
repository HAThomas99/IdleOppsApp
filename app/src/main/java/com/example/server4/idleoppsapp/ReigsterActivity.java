package com.example.server4.idleoppsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class ReigsterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reigster);
        final Button Register = (Button)findViewById(R.id.button);
        final Button RegisterLink = (Button)findViewById(R.id.RtoL);
        final Spinner Role = (Spinner) findViewById(R.id.txtGroup);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(LoginActivity.this, "Please fill out the form.", Toast.LENGTH_LONG).show();
                Role.getSelectedItem().toString();
                startActivity(new Intent(ReigsterActivity.this, HomeActivity.class));
            }
        });
        RegisterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReigsterActivity.this, LoginActivity.class));
            }
        });
    }
}