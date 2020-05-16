package com.maze.back.controllers;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maze.back.level.model.levelModel;
import com.maze.back.level.service.levelDao;
import com.maze.back.security.User;
import com.maze.back.security.UserRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MainController {
	
	
	@Autowired
	levelDao dao;
	private final UserRepository userRepository;

    // Available to all authenticated users
    @GetMapping("/public/test")
    public String test1(){
        return "API Test 1";
    }

    // Available to managers
    @GetMapping("/public/management/reports")
    public String reports(){
        return "API Test 2";
    }

    // Available to ROLE_ADMIN
    @GetMapping("/public/admin/users")
    public List<User> allUsers(){
        return this.userRepository.findAll();
    }
    
    @GetMapping("/level/{id}")
    public levelModel getLevel(@PathVariable("id") int id) {
    	levelModel model=dao.getLevel(id);
    	return model;
    }
    
	
}
