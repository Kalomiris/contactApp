package com.example.contactapp.com.example.contactapp.dao;

import android.arch.lifecycle.LiveData;

import com.example.contactapp.com.example.contactapp.model.Contact;

import java.util.List;

public class ContactDaoImpl implements ContactDao {
    @Override
    public void insert(Contact contact) {

    }

    @Override
    public Contact findByEmail(String email) {
        return null;
    }

    @Override
    public List<Contact> findByName(String lastName) {
        return null;
    }

    @Override
    public void update(Contact contact) {

    }

    @Override
    public void deleteByEmail(String email) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Contact> getAll() {
        return (List<Contact>) this;
    }
}
