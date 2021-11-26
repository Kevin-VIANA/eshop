package model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

//@Entity --ERREUR, comme on veut imbriquer adresse aux autres ce n'est pas une entity
@Embeddable
public class Adresse {

	@Column(nullable=true)
	private int numeroRue;
	@Column(nullable=true)
	private String rue;
	
	
	public Adresse() {}
	
	public Adresse(int numeroRue,String rue) {
		this.numeroRue=numeroRue;
		this.rue=rue;
	}
	public int getNumeroRue() {
		return numeroRue;
	}
	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	@Override
	public String toString() {
		return "Adresse [numeroRue=" + numeroRue + ", rue=" + rue + "]";
	}

	

}
