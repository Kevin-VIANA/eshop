package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Personne;

public class App {

	public static void main(String[] args) {
		Personne p = new Personne("ABID","Jordan");
		Personne p2 = new Personne("DOE","John");
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetJpa");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		em.persist(p);
		em.persist(p2);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}

}
