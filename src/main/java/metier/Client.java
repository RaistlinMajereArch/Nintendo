package metier;

import java.util.List;

public class Client {
	String nom;
	String prenom;
	List<Jeu> liste_jeu;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public List<Jeu> getListe_jeu() {
		return liste_jeu;
	}
	public void setListe_jeu(List<Jeu> liste_jeu) {
		this.liste_jeu = liste_jeu;
	}
	public Client(String nom, String prenom, List<Jeu> liste_jeu) {
		this.nom = nom;
		this.prenom = prenom;
		this.liste_jeu = liste_jeu;
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", liste_jeu=" + liste_jeu + "]";
	}

}
