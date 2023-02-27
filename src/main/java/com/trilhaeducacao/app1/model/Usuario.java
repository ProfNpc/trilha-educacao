package com.trilhaeducacao.app1.model;

import java.math.BigDecimal;

public class Usuario {
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BigDecimal getCelular() {
		return celular;
	}
	public void setCelular(BigDecimal celular) {
		this.celular = celular;
	}
	// aqui colocamos os atributos necessarios para cadastro de usuario
	private String nome;
	private String email;
	private BigDecimal celular;;

}
