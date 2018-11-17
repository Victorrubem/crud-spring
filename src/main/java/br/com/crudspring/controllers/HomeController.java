package br.com.crudspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("ola_mundo")
	public String helloWordSpring() {

		return "olaMundo";
	}
}
