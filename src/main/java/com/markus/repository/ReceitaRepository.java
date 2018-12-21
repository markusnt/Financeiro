package com.markus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.markus.model.Receita;;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {
//	List<Receita> findByDescricaoLike(String descricao);
}
