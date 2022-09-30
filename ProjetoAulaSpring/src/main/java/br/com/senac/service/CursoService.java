package br.com.senac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.entity.Curso;
import br.com.senac.repository.CursoRepository;

@Service
public class CursoService {
	@Autowired
	CursoRepository repo;
	public List<Curso> selectAll(){
		return repo.findAll();
	}
	
	public Curso insert(Curso curso) {
		return repo.save(curso);
	}
	
	public Curso select(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	public void update(Curso cursoAlterado) {
		Curso curso = select(cursoAlterado.getId());
		curso.setDescricao(cursoAlterado.getDescricao());
		insert(curso);
	}
	public Curso salvarAlteraçao(Curso cursoAlterado) {
		Curso curso = select(cursoAlterado.getId());
		curso.setDescricao(cursoAlterado.getDescricao());
		curso.setProfessor(cursoAlterado.getProfessor());
		return repo.save(curso);
	}
}
