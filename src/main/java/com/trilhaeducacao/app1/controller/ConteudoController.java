package com.trilhaeducacao.app1.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trilhaeducacao.app1.model.Conteudo;
import com.trilhaeducacao.app1.model.Notificacao;
import com.trilhaeducacao.app1.model.Usuario;
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
	
	
	@GetMapping("/questionario/html/{id}")
	public ModelAndView questionarioHtml(@PathVariable("id") Long id) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("categorias/questionario-html");
		Conteudo conteudo = conteudorepositorio.getOne(id);
		mv.addObject("conteudo", conteudo);
		mv.addObject("conteudoList", conteudorepositorio.findAll()); // o atribute value q vai ser guardado na variavel ao lado é a variavel
											// responsavel por capiturar o di do user
		return mv;
	}

	@PostMapping("/questionario/html") // podemos ter 2 metodos com o msm nome caso exista diferença entre eles
	public ModelAndView alterar(@Valid Conteudo conteudo, BindingResult br) { // e sempre passamos a classe usuario e a
																			// variavel usuario
		ModelAndView mv = new ModelAndView();
		if (br.hasErrors()) {
			mv.setViewName("categorias/questionario-html"); // caso tenha algum erro a tela continará em formulario
			mv.addObject("conteudo");
		} else {

			// caso contrario ele redionará para a tela de usuarios cadastrados
			mv.setViewName("redirect:/listagem"); // aqui redirecionamos para a requisição q esta no get, e nao ao
													// arquivo na pasta
			conteudorepositorio.save(conteudo);
		}
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
