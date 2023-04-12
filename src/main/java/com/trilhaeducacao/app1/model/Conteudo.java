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
