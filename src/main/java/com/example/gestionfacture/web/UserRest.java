package com.example.gestionfacture.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestionfacture.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserRest {
	@Autowired
	private UserRepository userRepository;

}
