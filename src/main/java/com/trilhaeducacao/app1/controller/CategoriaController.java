package com.trilhaeducacao.app1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoriaController {
	
	@GetMapping("/frontend")
	public String FrontEnd() {
		return "categorias/front-end";
	}

}
