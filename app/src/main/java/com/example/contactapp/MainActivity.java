package com.example.contactapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button addButton, deleteButton, updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton = findViewById((R.id.button));
        deleteButton = findViewById((R.id.button2));
        updateButton = findViewById((R.id.button3));
    }

    @Override
    public void onClick(View v) {

    }
}
