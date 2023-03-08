package com.trilhaeducacao.app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trilhaeducacao.app1.model.Usuario;

// aqui precisamos passar nosso objeto aula e o tipo de identificador dele
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
