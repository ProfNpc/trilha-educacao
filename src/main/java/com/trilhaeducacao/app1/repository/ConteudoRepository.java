package com.trilhaeducacao.app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trilhaeducacao.app1.model.Conteudo;


public interface ConteudoRepository extends JpaRepository<Conteudo, Long> {

}
