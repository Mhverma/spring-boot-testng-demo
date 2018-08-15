package com.manoj.training.spring.springboottestngdemo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manoj.training.spring.springboottestngdemo.service.HelloWorldService;

@RestController
public class HelloWordController {
	
	@Autowired
	private HelloWorldService helloWordService;

	@GetMapping("/sayHello")
	public ResponseEntity<String> sayHello()
	{
		return new ResponseEntity<>(helloWordService.sayHello(), HttpStatus.OK);
	}
}
