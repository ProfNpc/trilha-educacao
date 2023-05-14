package com.trilhaeducacao.app1.conteudos.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trilhaeducacao.app1.model.Conteudo;
import com.trilhaeducacao.app1.model.CssIniciante;
import com.trilhaeducacao.app1.model.HtmlIntermediario;
import com.trilhaeducacao.app1.repository.CssInicianteRepository;

@Controller
public class CssInicianteController {

	@Autowired
	private CssInicianteRepository cssInicianteRepositorio;
	
	@GetMapping("/admin/registrar-css-iniciante")
	public ModelAndView InsertAtividade(CssInicianteRepository cssInicianteRepositorio) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("conteudo/css-iniciante-form");
		mv.addObject("cssIniciante", new HtmlIntermediario());
		return mv;

		
	}
	
	@PostMapping("insertCssIniciante")
	public ModelAndView inserirCssIniciante(@Valid CssIniciante cssIniciante, BindingResult br) {

		ModelAndView mv = new ModelAndView();
		if (br.hasErrors()) {
			mv.setViewName("conteudo/css-iniciante-form");
			mv.addObject("cssIniciante");
		} else {

			mv.setViewName("redirect:/frontend/css-iniciante");

			cssInicianteRepositorio.save(cssIniciante);

		}
		return mv;
	}
	
	//listagem 
	
	@GetMapping("/frontend/css-iniciante")
	public ModelAndView listagemCssIniciante() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("percurso-iniciante/css-percurso-iniciante");
		
		mv.addObject("cssInicianteList", cssInicianteRepositorio.findAll()); 
		
		return mv;
	}
	
	// questionarios
	
	
	
	
	
	
}

