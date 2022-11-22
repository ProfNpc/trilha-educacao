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

import repository.ConteudoRepository;


import com.trilhaeducacao.app1.model.Conteudo;




@Controller
public class ConteudoController {
	
	
	@Autowired
	private ConteudoRepository repository;
	
	private static List<Conteudo> listaConteudo = new ArrayList<Conteudo>();

	private static int next = 1;
	
	static {
		listaConteudo.add(new Conteudo(next++, "portugues", 2, "Kaique"));
		listaConteudo.add(new Conteudo(next++, "matematica", 3, "Gabriel"));
	}
	
	@GetMapping("/usuario/list")
	public String list(Model model) {
		
		//model.addAttribute("produtos", listaProdutos);
		model.addAttribute("nome", repository.findAll());
		
		return "conteudo/conteudo-list";
	}
	
	@GetMapping("/conteudo/{id}")
	public String detalhe(
			@PathVariable("id") int id,
			Model model) {
		
		//Produto p = buscarProdutoPeloId(id);
		Conteudo p = repository.findById(id);
	
		if (p == null) {
			return "usuario-nao-encontrado";
		}
		
		model.addAttribute("produto", p);
		
		return "conteudo-detalhe";
	}

	private Conteudo buscarConteudoPeloId(int id) {
		for (Conteudo p : listaConteudo) {
			if (p.getId() == id) {
				return p;
			}
		}
		return null;
	}


	@GetMapping("/conteudo/novo")
	public String novo(Model model) {
		model.addAttribute("conteudo", new Conteudo());
		return "usuario/usuario-form-cadastro";
	}
	
	@PostMapping("/conteudo/novo")
	public ModelAndView novo(Conteudo conteudo) {
		
		ModelAndView mv = 
				new ModelAndView("redirect:/conteudo/conteudo-list");
	
		if (conteudo.getId() == null) {
			
			//prod.setId(next++);
			//listaProdutos.add(prod);
			repository.save(conteudo);
			
		} else {
			
			//updateProduto(prod);
			repository.save(conteudo);
		}
		
		return mv;
	}

	private void updateConteudo(Conteudo conteudo) {
		ListIterator<Conteudo> i = listaConteudo.listIterator();
		while(i.hasNext()) {
			Conteudo atual = i.next(); 
			if (atual.getId() == conteudo.getId()) {
				i.set(conteudo);
			}
		}
	}

	
	@GetMapping("/conteudo/{id}/edit")
	public String edit(
			@PathVariable("id") int id, Model model) {
		
		//Produto p = buscarProdutoPeloId(id);
		Conteudo p = repository.findById(id);
		
		if (p == null) {
			return "conteudo/conteudo-nao-encontrado";
		}
		
		model.addAttribute("conteudo", p);
		return "conteudo/conteudo-form-cadastro";
	}
 
}