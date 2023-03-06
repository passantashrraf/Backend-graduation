package com.example.VoltBook.Models;

import jakarta.persistence.*;

import java.sql.Timestamp;

//import javax.persistence.*;

@Entity
@Table
public class Reservation {
    //client:Client
    Timestamp startTime;
    Timestamp expectedTime;
    Timestamp endTime;
    double price;
    //charger:Chrger
    //Provider provider;
    //payment:Payment
    double powerExcepected;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long ReservationId;
    @ManyToOne
    @JoinColumn(name="ClientId", nullable=false)
    private Client client;
    public Reservation() {
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getExpectedTime() {
        return expectedTime;
    }

    public void setExpectedTime(Timestamp expectedTime) {
        this.expectedTime = expectedTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPowerExcepected() {
        return powerExcepected;
    }

    public void setPowerExcepected(double powerExcepected) {
        this.powerExcepected = powerExcepected;
    }

    public Long getReservationId() {
        return ReservationId;
    }

    public void setReservationId(Long reservationId) {
        ReservationId = reservationId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }



}
