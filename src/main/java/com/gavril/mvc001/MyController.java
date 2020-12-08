package com.gavril.mvc001;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@RequestMapping("add-people")
	public String add(@ModelAttribute("people") People people) {
		
		return "result";
	}
}
