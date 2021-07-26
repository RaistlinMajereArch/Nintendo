package test;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Hybride;
import metier.Jeu;
import metier.Portable;
import metier.Salon;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salon console1= new Salon("Nintendo 64",100,LocalDate.now());
		Portable console2= new Portable("Gameboy",5,LocalDate.now());
		Hybride console3= new Hybride("Nintendo Switch",500,LocalDate.now());
		List<Console> liste1= new ArrayList<Console>();
		List<Console> liste2= new ArrayList<Console>();
		
		liste1.add(console1);
		liste1.add(console3);
		liste2.add(console2);
		liste2.add(console3);

		
		Jeu jeu1= new Jeu("Mario 64",liste1);
		Jeu jeu2= new Jeu("GoldenEye",liste1);
		Jeu jeu3= new Jeu("Zelda Skyward Sword",liste2);
		Jeu jeu4= new Jeu("Metroid Prime 4",liste1);
		Jeu jeu5= new Jeu("Smash Bros Ultimate",liste2);
		Adresse adresse = new Adresse(45,"rue de la paix","toulon");
		
		List<Jeu> catalogue = new ArrayList<Jeu>();
		catalogue.add(jeu1);
		catalogue.add(jeu2);
		catalogue.add(jeu3);
		List<Jeu> MesJeuxC1 = new ArrayList<Jeu>();
		MesJeuxC1.add(jeu1);
		MesJeuxC1.add(jeu4);
		MesJeuxC1.add(jeu2);
		Client c1 = new Client("Mario","TheWinner",MesJeuxC1);

		Boutique micromania = new Boutique("Micromania",adresse,catalogue) ;
	}

}
