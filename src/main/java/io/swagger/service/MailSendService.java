package io.swagger.service;

import io.swagger.model.Correos;

public interface MailSendService {
	
	public void enviarCorreo(Correos correos);

}
