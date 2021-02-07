package ma.gestion.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Medecin extends User {
	@Id
	@GeneratedValue
	@OneToMany
	private List<Patient> patientt ;
	@OneToMany
	private List<Certificat> certificat ;
	@OneToMany
	private List<Visite> visite ;
	
	
	
	
	

}
