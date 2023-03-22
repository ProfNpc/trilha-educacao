package com.trilhaeducacao.app1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.trilhaeducacao.app1.repository.NotificacaoRepository;
import com.trilhaeducacao.app1.repository.SolicitacaoRepository;

@Controller
public class NotificacaoController {
	
	
	@Autowired
	private NotificacaoRepository notificacaorepositorio;

	
	@GetMapping("/usuario/notificacao")
	public String usuarioNotificacao() {
		return "usuario/notificacao";
	}
	
	// fazer o formulario
	
	// fazer o metodo post pra gravar informacoes
	
	// fazer get mapping q devolve a lista de notificacoes
}
