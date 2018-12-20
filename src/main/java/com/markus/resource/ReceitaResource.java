package com.markus.resource;
//package com.financa.resource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.financa.model.Receita;
//import com.financa.service.ReceitaService;
//
//@RestController
//@RequestMapping(value="/receitares")
//public class ReceitaResource {
//
//	@Autowired
//	private ReceitaService service;
//	
//	@RequestMapping(value="/{id}", method=RequestMethod.GET)
//	public ResponseEntity<?> buscarPorId(@PathVariable Long id){
//		Receita receita = service.buscarPorId(id);
//		return ResponseEntity.ok().body(receita);
//	}
//}
