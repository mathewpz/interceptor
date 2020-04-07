package br.usjt.hellospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.hellospringboot.model.Clima;
import br.usjt.hellospringboot.repository.ClimasRepository;
import br.usjt.hellospringboot.service.ClimasService;

@Controller
public class ClimasController {
	//@Autowired
	//private ClimasRepository climasRepo;
	@Autowired
	private ClimasService service;

	@GetMapping("/previsao")
	public ModelAndView listarClimas() {
		ModelAndView mv = new ModelAndView("previsao_do_tempo");
		List<Clima> climas = service.ListarTodos();
		mv.addObject("climas", climas);
		mv.addObject(new Clima());
		return mv;
	}
}