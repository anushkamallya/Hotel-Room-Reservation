package com.hotelreservations.reactivespring.controller;

import com.hotelreservations.reactivespring.model.Reservation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.awt.*;

//Convenient annotation that gives you controller as well as ResponseBody annotation
@RestController
@RequestMapping(ReservationResource.ROOM_V_1_RESERVATION)
//Angular App and Spring Apps run on different ports, cross origin helps you run Angular app and Spring app together
@CrossOrigin
public class ReservationResource {

    public static final String ROOM_V_1_RESERVATION = "/room/v1/reservation/";

    @GetMapping(path = "{roomId}", produces = MediaType.APPLICATION_JSON_VALUE)
    //The variable name and path parameter (room Id) match, Spring will know to extract the path parameter to that variable
    public Mono<String> getReservationById(@PathVariable String roomId){
        //reservationService.getReservation(roomId);
        return Mono.just("{}");

    }

}
