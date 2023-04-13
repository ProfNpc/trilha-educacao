package com.trilhaeducacao.app1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoriaController {
	
	@GetMapping("/frontend")
	public String FrontEnd() {
		return "categorias/front-end";
	}
	

	
	@GetMapping("/frontend/css")
	public String Css() {
		return "categorias/css";
	}
	
	@GetMapping("/frontend/javascript")
	public String JavaScript() {
		return "categorias/javascript";
	}
	
	@GetMapping("/frontend/react")
	public String React() {
		return "categorias/react";
	}
	
	@GetMapping("/questionario2/html")
	public String QuestionarioHtml() {
		return "categorias/questionario-html";
	}
	
	@GetMapping("/frontend/html/niveis")
	public String EscolherNivel() {
		return "categorias/html-niveis";
	}

}
