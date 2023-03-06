package com.example.VoltBook.Services;

import com.example.VoltBook.Models.Provider;
import com.example.VoltBook.Repos.ProviderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProviderService {
    private ProviderRepo providerRepo;

    @Autowired
    public ProviderService(ProviderRepo providerRepo) {
        this.providerRepo = providerRepo;
    }

    public void addProvider(Provider provider)
    {
        providerRepo.save(provider);
    }

    public Provider getProvider(int id)
    {
        return providerRepo.findById(id).get();
    }

    public void deleteProvider(int id)
    {
        providerRepo.deleteById(id);
    }

    public void updateProvider(Provider provider)
    {
        providerRepo.save(provider);
    }


    public Iterable<Provider> getAllProviders()
    {
        return providerRepo.findAll();
    }

}
