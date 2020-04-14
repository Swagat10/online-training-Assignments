package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cg.dao.StudentDaoI;
import com.cg.entity.Student;

@SpringBootApplication
public class JpaProjectDemoApplication implements CommandLineRunner {

	@Autowired
	StudentDaoI studao;
	public static void main(String[] args) {
		SpringApplication.run(JpaProjectDemoApplication.class, args);
	}
	
	@Override
	public void run (String... args) throws Exception
	{
		/*Student s1 = new Student (7,"Ronaldo","ST");
		
		studao.create(s1);
		
		System.out.println("Inserted");*/
		List<Student> studentlist = studao.reterive();
		for (Student stu :studentlist)
		{
			System.out.println(stu.getId() + " " + stu.getName() + " " + stu.getDept());
		}
	}

}
