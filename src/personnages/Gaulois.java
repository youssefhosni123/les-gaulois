package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((force / 3)*effetPotion);
	}

	@Override 
	 public String toString() {
	return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion="
	+ effetPotion + "]";
	 }
	public static void main(String[] args) {
		Gaulois asterix;
		asterix = new Gaulois("asterix", 8);
		 System.out.println(asterix.getNom());
		 asterix.parler("salut asba");
		 System.out.println(asterix.prendreParole());
		 Romain romain;
		 romain = new Romain("gaulois",5);
		 asterix.frapper(romain);
		 asterix.boirpotion(3);
		 
	}
	public void boirpotion(int forcePotion) {
		this.effetPotion=forcePotion;
		parler("Merci druide , je sens que ma force est "+ forcePotion+"fois decuplée.");
		
		
	}
}

