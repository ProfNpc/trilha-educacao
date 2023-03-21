package com.trilhaeducacao.app1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Solicitacao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id; 
	
	@Column(name = "nome")
	@Size(min = 5, max = 35, message = "O nome deve conter no minimo 5 caracteres") 
	@NotBlank(message = "O nome nao pode ser vazio.") 
														
	private String nome;

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

	@Column(name = "email")
	@Size(min = 15, max = 35, message = "O email deve conter no minimo 15 caracteres.")
	@NotNull(message = "O campo de email nao pode estar vazio.")
	private String email;
	
	private String dataNasc;
	private String tel;
	private String rg;
	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getMotivoSolicitacao() {
		return motivoSolicitacao;
	}

	public void setMotivoSolicitacao(String motivoSolicitacao) {
		this.motivoSolicitacao = motivoSolicitacao;
	}

	private String cpf;
	private String imagem;
	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	private String cep;
	private String idade;
	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	private String motivoSolicitacao;
	
}
