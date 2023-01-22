package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GitFirstController {
	@GetMapping("/api/hello")
	
	
	public String HelloApi() {
		return "Hello World";
	}
@GetMapping("/api/hello2")
	
	
	public String HelloApi2() {
		return "Hello World2";
	}
	

}
