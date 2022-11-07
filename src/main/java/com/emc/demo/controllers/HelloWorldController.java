package com.emc.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	static final Logger log = LoggerFactory
			.getLogger(HelloWorldController.class);

	@RequestMapping("/hello")
	@CrossOrigin
	public String helloWorld(
			@RequestParam(value = "name", defaultValue = "World") String name) {

		return "Hello " + name + "!!";
	}
}
