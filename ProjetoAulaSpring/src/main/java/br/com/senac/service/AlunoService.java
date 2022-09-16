package br.com.senac.service;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.senac.entity.Aluno;
import br.com.senac.repository.AlunoRepository;

import java.util.List;
import java.util.Optional;
@Service
public class AlunoService {
	@Autowired
	AlunoRepository repo;
	
	public List <Aluno> buscarTodosAlunos(){
		return repo.findAll();
	}
	
	public Aluno salvar(Aluno aluno) {
		return repo.save(aluno);
	}
	
	public Aluno buscarPorId(Integer Id) throws ObjectNotFoundException {
		Optional<Aluno> aluno = repo.findById(Id);
		return aluno.orElseThrow(() -> new ObjectNotFoundException(1L, "Aluno não encontrado"));
	}
		
	public void deletar(Integer Id) {
			repo.deleteById(Id);
	}
}
