package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component

public class Main {
    public static void main(String[] args){

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.scan("org.example");
//        context.refresh();
//        Person person = context.getBean(Person.class);
////        Person person = (Person) context.getBean("person");
//        System.out.println(person);

        Address address = new Address("Urganch","Al-Xorazmiy","9");
        Person person = new Person();
        person.setAge(25);
        person.setFullName("Alisher Rajabov");
        person.setAddress(address);
        System.out.println(person);




    }
}