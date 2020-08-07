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