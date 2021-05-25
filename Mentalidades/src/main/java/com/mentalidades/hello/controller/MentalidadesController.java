package com.mentalidades.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MentalidadesController {

	@GetMapping("/ment")
	public String ment() {
		return "Mentalidade de persistência\nHabilidade de atenção aos detalhes";
	}
}
