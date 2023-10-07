package com.tamanna.hotellimo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name="RESERVATION")
public class Reservation {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="RESERVATION_ID")
    private long id;
    @Column(name="ROOM_ID")
    private long roomId;
    @Column(name="GUEST_ID")
    private long guestId;
    @Column(name="RES_DATE")
    private Date reservationDate;

}
