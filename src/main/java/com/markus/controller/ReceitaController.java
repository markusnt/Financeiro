package com.markus.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.markus.model.Receita;
import com.markus.repository.ReceitaRepository;
import com.markus.repository.TipoRepository;

@Controller
@RequestMapping("/receitas")
public class ReceitaController {

	@Autowired
	private ReceitaRepository receitasRep;
	private TipoRepository tiposRep;
	
	public ReceitaController(ReceitaRepository receitas, TipoRepository tipos) {
		this.receitasRep = receitas;
		this.tiposRep = tipos;
	}
	
//	@GetMapping
//	public String list(Model model) {
//		model.addAttribute("receita", new Receita());
//		model.addAttribute("receitas", receitasRep.findAll());
//		return "/listar";
//	}
//	
//	@GetMapping("/editar")
//	public String editar(Model model, @RequestParam Long id) {
//		model.addAttribute("receita", receitasRep.findById(id));
//		model.addAttribute("tipos", tiposRep.findAll());
//		return "/editar";
//	}
//	
//	@GetMapping("/novo")
//	public String novo(Model model) {
//		model.addAttribute("receita", new Receita());
//		model.addAttribute("tipos", tiposRep.findAll());
//		return "/novo";
//	}
//	
//	@PostMapping("/salvar")
//	public String salvar(@Valid Receita receita, BindingResult bindingResult, Model model) {
//		if(bindingResult.hasErrors()) {
//			model.addAttribute("tipos", tiposRep.findAll());
//			return "/novo";
//		}
//		receitasRep.save(receita);
//		return "/listar";
//	}
//	
//	@GetMapping("/excluir")
//	public String excluir(Model model, @RequestParam Long id) {
//		receitasRep.deleteById(id);
//		return "redirect:/";
//	}
	
//	@GetMapping("/buscar")
//	public String buscar(Model model, @RequestParam String nome) {
//		model.addAttribute("receita", new Receita());
//		model.addAttribute("receitas", receitasRep.findByDescricaoLike(descricao));
//		return "/lista";
//	}
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaReceitas");
		modelAndView.addObject("receitas", receitasRep.findAll());
		modelAndView.addObject(new Receita());
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(Receita receita ) {
		this.receitasRep.save(receita);
		return "redirect:/receitas";
	}
	
	@GetMapping("{id}")
	public ModelAndView editar(@PathVariable("id") Receita receita, @RequestParam Long id) {
		ModelAndView modelAndView = new ModelAndView("ListaReceitas");
		modelAndView.addObject("receitas", receitasRep.findById(id));
		modelAndView.addObject("tipos", tiposRep.findAll());
		modelAndView.addObject("receita", receita);
		return modelAndView;
	}
	
	@GetMapping("remover/{id}")
	public ModelAndView remover(@PathVariable("id") Long id) {
		this.receitas.deleteById(id);
		ModelAndView modelAndView = new ModelAndView("ListaReceitas");
		modelAndView.addObject("receitas", receitasRep.findAll());
		modelAndView.addObject(new Receita());
		modelAndView.addObject("globalMessage", "Receita removida");
		return modelAndView;
	}
}
