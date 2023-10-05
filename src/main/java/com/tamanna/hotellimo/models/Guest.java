package com.tamanna.hotellimo.models;

import jakarta.persistence.*;

@Entity
@Table(name="Guest")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "GUEST_ID")
    private Long id;
    @Column(name="FIRST_NAME")
    private String FIRST_NAME;
    @Column(name="LAST_NAME")
    private String LAST_NAME;
    @Column(name="EMAIL_ADDRESS")
    private String EMAIL_ADDRESS;
    @Column(name="ADDRESS")
    private String ADDRESS;
    @Column(name="COUNTRY")
    private String COUNTRY;
    @Column(name="STATE")
    private String STATE;
    @Column(name="PHONE_NUMBER")
    private String PHONE_NUMBER;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getEMAIL_ADDRESS() {
        return EMAIL_ADDRESS;
    }

    public void setEMAIL_ADDRESS(String EMAIL_ADDRESS) {
        this.EMAIL_ADDRESS = EMAIL_ADDRESS;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }

    public String getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public void setPHONE_NUMBER(String PHONE_NUMBER) {
        this.PHONE_NUMBER = PHONE_NUMBER;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", FIRST_NAME='" + FIRST_NAME + '\'' +
                ", LAST_NAME='" + LAST_NAME + '\'' +
                ", EMAIL_ADDRESS='" + EMAIL_ADDRESS + '\'' +
                ", ADDRESS='" + ADDRESS + '\'' +
                ", COUNTRY='" + COUNTRY + '\'' +
                ", STATE='" + STATE + '\'' +
                ", PHONE_NUMBER='" + PHONE_NUMBER + '\'' +
                '}';
    }
}
