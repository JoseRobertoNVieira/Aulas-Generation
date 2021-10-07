package br.org.generation.lojadegames.service;

import java.nio.charset.Charset;
import org.apache.commons.codec.binary.Base64;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.org.generation.lojadegames.model.Usuario;
import br.org.generation.lojadegames.model.UsuarioLogin;
import br.org.generation.lojadegames.repository.UsuarioRepository;

@Service
public class UsuarioService {

@Autowired
private UsuarioRepository repository;

public Usuario CadastrarUsuario(Usuario usuario) {
BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

String senhaEncoder = encoder.encode(usuario.getSenha());
usuario.setSenha(senhaEncoder);

return repository.save(usuario);
}

public Optional<UsuarioLogin> Logar(Optional<UsuarioLogin> user) {
BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
Optional<Usuario> usuario = repository.findByUsuario(user.get().getUsuario());

if(usuario.isPresent()) {
if(encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {

String auth = user.get().getUsuario() + ":" + user.get().getSenha();
byte[] encodeAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
String authHeader = "Basic " + new String(encodeAuth);

user.get().setId(usuario.get().getId());
user.get().setNome(usuario.get().getNome());
user.get().setSenha(usuario.get().getSenha());
user.get().setToken(authHeader);

return user;
}
}
return null;
}
}
