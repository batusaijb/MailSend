package io.swagger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.model.Correos;
import io.swagger.util.EmailService;

@Service
public class MailSendServiceImpl implements MailSendService{

	@Autowired
	private EmailService emailServ;
	
	@Override
	public void enviarCorreo(Correos correos) {
		emailServ.enviarCorreo(correos.getDestinatario(), correos.getCuerpo(), correos.getMensaje());
	}
}
