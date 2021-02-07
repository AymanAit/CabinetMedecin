package ma.gestion.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Patient extends User {
	@Id
	@GeneratedValue
	private String login;
	private String Password; 
	private String numAssurance ;
	@OneToOne
	private Dossier doss ;
	@ManyToOne
	private Medecin medc ;
	@OneToMany
	private List<RendezVous> rendezvous ;
	@OneToMany
	private List<Visite> visit ;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getNumAssurance() {
		return numAssurance;
	}
	public void setNumAssurance(String numAssurance) {
		this.numAssurance = numAssurance;
	}

}
