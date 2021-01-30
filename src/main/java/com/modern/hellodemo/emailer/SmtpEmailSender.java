package com.modern.hellodemo.emailer;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class SmtpEmailSender implements IEmailerService {

	// Initialize the logger
	private static Log log=LogFactory.getLog(SmtpEmailSender.class);

	private JavaMailSender javaMailSender;
	
	public SmtpEmailSender(JavaMailSender javaMailSender) {

		this.javaMailSender = javaMailSender;
	}

	@Override
	public void sendEmail(String emailID, String subject, String mailContent) throws MessagingException{
		 log.info("SMTP-google Mail receiver ID : "+emailID);
	     log.info("SMTP-google Mail Subject : "+subject);
	     log.info("SMTP-google Mail Body : "+mailContent);
	     log.warn("This is just SMTP email sender");
	     
	     MimeMessage message = javaMailSender.createMimeMessage();
		 MimeMessageHelper helper;

			helper = new MimeMessageHelper(message, true); // true indicates
	 					  				                   // multipart message
			helper.setSubject("This is test message");
			helper.setTo("dixitshantanu106@gmail.com");
			helper.setText("<h1> Body </h1>", true); // true indicates html

			// continue using helper for more functionalities
	        // like adding attachments, etc.  
			
			javaMailSender.send(message);
	}

}
