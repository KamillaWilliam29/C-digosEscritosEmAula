package br.com.senac.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.senac.entity.Aluno;
import br.com.senac.entity.Endereço;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

//	@Query("SELECT DISTINCT e FROM ENDEREÇO e"
//			+ " JOIN FETCH e.alunos a"
//			+ " WHERE a.endereço.id = ?1")
	Aluno findByNome(String nome);
	
	@Query(value = "SELECT DISTINCT a FROM Aluno a JOIN FETCH a.endereços b")
	List <Aluno> buscarAlunoComEndereço();
	
	@Query(value = "SELECT DISTINCT a FROM ALUNO a JOIN FETCH a.endereços b WHERE a.nome = ?1")
	List <Aluno> buscaAlunoPeloNome(String nome);
}