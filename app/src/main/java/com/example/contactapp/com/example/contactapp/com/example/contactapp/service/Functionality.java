package com.example.contactapp.com.example.contactapp.com.example.contactapp.service;

import com.example.contactapp.com.example.contactapp.dao.ContactDao;
import com.example.contactapp.com.example.contactapp.model.Contact;

public class Functionality {

    private ContactDao contactDao;

    public boolean save(Contact contact){
        if (contact != null) {
//            contactDao.insert(contact);
            return true;
        }
        return false;
    }

    public boolean delete(String email){
        if (email != null || email != ""){
//            contactDao.deleteByEmail(email);
            return true;
        }else {
            return false;
        }
    }
}
