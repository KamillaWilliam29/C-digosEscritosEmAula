package br.com.senac.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.entity.Livro;
import br.com.senac.repository.LivroRepository;

@Service
public class LivroService {
	@Autowired
	LivroRepository repo;
	public List<Livro> selectAll(){
		return repo.findAll();
	}
	
	public Livro salvar(Livro livro) {
		return repo.save(livro);
	}
	


}
