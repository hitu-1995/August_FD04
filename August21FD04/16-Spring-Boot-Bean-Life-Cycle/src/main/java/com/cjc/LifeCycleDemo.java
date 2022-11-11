package com.cjc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

//@Component
public class LifeCycleDemo implements InitializingBean,DisposableBean{

	@Override
	public void afterPropertiesSet() throws Exception {

       // these method called when ioc container will started
		System.out.println("** LifeCycleDemo :: afterPropertiesSet method called **");
		
	}

	@Override
	public void destroy() throws Exception {
		// these method called when object removed from ioc container
		System.out.println("*** LifeCycleDemo :: destroy method called");
	}

}
