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
	
	private String dataAdicao;
	private String alternativa1;
	
	public String getAlternativa1() {
		return alternativa1;
	}
	public void setAlternativa1(String alternativa1) {
		this.alternativa1 = alternativa1;
	}
	@Column(name = "descricao")
	@Size(min = 5, max = 200, message = "A descricao deve conter no minimo 5 caracteres") 
	@NotBlank(message = "A descricao nao pode ser vazia.") 
	private String descricao;
	
	@Column(name = "pergunta1")
	@Size(min = 5, max = 200, message = "A descricao deve conter no minimo 5 caracteres") 
	@NotBlank(message = "A descricao nao pode ser vazia.")
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
	public String getDataAdicao() {
		return dataAdicao;
	}
	public void setDataAdicao(String dataAdicao) {
		this.dataAdicao = dataAdicao;
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
