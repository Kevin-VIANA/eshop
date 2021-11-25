package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity //Obligatoire
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="Personne")
public abstract class Personne  {

	@Id//Obligatoire
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Obligatoire*
	protected int id;
	//@Id prendra le premier attribut qui sera en dessous comme auto incrément
	protected String nom;
	protected String prenom;
	
	
	
	//Obligatoire
	public Personne() {}
	
	
	//Pour nous l'utiliser
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}



	




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}


	



	
	
	
	
	
	
}
