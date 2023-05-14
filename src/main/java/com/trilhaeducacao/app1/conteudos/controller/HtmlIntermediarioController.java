package com.trilhaeducacao.app1.conteudos.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trilhaeducacao.app1.model.Conteudo;
import com.trilhaeducacao.app1.model.HtmlIntermediario;
import com.trilhaeducacao.app1.model.Usuario;
import com.trilhaeducacao.app1.repository.ConteudoRepository;
import com.trilhaeducacao.app1.repository.HtmlIntermediarioReposiory;

@Controller
public class HtmlIntermediarioController {

	@Autowired
	private HtmlIntermediarioReposiory htmlIntermediariorepositorio;

	@GetMapping("/admin/registrar-html-intermediario")
	public ModelAndView InsertAtividade(HtmlIntermediario htmlIntermediario) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("conteudo/html-intermediario-form");
		mv.addObject("htmlIntermediario", new HtmlIntermediario());
		return mv;

	}

	@PostMapping("insertHtmlIntermediario")
	public ModelAndView inserirHtmlIntermedario(@Valid HtmlIntermediario htmlIntermediario, BindingResult br) {

		ModelAndView mv = new ModelAndView();
		if (br.hasErrors()) {
			mv.setViewName("conteudo/html-intermediario-form");
			mv.addObject("htmlIntermediario");
		} else {

			mv.setViewName("redirect:/frontend/html-intermediario");

			htmlIntermediariorepositorio.save(htmlIntermediario);

		}
		return mv;
	}
	
	
	// listagem das atividades intermediarias
	
	@GetMapping("/frontend/html-intermediario")
	public ModelAndView listagemHtmlIntermediario() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("percurso-intermediario/html-percurso-intermediario");
		
		mv.addObject("IntermediarioList", htmlIntermediariorepositorio.findAll()); 
		
		return mv;
	}
	
	// questionarios
	
	@GetMapping("/testee/{id}")
	public ModelAndView teste(@PathVariable("id") Long id) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("percurso-intermediario/questionario-html-intermediario");
		HtmlIntermediario htmlIntermediario = htmlIntermediariorepositorio.getOne(id);
		mv.addObject("htmlIntermediario", htmlIntermediario); // o atribute value q vai ser guardado na variavel ao lado é a variavel
		mv.addObject("IntermediarioList", htmlIntermediariorepositorio.findAll());								// responsavel por capiturar o di do user
		return mv;
	}
	
	
	
	
	
}