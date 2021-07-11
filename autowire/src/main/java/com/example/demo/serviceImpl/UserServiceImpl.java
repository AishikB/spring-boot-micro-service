package com.example.demo.serviceImpl;

import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Service;

import com.example.demo.service.UserService;

@Service("user")
public class UserServiceImpl implements UserService {
	public String getUserName() {
		return "From User service Impl";
	}
}
