package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GitFirstController {
	@GetMapping("/api/hello")
	
	
	public String HelloApi() {
		return "Hello World";
	}
	

}
