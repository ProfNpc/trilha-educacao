package com.trilhaeducacao.app1.model;

import java.time.LocalDate;

public class Conteudo {
//aqui adicionaremos os atributos que o objeto Conteudo possui:
	
	private String nomeConteudo;
	private String materiaConteudo;
	private String nivelConteudo;
	private String tipoExercicioConteudo;
	private LocalDate dataAdicaoConteudo;
	private String enderedecoImagemConteudo;
	private String descricaoConteudo;
	public String getNomeConteudo() {
		return nomeConteudo;
	}
	public void setNomeConteudo(String nomeConteudo) {
		this.nomeConteudo = nomeConteudo;
	}
	public String getMateriaConteudo() {
		return materiaConteudo;
	}
	public void setMateriaConteudo(String materiaConteudo) {
		this.materiaConteudo = materiaConteudo;
	}
	public String getNivelConteudo() {
		return nivelConteudo;
	}
	public void setNivelConteudo(String nivelConteudo) {
		this.nivelConteudo = nivelConteudo;
	}
	public String getTipoExercicioConteudo() {
		return tipoExercicioConteudo;
	}
	public void setTipoExercicioConteudo(String tipoExercicioConteudo) {
		this.tipoExercicioConteudo = tipoExercicioConteudo;
	}
	public LocalDate getDataAdicaoConteudo() {
		return dataAdicaoConteudo;
	}
	public void setDataAdicaoConteudo(LocalDate dataAdicaoConteudo) {
		this.dataAdicaoConteudo = dataAdicaoConteudo;
	}
	public String getEnderedecoImagemConteudo() {
		return enderedecoImagemConteudo;
	}
	public void setEnderedecoImagemConteudo(String enderedecoImagemConteudo) {
		this.enderedecoImagemConteudo = enderedecoImagemConteudo;
	}
	public String getDescricaoConteudo() {
		return descricaoConteudo;
	}
	public void setDescricaoConteudo(String descricaoConteudo) {
		this.descricaoConteudo = descricaoConteudo;
	}
}
