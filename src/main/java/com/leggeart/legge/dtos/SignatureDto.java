package com.leggeart.legge.dtos;

/**
 * Dto class to handle Signature class.
 *
 * @author ACh
 * @version 0.0.1
 */
public class SignatureDto {
    private long id;
    private String designation;

    public SignatureDto() {
    }

    public SignatureDto(long id, String designation) {
        this.id = id;
        this.designation = designation;
    }

    public long getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
