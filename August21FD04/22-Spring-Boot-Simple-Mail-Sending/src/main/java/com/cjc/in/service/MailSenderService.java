package com.cjc.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSenderService {

	
	@Autowired
	 private JavaMailSender javaMailSender;
	 
	
	public void sendMail(String to,
			             String subj,
			             String msg) {
		
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("hiteshwankhede11@gmail.com");
		message.setTo(to);
		message.setSubject(subj);
		message.setText(msg);
		
	   javaMailSender.send(message);
	   
	   
	   System.out.println("Mail sent Sussessfull  !!!");
		  
	}
}
