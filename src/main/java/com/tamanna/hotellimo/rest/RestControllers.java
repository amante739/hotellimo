package com.tamanna.hotellimo.rest;

import com.tamanna.hotellimo.models.Guest;
import com.tamanna.hotellimo.models.RoomReservation;
import com.tamanna.hotellimo.repository.GuestRepository;
import com.tamanna.hotellimo.services.GuestService;
import com.tamanna.hotellimo.services.ReservationService;
import com.tamanna.hotellimo.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RestControllers {
    private final DateUtils dateUtils;
    private final ReservationService reservationService;
    private final GuestRepository guestRepository;
    private final GuestService guestService;

    @Autowired
    public RestControllers(DateUtils dateUtils, ReservationService reservationService, GuestRepository guestRepository, GuestService guestService) {
        this.dateUtils = dateUtils;
        this.reservationService = reservationService;
        this.guestRepository = guestRepository;
        this.guestService = guestService;
    }

    //@RequestMapping (path="/reservations",method = RequestMethod.GET)
    @GetMapping("/reservations")
    public ResponseEntity<List<RoomReservation>> getReservations(@RequestParam(value="date",required = false) String dateString){
        Date dateRes=this.dateUtils.createDateFromDateString(dateString);
        List<RoomReservation> service= this.reservationService.getRoomReservationForDate(dateRes);
        return new ResponseEntity<>(service, HttpStatus.OK);
    }

    @PostMapping("/guest/create")
    public ResponseEntity <Guest>createGuest(@RequestBody Guest guest){
       Guest createdGuest = guestService.createGuest( guest);

        return new ResponseEntity<>(createdGuest, HttpStatus.CREATED);
    }
    @GetMapping("/test")
    public ResponseEntity<String>  test(){
        String test = "test";
        return new ResponseEntity<>(test, HttpStatus.OK);
    }
}
