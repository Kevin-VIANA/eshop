package model;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class Client extends Personne {

	private int age;
	@Column(name="date_de_naissance")
	private String naissance;
	
	public Client() {}
	
	public Client(String nom,String prenom, int age, String naissance) {
		super(nom,prenom);
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

	@Override
	public String toString() {
		return "Client [age=" + age + ", naissance=" + naissance + ", id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ "]";
	}
	
}
