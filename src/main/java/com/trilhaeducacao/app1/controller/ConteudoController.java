package com.trilhaeducacao.app1.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.trilhaeducacao.app1.model.Conteudo;

@Controller
public class ConteudoController {

	@GetMapping("/conteudo/lista")
	public String ConteudoCadastro(Model model) {
		//armazenando a class Conteudo dentro de uma variavel local com as informações contidas dentro do nidek conteudo
		
		Conteudo conteudo = new Conteudo();
		// adicionando valores aos atributos que criamso em Conteudo de model
		
		
		conteudo.setNomeConteudo("Exercicio de portugues");// estamos alterando o valor dos atributos adicionados em model, com setNomeDoAtributo
		conteudo.setMateriaConteudo("Portugues");// pra isso que são criados os métodos setters
		conteudo.setNivelConteudo("Médio");
		conteudo.setTipoExercicioConteudo("Questionario");
		conteudo.setEnderedecoImagemConteudo("https://m.media-amazon.com/images/I/71B1wzw1LkL._AC_SX569_.jpg");
		conteudo.setDescricaoConteudo("Uma descriçao");
		
	//tudo isso que foi feito será transformado em uma lista:
		
		//todos os atributos que o conteudo possui podeão ser acessados na view atraves da variavel que esta armazenando a lista que contem as informações do conteudo.
		
		// podemos criar varios conteudos pois a variavel esta armazenando a lista com todos os atributos adicionados
		List <Conteudo>conteudos = Arrays.asList(conteudo, conteudo); // armazenamos nossa lista dentro de uma variavel pra facilitar o acesso das informações na view
		// e precimaos adicionar tudo isso no model pra visualizar la nossa view
		model.addAttribute("conteudos", conteudos);// e por fim armazenamos a lista que contem os atributos do conteudo, dentro da variavel criada q armazena a lista, assim como fizemos no exemplo.
		
		
		
		return "conteudo/conteudo-list";
	}
}
