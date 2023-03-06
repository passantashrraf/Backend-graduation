package com.example.VoltBook.Services;

import com.example.VoltBook.Models.Charger;
import com.example.VoltBook.Repos.ChargerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChargerService {
    private ChargerRepo chargerRepo;

    @Autowired
    public ChargerService(ChargerRepo chargerRepo) {
        this.chargerRepo = chargerRepo;
    }

    public void addCharger(Charger charger)
    {
        chargerRepo.save(charger);
    }

    public Charger getCharger(int id)
    {
        return chargerRepo.findById(id).get();
    }

    public void deleteCharger(int id)
    {
        chargerRepo.deleteById(id);
    }

    public void updateCharger(Charger charger)
    {
        chargerRepo.save(charger);
    }

    public Iterable<Charger> getAllChargers()
    {
        return chargerRepo.findAll();
    }

}
