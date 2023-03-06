package com.example.VoltBook.Repos;

import com.example.VoltBook.Models.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepo extends JpaRepository<Provider, Integer> {

}
