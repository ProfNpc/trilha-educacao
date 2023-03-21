package com.trilhaeducacao.app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trilhaeducacao.app1.model.Solicitacao;



public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long> {

}
