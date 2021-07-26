package test;


import java.util.ArrayList;
import java.util.List;

import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console1= new Console("Nintendo 64");
		Console console2= new Console("Wii");
		Console console3= new Console("Nintendo Switch");
		Jeu jeu1= new Jeu("Mario 64",console1);
		Jeu jeu2= new Jeu("GoldenEye",console1);
		Jeu jeu3= new Jeu("Zelda Skyward Sword",console2);
		Jeu jeu4= new Jeu("Metroid Prime 4",console1);
		Jeu jeu5= new Jeu("Smash Bros Ultimate",console3);
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
