package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
record Person (String name,int age,Address address){};
record Address (String firstline, String city){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Booyah";
    } ;
    @Bean
    public int age(){
        return 21;
    }
    @Bean
    public Person person(){
        return new Person("SALAS",20,new Address("Main Street","St Louis"));
    }

    @Bean 
    public Person person2MethodCall(){
        return new Person(name(),age(),address());
    }
    @Bean
    public Person person3Parameters(String name,int age,Address address){
    return new Person(name,age,address);
    }
    @Bean
    public Address address(){
        return new Address("Baker ","London");
    }

}
