package com.trilhaeducacao.app1.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trilhaeducacao.app1.model.Conteudo;
import com.trilhaeducacao.app1.model.Notificacao;
import com.trilhaeducacao.app1.repository.ConteudoRepository;

@Controller
public class ConteudoController {

	@Autowired
	private ConteudoRepository conteudorepositorio;

	@GetMapping("/admin/criar-atividade")
	public ModelAndView InsertAtividade(Conteudo conteudo) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("conteudo/conteudo-form");
		mv.addObject("conteudo", new Conteudo());
		return mv;

	}

	@PostMapping("insertConteudo")
	public ModelAndView inserirConteudo(@Valid Conteudo conteudo, BindingResult br) {

		ModelAndView mv = new ModelAndView();
		if (br.hasErrors()) {
			mv.setViewName("conteudo/conteudo-form");
			mv.addObject("conteudo");
		} else {

			mv.setViewName("redirect:/frontend/html");

			conteudorepositorio.save(conteudo);

		}
		return mv;
	}

	@GetMapping("/frontend/html")
	public ModelAndView listagemHtml() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("categorias/html");
		mv.addObject("conteudoList", conteudorepositorio.findAll()); 
		
		return mv;
	}

	@GetMapping("/questionario/html")
	public String questionarioHtml() {
		return "categorias/questionario-html";
	}
	
	@GetMapping("/admin/escolher-cadastro-conteudo")
	public String escolherCadastroConteudo() {
		return "conteudo/escolher-cadastro-conteudo";
	}
	
	@GetMapping("/admin/escolha-front-end")
	public String escolhaFrontEnd() {
		return "conteudo/escolha-front-end";
	}
	
}
