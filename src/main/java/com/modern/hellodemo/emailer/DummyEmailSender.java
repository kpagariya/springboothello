package com.modern.hellodemo.emailer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// WHen application gets started, Spring checks @Component annotation and if found
// then it create the instance of the class and store it in ApplicationContext.

public class DummyEmailSender implements IEmailerService{

	// Initilize the logger
	private static Log log=LogFactory.getLog(DummyEmailSender.class);

	@Override
	public void sendEmail(String emailID, String subject, String mailContent) {
		 log.info("Dummy-MS Mail receiver ID : "+emailID);
	     log.info("Dummy-MS Mail Subject : "+subject);
	     log.info("Dummy-MS Mail Body : "+mailContent);
	     
	     log.warn("This is just a Dummy email sender");
	}
}
