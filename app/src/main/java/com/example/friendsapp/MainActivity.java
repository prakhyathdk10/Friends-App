package com.example.friendsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MainActivity extends AppCompatActivity {
    AppCompatButton b1;
    EditText e1, e2, e3, e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.name);
        e2 = (EditText) findViewById(R.id.fn);
        e3 = (EditText) findViewById(R.id.fnn);
        e4 = (EditText) findViewById(R.id.df);
        b1 = (AppCompatButton) findViewById(R.id.reg);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = e1.getText().toString();
                String fname = e2.getText().toString();
                String fnname = e3.getText().toString();
                String desc = e4.getText().toString();
                Toast.makeText(getApplicationContext(), name + fname + fnname + desc, Toast.LENGTH_LONG).show();


            }

        });
    }
}