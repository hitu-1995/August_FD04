package com.cjc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class LifeCycleAnnoationBased {

	@PostConstruct
	public void init() {
	System.out.println("***  LifeCycleAnnoationBased :: init() called");	
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("***  LifeCycleAnnoationBased :: destroy() called");	
	}
	
}
