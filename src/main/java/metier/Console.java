package metier;

import java.time.LocalDate;

public class Console {

	private String nom;
	private double prix;
	private LocalDate date_sortie;

	public Console(String nom, double prix, LocalDate date_sortie) {
		this.nom = nom;
		this.prix = prix;
		this.date_sortie = date_sortie;
	}

	public Console(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + "]";
	}
	
	
}
