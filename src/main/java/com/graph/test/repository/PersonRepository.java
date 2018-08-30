package com.graph.test.repository;

import com.graph.test.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {
    Person findByName(String name);
}
