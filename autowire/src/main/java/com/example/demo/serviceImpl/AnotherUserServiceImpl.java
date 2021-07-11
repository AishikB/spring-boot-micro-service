package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.repository.JdbcConnection;
import com.example.demo.service.UserService;

@Service("anotherUser")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Primary
public class AnotherUserServiceImpl implements UserService{
	
	@Autowired
	JdbcConnection jdbcConnection;
	
	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return jdbcConnection.toString();
	}
	
}
