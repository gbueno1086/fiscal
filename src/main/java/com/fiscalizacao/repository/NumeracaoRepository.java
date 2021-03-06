package com.fiscalizacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiscalizacao.models.Numeracao;

@Repository
public interface NumeracaoRepository extends JpaRepository<Numeracao, Integer>{

}
