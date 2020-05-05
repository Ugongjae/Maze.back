package com.maze.back.maps;

import org.json.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class MainMap {
	private int[][] map;
	
	public MainMap() {
		map=new int[][] {
			{1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1}
		};
	}
	
	
	public JSONObject checkMove(int x,int y) {
		JSONObject res=new JSONObject();
		
		if(x>0) {
			if(map[x-1][y]==0) {
				res.put("up", true);
			}
			else
				res.put("up", false);
		}
		else
			res.put("up", false);
		
		if(x<map.length) {
			if(map[x+1][y]==0) {
				res.put("down", true);
			}
			else
				res.put("down", false);
		}
		else
			res.put("down", false);
		
		if(y>0) {
			if(map[x][y-1]==0) {
				res.put("left", true);
			}
			else
				res.put("left", false);
		}
		else
			res.put("left", false);
		
		if(y<map[0].length) {
			if(map[x][y+1]==0) {
				res.put("right", true);
			}
			else
				res.put("right", false);
		}
		else
			res.put("right", false);
		
		System.out.println(res.length());
		
		return res;
	}
}
