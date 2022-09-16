package br.com.senac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.entity.Turma;
import br.com.senac.service.TurmaService;

@Controller
@RequestMapping("turma")
public class TurmaController {
	@Autowired
	private TurmaService turmaService;
	
	@GetMapping("/listarTurmas")
	public ModelAndView listaTodasTurmas() {
		ModelAndView mv = new ModelAndView("turma/paginaListaTurmas");
		mv.addObject("turma", turmaService.selectAll());
		return mv;
	}

	@GetMapping("/cadastrarTurma")
	public ModelAndView cadastrarCurso() {
		ModelAndView mv = new ModelAndView("turma/cadastrarTurma");
		 mv.addObject("turma", new Turma());
		 return mv;
	}
	
	@PostMapping("/salvar")
	public ModelAndView salvarCurso(Turma turma) {
		turmaService.insert(turma);
		return listaTodasTurmas();
	}

}
