package com.zup.controleestoquehortifruti.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zup.controleestoquehortifruti.v1.entity.Lote;

@Repository
public interface LoteRepository extends JpaRepository<Lote, Integer> {

}