package com.trilhaeducacao.app1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trilhaeducacao.app1.model.Notificacao;
import com.trilhaeducacao.app1.model.Solicitacao;
import com.trilhaeducacao.app1.repository.NotificacaoRepository;
import com.trilhaeducacao.app1.repository.SolicitacaoRepository;

@Controller
public class NotificacaoController {
	
	
	@Autowired
	private NotificacaoRepository notificacaorepositorio;

	

	@GetMapping("/admin/notificacao")
	public ModelAndView InsertSolicitacao(Notificacao notificacao) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/notificar-form");
		mv.addObject("notificacao", new Notificacao());
		return mv;

	}
	
	@PostMapping("insertNotificacao")
	public ModelAndView inserirNotificacao(@Valid Notificacao notificacao, BindingResult br) { // passamos o objeto aluno e criamos
																					// uma variavel pra esse objeto
		ModelAndView mv = new ModelAndView();
		if (br.hasErrors()) {
			mv.setViewName("admin/notificar-form"); // caso tenha algum erro a tela continará em formulario
			mv.addObject("notificacao");
		} else { 

			// caso contrario ele redionará para a tela de usuarios cadastrados
			mv.setViewName("redirect:/admin/notificacao-enviada"); // aqui redirecionamos para a requisição q esta no get, e nao ao
													// arquivo na pasta
			notificacaorepositorio.save(notificacao);
		
		
	}
		return mv;
	}
	
	@GetMapping("/listanotificacao")
	public ModelAndView listagemNotificacao() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("usuario/notificacao");
		mv.addObject("notificacaoList", notificacaorepositorio.findAll()); // o find all é responsavel por listar todos os
																	// dados q tem no banco
		return mv;
	}

	@GetMapping("/notificacao/excluir/{id}")
	public String excluirNotificacao(@PathVariable("id") Long id) {
		notificacaorepositorio.deleteById(id); // dessa vez usamos o metodo de delete ao inves de save, dessa maneira ele
											// irá deletar o usuario buscando pelo seu id
		return "redirect:/listanotificacao";
	}
	
	@GetMapping("/admin/notificacao-enviada")
	public String notificacaoEnviada() {
		return "admin/notificacao-enviada";
	}
	
}
