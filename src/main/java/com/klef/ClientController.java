package com.klef;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	@GetMapping("/")
	public String home()
	{
		return "CI/CD and CLoud DevOps";
	}
	
	@GetMapping("/demo")
	public String demo()
	{
		return "Jenkins Demo";
	}
	
	@GetMapping("/test")
	public String demo1()
	{
		return "Deploy Spring Boot Using Jenkins";
	}
}
