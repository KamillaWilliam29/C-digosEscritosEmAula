
package br.com.senac.inicializacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.senac.entity.Curso;
import br.com.senac.service.CursoService;

@Component

public class InitCurso implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	CursoService cursoService;
	
	//AlunoRepository repo;
@Override
public void onApplicationEvent(ContextRefreshedEvent event) {
	// TODO Auto-generated method stub
	
	Curso curso1 = new Curso();
	curso1.setNome("ADS");
	curso1.setTurma("2021.1n");
	Curso curso2 = new Curso();
	curso2.setNome("Hotelaria");
	curso2.setTurma("2019.2n");
	Curso curso3 = new Curso();
	curso3.setNome("Logística");
	curso3.setTurma("2022.1n");
	cursoService.salvar(curso1);
	cursoService.salvar(curso2);
	cursoService.salvar(curso3);
	
	}
}
