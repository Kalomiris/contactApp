package com.example.contactapp.com.example.contactapp.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import android.widget.TextView;

import com.example.contactapp.com.example.contactapp.model.Contact;
import java.util.List;

@Dao
public interface ContactDao {

    @Insert
    void insert (Contact contact);

    @Query("SELECT * FROM contact_table WHERE email =:email")
    Contact findByEmail(String email);

    @Query("SELECT *FROM contact_table WHERE lastname LIKE :lastName")
    List<Contact> findByName(String lastName);

    @Update
    void update(Contact contact);

    @Query("DELETE FROM contact_table WHERE email =:email")
    void deleteByEmail(String email);

    @Query("DELETE FROM contact_table")
    void deleteAll();

    @Query("SELECT * FROM contact_table ORDER BY lastname ASC")
    List<Contact> getAll();


}
