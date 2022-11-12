package com.trilhaeducacao.app1.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.trilhaeducacao.app1.model.Usuario;

@Controller
public class UsuarioController {

		
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	
	@GetMapping("")
	public String landingPage() {
		return "landingPage/landingPage";
	}
	
	@GetMapping("/cadastro")
	public String form() {
		return "usuario/usuario-form-cadastro";
	}
	 
	@PostMapping("/cadastro")
	public String criado(Usuario usuario, Model model) {
		listaUsuarios.add(usuario);
		return "usuario/usuario-novo-cadastro-realizado";
	}
}
