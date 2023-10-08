package com.tamanna.hotellimo.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="Guest")

public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GUEST_ID")
    private Long id;
    @Column(name="FIRST_NAME")
    private String firstName ;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name="ADDRESS")
    private String address;
    @Column(name="COUNTRY")
    private String country;
    @Column(name="STATE")
    private String state;
    @Column(name="PHONE_NUMBER")
    private String phoneNumber;




}
