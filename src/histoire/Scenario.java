package histoire;

import personnages.Gaulois;
import personnages.Druide;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Romain Minus;
		Minus = new Romain("Minus", 6);
	    Gaulois Asterix;
	    Asterix = new Gaulois("Asterix",8);
	    Druide Panoramix;
	    Panoramix=new Druide("Panoramix",5,10);
	    Panoramix.parler("Je vais aller préparer une petite potion");
	    Panoramix.preparerPotion();
	    Gaulois Obelix;
	    Obelix= new Gaulois ("Obelix",25);
	    Panoramix.booster(Obelix);
	    Obelix.parler("« Par Bélénos, ce n'est pas juste !");
	    Asterix.boirpotion(6);
	    Asterix.parler("Bonjour");
	    Minus.parler("Un GAU... UN GAUGAU...");
	    Asterix.frapper(Minus);
	    
	}
}
