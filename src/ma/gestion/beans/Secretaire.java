package ma.gestion.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Secretaire extends User {

		@OneToMany
	private List<Dossier> doss ;
	@OneToMany
	private List <RendezVous> rendezvous ;

	}
	

