package com.markus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.markus.model.Tipo;
import com.markus.repository.TipoRepository;

@Controller
@RequestMapping("/tipos")
public class TipoController {
	
	@Autowired
	private TipoRepository tipos;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaTipos");
		modelAndView.addObject("tipos", tipos.findAll());
		modelAndView.addObject(new Tipo());
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(Tipo tipo) {
		this.tipos.save(tipo);
		return "redirect:/tipos";
	}
	
	@GetMapping("{id_tp}")
	public ModelAndView editar(@PathVariable("id_tp") Tipo tipo) {
		ModelAndView modelAndView = new ModelAndView("ListaTipos");
		modelAndView.addObject("tipos", tipos.findAll());
		modelAndView.addObject("tipo", tipo);
		return modelAndView;
	}
	
	@GetMapping("remover/{id_tp}")
	public ModelAndView remover(@PathVariable("id_tp") Long id_tp) {
		this.tipos.deleteById(id_tp);
		ModelAndView modelAndView = new ModelAndView("ListaTipos");
		modelAndView.addObject("tipos", tipos.findAll());
		modelAndView.addObject(new Tipo());
		modelAndView.addObject("globalMessage", "Tipo removido");
		return modelAndView;
	}

}
