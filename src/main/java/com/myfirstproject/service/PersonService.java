package com.myfirstproject.service;

import com.myfirstproject.Person;
import com.myfirstproject.Repositories.PersonRepository;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService {

    @Autowired
    private PersonRepository personRepository;    

   
    public void add(Person p) {
        personRepository.save(p);         
    }

    
    public void addAll(Collection<Person> persons) {
        for (Person p : persons) {
            personRepository.save(p);
        }
    }


    public List<Person> listAll() {
        return (List<Person>)personRepository.findAll();
    }
    
    public Person findByName(String name){
        return personRepository.findByName(name);
    }
    
    public long findCount(){
        return personRepository.eliteSweep();
    }
    
    public List<Person> findAllVasia(){
        return personRepository.findVasia();
    }
}
