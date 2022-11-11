package br.com.senac.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.senac.entity.Aluno;
import br.com.senac.entity.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer>{
	
	@Query("SELECT DISTINCT p FROM Professor p JOIN FETCH p.livros l")
	List <Professor> buscaLivroPeloNome(String nome);
}
