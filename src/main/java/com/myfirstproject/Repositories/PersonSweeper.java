/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfirstproject.Repositories;

import com.myfirstproject.Person;
import java.util.List;

/**
 *
 * @author emergency
 */
public interface PersonSweeper {
    long eliteSweep();
    List<Person> findVasia();
}
