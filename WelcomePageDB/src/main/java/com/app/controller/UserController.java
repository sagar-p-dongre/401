package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

	@GetMapping("/")
	public String Home() {
		return "hi";
	}
}
