package com.gavril.mvc001;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gavril.mvc001.model.People;

@Controller
public class MyController 
{
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Some Name");
	}
	
	@RequestMapping("/")
	public String getPage() {
		
		return "index";
	}
	
	@RequestMapping("/add")
	public String getResult(@RequestParam("nr1") int n1, @RequestParam("nr2") int n2, ModelMap m) {
		
		int result = n1 + n2;
		m.addAttribute("res", result);
	
		return "result";
	}
	
	@GetMapping("getPeople")
	public String getPeople(Model m) {
		List<People> list = Arrays.asList(new People(1, "Andrei"), new People(2, "George"));
		m.addAttribute("list", list);
		
		return "showPeople";
	}
	
	@RequestMapping(value = "add-people", method = RequestMethod.GET)
	public String add(@ModelAttribute("people") People people) {
		
		return "result";
	}
}
