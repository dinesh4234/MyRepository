package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	@Value(value = "${cjc.msg}")
	private String message;
	
	
	@ RequestMapping("/")
	public String prelogin()
	{
		return message;
		
		
	}

}
