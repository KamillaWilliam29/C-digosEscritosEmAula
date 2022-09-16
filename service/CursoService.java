package br.com.senac.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.entity.Curso;
import br.com.senac.repository.CursoRepository2;

@Service
public class CursoService {

		@Autowired
		CursoRepository2 repo;
		
		public List<Curso> buscarTodosCursos(){
			return repo.findAll();
		}
		
		public Curso salvar(Curso curso) {
			return repo.save(curso);
		}
		
		public Curso buscarPorId(Integer Id) throws ObjectNotFoundException {
			Optional <Curso> curso = repo.findById(Id);
			return curso.orElseThrow(() -> new ObjectNotFoundException(1L, "Curso não encontrado"));
		}
		
		public Curso Atualizar(Curso cursoAlterado) {
			Curso curso = buscarPorId(cursoAlterado.getId());
			curso.setNome(cursoAlterado.getNome());
			return repo.save(curso);
			
		}
		
		public void excluir(Integer Id) {
			 repo.deleteById(Id);
		}
}
