package com.trilhaeducacao.app1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conteudo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String materia;
	private int nivel;
	private String responsavel;
	public Conteudo() {
		super();
	}
	public Conteudo(Integer id, String materia, int nivel, String responsavel) {
		super();
		this.id = id;
		this.materia = materia;
		this.nivel = nivel;
		this.responsavel = responsavel;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", materia=" + materia + ", nivel=" + nivel + ", responsavel=" + responsavel + "]";
	}
}