package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/ObjSemana")

public class ObjSemanaController {

		@GetMapping
		
		public String ObjSemana() { 
			return "Meus objetivos de aprendizagem para a semana, serão:\n"
				   +"Aprender mais sobre SpringBoot;\n "
				   +"Estudar mais sobre Banco de dados;\n "
				   +"Tentar aprender alguma linguagem nova, para aprimorar minhas skills.";

		}
}