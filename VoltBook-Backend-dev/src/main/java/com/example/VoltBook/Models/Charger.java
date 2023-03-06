package com.example.VoltBook.Models;

import jakarta.persistence.*;

import java.text.DateFormat;

//import javax.persistence.*;

@Entity
@Table
public class Charger {
    String chargingType;
    boolean working;
    DateFormat availableTime;
    String chargingConnectorType;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long chargerId;
    @ManyToOne
    @JoinColumn(name="providerId", nullable=false)
    private Provider provider;


    public Charger() {
    }

    public void setChargerIdId(Long id) {
        this.chargerId = id;
    }

    public Long getChargerIdId() {
        return chargerId;
    }

    public String getChargingType() {
        return chargingType;
    }

    public void setChargingType(String chargingType) {
        this.chargingType = chargingType;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public DateFormat getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(DateFormat availableTime) {
        this.availableTime = availableTime;
    }

    public String getChargingConnectorType() {
        return chargingConnectorType;
    }

    public void setChargingConnectorType(String chargingConnectorType) {
        this.chargingConnectorType = chargingConnectorType;
    }
}