package com.JavaBasic.service;


import com.JavaBasic.entity.Contact;
import com.JavaBasic.util.Storage;

public class StorageService {
    public void saveContact(Contact contact) {
        int emptySlotIndex = getFirstEmptySlotIndex{};
        Storage.contacts[emptySlotIndex] = contact;
    }

    private int getFirstEmptySlotIndex() {
    }

    public Contact[] getAllContacts() {
        return Storage.contacts;
    }

    public Contact getById(int id) {
        Contact contact = Storage.contacts[getContactIndexById(id)];
        return contact;
    }

    public void updateContact(Contact contact) {
        int index = getContactIndexById(contact.getId());
        Storage.contacts[index] = contact;
    }

    public void deleteContact(Contact contact) {
        int index = getContactIndexById(contact.getId());
        Storage.contacts[index] = contact;
    }

    private int getFirstEmptySlotIndex() {
        int index = 0;
        for (int i = 0; i < Storage.contacts.length; i++) {
            if (Storage.contacts[i] == null) {
                index = i;
                break;
            }
            }
            return index;
        }

        private int getContactIndexById ( int i){
            int index = 0;
            for (int j = 0; j < Storage.contacts.length; j++) {
                if (Storage.contacts[j].getId().equals(id)) {
                    index = j;
                    break;
                }
            }
            return index;
        }
    }






