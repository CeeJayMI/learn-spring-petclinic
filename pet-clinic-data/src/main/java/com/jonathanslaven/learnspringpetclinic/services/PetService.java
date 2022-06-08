package com.jonathanslaven.learnspringpetclinic.services;

import com.jonathanslaven.learnspringpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
