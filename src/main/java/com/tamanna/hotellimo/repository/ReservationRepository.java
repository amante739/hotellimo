package com.tamanna.hotellimo.repository;

import com.tamanna.hotellimo.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;



public interface ReservationRepository extends JpaRepository<Reservation, Long> {

   //iterable<Reservation> findReservationByDate(Date date);

}
