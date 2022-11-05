package mocklabjava;

public class Pessoa2 implements IPessoa {
 
	int idade;
	
	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


//	private
	@Override
	public void falar() {
		// TODO Auto-generated method stub
		System.out.println("Falamos alguma coisa");
	}

}