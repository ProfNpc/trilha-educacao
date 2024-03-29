package com.trilhaeducacao.app1.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.trilhaeducacao.app1.model.Usuario;
import com.trilhaeducacao.app1.repository.UsuarioRepository;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuariorepositorio;

	@GetMapping("/inseriralunos")
	public ModelAndView InsertAlunos(Usuario usuario) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("usuario/usuario-cadastro");
		mv.addObject("usuario", new Usuario());
		return mv;

	}

	@PostMapping("insertAlunos")
	public ModelAndView inserirAluno(@Valid Usuario usuario, BindingResult br) { // passamos o objeto aluno e criamos
																					// uma variavel pra esse objeto
		ModelAndView mv = new ModelAndView();
		if (br.hasErrors()) {
			mv.setViewName("usuario/usuario-cadastro"); // caso tenha algum erro a tela continará em formulario
			mv.addObject("usuario");
		} else {

			// caso contrario ele redionará para a tela de usuarios cadastrados
			mv.setViewName("redirect:/informacoesEnviadas"); // aqui redirecionamos para a requisição q esta no get, e
																// nao ao
			// arquivo na pasta
			usuariorepositorio.save(usuario);
		}
		return mv;
	}
	
	@GetMapping("/inserirUsuarios")
	public ModelAndView Insertusuarios(Usuario usuario) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("usuario/usuario-form-cadastro");
		mv.addObject("usuario", new Usuario());
		return mv;

	}

	@PostMapping("insertUsuarios")
	public ModelAndView inserirUsuario(@Valid Usuario usuario, BindingResult br) { // passamos o objeto aluno e criamos
																					// uma variavel pra esse objeto
		ModelAndView mv = new ModelAndView();
		if (br.hasErrors()) {
			mv.setViewName("usuario/usuario-form-cadastro"); // caso tenha algum erro a tela continará em formulario
			mv.addObject("usuario");
		} else {

			// caso contrario ele redionará para a tela de usuarios cadastrados
			mv.setViewName("redirect:/listagem"); // aqui redirecionamos para a requisição q esta no get, e
																// nao ao
			// arquivo na pasta
			usuariorepositorio.save(usuario);
		}
		return mv;
	}

	@GetMapping("/listagem")
	public ModelAndView listagemUsuarios() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("usuario/usuario-list");
		mv.addObject("usuariosList", usuariorepositorio.findAll()); // o find all é responsavel por listar todos os
																	// dados q tem no banco
		return mv;
	}

	// criando o metodo para alterar dados do usuario
	@GetMapping("/alterar/{id}")
	public ModelAndView alterar(@PathVariable("id") Long id) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("usuario/alterar");
		Usuario usuario = usuariorepositorio.getOne(id);
		mv.addObject("usuario", usuario); // o atribute value q vai ser guardado na variavel ao lado é a variavel
											// responsavel por capiturar o di do user
		return mv;
	}

	@PostMapping("/alterar") // podemos ter 2 metodos com o msm nome caso exista diferença entre eles
	public ModelAndView alterar(@Valid Usuario usuario, BindingResult br) { // e sempre passamos a classe usuario e a
																			// variavel usuario
		ModelAndView mv = new ModelAndView();
		if (br.hasErrors()) {
			mv.setViewName("usuario/alterar"); // caso tenha algum erro a tela continará em formulario
			mv.addObject("usuario");
		} else {

			// caso contrario ele redionará para a tela de usuarios cadastrados
			mv.setViewName("redirect:/listagem"); // aqui redirecionamos para a requisição q esta no get, e nao ao
													// arquivo na pasta
			usuariorepositorio.save(usuario);
		}
		return mv;
	}

	@GetMapping("/excluir/{id}")
	public String excluirAluno(@PathVariable("id") Long id) {
		usuariorepositorio.deleteById(id); // dessa vez usamos o metodo de delete ao inves de save, dessa maneira ele
											// irá deletar o usuario buscando pelo seu id
		return "redirect:/listagem";
	}

	// esse post é referente ao input q procura por usuarios
	@PostMapping("pesquisar-usuario")
	public ModelAndView pesquisarUsuario(@RequestParam(required = false) String nome) { // passamos a string nome como
																						// parametro pq vamos nos absear
																						// nela pra buscar os usuarios
		ModelAndView mv = new ModelAndView();
		List<Usuario> listaUsuarios; // criamso essa variavel para armazenar todos os dados dos usuarios
		// verificando se o usuario n esta enviando nada
		if (nome == null || nome.trim().isEmpty()) {
			listaUsuarios = usuariorepositorio.findAll(); // caso digite nada ele devolverá a lista copmplete de
															// usuarios
		} else {
			// e aqui ja utilizamos o metodo criado la no repository
			listaUsuarios = usuariorepositorio.findByNomeContainingIgnoreCase(nome);
		}
		mv.addObject("ListaDeUsuarios", listaUsuarios);
		mv.setViewName("usuario/pesquisa-resultado");
		return mv;
	}

	@GetMapping("/entrar")
	public String Login() {

		return "usuario/usuario-login";
	}

	@GetMapping("/usuario/home")
	public String usuarioHome() {

		return "usuario/usuario-home";
	}

	@GetMapping("/usuario/solicitacao")
	public String usuarioSolicitacao() {
		return "usuario/usuario-solicitacao";
	}
	
	@GetMapping("/usuario/perfil")
	public String Perfil() {
		return "usuario/perfil";
	}
	
	@GetMapping("/usuario/editar-perfil")
	public String EditarPerfil() {
		return "usuario/editar-perfil";
	}



}
