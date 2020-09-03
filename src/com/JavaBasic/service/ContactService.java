package com.JavaBasic.service;

import com.JavaBasic.entity.Address;
import com.JavaBasic.entity.Contact;

import java.io.IOException;
import java.util.concurrent.Callable;

import static com.JavaBasic.util.Util.inputText;

public class ContactService {
    private StorageService storageService = new StorageService();

    public void createContact(int id, String firstName, String lastName, char sex, Address address, String email, long phone, String job) {
        Contact contact = new Contact(id, firstName, lastName, sex, address, email, phone, job);
        saveContact(contact);
    }

    public void saveContact(Contact contact) {
        storageService.saveContact(contact);
    }

    public Contact getContactById(int id) {
        return storageService.getById(id);
    }

    public Contact[] getAllContacts() {
        return storageService.getAllContacts();
    }

    public void updateContact(Contact contact) {
        storageService.updateContact(contact);
    }

    public void deleteContact(Contact contact) {
        storageService.deleteContact(contact);
    }

    public void inputContact() throws IOException {
        System.out.println("Input id          ");
        int id = Integer.parseInt(inputText());
        System.out.println("Input firstName          ");
        String firstName = inputText();
        System.out.println("Input lastName          ");
        String lastName = inputText();
        System.out.println("Input sex          ");
        // char sex = (inputText());
        System.out.println("Input address          ");
        //Address address=Address.class(inputText());
        System.out.println("Input email         ");
        String email = inputText();
        System.out.println("Input phone          ");
        long phone = Long.parseLong(inputText());
        System.out.println("Input job          ");
        String job = inputText();

    }

    public void printContact(Contact contact) {
        System.out.println("******************************************************************************************");

        System.out.println("id            " +
                contact.getId());
        System.out.println("First Name               " +
                contact.getFirstName());
        System.out.println("Last Name                 " +
                contact.getLastName());
        System.out.println("Sex              " +
                contact.getSex());
        System.out.println("Address                              " +
                contact.getAddress());
        System.out.println("Email                         " +
                contact.getEmail());
        System.out.println("Phone Number                      " +
                contact.getPhone());
        System.out.println("Job                         " +
                contact.getJob());

        System.out.println("******************************************************************************************");
    }

    public void printContacts(Contact[] contacts) {
        for (Contact contact : contacts) {
            if(contact !=null) {
                printContact(contact);
            }

        }


    }
}
