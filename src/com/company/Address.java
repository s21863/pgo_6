package com.company;

public class Address {
    public String country;
    public String city;
    public String postcode;
    public String street;
    public String number;

    public static String createAddress(String country, String city) {
        return (city + " " + country);
    }

    public static String createAddress(String country, String city, String postcode) {
        return (city + " " + country + " " + postcode);
    }

    public static String createAddress(String country, String city, String postcode, String street) {
        return (street + " " + city + " " + country + " " + postcode);
    }

    public static String createAddress(String country, String city, String postcode, String street, String number) {
        return (number + " " + street + " " + city + " " + country + " " + postcode);
    }
}
