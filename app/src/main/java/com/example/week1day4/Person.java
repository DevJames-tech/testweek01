package com.example.week1day4;

import java.sql.Struct;

public class Person {

    String name;
    String LastName;

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    String streetAddress;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    String state;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    String city;

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    String zip ;
    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    Person() {
        String name = this.name;
        String LastName = this.LastName;
        String streetAddress = this.streetAddress;
        String state = this.state;
        String city = this.city;
        String zip = this.zip;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                '}';
    }
}