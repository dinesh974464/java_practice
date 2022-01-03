package com.example.simpleApp.controller.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<String> getAllUserNames() {
		List<String> usernameList=new ArrayList<>();
		usernameList.addAll(jdbcTemplate.queryForList("select name from user", String.class));
		return usernameList;
	}

}
