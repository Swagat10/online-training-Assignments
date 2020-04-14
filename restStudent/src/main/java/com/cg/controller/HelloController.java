package com.cg.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/")
public class HelloController {
	
	List<Student> stu=new ArrayList<>();
	
	public HelloController() {
		stu.add(new Student("Ronldo",7,"ST","Portugal"));
		stu.add(new Student("Messi",10,"FW","Argentina"));
		stu.add(new Student("Ramos",4,"DEF","Spain"));
		stu.add(new Student("KD Bruyne",10,"CAM","Colombia" ));
				
	}
	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public String index(@PathVariable String name) {
		return "Welcome to Sring Boot!" + name;
	}

	@RequestMapping(value="/", method=RequestMethod.GET)
	public List<Student> index() {

		return stu ;
	}
	

	@RequestMapping("/greet")
	public String greet() {
		return "Greetings from Spring Boot!";
	}
}