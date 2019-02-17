package com.example.contactapp.com.example.contactapp.dao;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.contactapp.com.example.contactapp.model.Contact;

@Database(entities = {Contact.class}, version = 1)
public abstract class ContactDB extends RoomDatabase {

    public abstract ContactDao contactDao();

    private static volatile ContactDB INSTANCE;

    static ContactDB createDatabase(final Context context){
        if (INSTANCE == null){
            synchronized (ContactDB.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),ContactDB.class, "contact_database").build();
                }
            }
        }
        return INSTANCE;
    }
}