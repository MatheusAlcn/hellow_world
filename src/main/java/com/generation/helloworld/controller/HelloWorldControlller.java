package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloWorldControlller {

	@GetMapping
	public String ola() {
		return "Olá mundo! Bom dia!!!";
	}
	
	@GetMapping("/bsms")
	public String bsm() {
		return "Reposabildade Pessoal \n Mentalidade de Crescimento \n Orientação ao Futuro \n Persistência"
				+ "Trabalho em Equipe \n Proatividade \n Comunicação \n Orientação ao Detalhe";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Aprender Spring Boot \n Praticar APIs \n Estudar sobre segurança em APIs \n Implementar testes automatizados";
	}
}
