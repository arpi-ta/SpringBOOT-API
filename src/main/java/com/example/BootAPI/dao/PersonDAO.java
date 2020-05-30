package com.example.BootAPI.dao;

import com.example.BootAPI.model.Person;

import java.util.UUID;

public interface PersonDAO {

    int insertPerson(UUID id, Person person); //function for inserting person name to DB

    default int insertPerson(Person person) //interface abstract functions cannot have body (adding default)
    {
        UUID id=UUID.randomUUID();
        return insertPerson(id,person);

    }
}
