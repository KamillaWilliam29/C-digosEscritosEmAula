package br.com.senac.inicializacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.senac.entity.Aluno;
import br.com.senac.service.AlunoService;

@Component
public class InitALuno implements ApplicationListener<ContextRefreshedEvent> {

		@Autowired
		AlunoService alunoService;
		
		//AlunoRepository repo;
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Lucas");
		aluno1.setCurso("ADS");
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Arthur");
		aluno2.setCurso("Hotelaria");
		Aluno aluno3 = new Aluno();
		aluno3.setNome("José");
		aluno3.setCurso("Logística");
		alunoService.salvar(aluno1);
		alunoService.salvar(aluno2);
		alunoService.salvar(aluno3);
		
		alunoService.buscarPorId(1);
		
		Aluno aluno4 = alunoService.buscarPorId(1);

		System.out.println(aluno4.getNome());
		
		
		alunoService.deletar(3);
		
		Aluno alunoAlterado = new Aluno();
		alunoAlterado.setId(1);
		alunoAlterado.setNome("Lucas Silva");
		
		alunoService.Alterar(alunoAlterado);
		
		Aluno alunoAlterado2 = new Aluno();
		alunoAlterado2.setId(2);
		alunoAlterado2.setNome("Arthur da Rocha");
		
		alunoService.Alterar(alunoAlterado2);
		//List<Aluno> listaAlunos = alunoService.buscarTodosAlunos();
		//for(Aluno aluno:listaAlunos) {
		//System.out.println(aluno.getNome());
		}
	
		//repo.saveALll(Arrays.asLIst(aluno1, aluno2, aluno3));
	}
	

