package com.jonathanslaven.learnspringpetclinic.bootstrap;

import com.jonathanslaven.learnspringpetclinic.model.Owner;
import com.jonathanslaven.learnspringpetclinic.model.Vet;
import com.jonathanslaven.learnspringpetclinic.services.OwnerService;
import com.jonathanslaven.learnspringpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) {
        System.out.println("Bootstrapping Demo Data #############################################");
        System.out.println("Loading owners");

        Owner owner1 = new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Doe");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Bob");
        owner2.setLastName("Smith");
        ownerService.save(owner2);

        System.out.println("Loading vets");

        Vet vet1 = new Vet();
        vet1.setFirstName("Anna");
        vet1.setLastName("Mary");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Laura");
        vet2.setLastName("Linton");
        vetService.save(vet2);

        System.out.println("Finished bootstrapping data");

    }
}
