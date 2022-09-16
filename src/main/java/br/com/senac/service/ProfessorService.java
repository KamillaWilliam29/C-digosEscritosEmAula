package br.com.senac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.entity.Professor;
import br.com.senac.repository.ProfessorRepository;

@Service
public class ProfessorService {
	@Autowired
	ProfessorRepository repo;
	public List<Professor> selectAll(){
		return repo.findAll();
	}
	 
	public Professor insert(Professor professor) {
		return repo.save(professor);
	 }
	 
	public Professor select(Integer id) {
		return repo.findById(id).get();
	}
	 
	public void delete(Integer id) {
		repo.deleteById(id);
	 }
	 
	public void update(Professor professorAlterado) {
		Professor professor = select(professorAlterado.getId());
		professor.setNome(professorAlterado.getNome());
		insert(professor);
	}
}
