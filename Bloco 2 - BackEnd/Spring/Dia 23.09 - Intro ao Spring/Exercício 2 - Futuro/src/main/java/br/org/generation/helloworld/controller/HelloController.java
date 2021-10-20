package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Essa semana, pretendo manter meu foco, visto que o conteúdo parece ser complexo, "
				+ "mantendo minha persistencia e atenção para aprender o máximo possível.";
	}
}
