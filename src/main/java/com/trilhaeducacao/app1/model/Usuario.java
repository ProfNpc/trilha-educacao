package com.trilhaeducacao.app1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String sobrenome;
	private int celular;
	public Usuario() {
		super();
	}
	public Usuario(Integer id, String nome, String sobrenome, int celular) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.celular = celular;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public void setDescricao(int celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", celular=" + celular + "]";
	}
}