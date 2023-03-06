package com.example.VoltBook.Controllers;

import com.example.VoltBook.Models.Provider;
import com.example.VoltBook.Services.ProviderService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*" , maxAge = 3600,allowCredentials = "false")
@RestController
@RequestMapping("/api/provider")
public class ProviderController {
    ProviderService providerService;

    public ProviderController(ProviderService providerService) {
        this.providerService = providerService;
    }

    @PostMapping("/add")
    public void addProvider(Provider provider)
    {
        providerService.addProvider(provider);
    }

    @GetMapping("/get")
    public Provider getProvider(int id)
    {
        return providerService.getProvider(id);
    }

    @DeleteMapping("/delete")
    public void deleteProvider(int id)
    {
        providerService.deleteProvider(id);
    }

    @PutMapping("/update")
    public void updateProvider(Provider provider)
    {
        providerService.updateProvider(provider);
    }

    @GetMapping("/all")
    public Iterable<Provider> getAllProviders()
    {
        return providerService.getAllProviders();
    }


}
