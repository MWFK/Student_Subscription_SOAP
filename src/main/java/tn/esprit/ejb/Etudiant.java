//maven de type jar et nest pas war par ce qu'on travail avec EJB qui ne supporte pas war

//on met les annotations au niveau de getters

package tn.esprit.ejb;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


//this is to consider this element as a root (it will appear in the root elements of Types)
@XmlRootElement(name = "TopStudent")//jax-b
public class Etudiant {

	private String cin;
	private String adresse;
	private String dateNaissance;
	private String email;
	private String firstName;
	private String lastName;
	
	public Etudiant() {
		super();
	}

	public Etudiant(String cin, String adresse, String dateNaissance, String email, String firstName, String lastName) {
		super();
		this.cin = cin;
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	//Changer la valeur de "cin" et l'unitiliser comme un attribut dans Types
	@XmlAttribute(name="cinID")//unique
	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@XmlTransient//masquer une var
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//Changer la valeur de "firstName" et l'unitiliser comme un element dans Types
	@XmlElement(name="prenom")//pour chnager le nom de var a afficher
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	


	
	
}
