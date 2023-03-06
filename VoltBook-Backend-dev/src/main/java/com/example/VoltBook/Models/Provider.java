package com.example.VoltBook.Models;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table
public class Provider implements User {

    int bankAccountNum;
    //historyOfBookings[]:Reservation
    //private Set<Integer> ratings;
    double avgRating;
    //location: Location
    //photos: images
    //currentBookings[]:Reservation
    //reservations []: Reservation
    //verficationDocs: images
    String address;
    String status;

    @OneToMany(mappedBy="provider")
    private Set<Charger> chargers;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long providerId;

    public Provider() {
    }

    public int getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(int bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Charger> getChargers() {
        return chargers;
    }

    public void setChargers(Set<Charger> chargers) {
        this.chargers = chargers;
    }

    public Long getProviderId() {
        return providerId;
    }

    public void setProviderId(Long providerId) {
        this.providerId = providerId;
    }
}