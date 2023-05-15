package com.trilhaeducacao.app1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



// Dizendo que a classe pedido é uma entidade no banco de dados

@Entity
public class Conteudo {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    private String paginaDestino;
    
    //Getters

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPaginaDestino() {
		return paginaDestino;
	}

	public void setPaginaDestino(String paginaDestino) {
		this.paginaDestino = paginaDestino;
	}
	

	


}
