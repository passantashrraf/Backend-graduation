package com.example.VoltBook.Services;

import com.example.VoltBook.Models.Car;
import com.example.VoltBook.Repos.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    private CarRepo carRepo;

    @Autowired
    public CarService(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public void addCar(Car car)
    {
        carRepo.save(car);
    }

    public Car getCar(int id)
    {
        return carRepo.findById(id).get();
    }

    public void deleteCar(int id)
    {
        carRepo.deleteById(id);
    }

    public void updateCar(Car car)
    {
        carRepo.save(car);
    }

    public Iterable<Car> getAllCars()
    {
        return carRepo.findAll();
    }

}
