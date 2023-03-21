package com.trilhaeducacao.app1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trilhaeducacao.app1.model.Solicitacao;
import com.trilhaeducacao.app1.model.Usuario;
import com.trilhaeducacao.app1.repository.SolicitacaoRepository;


@Controller
public class SolicitacaoController {

	
	@Autowired
	private SolicitacaoRepository solicitacaorepositorio;

	
	@GetMapping("/solicitarcadastro")
	public ModelAndView InsertSolicitacao(Solicitacao solicitacao) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("usuario/solicitacao");
		mv.addObject("solicitacao", new Solicitacao());
		return mv;

	}
	
	@PostMapping("insertSolicitacao")
	public ModelAndView inserirSolicitacao(@Valid Solicitacao solicitacao, BindingResult br) { // passamos o objeto aluno e criamos
																					// uma variavel pra esse objeto
		ModelAndView mv = new ModelAndView();
		/*if (br.hasErrors()) {
			mv.setViewName("usuario/usuario-form-cadastro"); // caso tenha algum erro a tela continará em formulario
			mv.addObject("usuario");
		} else { */

			// caso contrario ele redionará para a tela de usuarios cadastrados
			mv.setViewName("redirect:/informacoesEnviadas"); // aqui redirecionamos para a requisição q esta no get, e nao ao
													// arquivo na pasta
			solicitacaorepositorio.save(solicitacao);
		
		return mv;
	}
	
	@GetMapping("/listagemsolicitacao")
	public ModelAndView listagemUsuarios() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("usuario/usuario-solicitacao");
		mv.addObject("solicitacaoList", solicitacaorepositorio.findAll()); // o find all é responsavel por listar todos os
																	// dados q tem no banco
		return mv;
	}
	
	@GetMapping("/solicitacao/excluir/{id}")
	public String excluirAluno(@PathVariable("id") Long id) {
		solicitacaorepositorio.deleteById(id); // dessa vez usamos o metodo de delete ao inves de save, dessa maneira ele
											// irá deletar o usuario buscando pelo seu id
		return "redirect:/listagemsolicitacao";
	}
	
	@GetMapping("/informacoesEnviadas")
	public String informacoesEnviadas() {
		return "usuario/informacoes-enviadas";
	}
	
	
}
