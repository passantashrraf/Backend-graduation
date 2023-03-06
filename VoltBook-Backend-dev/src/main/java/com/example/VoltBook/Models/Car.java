package com.example.VoltBook.Models;

import jakarta.persistence.*;

//import javax.persistence.*;

@Entity
@Table
public class Car {
    String make;
    String model;
    String year;
    int batteryCapacity;
    int batteryLevel;
    int batteryRange;
    int batteryEfficiency;
    String ChargingConnectorType;
    String licensePlate;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryRange() {
        return batteryRange;
    }

    public void setBatteryRange(int batteryRange) {
        this.batteryRange = batteryRange;
    }

    public int getBatteryEfficiency() {
        return batteryEfficiency;
    }

    public void setBatteryEfficiency(int batteryEfficiency) {
        this.batteryEfficiency = batteryEfficiency;
    }

    public String getChargingConnectorType() {
        return ChargingConnectorType;
    }

    public void setChargingConnectorType(String chargingConnectorType) {
        ChargingConnectorType = chargingConnectorType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long carId;
    @ManyToOne
    @JoinColumn(name="ClientId", nullable=false)

    private Client client;
    public Car() {

    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }


    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
