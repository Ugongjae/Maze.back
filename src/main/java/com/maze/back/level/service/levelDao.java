package com.maze.back.level.service;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.maze.back.level.model.levelModel;

@Repository
public class levelDao {
	
	@Autowired
    private SqlSession sqlSession;
	
	public levelModel getLevel(int level) throws DataAccessException {
		return sqlSession.selectOne("CommonSql.selectLevel", level);
	}
}
