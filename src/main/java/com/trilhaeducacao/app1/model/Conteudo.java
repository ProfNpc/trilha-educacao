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
	
	@Column(name = "descricao")
	private String descricao;
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
