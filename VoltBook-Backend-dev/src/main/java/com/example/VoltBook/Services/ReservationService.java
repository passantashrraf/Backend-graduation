package com.example.VoltBook.Services;

import com.example.VoltBook.Models.Reservation;
import com.example.VoltBook.Repos.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    private ReservationRepo reservationRepo;

    @Autowired
    public ReservationService(ReservationRepo reservationRepo) {
        this.reservationRepo = reservationRepo;
    }

    public void addReservation(Reservation reservation) { reservationRepo.save(reservation);}
    public Reservation getReservation(int id)
    {
        return reservationRepo.findById(id).get();
    }

    public void deleteReservation(int id)
    {
        reservationRepo.deleteById(id);
    }

    public void updateReservation(Reservation reservation)
    {
        reservationRepo.save(reservation);
    }

    public Iterable<Reservation> getAllReservations()
    {
        return reservationRepo.findAll();
    }

}
