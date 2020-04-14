package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.dao.UserDao;
import com.cg.entity.User;

@Controller
public class Kitchen {

	@Autowired
	UserDao userdao;
	
	@RequestMapping("/")
	public String chef1()
	{
		return "home1.jsp";
	}
	
	@RequestMapping("userlogin")
	public String chef2()
	{
		return "login2.jsp";
	}
	
	
	@RequestMapping("validateuser")
	public String chef3(@RequestParam String user,int age,Model m)
	{
		if(age>18)
		{
		    m.addAttribute("msg","hello you can vote");
		    User u = new User();
		    u.setUsername(user);
		    u.setAge(age);
		    userdao.addUser(u);
		    System.out.println("added");
			return "welcome.jsp";
			

		}
		else
		{
			return "login2.jsp";
		}
	}
	
	
}
