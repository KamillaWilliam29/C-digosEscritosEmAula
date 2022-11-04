package mocklabjava;

import java.util.ArrayList;

public class Pilha {

	int limite = 50;
	ArrayList <Livro> pilha = new ArrayList<Livro>();
	
	private IPilhaDAO pilhaDAO;
	
	public Pilha(IPilhaDAO pilhaDAO) {
		this.pilhaDAO = pilhaDAO;
	}
	public void push(Livro livro) {
		if (pilha.size() >= limite) {
			throw new ArrayStoreException();
		}
		
		pilha.add(livro);
		pilhaDAO.save(this);
	}
	
	public Livro pop() {
		return null;
	}
	
	//método count pra contar quantos livros estão na pilha
}
