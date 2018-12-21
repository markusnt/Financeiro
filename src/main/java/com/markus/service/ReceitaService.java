package com.markus.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markus.model.Receita;
import com.markus.repository.ReceitaRepository;
import com.markus.service.excepetions.ObjectNotFoundException;;

@Service
public class ReceitaService {

	@Autowired
	private ReceitaRepository repositorio;
	
	public Receita buscarPorId(Long id) {
		Optional<Receita> obj = repositorio.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Receita com ID: " + id + "não encontrado"));
	}
}
