package com.example.hello.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class abc {

	@GetMapping("/test")
		public String test() {
			return "123.23";
		}
	
	
	
}