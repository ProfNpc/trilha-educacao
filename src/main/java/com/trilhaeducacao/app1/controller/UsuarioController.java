package com.trilhaeducacao.app1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {
	
	@GetMapping("/cadastro")// model serve pra adicionar dados, informações
	public String Cadastro(Model model) {
		return "usuario/usuario-form-cadastro";
	}
	
}


