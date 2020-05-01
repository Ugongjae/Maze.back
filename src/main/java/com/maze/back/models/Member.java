package com.maze.back.models;

import java.util.Collection;

import javax.persistence.Entity;

import org.springframework.security.core.GrantedAuthority;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;


@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
	private int num;
	private String id;
	private String pw;

	public Member(int num,String id,String pw) {
		this.num=num;
		this.id=id;
		this.pw=pw;
	}
}
