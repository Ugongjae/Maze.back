package com.maze.back.services;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maze.back.models.Member;

public interface MemberRepository extends JpaRepository<Member, Long>{
	Optional<Member> findById(String id);
}
