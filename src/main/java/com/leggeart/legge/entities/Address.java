package com.leggeart.legge.entities;

import javax.persistence.*;

/**
 * Class responsible for handling Addresses object. Contains all data connected
 * to a case.
 *
 * @author ACh
 * @version 0.0.2
 */
@Entity(name = "ADDRESSES")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private long id;

    @Column(name = "STREET", nullable = false)
    private String street;

    @Column(name = "STREETNO", nullable = false)
    private int streetNo;

    @Column(name = "FLATNO", nullable = false)
    private int flatNo;

    @Column(name = "CITY", nullable = false)
    private String city;

    @Column(name = "ZIPCODE", nullable = false)
    private String zipCode;

    @Column(name = "COUNTRY", nullable = false)
    private String country;

    public Address() {
    }

    public Address(long id, String street, int streetNo, int flatNo, String city, String zipCode, String country) {
        this.id = id;
        this.street = street;
        this.streetNo = streetNo;
        this.flatNo = flatNo;
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

    public int getFlatNo() {
        return flatNo;
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

    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
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
