package com.example.dummyproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/getEmployees")
	public String getEmployees() {
		return "{name: Syed}";
		
	}

}
