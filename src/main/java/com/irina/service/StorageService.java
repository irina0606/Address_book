package com.irina.service;


import com.irina.entity.Contact;
import com.irina.util.Sorter;
import com.irina.util.Storage;

import java.util.ArrayList;

public class StorageService {

    public void saveContact(Contact contact) {

        Storage.getContacts().add(contact);
        Storage.getContacts().sort(new Sorter());
    }

    public ArrayList<Contact> getAllContact() {
        return Storage.getContacts();
    }

    public Contact getByFirstNameOrLastNameOrCityName(String searchQuery) {
        for (Contact contact : Storage.getContacts()) {

            if (contact.getFirstName().equals(searchQuery) || contact.getLastName().equals(searchQuery) || contact.getAddress().getCityName().equals(searchQuery)) {
                return contact;
            }
        }

        return null;
    }

    public Contact getByFirstName(String firstName) {
        for (Contact contact : Storage.getContacts()) {

            if (contact.getFirstName().equals(firstName)) {
                return contact;
            }
        }

        return null;
    }

    public void removeContact(Contact contact) {
        Storage.getContacts().remove(contact);
    }

}
