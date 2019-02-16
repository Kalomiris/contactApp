package com.example.contactapp;

import android.content.Intent;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.contactapp.com.example.contactapp.com.example.contactapp.service.Functionality;
import com.example.contactapp.com.example.contactapp.model.Contact;

import java.io.Serializable;

public class Main2Activity extends AppCompatActivity {

    Button saveButton, mainMenuButton;
    EditText firstName, lastName, address, email, phone;
    Functionality service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        firstName = findViewById(R.id.editText);
        lastName = findViewById(R.id.editText2);
        address = findViewById(R.id.editText6);
        email = findViewById(R.id.editText4);
        phone = findViewById(R.id.editText5);
        saveButton = findViewById(R.id.button6);
        mainMenuButton = findViewById(R.id.button4);
    }

    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.button6: //save
                Contact contact = new Contact(firstName.toString(),
                                                lastName.toString(),
                                                address.toString()
                                                ,email.toString(),
                                                phone.toString());
                intent = new Intent(this, MainActivity.class);
                if(service.save(contact)) {
                    intent.putExtra("save_model", "saved successfully!");
                }else {
                    intent.putExtra("save_model", "Invalid input");
                }
                startActivity(intent);
                break;
            case R.id.button4: //main menu
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
