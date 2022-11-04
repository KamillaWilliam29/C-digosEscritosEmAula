package mocklabjava;

public class pilhaDAO implements IPilhaDAO {

	@Override
	//método abtrato da INterface
	public  void save(Pilha pilha) {
		//chamei getconn
		//inicializo o necessário
		System.out.println("Salvamos a pilha no BD");
	}
}
