package com.maze.back.controllers;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maze.back.maps.MainMap;
import com.maze.back.models.LocationModel;

@RestController
@RequestMapping(value="/game")
public class MainController {
	@Autowired
	private MainMap map;
	
	@RequestMapping(value="/move",method=RequestMethod.GET)
	public String goUp(@RequestHeader String x,@RequestHeader String y) {
		
		int ix=Integer.parseInt(x);
		int iy=Integer.parseInt(y);
		
		System.out.print(x);
		System.out.print(" ");
		System.out.println(y);
		
		JSONObject move=map.checkMove(ix, iy);
		
		return move.toString();
	}
}
