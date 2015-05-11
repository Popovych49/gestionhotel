package fr.soprasteria.gestionHotel.metier;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="operateur")

public class Operateur {

	@Id
	@Column(name = "OPERATEUR_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String operateur_id;
	
	@Column(name="NOM_OPERATEUR")
	protected String nom_operateur;
	
	@Column(name="CHEF_ID")
	protected String chef_id;
	
	@OneToMany(mappedBy = "operateurs",cascade=CascadeType.ALL) 
	private Set<Client> clients = new HashSet<Client>(); 
	
	
	public Operateur (){
	}
	
	public Operateur(String nom) {
		setNom_operateur(nom);
	}

	// toString
	public String toString() {
		return String.format("[%s,%s,%s]", getOperateur_id(), getNom_operateur(), getChef_id());
	}

	public String getOperateur_id() {
		return operateur_id;
	}

	public void setOperateur_id(String operateur_id) {
		this.operateur_id = operateur_id;
	}

	public String getNom_operateur() {
		return nom_operateur;
	}

	public void setNom_operateur(String nom_operateur) {
		this.nom_operateur = nom_operateur;
	}

	public String getChef_id() {
		return chef_id;
	}

	public void setChef_id(String chef_id) {
		this.chef_id = chef_id;
	}

	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	
}
