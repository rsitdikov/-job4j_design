package ru.job4j.serialization.json;

public class Address {
    private String zip;
    private String city;
    private String street;
    private String building;

    public Address(String zip, String city, String street, String building) {
        this.zip = zip;
        this.city = city;
        this.street = street;
        this.building = building;
    }

    @Override
    public String toString() {
        return "Address{"
                + "zip='" + zip + '\''
                + ", city='" + city + '\''
                + ", street='" + street + '\''
                + ", building='" + building + '\''
                + '}';
    }
}
