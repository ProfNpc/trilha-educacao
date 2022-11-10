package com.trilhaeducacao.app1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@SpringBootApplication
public class TrilhaAplication {

	public static void main(String[] args) {
		
	}
	 @GetMapping("/cadastro")
	 
	    public ModelAndView getList() {
	        
	        ModelAndView mv = new ModelAndView("cadastro");
	        return mv;
	    }
	
	}

