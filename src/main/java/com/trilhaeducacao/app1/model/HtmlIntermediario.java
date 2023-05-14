package com.trilhaeducacao.app1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class HtmlIntermediario {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@Column(name = "titulo")
	private String titulo;
	private String descricao;
	private String guia;
	private String exemplo1;
	private String exemploDois;
	private String exemploTres;
	private String exemploQuatro;
	private String exemploCinco;
	private String expicacaoExemplos;
	
	// Pergunta 1
	 private String pergunta1;
	private String alternativa_1_a;
	private String alternativa_1_b;
	private String alternativa_1_c;
	private String alternativa_1_d;
	
	// Pergunta 2
	private String pergunta2;
	private String alternativa_2_a;
	private String alternativa_2_b;
	private String alternativa_2_c;
	private String alternativa_2_d;
	
	// Pergunta 3
	private String pergunta3;
	private String alternativa_3_a;
	private String alternativa_3_b;
	private String alternativa_3_c;
	private String alternativa_3_d;
	
	// Pergunta 4
	private String pergunta4;
	private String alternativa_4_a;
	private String alternativa_4_b;
	private String alternativa_4_c;
	private String alternativa_4_d;
	
	// Pergunta 5
	private String pergunta5;
	private String alternativa_5_a;
	private String alternativa_5_b;
	private String alternativa_5_c;
	private String alternativa_5_d;
	
	// Getters e Setters
	
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
	public String getGuia() {
		return guia;
	}
	public void setGuia(String guia) {
		this.guia = guia;
	}
	public String getExemplo1() {
		return exemplo1;
	}
	public void setExemplo1(String exemplo1) {
		this.exemplo1 = exemplo1;
	}
	public String getExemploDois() {
		return exemploDois;
	}
	public void setExemploDois(String exemploDois) {
		this.exemploDois = exemploDois;
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
	public String getExemploCinco() {
		return exemploCinco;
	}
	public void setExemploCinco(String exemploCinco) {
		this.exemploCinco = exemploCinco;
	}
	public String getAlternativa_1_a() {
		return alternativa_1_a;
	}
	public void setAlternativa_1_a(String alternativa_1_a) {
		this.alternativa_1_a = alternativa_1_a;
	}
	public String getAlternativa_1_b() {
		return alternativa_1_b;
	}
	public void setAlternativa_1_b(String alternativa_1_b) {
		this.alternativa_1_b = alternativa_1_b;
	}
	public String getAlternativa_1_c() {
		return alternativa_1_c;
	}
	public void setAlternativa_1_c(String alternativa_1_c) {
		this.alternativa_1_c = alternativa_1_c;
	}
	public String getAlternativa_1_d() {
		return alternativa_1_d;
	}
	public void setAlternativa_1_d(String alternativa_1_d) {
		this.alternativa_1_d = alternativa_1_d;
	}
	public String getAlternativa_2_a() {
		return alternativa_2_a;
	}
	public void setAlternativa_2_a(String alternativa_2_a) {
		this.alternativa_2_a = alternativa_2_a;
	}
	public String getAlternativa_2_b() {
		return alternativa_2_b;
	}
	public void setAlternativa_2_b(String alternativa_2_b) {
		this.alternativa_2_b = alternativa_2_b;
	}
	public String getAlternativa_2_c() {
		return alternativa_2_c;
	}
	public void setAlternativa_2_c(String alternativa_2_c) {
		this.alternativa_2_c = alternativa_2_c;
	}
	public String getAlternativa_2_d() {
		return alternativa_2_d;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getExpicacaoExemplos() {
		return expicacaoExemplos;
	}
	public void setExpicacaoExemplos(String expicacaoExemplos) {
		this.expicacaoExemplos = expicacaoExemplos;
	}
	public void setAlternativa_2_d(String alternativa_2_d) {
		this.alternativa_2_d = alternativa_2_d;
	}
	public String getAlternativa_3_a() {
		return alternativa_3_a;
	}
	public void setAlternativa_3_a(String alternativa_3_a) {
		this.alternativa_3_a = alternativa_3_a;
	}
	public String getAlternativa_3_b() {
		return alternativa_3_b;
	}
	public void setAlternativa_3_b(String alternativa_3_b) {
		this.alternativa_3_b = alternativa_3_b;
	}
	public String getAlternativa_3_c() {
		return alternativa_3_c;
	}
	public void setAlternativa_3_c(String alternativa_3_c) {
		this.alternativa_3_c = alternativa_3_c;
	}
	public String getAlternativa_3_d() {
		return alternativa_3_d;
	}
	public void setAlternativa_3_d(String alternativa_3_d) {
		this.alternativa_3_d = alternativa_3_d;
	}
	public String getAlternativa_4_a() {
		return alternativa_4_a;
	}
	public void setAlternativa_4_a(String alternativa_4_a) {
		this.alternativa_4_a = alternativa_4_a;
	}
	public String getAlternativa_4_b() {
		return alternativa_4_b;
	}
	public void setAlternativa_4_b(String alternativa_4_b) {
		this.alternativa_4_b = alternativa_4_b;
	}
	public String getAlternativa_4_c() {
		return alternativa_4_c;
	}
	public void setAlternativa_4_c(String alternativa_4_c) {
		this.alternativa_4_c = alternativa_4_c;
	}
	public String getAlternativa_4_d() {
		return alternativa_4_d;
	}
	public void setAlternativa_4_d(String alternativa_4_d) {
		this.alternativa_4_d = alternativa_4_d;
	}
	public String getAlternativa_5_a() {
		return alternativa_5_a;
	}
	public void setAlternativa_5_a(String alternativa_5_a) {
		this.alternativa_5_a = alternativa_5_a;
	}
	public String getAlternativa_5_b() {
		return alternativa_5_b;
	}
	public void setAlternativa_5_b(String alternativa_5_b) {
		this.alternativa_5_b = alternativa_5_b;
	}
	public String getAlternativa_5_c() {
		return alternativa_5_c;
	}
	public void setAlternativa_5_c(String alternativa_5_c) {
		this.alternativa_5_c = alternativa_5_c;
	}
	public String getAlternativa_5_d() {
		return alternativa_5_d;
	}
	public void setAlternativa_5_d(String alternativa_5_d) {
		this.alternativa_5_d = alternativa_5_d;
	}
	public String getPergunta1() {
		return pergunta1;
	}
	public void setPergunta1(String pergunta1) {
		this.pergunta1 = pergunta1;
	}
	public String getPergunta2() {
		return pergunta2;
	}
	public void setPergunta2(String pergunta2) {
		this.pergunta2 = pergunta2;
	}
	public String getPergunta3() {
		return pergunta3;
	}
	public void setPergunta3(String pergunta3) {
		this.pergunta3 = pergunta3;
	}
	public String getPergunta4() {
		return pergunta4;
	}
	public void setPergunta4(String pergunta4) {
		this.pergunta4 = pergunta4;
	}
	public String getPergunta5() {
		return pergunta5;
	}
	public void setPergunta5(String pergunta5) {
		this.pergunta5 = pergunta5;
	}
	

	
	
	


}
