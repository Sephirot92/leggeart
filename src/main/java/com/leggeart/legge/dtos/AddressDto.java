package com.leggeart.legge.dtos;

/**
 Dto class to handle Address class.

 @version 0.0.1
 @author ACh
 */
public class AddressDto {

    private long id;
    private String street;
    private int streetNo;
    private String city;
    private String zipCode;
    private String country;

    public AddressDto() {
    }

    public AddressDto(long id, String street, int streetNo, String city, String zipCode, String country) {
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
