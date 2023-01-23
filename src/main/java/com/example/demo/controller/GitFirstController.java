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
	
   @GetMapping("/api/hello3")
	
	
	public String HelloApi3() {
		return "Hello World3";
	}
   @GetMapping("/api/hello4")
	
	
	public String HelloApi4() {
		return "Hello World4";
	}
   @GetMapping("/api/hello5")
  public String HelloApi5() {
	  return "Hello World5";
  }
   @GetMapping("/api/hello6")
   public String HelloApi6() {
 	  return "Hello World5";
   }
}
