package com.sameer.restaurant.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    // Retrieve all rows from table and populate list with objects
    public List getAllReservations() {
        List reservations = new ArrayList<>();
        reservationRepository.findAll().forEach(reservations::add);
        return reservations;
    }

    // Retrieves one row from table based on given id
    public ReservationEntity getReservation(Long id) {
        Optional<ReservationEntity> res = reservationRepository.findById(id);
        if(res != null){
            return res.get();
        } else {
            return null;
        }
    }

    // Inserts row into table
    //TODO: validate input
    public void addReservation(ReservationEntity reservation) {
        reservationRepository.save(reservation);
    }

    // Updates row in table
    //TODO: validate input
    public void updateReservation(Long id, ReservationEntity reservation) {
        reservationRepository.save(reservation);
    }

    // Removes row from table
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
