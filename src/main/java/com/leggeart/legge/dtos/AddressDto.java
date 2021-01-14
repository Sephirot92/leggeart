package com.leggeart.legge.dtos;

/**
 * Dto class to handle Address class.
 *
 * @author ACh
 * @version 0.0.2
 */
public class AddressDto {

    private long id;
    private String street;
    private int streetNo;
    private int flatNo;
    private String city;
    private String zipCode;
    private String country;

    public AddressDto() {
    }

    public AddressDto(long id, String street, int flatNo, int streetNo, String city, String zipCode, String country) {
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
