package com.example.BootAPI.dao;

import com.example.BootAPI.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class PersonDataAccessService implements PersonDAO{

    private static List<Person> DB=new ArrayList<Person>(); //creating Person ArrayList to store the details

    @Override
    public int insertPerson(UUID id, Person person) {
        //System.out.println(person);
        DB.add(person); //creating new Person object to store into DB
        return 1;
    }



}
