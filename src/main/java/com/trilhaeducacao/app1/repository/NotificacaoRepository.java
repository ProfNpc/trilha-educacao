package com.trilhaeducacao.app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trilhaeducacao.app1.model.Notificacao;

public interface NotificacaoRepository extends JpaRepository<Notificacao, Long> {

}
