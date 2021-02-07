package ma.gestion.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RendezVous {
	@Id
	@GeneratedValue
private int id;
private Date date;
@ManyToOne
private Patient patientt ;
@ManyToOne
private Secretaire secretaire ;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

}
