package br.org.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{

}
