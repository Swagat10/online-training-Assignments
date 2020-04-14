package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class Kitchen 
{
	@RequestMapping("/")
	public String chef1()
	{
		return "home.jsp";
	}
	
	@RequestMapping("userlogin")
	public String chef2()
	{
		return "login.jsp";
	}
	
	@RequestMapping("validateuser")
	public String chef3()
	{
			return "welcome.jsp";
	}

}
