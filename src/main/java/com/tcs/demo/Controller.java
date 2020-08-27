package com.tcs.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Hello you are welcome";
	}
	
	@GetMapping("/checkapi")
	public String checkApi() {
		return "Hello you are welcome...checking apis";
	}

}
