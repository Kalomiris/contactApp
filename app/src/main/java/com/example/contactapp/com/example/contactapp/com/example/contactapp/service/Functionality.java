package com.example.contactapp.com.example.contactapp.com.example.contactapp.service;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.contactapp.com.example.contactapp.dao.ContactDao;
import com.example.contactapp.com.example.contactapp.dao.ContactDaoImpl;
import com.example.contactapp.com.example.contactapp.model.Contact;

import java.util.List;

public class Functionality extends ViewModel {

    private ContactDao contactDao = new ContactDaoImpl();

    public boolean save(Contact contact){
        if (contact != null) {
            contactDao.insert(contact);
            return true;
        }
        return false;
    }

    public boolean delete(String email){
        if (email != null || email != ""){
            contactDao.deleteByEmail(email);
            return true;
        }else {
            return false;
        }
    }

    public List<Contact> showAll(){
        return contactDao.getAll();
    }
}
