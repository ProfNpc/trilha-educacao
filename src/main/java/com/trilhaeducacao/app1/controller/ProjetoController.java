package com.trilhaeducacao.app1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import com.trilhaeducacao.app1.model.Projeto;
import com.trilhaeducacao.app1.model.Usuario;
import com.trilhaeducacao.app1.repository.ProjetoRepository;

@Controller
public class ProjetoController {
	
	@Autowired
	private ProjetoRepository projetorepositorio;
	
	
	// Meus Projetos
	
	@GetMapping("/meus-projetos")
	public ModelAndView MeusProjetos() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("projetos/meus-projetos");
		
		mv.addObject("projetosList", projetorepositorio.findAll()); 
		
		return mv;
	}
	

	// Publicar Projeto

	@GetMapping("/projetos/publicar")
	public ModelAndView PublicarProjeto(Projeto projeto) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("projetos/projeto-form");
		mv.addObject("projeto", new Projeto());
		return mv;

	}
	
	
	// Enviar informações do cadastro e salvar
	
	@PostMapping("publicar")
	public ModelAndView inserirProjeto(@Valid Projeto projeto, BindingResult br) { // passamos o objeto aluno e criamos
																					// uma variavel pra esse objeto
		ModelAndView mv = new ModelAndView();
		if (br.hasErrors()) {
			mv.setViewName("projetos/projeto-form"); // caso tenha algum erro a tela continará em formulario
			mv.addObject("projeto");
		} else {

			// caso contrario ele redionará para a tela de usuarios cadastrados
			mv.setViewName("redirect:/meus-projetos"); // aqui redirecionamos para a requisição q esta no get, e
																// nao ao
			// arquivo na pasta
			projetorepositorio.save(projeto);
		}
		return mv;
	}
	
	
	// Ver projeto
	
	@GetMapping("/projeto/{id}")
	public ModelAndView VerProjeto(@PathVariable("id") Long id) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("projetos/ver-projeto");
		Projeto projeto = projetorepositorio.getOne(id);
		mv.addObject("projeto", projeto);
		mv.addObject("projetosList", projetorepositorio.findAll()); // o atribute value q vai ser guardado na variavel ao lado é a variavel
											// responsavel por capiturar o di do user
		return mv;
	}
	
	
	// Editar dados do projeto
	
	@GetMapping("/projeto/editar/{id}")
	public ModelAndView EditarProjeto(@PathVariable("id") Long id) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("projetos/projeto-editar");
		Projeto projeto = projetorepositorio.getOne(id);
		mv.addObject("projeto", projeto); // o atribute value q vai ser guardado na variavel ao lado é a variavel
											// responsavel por capiturar o di do user
		return mv;
	}
	
	@PostMapping("/editar") // podemos ter 2 metodos com o msm nome caso exista diferença entre eles
	public ModelAndView Editar(@Valid Projeto projeto, BindingResult br) { // e sempre passamos a classe usuario e a
																			// variavel usuario
		ModelAndView mv = new ModelAndView();
		if (br.hasErrors()) {
			mv.setViewName("projeto/projeto-editar"); // caso tenha algum erro a tela continará em formulario
			mv.addObject("projeto");
		} else {

			// caso contrario ele redionará para a tela de usuarios cadastrados
			mv.setViewName("redirect:/meus-projetos"); // aqui redirecionamos para a requisição q esta no get, e nao ao
													// arquivo na pasta
			projetorepositorio.save(projeto);
		}
		return mv;
	}
	
	
// Excluir Projeto
	
	@GetMapping("/projeto/excluir/{id}")
	public String excluirAluno(@PathVariable("id") Long id) {
		projetorepositorio.deleteById(id); // dessa vez usamos o metodo de delete ao inves de save, dessa maneira ele
											// irá deletar o usuario buscando pelo seu id
		return "redirect:/meus-projetos";
	}

}
