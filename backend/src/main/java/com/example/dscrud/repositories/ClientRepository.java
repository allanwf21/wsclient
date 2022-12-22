package com.example.dscrud.repositories;

import com.example.dscrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface ClientRepository extends JpaRepository<Client, Long> {

    }

