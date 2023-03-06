package com.example.VoltBook.Controllers;

import com.example.VoltBook.Models.Car;
import com.example.VoltBook.Services.CarService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*" , maxAge = 3600,allowCredentials = "false")
@RestController
@RequestMapping("/api/car")
public class CarController {
    CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/add")
    public void addCar(Car car)
    {
        carService.addCar(car);
    }

    @GetMapping("/get")
    public Car getCar(int id)
    {
        return carService.getCar(id);
    }

    @DeleteMapping ("/delete")
    public void deleteCar(int id)
    {
        carService.deleteCar(id);
    }

    @PutMapping("/update")
    public void updateCar(Car car)
    {
        carService.updateCar(car);
    }

    @GetMapping("/all")
    public Iterable<Car> getAllCars()
    {
        return carService.getAllCars();
    }


}
