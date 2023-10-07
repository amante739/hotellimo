package com.tamanna.hotellimo.util;

import com.tamanna.hotellimo.models.Guest;
import com.tamanna.hotellimo.models.Reservation;
import com.tamanna.hotellimo.models.Room;
import com.tamanna.hotellimo.models.RoomReservation;
import com.tamanna.hotellimo.services.ReservationService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class AppStartUpEvent implements ApplicationListener<ApplicationReadyEvent> {

    private final ReservationService reservationService;
    private final DateUtils dateUtils;

    public AppStartUpEvent(ReservationService reservationService, DateUtils dateUtils) {
        this.reservationService = reservationService;
        this.dateUtils = dateUtils;
    }


    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Date date=this.dateUtils.createDateFromDateString("2022-01-01");
        List<RoomReservation> roomReservationList=this.reservationService.getRoomReservationForDate(date);

       /* Iterable<Room> rooms=this.roomRepository.findAll();
        rooms.forEach(System.out::println);
        Iterable<Guest> guests=this.guestRepository.findAll();
        guests.forEach(System.out::println);

        Iterable<Reservation> reservationList=this.reservationRepository.findAll();
        reservationList.forEach(System.out::println);*/

    }

}
