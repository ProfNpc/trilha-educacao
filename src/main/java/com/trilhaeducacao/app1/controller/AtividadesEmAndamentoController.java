package com.trilhaeducacao.app1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trilhaeducacao.app1.model.Conteudo;
import com.trilhaeducacao.app1.model.Usuario;
import com.trilhaeducacao.app1.repository.ConteudoRepository;

@Controller
public class AtividadesEmAndamentoController {
	
	@Autowired
	private ConteudoRepository conteudorepositorio;

	@PostMapping("/andamento") // podemos ter 2 metodos com o msm nome caso exista diferença entre eles
	public ModelAndView andamento(@Valid Conteudo conteudo, BindingResult br) { // e sempre passamos a classe usuario e a
																			// variavel usuario
		ModelAndView mv = new ModelAndView();
		if (br.hasErrors()) {
			mv.setViewName("usuario/alterar"); // caso tenha algum erro a tela continará em formulario
			mv.addObject("usuario");
		} else {

			// caso contrario ele redionará para a tela de usuarios cadastrados
			mv.setViewName("redirect:/usuario/perfil"); // aqui redirecionamos para a requisição q esta no get, e nao ao
													// arquivo na pasta
			conteudorepositorio.save(conteudo);
		}
		return mv;
	}
}
