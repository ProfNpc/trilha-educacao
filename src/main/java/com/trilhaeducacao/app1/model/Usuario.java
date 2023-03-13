package com.trilhaeducacao.app1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.trilhaeducacao.app1.Enums.Status;

// precisamos dizer ao spring q essa classe se trata de uma entidade usuario, um objeto, por isso usamos a anotação entity

@Entity
public class Usuario {

	// essa amotação vai dizer que esse atributo é um identificador da minha classe:

	// essa anotação vai fazer com q o id do usuario seja auto incremento, ou seja,
	// pra cada regustro que for sendo adicionado no banco será sempre incrementado
	// +1 ao id.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // faz com q incremete automaticamente
	private Long id; // em id precisamos colocar algumas anotações a mais

	// dizendo qual vai ser o nome dessa coluna no banco
	@Column(name = "nome")
	@Size(min = 5, max = 35, message = "O nome deve conter no minimo 5 caracteres") // especicidando qual a quantidade
																					// minima e maxima aceita neste
																					// campo
	@NotBlank(message = "O nome nao pode ser vazio.") // notblank valida se o capo esta vazio, se o campo é nulo e pode
														// validar o tamanho do campo
	private String nome;

	@Column(name = "email")
	@Size(min = 15, max = 35, message = "O email deve conter no minimo 15 caracteres.")
	@NotNull(message = "O campo de email nao pode estar vazio.")
	private String email;

	@Column(name = "telefone")
	@Size(max = 9, message = "O telefone deve conter no maximo 9 caracteres") // especicidando qual a quantidade minima
																				// e maxima aceita neste campo
	@NotBlank(message = "O telefone nao pode ser vazio.")
	private String tel;

	@Column(name = "idade")
	private Integer idade;

	@Column(name = "cep")
	@Size(min = 8, message = "O cep deve conter 8 caracteres") // especicidando qual a quantidade minima e maxima aceita
																// neste campo
	@NotBlank(message = "O cep nao pode ser vazio.")
	private String cep;

	@Column(name = "status")
	private Status status;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
