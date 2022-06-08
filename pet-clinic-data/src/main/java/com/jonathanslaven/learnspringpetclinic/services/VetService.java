package com.jonathanslaven.learnspringpetclinic.services;

import com.jonathanslaven.learnspringpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
