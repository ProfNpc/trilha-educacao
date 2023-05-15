package com.trilhaeducacao.app1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConteudoController {
	
	@GetMapping("/cadastro-conteudo")
	public String CadastroAtividades () {
		return "conteudo/conteudo-form";
	}

	@GetMapping("/html/iniciante")
	public String HtmlIniciante () {
		return "categorias/atividades-html-iniciante";
	}
	
	@GetMapping("/css/iniciante")
	public String CssIniciante () {
		return "categorias/atividades-css-iniciante";
	}
	
	@GetMapping("/js/iniciante")
	public String JsIniciante () {
		return "categorias/atividades-js-iniciante";
	}
}
