package io.swagger.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {

	 @Autowired
	    public JavaMailSender emailSender;

	@Override
	public void enviarCorreo(String destinatario, String cuerpo,String mensaje) { 
	        
	        SimpleMailMessage message = new SimpleMailMessage(); 
	        message.setTo(destinatario); 
	        message.setSubject(mensaje);
	        emailSender.send(message);
		
	}
	 
	 
	 
}
