package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity //Obligatoire
@Table(name="Personne")
public class Personne {

	@Id//Obligatoire
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Obligatoire*
	private int numero;
	//@Id prendra le premier attribut qui sera en dessous comme auto incrément
	private String nom;
	private String prenom;
	
	//Obligatoire
	public Personne() {}
	
	
	//Pour nous l'utiliser
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}



	

	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	@Override
	public String toString() {
		return "Personne [numero=" + numero + ", nom=" + nom + ", prenom=" + prenom + "]";
	}



	
	
	
	
	
	
}
