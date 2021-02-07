package ma.gestion.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Certificat {
@ Id 
@GeneratedValue
private int id ;
private String type ;
@ManyToOne
private Medecin medc ;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}


}
