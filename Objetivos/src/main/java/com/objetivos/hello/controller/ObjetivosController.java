package com.objetivos.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObjetivosController {
	
	@GetMapping ("/objetivos")
	public String objetivos() {
		return "O meu objetivo de aprendizagem dessa semana é entender o Spring e suas camadas"; 
		
	}

}
