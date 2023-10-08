package com.tamanna.hotellimo.services;

import com.tamanna.hotellimo.models.Guest;
import com.tamanna.hotellimo.models.RoomReservation;
import com.tamanna.hotellimo.repository.GuestRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class GuestService {
    public final GuestRepository guestRepository;

    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }
    public List<Guest> getGuestList() {

        List <Guest> guests=guestRepository.findAll();
        List<Guest> guestList=new ArrayList<>();
        guests.forEach(guest->{
            guestList.add(guest);
        });
        return guestList;

    }



    public Guest createGuest(Guest guest) {
        Guest guests=new Guest();
        guests.setLastName(guest.getLastName());
        guests.setFirstName(guest.getFirstName());
        guests.setAddress(guest.getAddress());
        guests.setEmailAddress(guest.getEmailAddress());
        guests.setCountry(guest.getCountry());
        guests.setState(guest.getState());
        guests.setPhoneNumber(guest.getPhoneNumber());
        //guests
        return guestRepository.save(guest);
    }
}
