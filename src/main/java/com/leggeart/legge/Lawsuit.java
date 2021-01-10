package com.leggeart.legge;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

/**
 Class responsible for handling Lawsuit object. Contains all data connected
 to a case.

 @version 0.0.1
 @author LC
 */
@Entity
@Table(name="LAWSUITS")
public class Lawsuit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name= "SIGNATURE", nullable = false)
    private String signature;

    @Column(name= "COURT", nullable = false)
    private String court;

    @Column(name= "PLAINTIFF", nullable = false)
    private String plaintiff;

    @Column(name = "PLAINTIFFREPRESENTATIVE")
    private String plaintiffRepresentative;

    @Column(name = "DEFENDANT", nullable = false)
    private String defendant;

    @Column(name = "defendantRepresentative")
    private String defendantRepresentative;

    @Column (name = "THEME", nullable = false)
    private String theme;

    @Column (name = "SALARY")
    private BigDecimal salary;

    @Column(name = "WASSALARYPAYED")
    private boolean wasSalaryPayed;

    @Column(name = "BEGGININGDATE")
    private Date begginingDate;

    @Column(name = "ENDINGDATE")
    private LocalDate endingDate;

    public Lawsuit() {
    }

    public Lawsuit(String signature, String court, String plaintiff, String plaintiffRepresentative,
                   String defendant, String defendantRepresentative, String theme, BigDecimal salary,
                   boolean wasSalaryPayed, LocalDate begginingDate, LocalDate endingDate) {
        this.signature = signature;
        this.court = court;
        this.plaintiff = plaintiff;
        this.plaintiffRepresentative = plaintiffRepresentative;
        this.defendant = defendant;
        this.defendantRepresentative = defendantRepresentative;
        this.theme = theme;
        this.salary = salary;
        this.wasSalaryPayed = wasSalaryPayed;
        this.begginingDate = new Date();
        this.endingDate = endingDate;
    }

    public int getId() {
        return id;
    }

    public String getSignature() {
        return signature;
    }

    public String getCourt() {
        return court;
    }

    public String getPlaintiff() {
        return plaintiff;
    }

    public String getPlaintiffRepresentative() {
        return plaintiffRepresentative;
    }

    public String getDefendant() {
        return defendant;
    }

    public String getDefendantRepresentative() {
        return defendantRepresentative;
    }

    public String getTheme() {
        return theme;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public boolean isWasSalaryPayed() {
        return wasSalaryPayed;
    }

    public Date getBegginingDate() {
        return begginingDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }
}
