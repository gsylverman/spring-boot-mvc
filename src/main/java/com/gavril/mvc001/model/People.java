package com.gavril.mvc001.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class People {
	
	@Id
	private int id;
	private String name;
	private int age;
	
	
	public People() {
	}

	public People(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "People + [id=" + id + ", name=" + name + ", age:"+ age + "]";
	}
}
