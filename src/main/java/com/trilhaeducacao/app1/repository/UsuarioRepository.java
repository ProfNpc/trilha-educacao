package com.trilhaeducacao.app1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trilhaeducacao.app1.model.Usuario;

// aqui precisamos passar nosso objeto aula e o tipo de identificador dele
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	// aqui ja retorna todos os atributos da tabela nome
	public List<Usuario> findByNomeContainingIgnoreCase(String nome); // responsavel por fazer o selct no banco, onde vai conter o upper, o link etc
}
