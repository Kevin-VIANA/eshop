package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Client;
import model.Fournisseur;
import model.Personne;

public class App {

	public static void main(String[] args) {
		
		Client c1 = new Client("DOE","Jane",28,"08-06-1993");
		Client c2 = new Client("DAVE","Alex",28,"19-12-1993");
		
		Fournisseur f1 = new Fournisseur("MACON","ALEX","Carrefour");
		Fournisseur f2 = new Fournisseur("JOSEPH","Ming","Aliexpress");
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetJpa");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
		em.persist(f1);
		em.persist(f2);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}

}
