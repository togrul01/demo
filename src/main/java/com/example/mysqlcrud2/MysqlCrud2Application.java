package com.example.mysqlcrud2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlCrud2Application implements CommandLineRunner {
@Autowired PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(MysqlCrud2Application.class, args);
    }
public void run(String... args) throws  Exception{
//        Person person=new Person();
//        person.setName("ABDU");
//        person.setSurName("Qedirli");
//        person.setPhone("070-789-56-56");

    Person person=personRepository.findById(4L).get();
    person.setName("Hesen");
        personRepository.save(person);
//        Person person=personRepository.findById(5L).get();
//        personRepository.delete(person);
}
}


