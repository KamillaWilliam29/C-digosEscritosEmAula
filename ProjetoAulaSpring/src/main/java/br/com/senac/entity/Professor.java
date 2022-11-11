package br.com.senac.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.senac.entity.Livro;

@Entity
public class Professor implements Serializable{
	
	private static final long serialVersionUID = -3895777336004118482L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String nome;
	@Column
	private Integer IdCurso;
	
	@OneToMany(mappedBy = "livro",  fetch = FetchType.LAZY)
	private List <Livro> livros = new ArrayList();
	
	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

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
