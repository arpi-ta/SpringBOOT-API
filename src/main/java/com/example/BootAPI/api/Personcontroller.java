package com.example.BootAPI.api;

import com.example.BootAPI.model.Person;
import com.example.BootAPI.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v2/person")
@RestController
public class Personcontroller {

    private final PersonService personService;

    @Autowired
    public Personcontroller(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public int addPerson(@RequestBody Person person){
        //System.out.println(person);
        return personService.addPerson(person);
    }
}
