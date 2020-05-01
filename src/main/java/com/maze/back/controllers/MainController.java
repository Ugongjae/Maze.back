package com.maze.back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maze.back.services.UserMapper;

@RestController
@RequestMapping(value="/")
public class MainController {
	
	@Autowired
	UserMapper usermapper;
	
	
	
}
