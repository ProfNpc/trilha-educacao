package com.trilhaeducacao.app1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.trilhaeducacao.app1.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

	// metodo pra pegar a lista de emails cadastrados:
	// necessario fazer o mesmo pra buscar os tokens de acesso admin
	@Query("select i from Admin i where i.email = :email")
	public Admin findByEmail(String email); // esse metodo ja vai trazer uma lista dos emails dos admins

	@Query("select j from Admin j where j.nome = :nome and j.senha = :senha")
	public Admin buscarLogin(String nome, String senha);
}
