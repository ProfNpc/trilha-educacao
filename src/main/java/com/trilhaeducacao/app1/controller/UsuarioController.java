package com.trilhaeducacao.app1.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import repository.UsuarioRepository;
import com.trilhaeducacao.app1.model.Usuario;



@Controller
public class UsuarioController {
	
	
	@Autowired
	private UsuarioRepository repository;
	
	private static List<Usuario> listaUsuarios = new ArrayList<Usuario>();

	private static int next = 1;
	
	static {
		listaUsuarios.add(new Usuario(next++, "Kaique", "Oliveira", 943956472));
		listaUsuarios.add(new Usuario(next++, "Leandro", "Moraes", 987986798));
	}
	
	@GetMapping("/usuario/list")
	public String list(Model model) {
		
		//model.addAttribute("produtos", listaProdutos);
		model.addAttribute("nome", repository.findAll());
		
		return "usuario/usuario-list";
	}
	
	@GetMapping("/usuario/{id}")
	public String detalhe(
			@PathVariable("id") int id,
			Model model) {
		
		//Produto p = buscarProdutoPeloId(id);
		Usuario p = repository.findById(id);
	
		if (p == null) {
			return "usuario-nao-encontrado";
		}
		
		model.addAttribute("produto", p);
		
		return "usuario-detalhe";
	}

	private Usuario buscarProdutoPeloId(int id) {
		for (Usuario p : listaUsuarios) {
			if (p.getId() == id) {
				return p;
			}
		}
		return null;
	}


	@GetMapping("/usuario/novo")
	public String novo(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "usuario/usuario-form-cadastro";
	}
	
	@PostMapping("/usuario/novo")
	public ModelAndView novo(Usuario usuario) {
		
		ModelAndView mv = 
				new ModelAndView("redirect:/usuario/usuario-list");
	
		if (usuario.getId() == null) {
			
			//prod.setId(next++);
			//listaProdutos.add(prod);
			repository.save(usuario);
			
		} else {
			
			//updateProduto(prod);
			repository.save(usuario);
		}
		
		return mv;
	}

	private void updateUsuario(Usuario usuario) {
		ListIterator<Usuario> i = listaUsuarios.listIterator();
		while(i.hasNext()) {
			Usuario atual = i.next(); 
			if (atual.getId() == usuario.getId()) {
				i.set(usuario);
			}
		}
	}

	
	@GetMapping("/produto/{id}/edit")
	public String edit(
			@PathVariable("id") int id, Model model) {
		
		//Produto p = buscarProdutoPeloId(id);
		Usuario p = repository.findById(id);
		
		if (p == null) {
			return "usuario/usuario-nao-encontrado";
		}
		
		model.addAttribute("produto", p);
		return "usuario/usuario-form-cadastro";
	}
 
}