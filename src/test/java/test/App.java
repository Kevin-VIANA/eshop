package test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Adresse;
import model.Client;
import model.Fournisseur;
import model.Personne;
import model.Produit;

public class App {

	public static void main(String[] args) {
		Adresse ad1=new Adresse(3,"Masson Street");
		Adresse ad2=new Adresse(12,"rue de la nation");
		Adresse ad3=new Adresse(70,"Caminho de Tolum");
		Adresse ad4=new Adresse(1,"Rue de Naples");
		
		Client c1 = new Client("DOE","Jane",28,"08-06-1993",ad1);
		Client c2 = new Client("DAVE","Alex",28,"19-12-1993",ad2);
		
		Fournisseur f1 = new Fournisseur("MACON","ALEX","Carrefour");
		f1.setAdresse(ad3);
		Fournisseur f2 = new Fournisseur("JOSEPH","Ming","Aliexpress");
		f2.setAdresse(ad4);
		
		Produit P1 = new Produit("CocaCola",2,f1);
		Produit P2 = new Produit("SandwitchTriangle",5,f1);
		Produit P3 = new Produit("ChipsLays",3,f2);
		
		List<Produit> listeAchatsJane =new ArrayList();
		listeAchatsJane.add(P1);
		listeAchatsJane.add(P2);
		c1.setAchat(listeAchatsJane);
		
		List<Produit> listeAchatsAlex =new ArrayList();
		listeAchatsAlex.add(P1);
		listeAchatsAlex.add(P2);
		listeAchatsAlex.add(P3);
		c2.setAchat(listeAchatsAlex);
		
		
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetJpa");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
	
		em.persist(f1);
		em.persist(f2);
		em.persist(P1);
		em.persist(P2);
		em.persist(P3);
		em.persist(c1);
		em.persist(c2);
		
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}

}
