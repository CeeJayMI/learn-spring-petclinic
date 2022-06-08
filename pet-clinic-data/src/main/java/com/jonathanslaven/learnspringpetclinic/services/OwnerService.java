package com.jonathanslaven.learnspringpetclinic.services;

import com.jonathanslaven.learnspringpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
