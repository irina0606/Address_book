package com.JavaBasic.entity;

public class Contact {


    private int id;
    private String firstName;
    private String lastName;
    private char sex;
    private String email;
    private long phone;
    private Address address;
    private String job;

    public Contact(int id,String firstName,String lastName,char sex,Address address,String email,long phone,String job){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.sex=sex;
        this.email=email;
        this.phone=phone;
        this.address=address;
        this.job=job;
    }

    public int getId(){return id;}
    public void setId(int id){this.id=id;}

    public String getFirstName(){return firstName;}
    public void setFirstName(String firstName){this.firstName=firstName;}

    public String getLastName(){return lastName;}
    public void setLastName(String lastName){this.lastName=lastName;}

    public char getSex(){return sex;}
    public void setSex(char sex){this.sex=sex;}

    public String getEmail(){return  email;}
    public void setEmail(String email){this.email=email;}

    public long getPhone(){return phone;}
    public void setPhone(long phone){this.phone=phone;}

    public Address getAddress(){return  address;}
    public void setAddress(Address address){this.address=address;}

    public String getJob(){return job;}
    public void setJob(String job){this.job=job;}





//    int[]ids={1,2,3,4,5,6,7,8,9,10};
//    String[] firstNames= {"Anna", "Vera", "Tanya", "Galina", "Julia", "Victor", "Alex", "Serge", "Boris", "Den"};
//    String[] lastNames= {"Blue", "Red", "Yellow","Brown", "Pink", "Black", "White", "Green", "Grey", "Silver"};
//    String[] jobs={"Doctor", "Nurse", "Surgeon", "Psychotherapist", "Dentist", "Urologist", "Cardiologist", "Endocrinologist", "Pediatrician", "Dermatologist"};
//    char[] sexes={'M', 'F'};
//    String[] emails= {"AB@gmail.com","VR@gmail.com","TY@gmail.com","GB@gmail.com","JP@gmail.com","VB@gmail.com","AW@gmail.com","SG@gmail.com","BG@gmail.com", "DS@gmail.com"};
}
