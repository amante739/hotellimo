package com.tamanna.hotellimo.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="RESERVATION")
public class Reservation {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="RESERVATION_ID")
    private long id;
    @Column(name="ROOM_ID")
    private long ROOM_ID;
    @Column(name="GUEST_ID")
    private long GUEST_ID;
    @Column(name="RES_DATE")
    private Date reservationDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getROOM_ID() {
        return ROOM_ID;
    }

    public void setROOM_ID(long ROOM_ID) {
        this.ROOM_ID = ROOM_ID;
    }

    public long getGUEST_ID() {
        return GUEST_ID;
    }

    public void setGUEST_ID(long GUEST_ID) {
        this.GUEST_ID = GUEST_ID;
    }

    public Date getRES_DATE() {
        return reservationDate;
    }

    public void setRES_DATE(Date RES_DATE) {
        this.reservationDate = reservationDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", ROOM_ID=" + ROOM_ID +
                ", GUEST_ID=" + GUEST_ID +
                ", reservationDate=" + reservationDate +
                '}';
    }
}
