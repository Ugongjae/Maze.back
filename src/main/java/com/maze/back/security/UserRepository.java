package com.maze.back.security;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.maze.back.security.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	User findByUsername(String username);
}
