package br.com.senac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.service.TurmaService;

@Controller
@RequestMapping("turma")
public class TurmaController {


	@Autowired
	private TurmaService service;
	
	@GetMapping("listarTurmas")
	public ModelAndView listarTodosTurmas() {
		ModelAndView mv = new ModelAndView("turma/paginaListaTurma");
		mv.addObject("turmas",service.buscarTodosTurmas());
		return mv;
	}
}
