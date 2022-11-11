package com.trilhaeducacao.app1.model;

public class Usuario {

	private int id;
	private String nome;
	private String sobrenome;
	private String email;
	private int celular;

	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobreNome() {
		return sobrenome;
	}
	
	public void setSobreNome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	

	
	
	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getCelular() {
		return celular;
	}



	public void setCelular(int celular) {
		this.celular = celular;
	}



	public Usuario(String nome, int id, String sobrenome, String email, int celular) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.celular = celular;
		
		
	}
	
	
}

