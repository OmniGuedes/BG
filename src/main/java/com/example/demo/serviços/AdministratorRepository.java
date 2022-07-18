package com.example.demo.serviços;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Administrator;

public interface AdministratorRepository extends CrudRepository<Administrator, Integer>{
    
}
