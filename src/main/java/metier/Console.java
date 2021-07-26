package metier;

import java.time.LocalDate;
public abstract class Console {

	private String nom;
	private double prix;
	private LocalDate date_sortie;

	public Console(String nom, double prix, LocalDate date_sortie) {
		this.nom = nom;
		this.prix = prix;
		this.date_sortie = date_sortie;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public LocalDate getDate_sortie() {
		return date_sortie;
	}

	public void setDate_sortie(LocalDate date_sortie) {
		this.date_sortie = date_sortie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", date_sortie=" + date_sortie + "]";
	}
	
	
}