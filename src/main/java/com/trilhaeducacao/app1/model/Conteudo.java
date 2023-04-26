package com.trilhaeducacao.app1.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


// Dizendo que a classe pedido é uma entidade no banco de dados

@Entity
public class Conteudo {
//aqui adicionaremos os atributos que o objeto Conteudo possui:
	
	//adicionando um atributo ID e colocando uma anotação de que ele é um id
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) // ele vai criar a tabela conteudo com uma coluna chamada ID auto incremento 
	private Long id;
	
	@Column(name = "titulo")
	@Size(min = 5, max = 35, message = "O titulo deve conter no minimo 5 caracteres") 
	@NotBlank(message = "O titulo nao pode ser vazio.") 
	private String titulo;
	
	private String guia;
	private String exemplo1;
	private String exemploDois;
	private String exemploTres;
	private String exemploQuatro;
	private String exemploCinco;
	
	// Pergunta 1
	private String alt;
	private String alt2;
	private String alt3;
	private String respostaCorreta;
	
	// Pergunta 2
	private String alt4;
	private String alt5;
	private String alt6;
	private String respostaCorreta2;
	
	// Pergunta 3
	private String alt7;

	public String getAlt4() {
		return alt4;
	}
	public void setAlt4(String alt4) {
		this.alt4 = alt4;
	}
	public String getAlt5() {
		return alt5;
	}
	public void setAlt5(String alt5) {
		this.alt5 = alt5;
	}
	public String getAlt6() {
		return alt6;
	}
	public void setAlt6(String alt6) {
		this.alt6 = alt6;
	}
	public String getAlt7() {
		return alt7;
	}
	public void setAlt7(String alt7) {
		this.alt7 = alt7;
	}
	public String getRespostaCorreta2() {
		return respostaCorreta2;
	}
	public void setRespostaCorreta2(String respostaCorreta2) {
		this.respostaCorreta2 = respostaCorreta2;
	}
	private String pergunta2;
	public String getPergunta2() {
		return pergunta2;
	}
	public void setPergunta2(String pergunta2) {
		this.pergunta2 = pergunta2;
	}
	public String getAlt3() {
		return alt3;
	}
	public void setAlt3(String alt3) {
		this.alt3 = alt3;
	}
	public String getRespostaCorreta() {
		return respostaCorreta;
	}
	public void setRespostaCorreta(String respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}

	
	public String getAlt2() {
		return alt2;
	}
	public void setAlt2(String alt2) {
		this.alt2 = alt2;
	}
	public String getExemploCinco() {
		return exemploCinco;
	}
	public void setExemploCinco(String exemploCinco) {
		this.exemploCinco = exemploCinco;
	}
	public String getExemploTres() {
		return exemploTres;
	}
	public void setExemploTres(String exemploTres) {
		this.exemploTres = exemploTres;
	}
	public String getExemploQuatro() {
		return exemploQuatro;
	}
	public void setExemploQuatro(String exemploQuatro) {
		this.exemploQuatro = exemploQuatro;
	}
	public String getExemploDois() {
		return exemploDois;
	}
	public void setExemploDois(String exemploDois) {
		this.exemploDois = exemploDois;
	}
	public String getExemplo1() {
		return exemplo1;
	}
	public void setExemplo1(String exemplo1) {
		this.exemplo1 = exemplo1;
	}
	public String getGuia() {
		return guia;
	}
	public void setGuia(String guia) {
		this.guia = guia;
	}
	private String descricao;
	


	public String getAlt() {
		return alt;
	}
	public void setAlt(String alt) {
		this.alt = alt;
	}
	private String pergunta1;
	public String getPergunta1() {
		return pergunta1;
	}
	public void setPergunta1(String pergunta1) {
		this.pergunta1 = pergunta1;
	}
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
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

	


}
