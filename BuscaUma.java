package actions;

import model.Tarefa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BuscaUma {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		
		EntityManager manager = factory.createEntityManager();
		
		Tarefa t1 = manager.find(Tarefa.class, 2L);
		System.out.println(t1.getDescricao());
		
		manager.close();
		factory.close();
	}
}
