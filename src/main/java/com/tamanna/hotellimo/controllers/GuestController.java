package com.tamanna.hotellimo.controllers;


import com.tamanna.hotellimo.models.Guest;
import com.tamanna.hotellimo.services.GuestService;
import org.apache.coyote.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Method;
import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {
    public final GuestService guestService;


    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView  getGuestList(Model model){
        ModelAndView modelAndView= new ModelAndView();
        List<Guest> GuestList= guestService.getGuestList();
        System.out.println(GuestList);
        modelAndView.addObject("guestList",GuestList);
        modelAndView.setViewName("guest");
        return modelAndView;

    }
}
