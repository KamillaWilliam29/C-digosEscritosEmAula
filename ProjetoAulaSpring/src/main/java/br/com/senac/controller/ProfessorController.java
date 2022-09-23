package br.com.senac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.entity.Professor;
import br.com.senac.service.ProfessorService;

@Controller
@RequestMapping("professor")
public class ProfessorController {
	@Autowired
	private ProfessorService professorService;
	
	@GetMapping("/listarProfessores")
	public ModelAndView listaTodosProfessores() {
		ModelAndView mv = new ModelAndView("professor/paginaListaProfessores");
		mv.addObject("professor", professorService.selectAll());
		return mv;
	}
	
	@GetMapping("/cadastrarProfessor")
	public ModelAndView cadastrarProfessor() {
		ModelAndView mv = new ModelAndView("professor/cadastrarProfessor");
		 mv.addObject("professor", new Professor());
		 return mv;
	}
	
	@PostMapping("/salvar")
	public ModelAndView salvarProfessor(Professor professor) {
		professorService.insert(professor);
		return listaTodosProfessores();
	}
	
	@GetMapping("/excluir/{id}")
	public ModelAndView excluirProfessor(@PathVariable("id") Integer id) {
		professorService.delete(id);
		return listaTodosProfessores();
	}
	
	@GetMapping("/paginaAlterar/{id}")
	public ModelAndView alterarProfessor(@PathVariable ("id")Integer id) {
		ModelAndView mv = new ModelAndView("professor/alterarProfessor");
		mv.addObject("professor", professorService.select(id));
		return mv;
		
	}
	
	@PostMapping("/salvarAlteraçao")
	public ModelAndView alterar(Professor profAlterado) {
		professorService.salvarAlteraçao(profAlterado);
		return listaTodosProfessores();	
	}
	
}
