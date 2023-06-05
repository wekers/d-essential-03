package com.devsuperior.desafioessential03.repositories;

import com.devsuperior.desafioessential03.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
