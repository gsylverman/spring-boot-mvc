package com.gavril.mvc001;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gavril.mvc001.model.Person;

public interface PeopleRepo extends JpaRepository<Person, Integer>{

	@Query("FROM Person WHERE name= :name") // Query Annotation
	List<Person> findByCustomQuery(@Param("name") String name); 

	// List<People> findByName(String name); //Query DSL
	
}
