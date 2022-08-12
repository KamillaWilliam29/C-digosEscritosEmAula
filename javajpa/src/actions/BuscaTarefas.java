package actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Tarefa;

import java.util.List;

public class BuscaTarefas {
		public static void main(String[] args) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
			
			EntityManager manager = factory.createEntityManager();
			
			//String sql ="select t fro Tarefa as t where t,finalizada =: paramFinalizada."
			String sql = "select t from Tarefa as t";
			//o propósito de criar uma String na forma de query sql é facilitar a manutençaão de código)
			Query query = manager.createQuery(sql);
			
			List <Tarefa> lista = query.getResultList();
			for (Tarefa tarefa : lista) {
				System.out.println(tarefa.getDescricao());
				
				manager.close();
				factory.close();
			}
		}
}
