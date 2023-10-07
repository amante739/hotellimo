package com.tamanna.hotellimo.services;

import com.tamanna.hotellimo.models.Guest;
import com.tamanna.hotellimo.models.Reservation;
import com.tamanna.hotellimo.models.Room;
import com.tamanna.hotellimo.models.RoomReservation;
import com.tamanna.hotellimo.repository.GuestRepository;
import com.tamanna.hotellimo.repository.ReservationRepository;
import com.tamanna.hotellimo.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ReservationService {
    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;


    public ReservationService(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    public List<RoomReservation> getRoomReservationForDate(Date date){
        Iterable<Room>rooms=this.roomRepository.findAll();
        Map<Long,RoomReservation> roomReservationMap=new HashMap<>();
        rooms.forEach(room->{
            RoomReservation roomReservation=new RoomReservation();
            roomReservation.setRoomId(room.getId());
            roomReservation.setRoomName(room.getName());
            roomReservation.setRoomNumber(room.getRoomNumber());
            roomReservation.setDate(date);
            roomReservationMap.put(room.getId(),roomReservation);
        });


        Iterable<Reservation> reservations=this.reservationRepository.findAll();

        reservations.forEach(reservation -> {
            RoomReservation roomReservation=roomReservationMap.get(reservation.getRoomId());
            //roomReservation.setDate(date);
            Guest guest=this.guestRepository.findById(reservation.getGuestId()).get();
            roomReservation.setFirstName(guest.getFirstName());
            roomReservation.setLastName(guest.getLastName());
            roomReservation.setGuestId(guest.getId());
        });

        List<RoomReservation> roomReservationList=new ArrayList<>();
        for (Long id:roomReservationMap.keySet()){
            roomReservationList.add(roomReservationMap.get(id));
        }
        //System.out.println("--------------------------");
        //System.out.println(roomReservationList);
        roomReservationList.sort((o1, o2) -> {
            if (o1.getRoomName().equals(o2.getRoomName())) {
                return o1.getRoomNumber().compareTo(o2.getRoomNumber());
            }
            return o1.getRoomName().compareTo(o2.getRoomName());
        });



        return roomReservationList;
    }
}
