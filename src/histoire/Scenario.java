package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Romain Minus;
		Minus = new Romain("Minus", 6);
	    Gaulois Asterix;
	    Asterix = new Gaulois("Asterix",8);
	    Asterix.parler("Bonjour a tous");
	    Minus.parler("Un GAU... UN GAUGAU...");
	    Asterix.frapper(Minus);
	    Asterix.frapper(Minus);
	    Asterix.frapper(Minus);
	  	}

}
