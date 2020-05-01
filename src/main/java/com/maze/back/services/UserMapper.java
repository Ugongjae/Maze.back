package com.maze.back.services;


import com.maze.back.models.Member;

public interface UserMapper {
	public Member readUser(String id);
}
