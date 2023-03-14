package com.trilhaeducacao.app1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trilhaeducacao.app1.model.Admin;
import com.trilhaeducacao.app1.repository.AdminRepository;
import com.trilhaeducacao.app1.service.ServiceAdmin;

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
			return mv;
		}
	
	@GetMapping("/cadastro")
	public ModelAndView Cadastrar() {
		ModelAndView mv = new ModelAndView();
			mv.addObject("admin", new Admin());
			mv.setViewName("admin/admin-cadastro");
			return mv;
		}
	
	@PostMapping("salvarAdmin")
	public ModelAndView Cadastrar(Admin admin) throws Exception {
		ModelAndView mv = new ModelAndView();
		// e chamaos aqui o admin repositorio pra salvar as informações colocadas no formulario
		serviceAdmin.salvarAdmin(admin); // e por fim dizemos q queremos salver o admin
		mv.setViewName("redirect:/admin/login");
		return mv;
	}
	
	@GetMapping("/admin/dashboard")
	public String DashBoardAdmin () {
		return "admin/HomeAdmin";
	}

}
