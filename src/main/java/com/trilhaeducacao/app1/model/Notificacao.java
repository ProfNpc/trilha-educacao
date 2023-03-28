package com.trilhaeducacao.app1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Notificacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id; 
	
	@Column(name = "Titiulo")
	@Size(min = 5, max = 35, message = "O titulo deve conter no minimo 5 caracteres") 
	@NotBlank(message = "O nome nao pode ser vazio.") 
														
	private String titulo;
	
	@Size(min = 5, max = 200, message = "O assunto deve conter no minimo 5 caracteres") 
	@NotBlank(message = "O nome nao pode ser vazio.") 
	private String assunto;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
}
