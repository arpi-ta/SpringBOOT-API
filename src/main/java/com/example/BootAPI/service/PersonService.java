package com.example.BootAPI.service;

import com.example.BootAPI.dao.PersonDAO;
import com.example.BootAPI.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonDAO personDAO;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDAO personDAO) {
        this.personDAO = personDAO;
    }


    public int addPerson(Person person){
        return personDAO.insertPerson(person);
    }
}
