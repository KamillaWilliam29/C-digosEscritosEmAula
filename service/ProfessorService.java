package br.com.senac.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.entity.Professor;

import br.com.senac.repository.ProfRepository;

@Service
public class ProfessorService {

	@Autowired
	ProfRepository repo;
	
	public List <Professor> buscarTodosProfessores(){
		return repo.findAll();
	}
	
	public Professor salvar(Professor professor) {
		return repo.save(professor);
	}
	
	public Professor buscarPorId(Integer Id) throws ObjectNotFoundException{
		Optional <Professor> professor = repo.findById(Id);
		return professor.orElseThrow(() -> new ObjectNotFoundException(1L, "Turma não encontrada"));
	}
	
	public Professor atualizar(Professor profAlterado) {
		Professor professor = buscarPorId(profAlterado.getId());
		professor.setNome(profAlterado.getNome());
		return repo.save(professor);
	}
	
	public void excluir(Integer Id) {
		repo.deleteById(Id);
	}
}
