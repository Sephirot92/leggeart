package com.leggeart.legge.entities;

import javax.persistence.*;

/**
 * Class responsible for handling Signature (as a number of case) object.
 *
 * @author ACh
 * @version 0.0.1
 */
@Entity(name = "SIGNATURE")
public class Signature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private long id;

    @Column(name = "DESIGNATION", nullable = false)
    private String designation;

    public Signature() {
    }

    public Signature(long id, String designation) {
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
