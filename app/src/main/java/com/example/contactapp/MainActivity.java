package com.example.contactapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.contactapp.com.example.contactapp.dao.ContactDao;
import com.example.contactapp.com.example.contactapp.model.Contact;

public class MainActivity extends AppCompatActivity {

    Button addButton, findButton, deleteButton, updateButton;
    ContactDao contactDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton = findViewById((R.id.button7));
        deleteButton = findViewById((R.id.button2));
        updateButton = findViewById((R.id.button3));
        findButton = findViewById(R.id.button5);
    }

    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.button7: //addPage
                intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.button2: //deletePage
                intent = new Intent(this, Main3Activity.class);
                startActivity(intent);
                break;
            case R.id.button3: //updatePage
                intent = new Intent(this, Main4Activity.class);
                startActivity(intent);
                break;
            case R.id.button5: //findPage
                intent = new Intent(this, Main5Activity.class);
                startActivity(intent);
                break;
        }

    }
}
