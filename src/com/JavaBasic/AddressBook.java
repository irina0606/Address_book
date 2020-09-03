package com.JavaBasic;

import com.JavaBasic.entity.Address;
import com.JavaBasic.entity.Contact;
import com.JavaBasic.service.ContactService;
import com.JavaBasic.util.Util;

import java.io.IOException;

import static com.JavaBasic.util.Util.inputText;


public class AddressBook {
    private static ContactService contactService = new ContactService();
    private static Util util = new Util();


    //private static Object Address;
    //private static Object Person;


    public static void main(String[] args) throws IOException {

        util.initApp();

        System.out.println("=========================================================================================");
        System.out.println("                        Welcome to Address Book                                ");
        System.out.println("=========================================================================================");

        String command = "start";

        while (command.equals("start") || command.equals("continue")) {

            System.out.println("Command prompt ==================================================================");
            System.out.println("enter contact            ==========================================");
            System.out.println("print contacts           ================================");
            System.out.println("search by name           =======================================");
            System.out.println("=========================================================================================");
            System.out.println("Enter command");

            command = inputText();

            switch (command) {
                case "enter contact": {
                    contactService.inputContact();
                }
                break;
                case "print contacts": {
                    contactService.printContacts(contactService.getAllContacts());
                }
                break;
                case "search by id": {
                    System.out.println("Input id");
                    int id = Integer.parseInt(inputText());
                    Contact contact = contactService.getContactById(id);

                    contactService.printContact(contact);
                }
                break;
                default: {
                    System.out.println("Mistaken!!!");
                }
            }

            System.out.println('\n' + "To go further input continue");
            command = inputText();
        }
    }


    }
