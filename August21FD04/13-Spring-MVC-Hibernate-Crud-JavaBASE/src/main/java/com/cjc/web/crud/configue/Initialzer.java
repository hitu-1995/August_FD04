package com.cjc.web.crud.configue;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Initialzer implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
	
		AnnotationConfigWebApplicationContext apc=new AnnotationConfigWebApplicationContext();
		apc.register(AppConfigue.class);
		apc.setServletContext(servletContext);
		
		ServletRegistration.Dynamic registration=servletContext.addServlet("dispatcher", new DispatcherServlet(apc));
		registration.addMapping("/");
      
	}

}
