package com.example.VoltBook.Controllers;

import com.example.VoltBook.Models.Car;
import com.example.VoltBook.Services.CarService;
import com.example.VoltBook.Models.Client;
//import com.example.VoltBook.Services.CLientService;
import com.example.VoltBook.Services.ClientService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*" , maxAge = 3600,allowCredentials = "false")
@RestController
@RequestMapping("/api/client")
public class ClientController {
    ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/add")
    public void addClient(Client client)
    {
        clientService.addClient(client);
    }

    @GetMapping("/get")
    public Client getClient(int id)
    {
        return clientService.getClient(id);
    }

    @DeleteMapping("/delete")
    public void deleteClient(int id)
    {
        clientService.deleteClient(id);
    }

    @PutMapping("/update")
    public void updateClient(Client client)
    {
        clientService.updateClient(client);
    }

    /*@PostMapping("/addCar")
    public void addCar(Client client,Car car)
    {
        clientService.addCar(car, client.getClientId());
    }*/

    @GetMapping("/all")
    public Iterable<Client> getAllClients()
    {
        return clientService.getAllClients();
    }


}
