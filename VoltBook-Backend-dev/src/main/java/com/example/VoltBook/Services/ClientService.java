package com.example.VoltBook.Services;

import com.example.VoltBook.Models.Client;
import com.example.VoltBook.Repos.CarRepo;
import com.example.VoltBook.Repos.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private ClientRepo clientRepo;
    private CarRepo carRepo;

    @Autowired
    public ClientService(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    public void addClient(Client client)
    {
        clientRepo.save(client);
    }

    public Client getClient(int id)
    {
        return clientRepo.findById(id).get();
    }

    public void deleteClient(int id)
    {
        clientRepo.deleteById(id);
    }

    public void updateClient(Client client)
    {
        clientRepo.save(client);
    }

    /*
    public void addCar(Car car,Long id)
    {
        car.getClient().setClientId(id);
        carRepo.save(car);
    }*/

    public Iterable<Client> getAllClients()
    {
        return clientRepo.findAll();
    }

}
