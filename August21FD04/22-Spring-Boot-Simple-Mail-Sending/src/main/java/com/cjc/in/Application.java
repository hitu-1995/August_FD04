package com.cjc.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cjc.in.service.MailSenderService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		MailSenderService service = context.getBean(MailSenderService.class);
		
		   service.sendMail("completejavaclassesakurdi@gmail.com", "Mail Sender API", "This is Hack mesage....");
		System.out.println("App is Running...");
	}

}
