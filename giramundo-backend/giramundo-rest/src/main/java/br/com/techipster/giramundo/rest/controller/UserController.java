package br.com.techipster.giramundo.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/users")
	String getUsers() {
		return "Ping";
	};
}
