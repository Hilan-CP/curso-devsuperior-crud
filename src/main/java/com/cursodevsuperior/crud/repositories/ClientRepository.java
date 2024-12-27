package com.cursodevsuperior.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursodevsuperior.crud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
