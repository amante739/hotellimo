package com.tamanna.hotellimo.controllers;
import com.tamanna.hotellimo.models.RoomReservation;
import com.tamanna.hotellimo.services.ReservationService;
import com.tamanna.hotellimo.util.DateUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/reservations")
public class RoomReservationController {
    private final DateUtils dateUtils;
    private final ReservationService reservationService;

    public RoomReservationController(DateUtils dateUtils, ReservationService reservationService) {
        this.dateUtils = dateUtils;
        this.reservationService = reservationService;
    }


    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getReservations(@RequestParam(value = "date", required = false) String dateString, Model model)
    {
        ModelAndView modelView = new ModelAndView();
        Date date=this.dateUtils.createDateFromDateString(dateString);
        List<RoomReservation> roomReservations=this.reservationService.getRoomReservationForDate(date);
        modelView.addObject("roomReservations" ,roomReservations);
        modelView.setViewName("roomres");
        return modelView;
       // return "redirect:/roomres.html";

    }

}
