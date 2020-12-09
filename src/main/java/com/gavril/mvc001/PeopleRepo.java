package com.gavril.mvc001;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gavril.mvc001.model.People;

public interface PeopleRepo extends JpaRepository<People, Integer>{

	List<People> findByName(String name); //Query DSL

}
