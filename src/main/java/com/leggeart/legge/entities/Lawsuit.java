package com.leggeart.legge.entities;

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
@Entity(name="LAWSUITS")
public class Lawsuit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private long id;

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

    @Column (name = "SUBJECT", nullable = false)
    private String subject;

    @Column(name = "PAYMENT")
    private BigDecimal payment;

    @Column(name = "WASPAYMENTDONE")
    private boolean wasPaymentDone;

    @Column(name = "BEGGININGDATE")
    private LocalDate begginingDate;

    @Column(name = "ENDINGDATE")
    private LocalDate endingDate;

    public Lawsuit() {
    }

    public Lawsuit(long id, String signature, String court, String plaintiff, String plaintiffRepresentative, String defendant,
                   String defendantRepresentative, String subject, BigDecimal payment, boolean wasPaymentDone,
                   LocalDate begginingDate, LocalDate endingDate) {
        this.id = id;
        this.signature = signature;
        this.court = court;
        this.plaintiff = plaintiff;
        this.plaintiffRepresentative = plaintiffRepresentative;
        this.defendant = defendant;
        this.defendantRepresentative = defendantRepresentative;
        this.subject = subject;
        this.payment = payment;
        this.wasPaymentDone = wasPaymentDone;
        this.begginingDate = begginingDate;
        this.endingDate = endingDate;
    }

    public long getId() {
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

    public String getSubject() {
        return subject;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public boolean isWasPaymentDone() {
        return wasPaymentDone;
    }

    public LocalDate getBegginingDate() {
        return begginingDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void setCourt(String court) {
        this.court = court;
    }

    public void setPlaintiff(String plaintiff) {
        this.plaintiff = plaintiff;
    }

    public void setPlaintiffRepresentative(String plaintiffRepresentative) {
        this.plaintiffRepresentative = plaintiffRepresentative;
    }

    public void setDefendant(String defendant) {
        this.defendant = defendant;
    }

    public void setDefendantRepresentative(String defendantRepresentative) {
        this.defendantRepresentative = defendantRepresentative;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public void setWasPaymentDone(boolean wasPaymentDone) {
        this.wasPaymentDone = wasPaymentDone;
    }

    public void setBegginingDate(LocalDate begginingDate) {
        this.begginingDate = begginingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }
}
