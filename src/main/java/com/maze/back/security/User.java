package com.maze.back.security;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long num;
	
	private String username;
	private String password;
	private String roles;
	private String permissions;
	private int active;
	
	public User(String username,String password, String roles, String permissions) {
		this.username=username;
		this.password=password;
		this.roles=roles;
		this.permissions=permissions;
		
		this.active=1;
	}
	protected User(){
    }

    public List<String> getRoleList(){
        if(this.roles.length()>0){
            return Arrays.asList(this.roles.split(","));
        }

        return new ArrayList<>();
    }

    public List<String> getPermissionList(){
        if(this.permissions.length()>0){
            return Arrays.asList(this.permissions.split(","));
        }

        return new ArrayList<>();
    }
}
