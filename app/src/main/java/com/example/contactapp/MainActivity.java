package com.example.contactapp;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.contactapp.com.example.contactapp.com.example.contactapp.service.Functionality;
import com.example.contactapp.com.example.contactapp.dao.ContactDao;
import com.example.contactapp.com.example.contactapp.model.Contact;

import java.util.List;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    Button addButton, findButton, deleteButton, updateButton, showAllButton;
    ContactDao contactDao;
    Functionality service = new Functionality();
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton = findViewById((R.id.button7));
        deleteButton = findViewById((R.id.button2));
        updateButton = findViewById((R.id.button3));
        findButton = findViewById(R.id.button5);
        showAllButton = findViewById(R.id.button9);
        initData();
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
            case R.id.button9: //ShowAllPage
                wrapper(service.showAll());
                break;
        }

    }

    private void initData(){
//        db.execSQL("DROP TABLE contact_database");
        db = openOrCreateDatabase("DemoUsersDB", Context.MODE_PRIVATE,null);
        db.execSQL("CREATE TABLE IF NOT EXISTS contact_database(" +
                "id TEXT PRIMARY KEY," +
                "firstname TEXT," +
                "lastname TEXT," +
                "address TEXT," +
                "email TEXT UNIQUE," +
                "phone TEXT);");
//        db.execSQL("INSERT OR IGNORE INTO contact_database VALUES('John','alepis','athanasiou','johny@kalom.com', '210992838');");
//        db.execSQL("INSERT OR IGNORE INTO contact_database VALUES('Nick','Jason','Hrakleiou','Nikck@kalom.com', '210992839');");
//        db.execSQL("INSERT OR IGNORE INTO contact_database VALUES('Nick','Jason','Hrakleiou','Nikck@kalom.com', '210992839');");
//        db.execSQL("INSERT OR IGNORE INTO contact_database VALUES('Nick','Jason','Hrakleiou','Nikck@kalom.com', '210992839');");
//        db.execSQL("INSERT OR IGNORE INTO contact_database VALUES('Nick','Jason','Hrakleiou','Nikck@kalom.com', '210992839');");
    }

    private void wrapper(List<Contact> contactList){
        int i = contactList.size();

    }
}
