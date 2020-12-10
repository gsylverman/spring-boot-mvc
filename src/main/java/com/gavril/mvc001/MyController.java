package com.gavril.mvc001;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gavril.mvc001.model.Person;

@Controller
public class MyController 
{
	@Autowired
	PeopleRepo repo;
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Some Name");
	}
	
	@RequestMapping("/")
	public String getPage() {
		
		return "index";
	}
	
	@GetMapping("getOnePerson")
	public String getOnePeople(@RequestParam int id, Model m) {
		
		m.addAttribute("list", repo.getOne(id));
		return "showPeople";
	}
	
	@GetMapping("getOneByName")
	public String getOneByName(@RequestParam String name, Model m) {
		
//		m.addAttribute("list", repo.findByName(name)); //Query DSL
		m.addAttribute("list", repo.findByCustomQuery(name)); // Query Annotation
		
		return "showPeople";
	}
	
	@GetMapping("getPeople")
	public String getPeople(Model m) {
		
		m.addAttribute("list", repo.findAll());
		return "showPeople";
	}
	
	@RequestMapping(value = "add-person", method = RequestMethod.GET)
	public String add(@ModelAttribute Person person) {
		
		repo.save(person);
		return "result";
	}
}
