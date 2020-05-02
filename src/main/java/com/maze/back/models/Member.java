package com.maze.back.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AccessLevel;


@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class Member {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num;
	private String id;
	private String pw;

	public Member(String id,String pw) {
		this.id=id;
		this.pw=pw;
	}
	public void setPw(String pw) {
        this.pw = pw;
    }
}
