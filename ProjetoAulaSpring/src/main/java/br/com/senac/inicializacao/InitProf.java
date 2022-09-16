package br.com.senac.inicializacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.senac.entity.Professor;
import br.com.senac.service.ProfessorService;

@Component
public class InitProf implements ApplicationListener <ContextRefreshedEvent>{
	
	@Autowired
	ProfessorService service;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Professor prof1 = new Professor();
		prof1.setNome("Johnny Tafur");
		Professor prof2 = new Professor();
		prof2.setNome("Renato Teixeira");
		Professor prof3 = new Professor();
		prof3.setNome("Manuel Alexandre");
		service.salvar(prof1);
		service.salvar(prof2);
		service.salvar(prof3);
	}
}
