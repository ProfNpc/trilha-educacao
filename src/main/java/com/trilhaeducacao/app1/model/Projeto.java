package com.trilhaeducacao.app1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "projeto")
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

	@Size(min = 5, max = 35, message = "O titulo deve conter no minimo 5 caracteres") // especicidando qual a quantidade
	@NotBlank(message = "O titulo nao pode ser vazio.")
	private String titulo;
	@Size(min = 5, max = 35, message = "A descrição deve conter no minimo 5 caracteres") // especicidando qual a quantidade
	@NotBlank(message = "O descrição nao pode ser vazio.")
	private String descricao;
	@Size(min = 10, max = 35, message = "O código HTML deve conter no minimo 10 caracteres") // especicidando qual a quantidade
	@NotBlank(message = "O campo de código HTML nao pode ser vazio.")
	private String codHtml;
	@Size(min = 10, max = 35, message = "O código CSS deve conter no minimo 10 caracteres") // especicidando qual a quantidade
	@NotBlank(message = "O campo de código CSS nao pode ser vazio.")
	private String codCss;
	@Size(min = 10, max = 1000, message = "O código JS deve conter no minimo 10 caracteres") // especicidando qual a quantidade
	@NotBlank(message = "O campo de código CSS nao pode ser vazio.")
	private String codJs;
	private String imgPreview;

}
