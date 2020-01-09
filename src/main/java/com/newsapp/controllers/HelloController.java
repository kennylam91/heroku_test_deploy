package com.newsapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.newsapp.model.User;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public ResponseEntity<User> hello(@RequestParam(defaultValue = "ban") String name){
		User user = new User(name);
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
}
