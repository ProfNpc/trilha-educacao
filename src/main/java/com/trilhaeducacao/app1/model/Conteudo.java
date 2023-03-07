package com.trilhaeducacao.app1.model;

import java.time.LocalDate;

public class Conteudo {
//aqui adicionaremos os atributos que o objeto Conteudo possui:

	private String nomeConteudo;
	private String temaConteudo;
	private String perguntaConteudo;
	private String imagemAuxilio;

	private String alternativa1;
	private String alternativa2;
	private String alternativa3;
	private String alternativa4;
	private String alternativaCorreta;
	private LocalDate dataAdicaoConteudo;
	private String enderedecoImagemConteudo;
	private String descricaoConteudo;

	public String getNomeConteudo() {
		return nomeConteudo;
	}

	public void setNomeConteudo(String nomeConteudo) {
		this.nomeConteudo = nomeConteudo;
	}

	public String getCategoriaConteudo() {
		return categoriaConteudo;
	}

	public void setCategoriaConteudo(String categoriaConteudo) {
		this.categoriaConteudo = categoriaConteudo;
	}

	public String getRevisaoConteudo() {
		return revisaoConteudo;
	}

	public void setRevisaoConteudo(String revisaoConteudo) {
		this.revisaoConteudo = revisaoConteudo;
	}

	public String getAlternativa1() {
		return alternativa1;
	}

	public void setAlternativa1(String alternativa1) {
		this.alternativa1 = alternativa1;
	}

	public String getAlternativa2() {
		return alternativa2;
	}

	public void setAlternativa2(String alternativa2) {
		this.alternativa2 = alternativa2;
	}

	public String getAlternativa3() {
		return alternativa3;
	}

	public void setAlternativa3(String alternativa3) {
		this.alternativa3 = alternativa3;
	}

	public String getAlternativa4() {
		return alternativa4;
	}

	public void setAlternativa4(String alternativa4) {
		this.alternativa4 = alternativa4;
	}

	public String getAlternativaCorreta() {
		return alternativaCorreta;
	}

	public void setAlternativaCorreta(String alternativa5) {
		this.alternativaCorreta = alternativa5;
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

	private String categoriaConteudo;
	private String revisaoConteudo;

	public String getTemaConteudo() {
		return temaConteudo;
	}

	public void setTemaConteudo(String temaConteudo) {
		this.temaConteudo = temaConteudo;
	}

	public String getPerguntaConteudo() {
		return perguntaConteudo;
	}

	public void setPerguntaConteudo(String perguntaConteudo) {
		this.perguntaConteudo = perguntaConteudo;
	}

	public String getImagemAuxilio() {
		return imagemAuxilio;
	}

	public void setImagemAuxilio(String imagemAuxilio) {
		this.imagemAuxilio = imagemAuxilio;
	}
}
