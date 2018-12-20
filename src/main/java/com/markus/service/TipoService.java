package com.markus.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markus.model.Tipo;
import com.markus.repository.TipoRepository;
import com.markus.service.excepetions.ObjectNotFoundException;

@Service
public class TipoService {

	@Autowired
	private TipoRepository repositorio;
	
	public Tipo buscaPorId(Long id_tp) {
		Optional<Tipo> obj = repositorio.findById(id_tp);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Tipo com ID: " + id_tp + "não encontrado"));
	}
}