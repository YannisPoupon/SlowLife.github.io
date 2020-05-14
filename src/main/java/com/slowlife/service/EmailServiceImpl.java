package com.slowlife.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class EmailServiceImpl implements EmailService{
  
    @Autowired
    public JavaMailSender emailSender;
    
    
    @Override
    public void sendSimpleMessage(String to, String subject, String text) {
        System.out.println(to);
        System.out.println(subject);
        System.out.println(text);
    	try {
    		 SimpleMailMessage message = new SimpleMailMessage(); 
    		 	
    	        message.setTo(to); 
    	        message.setSubject(subject); 
    	        message.setText(text);
    	        System.out.println(message);
    	        emailSender.send(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
       
        
    }
}