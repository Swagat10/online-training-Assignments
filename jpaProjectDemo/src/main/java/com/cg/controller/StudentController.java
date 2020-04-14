package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Student;
import com.cg.service.StudentServiceI;

@RestController
public class StudentController {

	@Autowired
	StudentServiceI stuservice;
	
@GetMapping(value="/student")
public List<Student> fetchStudent()
{
	return stuservice.reterive();
	
}
	
@GetMapping(value="/student/{id}")
public Student fetchone(@PathVariable int id)
{
	return stuservice.findById(id);
}
	
//@PostMapping(value="/student/new",consumes= {"application/json"})
//public String addStudent(@RequestBody Student student)
//{
//	stuservice.create(student);
//	return "statement added";
//}


}