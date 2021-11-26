package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
@DiscriminatorValue("client")
public class Client extends Personne {

	private int age;
	@Column(name="date_de_naissance")
	private String naissance;
	
	@ManyToMany
	@JoinTable(
			name="Liste_de_course", //Rename la table
			joinColumns = @JoinColumn(name="id_acheteur"), //rename la clé principale (Personnage car on est dans la classe Personnage)
			inverseJoinColumns = @JoinColumn(name="id_produit") //rename l'autre clé, celle de l'attribut donc Equipement ici
			)
	private List<Produit> achat;
	
	
	public Client() {}
	
	public Client(String nom,String prenom, int age, String naissance,Adresse adresse) {
		super(nom,prenom,adresse);
		this.age=age;
		this.naissance=naissance;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNaissance() {
		return naissance;
	}

	public void setNaissance(String naissance) {
		this.naissance = naissance;
	}

	public List<Produit> getAchat() {
		return achat;
	}

	public void setAchat(List<Produit> achat) {
		this.achat = achat;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", age=" + age
				+ ", naissance=" + naissance + ", achat=" + achat + "]";
	}

	
	
	
}
