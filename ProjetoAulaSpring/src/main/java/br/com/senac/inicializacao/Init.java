package br.com.senac.initialization;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.senac.entity.Aluno;
import br.com.senac.entity.Curso;
import br.com.senac.entity.Professor;
import br.com.senac.entity.Turma;
import br.com.senac.repository.AlunoRepository;
import br.com.senac.repository.CursoRepository;
import br.com.senac.repository.ProfessorRepository;
import br.com.senac.repository.TurmaRepository;
//import br.com.senac.repository.AlunoRepository;
import br.com.senac.service.AlunoService;
import br.com.senac.service.CursoService;
import br.com.senac.service.ProfessorService;
import br.com.senac.service.TurmaService;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent>{
	@Autowired
	AlunoService alunoService;
	@Autowired
	ProfessorService professorService;
	@Autowired
	CursoService cursoService;
	@Autowired
	TurmaService turmaService;
	
	@Autowired
	AlunoRepository alunoRepo;
	
	@Autowired
	ProfessorRepository ProfessorRepo;
	
	@Autowired
	CursoRepository CursoRepo;

	@Autowired
	TurmaRepository TurmaRepo;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {


		Curso c1 = new Curso();
		c1.setDescricao("Java");
		cursoService.insert(c1);
//		
		Curso c2 = new Curso();
		c2.setDescricao("NodeJS");
		cursoService.insert(c2);
		
		Curso c3 = new Curso();
		c3.setDescricao("Python");
		cursoService.insert(c3);
		
		Curso c4 = new Curso();
		c4.setDescricao("Javascript");
//		
		cursoService.insert(c4);
		
		List <Curso> ListaDeCursos1 = new ArrayList();
		ListaDeCursos1.add(c1);
		ListaDeCursos1.add(c4);
		
		List <Curso> ListaDeCursos2 = new ArrayList();
		ListaDeCursos2.add(c2);
		ListaDeCursos2.add(c3);
		
		List <Curso> ListaDeCursos3 = new ArrayList();
		ListaDeCursos3.add(c1);
		ListaDeCursos3.add(c3);
		
		Turma turma1 = new Turma();
		turma1.setNome("ADS2021.1");
		turma1.setCursos(ListaDeCursos1);
		
		Turma turma2 = new Turma();
		turma2.setNome("ADS2021.2");
		turma2.setCursos(ListaDeCursos2);
		
		Turma turma3 = new Turma();
		turma3.setNome("Hotelaria2022.1N");
		turma3.setCursos(ListaDeCursos3);
		
		//outra opção de inserir turmas
		
		//turmaService.insert(turma1);
		//turmaService.insert(turma2);
		//turmaService.insert(turma3);
		
		TurmaRepo.saveAll(Arrays.asList(turma1,turma2,turma3));
		
//		List<Turma> listaTurmas = turmaService.selectAll();
//		for(Turma turma: listaTurmas) {
//			System.out.println(turma.getNome());
//		}
//		
//		System.out.println("-----------------------------");
//		
//		System.out.println(turmaService.select(1).getNome());
//		
//		System.out.println("-----------------------------");
//		
//		turmaService.delete(1);
//		
//		listaTurmas = turmaService.selectAll();
//		for(Turma turma: listaTurmas) {
//			System.out.println(turma.getNome());
//		}
//		
//		System.out.println("-----------------------------");
//		
//		Turma turmaAlterada = turma2;
//		turmaAlterada.setNome("ADS2022.2");
//		
//		turmaService.update(turmaAlterada);
//		
//		System.out.println(turmaService.select(turmaAlterada.getId()).getNome());
		
		System.out.println("-----------------------------");	
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Rogerio");
		aluno1.setTurma(turma1);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alfredo");
		aluno2.setTurma(turma2);
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Juleide");
		aluno3.setTurma(turma3);
		
		//alunoService.insert(aluno1);
		//alunoService.insert(aluno2);
		//alunoService.insert(aluno3);
		
		alunoRepo.saveAll(Arrays.asList(aluno1, aluno2, aluno3));
		
		System.out.println("-----------------------------");
		
//		List<Aluno> listaAlunos = alunoService.selectAll();
//		for(Aluno aluno: listaAlunos) {
//			System.out.println(aluno.getNome());
//		}
//		
//		System.out.println("-----------------------------");
//		
//		System.out.println(alunoService.select(2).getNome());
//		
//		System.out.println("-----------------------------");
//		
//		//alunoService.delete(2);
//		
//		listaAlunos = alunoService.selectAll();
//		for(Aluno aluno: listaAlunos) {
//			System.out.println(aluno.getNome());
//		}
//		
//		System.out.println("-----------------------------");
//		
//		Aluno alunoAlterado = aluno1;
//		alunoAlterado.setNome("Rogerio Gerundes");
//		alunoService.update(alunoAlterado);
//		
//		System.out.println(alunoService.select(alunoAlterado.getId()).getNome());
//		
//		System.out.println("-----------------------------");
//		System.out.println("-----------------------------");
//		System.out.println("-----------------------------");
		
		
		Professor p1= new Professor();
		p1.setNome("Marcelo Estruc");
		

		Professor p2= new Professor();
		p2.setNome("Clayton Chagas");
		
		Professor p3= new Professor();
		p3.setNome("Gustavo Araújo");
	
		ProfessorRepo.saveAll(Arrays.asList(p1,p2,p3));
	}
}
