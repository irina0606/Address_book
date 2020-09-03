package com.JavaBasic.entity;

public class Address {

    private String house;
    private String street;
    private String city;
    private String state;
    private int zip;

    public Address(String house, String street, String city, String state, int zip) {
        this.house = house;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }

    public String getState() {
        return state;
    }
    public void setState (String state){
        this.state=state;
    }

    public int getZip() {
        return zip;
    }
    public void setZip(int zip){
        this.zip=zip;
    }


//    int[] houses={10,11,12,13,14,15,16,17,18,19};
//    String[] streets={"Orange St", "Apple St", "Plum St", "Grape St", "Ginger St", "Mango St", "Appricot St", "Cherry St", "Blueberry St", "Strawberry St" };
//    String[] cities= {"Austin","Dallas","Tampa","Orlando","Clearwater","Brandon","Panama","Miami","Waco","Lakeland"};
//    String[] states= {"TX","TX","FL","FL","FL","FL","FL","FL","TX","FL"};
//    int[] zips={12345,23456,34567,45678,56789,67890,78901,89012,90123,11234};


}
