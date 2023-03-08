package com.trilhaeducacao.app1.Enums;

public enum Status {

	ATIVO("Ativo"),
	INATIVO("Inativo");
	
	private String status;
	
	private Status (String status) {
		this.status = status;
	}
	
}
