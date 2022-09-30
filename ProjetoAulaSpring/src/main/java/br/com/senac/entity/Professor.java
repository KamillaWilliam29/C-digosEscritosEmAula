package br.com.senac.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3895777336004118482L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Integer IdCurso;
	
	public Integer getIdCurso() {
		return IdCurso;
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
	
	public void setIdCurso(Integer idCurso) {
		IdCurso = idCurso;
	}
	public Integer getId() {
		return id;
	}
}
