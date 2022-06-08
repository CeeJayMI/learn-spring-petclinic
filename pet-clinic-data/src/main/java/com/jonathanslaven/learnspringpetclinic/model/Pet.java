package com.jonathanslaven.learnspringpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {
    private LocalDate birthdate;
    private PetType petType;
    private Owner owner;

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
