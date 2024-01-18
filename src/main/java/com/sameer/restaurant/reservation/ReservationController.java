package com.sameer.restaurant.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    // ------------ Retrieve all reservations ------------
    @RequestMapping(value = "/reservations", method = RequestMethod.GET)
    public List getAllReservations() {
        return reservationService.getAllReservations();
    }

    // ------------ Retrieve a reservation ------------
    @RequestMapping(value = "/reservations/{id}", method = RequestMethod.GET)
    public ReservationEntity getReservation(@PathVariable Long id) {
        return reservationService.getReservation(id);
    }
    // ------------ Create a reservation ------------
    @RequestMapping(value = "/reservations", method =RequestMethod.POST)
    public void addReservation(@Valid @RequestBody ReservationEntity reservation) {
        reservationService.addReservation(reservation);
    }

    // ------------ Update a reservation ------------
    @RequestMapping(value = "/reservations/{id}", method = RequestMethod.PUT)
    public void updateReservation(@RequestBody ReservationEntity reservation,@PathVariable Long id) {
        reservationService.updateReservation(id, reservation);
    }

    // ------------ Delete a reservation ------------
    @RequestMapping(value = "/reservations/{id}", method = RequestMethod.DELETE)
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }
}
