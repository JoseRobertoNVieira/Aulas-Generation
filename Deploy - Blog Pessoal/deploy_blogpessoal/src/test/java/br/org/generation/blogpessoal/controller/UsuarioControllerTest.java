package br.org.generation.blogpessoal.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.org.generation.blogpessoal.model.Usuario;
import br.org.generation.blogpessoal.repository.UsuarioRepository;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsuarioControllerTest {
    
	@Autowired
	private TestRestTemplate testRestTemplate;
	
	private Usuario usuario;
	private Usuario usuarioAdmin;

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	public void start() {

		usuarioAdmin = new Usuario(0L, "Admin", "admin@admin.com", "admin");

		if(!usuarioRepository.findByUsuario(usuarioAdmin.getUsuario()).isPresent()) {

            HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuarioAdmin);
			testRestTemplate.exchange("/usuarios/cadastrar", HttpMethod.POST, request, Usuario.class);
			
		}
		
        usuario = new Usuario(0L, "Teste 1", "teste1@teste.com", "teste1senha");
        
	}

	@Test
	@Order(1)
    @DisplayName("Cadastrar Usuário")
	public void deveRealizarPostUsuario() {

		HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuario);

		ResponseEntity<Usuario> resposta = testRestTemplate
			.exchange("/usuarios/cadastrar", HttpMethod.POST, request, Usuario.class);
		
		assertEquals(HttpStatus.CREATED, resposta.getStatusCode());

	}
	
	@Test
	@Order(2)
    @DisplayName("Listar todos os usuários")
	public void deveMostrarTodosUsuarios() {
		
		ResponseEntity<String> resposta = testRestTemplate
			.withBasicAuth("admin@admin.com", "admin")
			.exchange("/usuarios/all", HttpMethod.GET, null, String.class);
		
		assertEquals(HttpStatus.OK, resposta.getStatusCode());

	}
	
}