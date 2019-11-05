/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfirstproject.Repositories;

import com.myfirstproject.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author emergency
 */
public class PersonRepositoryImpl implements PersonSweeper{
    @PersistenceContext
    private EntityManager em;
    
    public long eliteSweep(){
        String count="SELECT COUNT(name) from Person";
        return (Long)em.createQuery(count).getSingleResult();
    }
    
    public List<Person> findVasia(){
        String query="Select p from Person p where name='Vasia'";
        return (List<Person>)em.createQuery(query).getResultList();
    }
}
