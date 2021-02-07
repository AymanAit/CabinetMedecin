package ma.gestion.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Paiment {
	@Id
	@GeneratedValue
private int id ;
private String montant ;
private String typePaiment ;
@OneToOne
private Visite visit ;
@OneToOne
private TypePaiment typepaim ;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMontant() {
	return montant;
}
public void setMontant(String montant) {
	this.montant = montant;
}
public String getTypePaiment() {
	return typePaiment;
}
public void setTypePaiment(String typePaiment) {
	this.typePaiment = typePaiment;
}

}
