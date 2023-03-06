package com.example.VoltBook.Models;
import jakarta.persistence.*;
import com.example.VoltBook.Models.Car;

import java.util.Set;

@Entity
@Table
public class Client implements User {

    private String status;

    @OneToMany(mappedBy="client")
    private Set<Car> cars;
    @OneToMany(mappedBy="client")
    private Set<Reservation> reservations;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long clientId;

    public Client() {
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }
}