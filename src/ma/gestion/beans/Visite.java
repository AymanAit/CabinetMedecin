package ma.gestion.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Visite {
	@Id
	@GeneratedValue
	private int id ;
	private Date dateDebut ;
	private Date dateFin ;
	@ManyToOne
	private Patient patientt ;
	@ManyToOne
	private Medecin medecin ;
	@OneToOne
	private Ordonance ordon ;
	@OneToOne
	private Paiment paim ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

}
