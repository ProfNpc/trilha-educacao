package com.trilhaeducacao.app1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="projeto")
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
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
	public String getCodHtml() {
		return codHtml;
	}
	public void setCodHtml(String codHtml) {
		this.codHtml = codHtml;
	}
	public String getCodCss() {
		return codCss;
	}
	public void setCodCss(String codCss) {
		this.codCss = codCss;
	}
	public String getCodJs() {
		return codJs;
	}
	public void setCodJs(String codJs) {
		this.codJs = codJs;
	}
	
	public String getImgPreview() {
		return imgPreview;
	}
	public void setImgPreview(String imgPreview) {
		this.imgPreview = imgPreview;
	}
	
	private String titulo;
	private String descricao;
	private String codHtml;
	private String codCss;
	private String codJs;
	private String imgPreview;


	
}
