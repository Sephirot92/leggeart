package com.leggeart.legge.entities;

import javax.persistence.*;

/**
 Class responsible for handling Addresses object. Contains all data connected
 to a case.

 @version 0.0.1
 @author ACh
 */
@Entity(name="ADDRESSES")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private long id;

    @Column(name= "STREET", nullable = false)
    private String street;

    @Column(name= "STREETNO", nullable = false)
    private int streetNo;

    @Column(name= "CITY", nullable = false)
    private String city;

    @Column(name= "ZIPCODE", nullable = false)
    private String zipCode;

    @Column(name= "COUNTRY", nullable = false)
    private String country;

    public Address() {
    }

    public Address(long id, String street, int streetNo, String city, String zipCode, String country) {
        this.id = id;
        this.street = street;
        this.streetNo = streetNo;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
