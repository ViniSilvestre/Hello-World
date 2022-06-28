package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/BSM")

public class BSMController {

	@GetMapping
	
	public String BSM() { 
		return  "A lista de BSM's da Tia Gen, são:\n"
				+"Atenção aos Detalhes;\n "
				+"Comunicação;\n "
				+"Mentalidade de Crescimento;\n "
				+"Orientação ao Futuro;\n " 
				+"Persistência;\n " 
				+"Proatividade;\n " 
				+"Responsabilidade Pessoal;\n "
			    +"Trabalho em Equipe.\n";
				
	}
	
}
