package br.com.senac.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Curso implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	public Integer Id;
	
	public String nome;
	
	public String turma;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		Id = id;
	}
	/**
	 * @return the nome
	 */
	
	
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * @return the professor
	 */
	public String getTurma() {
		return turma;
	}
	/**
	 * @param professor the professor to set
	 */
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	
}
