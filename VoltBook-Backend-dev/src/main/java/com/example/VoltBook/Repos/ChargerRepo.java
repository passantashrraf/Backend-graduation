package com.example.VoltBook.Repos;

import com.example.VoltBook.Models.Charger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChargerRepo extends JpaRepository<Charger, Integer> {


}
