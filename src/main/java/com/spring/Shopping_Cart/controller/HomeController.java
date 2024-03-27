package com.spring.Shopping_Cart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/nav")
	public String na()
	{
		return "base";
	}
	
	@GetMapping("/index")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
	
	@GetMapping("/product")
	public String product()
	{
		return "product";
	}
}
