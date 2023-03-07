package com.trilhaeducacao.app1.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.trilhaeducacao.app1.model.Usuario;

@Controller
public class UsuarioController {
	
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
			usuario.setEmail("kaiqueoliveira375@gmail.com");
			
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


