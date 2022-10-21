package br.com.senac.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "avaliacoes")
public class Avaliacao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private AlunoCurso alunoCurso;
	
	private String conceito;

	public AlunoCurso getAlunoCurso() {
		return alunoCurso;
	}

	public void setAlunoCurso(AlunoCurso alunoCurso) {
		this.alunoCurso = alunoCurso;
	}

	public String getConceito() {
		return conceito;
	}

	public void setConceito(String conceito) {
		this.conceito = conceito;
	}

}
