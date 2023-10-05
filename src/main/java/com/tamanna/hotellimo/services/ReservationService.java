package com.tamanna.hotellimo.services;

import com.tamanna.hotellimo.models.Room;
import com.tamanna.hotellimo.models.RoomReservation;
import com.tamanna.hotellimo.repository.GuestRepository;
import com.tamanna.hotellimo.repository.ReservationRepository;
import com.tamanna.hotellimo.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

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
        rooms.forEach(room->{
            RoomReservation roomReservation=new RoomReservation();
            roomReservation.setRoomId(room.getId());
            roomReservation.setRoomName(room.getName());
            roomReservation.setRoomNumber(room.getRoomNumber());
        });


        return null;
    }
}
