package model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraInfraBanco {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		factory.close();
	}

}
