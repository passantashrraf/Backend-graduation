package com.example.VoltBook.Controllers;

import com.example.VoltBook.Models.Charger;
import com.example.VoltBook.Services.ChargerService;
import com.example.VoltBook.Services.ClientService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*" , maxAge = 3600,allowCredentials = "false")
@RestController
@RequestMapping("/api/charger")
public class ChargerController {
    ChargerService chargerService;

    public ChargerController(ChargerService chargerService) {
        this.chargerService = chargerService;
    }

    @PostMapping("/add")
    public void addCharger(Charger charger)
    {
        chargerService.addCharger(charger);
    }

    @GetMapping("/get")
    public Charger getCharger(int id)
    {
        return chargerService.getCharger(id);
    }

    @DeleteMapping("/delete")
    public void deleteCharger(int id)
    {
        chargerService.deleteCharger(id);
    }

    @PutMapping("/update")
    public void updateCharger(Charger charger)
    {
        chargerService.updateCharger(charger);
    }

    @GetMapping("/all")
    public Iterable<Charger> getAllChargers()
    {
        return chargerService.getAllChargers();
    }


}
