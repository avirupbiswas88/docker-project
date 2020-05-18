package com.project.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/docker")
public class DockerController {
	
	@GetMapping("/myapp")
	public String getMessages() {
		return "My First Docker Application";
	}

}
