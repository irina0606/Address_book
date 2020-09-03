package com.JavaBasic;

import java.text.DecimalFormat;

public class Notes {

    int[]id={1,2,3,4,5,6,7,8,9,10};
    String[] firstName= {"Anna", "Vera", "Tanya", "Galina", "Julia", "Alex", "Victor", "Serge", "Boris", "Den"};
    String[] lastName= {"Blue", "Red", "Yellow","Brown", "Pink", "Black", "White", "Green", "Grey", "Silver"};
    String[] job={"Doctor", "Nurse", "Surgeon", "Psychotherapist", "Dentist", "Urologist", "Cardiologist", "Endocrinologist", "Pediatrician", "Dermatologist"};
    char[]sex={'M', 'F'};


    DecimalFormat phoneNumber= new DecimalFormat ("###-###-####");
    NumberFormatException phoneNum= new NumberFormatException("###-###-####");
    NumberFormatException dob= new NumberFormatException("MM/DD/YYYY");

    String firstName1= "Anna", firstName2="Vera";

}

/*
Qestions:
1. If on variable sexes I have just 2, how cne I manage the loop
2.
*/


//        int[] ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        String[] firstNames = {"Anna", "Vera", "Tanya", "Galina", "Julia", "Victor", "Alex", "Serge", "Boris", "Den"};
//        String[] lastNames = {"Blue", "Red", "Yellow", "Brown", "Pink", "Black", "White", "Green", "Grey", "Silver"};
//        String[] jobs = {"Doctor", "Nurse", "Surgeon", "Psychotherapist", "Dentist", "Urologist", "Cardiologist", "Endocrinologist", "Pediatrician", "Dermatologist"};
//        char[] sexes = {'M', 'F'};
//        String[] emails = {"AB@gmail.com", "VR@gmail.com", "TY@gmail.com", "GB@gmail.com", "JP@gmail.com", "VB@gmail.com", "AW@gmail.com", "SG@gmail.com", "BG@gmail.com", "DS@gmail.com"};
//
//        //2. Combine a person`s data
//
//        Contact p = new Contact();
//        Object person = ids[0] + ".  | " + firstNames[0] + " | " + lastNames[0] + " | " + jobs[0] + " | " + sexes[1] + " | " + emails[0] + " | ";
//
//
//        //3. I create address
//        int house;
//        String street;
//        String city;
//        String state;
//        int zip;
//
//        int[] houses = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
//        String[] streets = {"Orange St", "Apple St", "Plum St", "Grape St", "Ginger St", "Mango St", "Appricot St", "Cherry St", "Blueberry St", "Strawberry St"};
//        String[] cities = {"Austin", "Dallas", "Tampa", "Orlando", "Clearwater", "Brandon", "Panama", "Miami", "Waco", "Lakeland"};
//        String[] states = {"TX", "TX", "FL", "FL", "FL", "FL", "FL", "FL", "TX", "FL"};
//        int[] zips = {12345, 23456, 34567, 45678, 56789, 67890, 78901, 89012, 90123, 11234};
//
//        Address addr = new Address();
//
//        Object address = houses[0] + " " + streets[0] + ", " + cities[0] + ", " + states[0] + ", " + zips[0];
//
//        //System.out.println(address);
//
//
//        System.out.print(person);
//        System.out.print(address);
//
//        // create dob and phone number
//
//        NumberFormatException phoneNum = new NumberFormatException("###-###-####");
//        NumberFormatException dob = new NumberFormatException("MM/DD/YYYY");
//
//
//        //System.out.print("\n"+phoneNums);
//
//
//    }

//    public static contact createPerson(int id, String firstName, String lastName) {
//        contact person = new contact();
//        person.id = id;
//        person.firstName = firstName;
//        person.lastName = lastName;
//        return person;
//
//    }