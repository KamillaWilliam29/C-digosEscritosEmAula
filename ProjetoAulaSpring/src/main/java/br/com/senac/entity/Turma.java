package br.com.senac.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Turma implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2176084948229069376L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nome;
	
	
	@ManyToMany
	@JoinTable(
			name="turma_curso",
			joinColumns =  {@JoinColumn(name = "turma_id")},
			inverseJoinColumns = {@JoinColumn(name = "curso_id")}
			)
	private List <Curso> cursos;
	
	@OneToMany(mappedBy = "turma")
	@Fetch(value = FetchMode.JOIN)
	private List <Aluno> alunos;
	
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
