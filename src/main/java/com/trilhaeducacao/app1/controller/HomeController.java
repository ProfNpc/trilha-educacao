package com.trilhaeducacao.app1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// um método que retorna uma string chamada hello.
	@GetMapping("/home")
	//substituimos o HttpServletReqiest pelo Model model q funciona da msm maneira, pois se trata de uma interface do proprio spring
	public String Home(Model model) {
		//primeiro nome do atributo(variavel) e dps o valor q ele armazena
		model.addAttribute("nome", "kaique"); // lembrando q o identificador do atributo "kaique" é "nome"
		return "landingPage/landingPage";
	}
	
	@GetMapping("/escolha")
	public String Escolha() {
		return "admin/EscolhaPerfil";
	}
	
}
