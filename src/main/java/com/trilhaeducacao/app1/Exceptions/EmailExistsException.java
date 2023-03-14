package com.trilhaeducacao.app1.Exceptions;

public class EmailExistsException extends Exception {

	public EmailExistsException(String message) {
		super(message);
		
	}

	// isso é a definição da versao da classe 
	private static final long serialVersionUID = 1L;
}
