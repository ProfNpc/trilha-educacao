package com.trilhaeducacao.app1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.trilhaeducacao.app1.Enums.Status;

// precisamos dizer ao spring q essa classe se trata de uma entidade usuario, um objeto, por isso usamos a anotação entity

@Entity
public class Usuario {

	// essa amotação vai dizer que esse atributo é um identificador da minha classe:

	// essa anotação vai fazer com q o id do usuario seja auto incremento, ou seja, pra cada regustro que for sendo adicionado no banco será sempre incrementado +1 ao id.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // faz com q incremete automaticamente
	private Long id; // em id precisamos colocar algumas anotações a mais
	
	//dizendo qual vai ser o nome dessa coluna no banco
	@Column(name = "Nome")
	private String nome;
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	@Column(name = "Email")
	private String email;
	@Column(name = "Telefone")
	private Integer tel;
	@Column(name = "Idade")
	private Integer idade;
	@Column(name = "Cep")
	private Integer cep;
	@Column(name = "Status")
	private Status status;
	@Column(name="Nome de usuário")
	private String nomeUsuario;
	
	
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public Integer getTel() {
		return tel;
	}
	public void setTel(Integer tel) {
		this.tel = tel;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}


}
