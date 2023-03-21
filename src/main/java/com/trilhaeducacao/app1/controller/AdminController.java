package com.trilhaeducacao.app1.controller;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trilhaeducacao.app1.model.Admin;
import com.trilhaeducacao.app1.repository.AdminRepository;
import com.trilhaeducacao.app1.service.ServiceAdmin;
import com.trilhaeducacao.app1.service.ServiceExc;
import com.trilhaeducacao.app1.util.Util;

@Controller
public class AdminController {
	
	@Autowired // adicionando a injeção de dependencias no repositorio q guarda as informações do admin
	private AdminRepository adminRepositorio;
	
	//chamando o admin service pra fazer a injeção de dependencia
	@Autowired
	private ServiceAdmin serviceAdmin;
	
	@GetMapping("/admin/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
			mv.setViewName("admin/admin-login");
			mv.addObject("admin", new Admin());
			return mv;
		}
	
	
	@GetMapping("/admin/dashboard")
	public ModelAndView DashBoardAdmin () {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/HomeAdmin");
		mv.addObject("admin", new Admin());
		return mv;
	}
	
	@GetMapping("/cadastro")
	public ModelAndView Cadastrar() {
		ModelAndView mv = new ModelAndView();
			mv.addObject("admin", new Admin());
			mv.setViewName("admin/admin-cadastro");
			return mv;
		}
	
	@GetMapping("/admin/listagem")
	public ModelAndView listagemUsuarios() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/admin-list");
		mv.addObject("adminList", adminRepositorio.findAll()); // o find all é responsavel por listar todos os
																	// dados q tem no banco
		return mv;
	}
	
	@GetMapping("/admin/excluir/{id}")
	public String excluirAdmin(@PathVariable("id") Long id) {
		adminRepositorio.deleteById(id); // dessa vez usamos o metodo de delete ao inves de save, dessa maneira ele
											// irá deletar o usuario buscando pelo seu id
		return "redirect:/admin/listagem";
	}
	
	@PostMapping("salvarAdmin")
	public ModelAndView Cadastrar(Admin admin) throws Exception {
		ModelAndView mv = new ModelAndView();
		// e chamaos aqui o admin repositorio pra salvar as informações colocadas no formulario
		serviceAdmin.salvarAdmin(admin); // e por fim dizemos q queremos salver o admin
		mv.setViewName("redirect:/admin/login");
		return mv;
	}
	
	// Método de login
	
	@PostMapping("/admin/login")
	public ModelAndView login(Admin admin, HttpSession session) throws NoSuchAlgorithmException, ServiceExc{
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("admin", new Admin());
		// verificacao se ha algum erro nos campos
	
		
		// vamos comparar se oq o admin digitiou ja tem la no banco
		Admin adminLogin = serviceAdmin.loginAdmin(admin.getNome(), Util.md5(admin.getSenha())); // usamos o md5 na hora de pegar senha pois ela ja criptografa a senha digitada
	
		if(adminLogin == null) {
			mv.addObject("msg", "Admin não encontrado. Tente novamente.");
			mv.setViewName("admin/admin-login");
		}else {
			
			session.setAttribute ("adminLogado", adminLogin);
			// sempre q retornarmos metodos é importante colocar os parenteses no final
			return DashBoardAdmin();
		}
		
		return mv;
	}
	
	@PostMapping("/admin/logout")
	public ModelAndView adminLogout(HttpSession session) {
		
		session.invalidate();
		return login();
		
	}


}
