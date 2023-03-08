package com.trilhaeducacao.app1.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trilhaeducacao.app1.model.Usuario;
import com.trilhaeducacao.app1.repository.UsuarioRepository;



@Controller
public class UsuarioController {
	
	/*
	@Autowired
	private UsuarioRepository usuariorepositorio;
	
	@GetMapping("/inseriralunos")
	public ModelAndView InsertAlunos(Usuario usuario) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("usuario/usuario-form-cadastro");
		mv.addObject("usuario", new Usuario());
		return mv;
		
	}
	
	@PostMapping("insertAlunos")
	public ModelAndView inserirAluno(Usuario usuario) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/usuario/usuario-list");
		usuariorepositorio.save(usuario);
		return mv;
	} */
	
	@GetMapping("/cadastro")// model serve pra adicionar dados, informações
	public String Cadastro(Model model) {
		return "usuario/usuario-form-cadastro";
	}
	
	//Lista de usuarios
		@GetMapping("/listagem")
		public String Listagem(Model model) {
			
			//criando um atalho pra criação de um novo usuario
			Usuario usuario = new Usuario();
			//aqui estamos alterando dinamicante o valor das variaveis q estao em model
			
			usuario.setNome("Kaique");
			usuario.setNomeUsuario("Lizt");
			usuario.setEmail("kaiqueoliveira375@gmail.com");
			usuario.setTel(1194395572);
			usuario.setIdade(19);
			usuario.setCep(210);
			
			
			//essas informacoes serão exibidas na tela mas dentro de uma lista:
		
			List <Usuario> usuarios = Arrays.asList(usuario); // guardando a lista de usuarios dentro de uma lista chamada usuarios
			
			model.addAttribute("usuarios", usuarios); // o model q é responsavel por levar nossas informações ate é a vie
			
			return "usuario/usuario-list";
		}
		
		@GetMapping("/entrar")
		public String Login() {
			return "usuario/usuario-login";
		}
		
		@GetMapping("/frontend")
		public String FrontEnd() {
			return "categorias/front-end";
		}
		
		@GetMapping("/backend")
		public String BackEnd() {
			return "categorias/back-end"; 
		}
		
	
}


