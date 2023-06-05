package com.devsuperior.desafioessential03.services;

import com.devsuperior.desafioessential03.dto.ClientDTO;
import com.devsuperior.desafioessential03.entities.Client;
import com.devsuperior.desafioessential03.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){
        Client client = repository.findById(id).get();
        return new ClientDTO(client);

    }
}
