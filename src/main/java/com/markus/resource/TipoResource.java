package com.markus.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.markus.model.Tipo;
import com.markus.service.TipoService;

@RestController
@RequestMapping(value="/tipores")
public class TipoResource {

	@Autowired
	private TipoService service;
	
	@RequestMapping(value="/{id_tp}", method=RequestMethod.GET)
	public ResponseEntity<?> buscarPorId(@PathVariable Long id_tp) {
		Tipo tipo = service.buscaPorId(id_tp);
		return ResponseEntity.ok().body(tipo);
	}
}