package com.example.demo.repository;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;


// proxyMode is added to make this Bean work as prototype, as without this even if this class is called in
// in service layer it would behave as a singleton
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Repository
public class JdbcConnection {

}

