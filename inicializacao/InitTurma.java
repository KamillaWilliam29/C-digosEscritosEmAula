package br.com.senac.inicializacao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.senac.entity.Turma;
import br.com.senac.service.TurmaSevice;

@Component
public class InitTurma implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	TurmaSevice service;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		
		Turma turma1 = new Turma();
		turma1.setProfessor("Clayton");
		turma1.setSala("306");
		Turma turma2 =  new Turma();
		turma2.setProfessor("Fernando");
		turma2.setSala("604");
		Turma turma3 = new Turma();
		turma3.setProfessor("Manuel Alexandre");
		turma3.setSala("503");
	}

}
