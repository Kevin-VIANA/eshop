package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
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
@DiscriminatorColumn(name="type_personne")
public abstract class Personne  {

	@Id//Obligatoire
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Obligatoire*
	protected int id;
	//@Id prendra le premier attribut qui sera en dessous comme auto incrément
	protected String nom;
	protected String prenom;
	@Embedded
	protected Adresse adresse;
	
	
	
	//Obligatoire
	public Personne() {}
	
	//Constructeur client (adress obligatoire)
		public Personne(String nom, String prenom, Adresse adresse) {
			this.nom = nom;
			this.prenom = prenom;
			this.adresse=adresse;
		}
		//Constructeur Fournisseur (adress pas obligatoire)
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

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}


	


	



	
	
	
	
	
	
}
