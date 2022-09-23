package br.com.senac.service;

import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.entity.Aluno;
import br.com.senac.repository.AlunoRepository;

@Service
public class AlunoService{
	@Autowired
	AlunoRepository repo;
	public List<Aluno> selectAll(){
		return repo.findAll();
	}
	
	public Aluno insert(Aluno aluno) {
		return repo.save(aluno);
	}
	
	public Aluno select(Integer id) throws ObjectNotFoundException{
		return repo.findById(id).get();
		//java.util.Optional<Aluno> aluno = repo.findById(id);
		//return aluno.orElseThrow(() -> new ObjectNotFoundException(1L, "Aluno não encontrado"));
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	public void update(Aluno alunoAlterado) {
		Aluno aluno = select(alunoAlterado.getId());
		aluno.setNome(alunoAlterado.getNome());
		insert(alunoAlterado);
	}

	public Aluno salvarAlteraçao(Aluno alunoAlterado) {
		Aluno aluno = select(alunoAlterado.getId());
		aluno.setNome(alunoAlterado.getNome());
		return repo.save(aluno);
	}
}
