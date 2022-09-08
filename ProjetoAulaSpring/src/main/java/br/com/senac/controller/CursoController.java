package br.com.senac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.service.CursoService;

public class CursoController {
@Controller
@RequestMapping("curso")

	@Autowired
	private CursoService service;
	
	@GetMapping("listarCursos")
	public ModelAndView listarTodosCursos() {
		ModelAndView mv = new ModelAndView("curso/paginaListaCurso");
		mv.addObject("cursos",service.buscarTodosCursos());
		return mv;
	}
}
