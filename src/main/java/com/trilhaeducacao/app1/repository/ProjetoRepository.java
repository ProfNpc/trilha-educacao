package com.trilhaeducacao.app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trilhaeducacao.app1.model.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

}
