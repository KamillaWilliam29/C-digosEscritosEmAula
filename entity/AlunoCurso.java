package br.com.senac.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class AlunoCurso implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5576038375872418074L;
	@ManyToOne
	private Aluno aluno;
	@ManyToOne
	private Curso curso;
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
}