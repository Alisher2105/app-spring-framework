package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.scheduling.config.AnnotationDrivenBeanDefinitionParser;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String fullName;
    private int age;
    private Address address;

    public Person(Address address){
        this.address = address;
    }

    public void setAddress(Address address){
        this.address = address;

    }

}
