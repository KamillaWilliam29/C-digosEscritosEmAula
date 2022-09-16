package br.com.senac.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.entity.Turma;

import br.com.senac.repository.TurmaRepository;

@Service
public class TurmaSevice {

	@Autowired
	TurmaRepository repo;
	
	public List<Turma> buscarTodasTurmas(){
		return repo.findAll();
	}
	
	public Turma salvar(Turma turma) {
		return repo.save(turma);
	}
	
	public Turma buscarPorId(Integer Id) throws ObjectNotFoundException {
		Optional <Turma> turma = repo.findById(Id);
		return turma.orElseThrow(() -> new ObjectNotFoundException(1L, "Turma não encontrada"));
	}
	
	public Turma Atualizar(Turma turmaAlterada) {
		Turma turma = buscarPorId(turmaAlterada.getId());
		turma.setProfessor(turmaAlterada.getProfessor());
		return repo.save(turma);
		
	}
	
	public void excluir(Integer Id) {
		 repo.deleteById(Id);
	}
}


