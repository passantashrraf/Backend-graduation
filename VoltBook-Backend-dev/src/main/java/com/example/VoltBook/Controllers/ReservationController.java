package com.example.VoltBook.Controllers;

import com.example.VoltBook.Models.Reservation;
import com.example.VoltBook.Services.ReservationService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*" , maxAge = 3600,allowCredentials = "false")
@RestController
@RequestMapping("/api/reservation")
public class ReservationController {
    ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/add")
    public void addCar(Reservation reservation)
    {
        reservationService.addReservation(reservation);
    }

    @GetMapping("/get")
    public Reservation getCar(int id)
    {
        return reservationService.getReservation(id);
    }

    @DeleteMapping("/delete")
    public void deleteCar(int id)
    {
        reservationService.deleteReservation(id);
    }

    @PutMapping ("/update")
    public void updateCar(Reservation reservation)
    {
        reservationService.updateReservation(reservation);
    }

    @GetMapping("/all")
    public Iterable<Reservation> getAllReservations()
    {
        return reservationService.getAllReservations();
    }


}
