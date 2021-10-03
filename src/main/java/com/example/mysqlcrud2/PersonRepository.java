package com.example.mysqlcrud2;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person,Long> {


}
