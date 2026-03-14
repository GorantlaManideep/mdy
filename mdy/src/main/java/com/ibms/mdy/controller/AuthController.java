package com.ibms.mdy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mdy/v1/auth")
public class AuthController {
	@GetMapping("/hello")
	public String helloWorld() {
		return "hello world !";
	}

}
