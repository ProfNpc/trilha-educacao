package com.trilhaeducacao.app1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	
	@GetMapping("/admin/dashboard")
	public String DashBoardAdmin () {
		return "admin/HomeAdmin";
	}

}
