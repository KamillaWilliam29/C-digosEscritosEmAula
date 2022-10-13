package br.com.senac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.entity.Turma;
import br.com.senac.service.CursoService;
import br.com.senac.service.TurmaService;

@Controller
@RequestMapping("turma")
public class TurmaController {
	@Autowired
	private TurmaService turmaService;
	@Autowired
	private CursoService cursoService;
	
	@GetMapping("/listarTurmas")
	public ModelAndView listaTodasTurmas() {
		ModelAndView mv = new ModelAndView("turma/paginaListaTurmas");
		mv.addObject("turma", turmaService.selectAll());
		return mv;
	}

	@GetMapping("/cadastrarTurmas")
	public ModelAndView cadastrarCurso() {
		ModelAndView mv = new ModelAndView("turma/cadastrarTurmas");
		 mv.addObject("turma", new Turma());
		 mv.addObject("listaCursos", cursoService.selectAll());
		 return mv;
	}
	
	@PostMapping("/salvar")
	public ModelAndView salvarCurso(Turma turma) {
		turmaService.insert(turma);
		return listaTodasTurmas();
	}
	@GetMapping("/excluir/{id}")
	public ModelAndView excluirTurma(@PathVariable("id") Integer id) {
		turmaService.delete(id);
		return listaTodasTurmas();
	}
	
	@GetMapping("/paginaAlterar/{id}")
	public ModelAndView alterarTurma(@PathVariable ("id")Integer id) {
		ModelAndView mv = new ModelAndView("turma/alterarTurma");
		mv.addObject("turma", turmaService.select(id));
		return mv;
		
	}
	
	@PostMapping("/salvarAlteraçao")
	public ModelAndView alterar(Turma turmaAlterada) {
		turmaService.salvarAlteraçao(turmaAlterada);
		return listaTodasTurmas();	
	}
	
}
