package com.myfirstproject;


import com.myfirstproject.service.PersonService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cntxt = new ClassPathXmlApplicationContext("Spring.xml");
        PersonService personService = cntxt.getBean(PersonService.class);
        List<Person> persons = new ArrayList<>();

        Person person = new Person();
        Person person2 = new Person();
        person.setName("Name");
        person.setCountry("Belarus");
        person.setId(3);
        person2.setId(4);
        
        personService.add(person);
        persons.add(person);
        persons.add(person2);
        try {
            personService.addAll(Arrays.asList(new Person(13, "Kolya", "Belarus"),
                    new Person(15, "vasia", "Belarus"), new Person(10, "vasia", "Belarus"), new Person(14, "vasia", "Belarus")));
        } catch (Exception e) {
            System.out.println("Error");
        }

        List<Person> list = personService.listAll();       

        for (Person p : list) {
            System.out.println("Person List::" + p);
        }
        
        Person Kolya=personService.findByName("Kolya");
        System.out.println("Person Kolya: "+Kolya);
        
        System.out.println(personService.findCount());
        
        List<Person> vasiyas = personService.findAllVasia();       

        for (Person p : vasiyas) {
            System.out.println("Person List::" + p);
        }

        cntxt.close();
    }
}
