package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Durante esta atividades, eu utilizei as seguintes habilidades e mentalidades:\n"
				+ "- Persistência\n-Atenção aos Detalhes";
	}
}
