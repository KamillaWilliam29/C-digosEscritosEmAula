package br.com.senac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.entity.Aluno;
import br.com.senac.entity.Endereço;
import br.com.senac.repository.EndereçoRepository;

@Service
public class  EndereçoService {
	@Autowired
	EndereçoRepository repo;
	public List<Endereço> selectAll(){
		return repo.findAll();
	}
	
	public Endereço salvar(Endereço endereço) {
		return repo.save(endereço);
	}
	
	public List <Endereço> buscar(Aluno aluno){
		List <Endereço> objListEndereço = repo.findByAluno(aluno);
	 return objListEndereço;
	}
//	public Endereço cadastrarEndereço(Endereço endereço) {
//		return repo.save(endereço);
//	}
//	
//	public Endereço buscarEndereço(Integer id) {
//		return repo.findById(id).get();
//	}
//	
//	public void excluirEndereço(Integer id) {
//		repo.deleteById(id);
//	}
//	
//	public void update(Endereço endereçoAlterado) {
//		Endereço endereço = buscarEndereço(endereçoAlterado.getId());
//		endereço.setRua(endereçoAlterado.getRua());
//		endereço.setNumero(endereçoAlterado.getNumero());
//		endereço.setComplemento(endereçoAlterado.getComplemento());
//		endereço.setBairro(endereçoAlterado.getBairro());
//		cadastrarEndereço(endereço);
//	}
//	public Endereço salvarAlteraçao(Endereço endereçoAlterado) {
//		Endereço endereço = buscarEndereço(endereçoAlterado.getId());
//		endereço.setRua(endereçoAlterado.getRua());
//		endereço.setNumero(endereçoAlterado.getNumero());
//		endereço.setComplemento(endereçoAlterado.getComplemento());
//		endereço.setBairro(endereçoAlterado.getBairro());
//		return repo.save(endereço);
//	}
//	
}