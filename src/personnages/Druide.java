package personnages;
import java.util.Random;
import personnages.Gaulois;
public class Druide {
	
		private String nom;
		private int effetPotionMin;
		private int effetPotionMax;
		private int forcePotion=1;

		public Druide(String nom, int effetPotionMin, int effetPotionMax) {
			this.nom = nom;
			this.effetPotionMin = effetPotionMin;
			this.effetPotionMax = effetPotionMax;
			this.forcePotion=1;
			parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin
					+ " à " + effetPotionMax + ".");
		}

		public String getNom() {
			return nom;
		}

		public void parler(String texte) {
			System.out.println(prendreParole() + "« " + texte + "»");
		}

		private String prendreParole() {
			return "Le druide " + nom + " : ";
		}
		public int  preparerPotion() {
			Random rand = new Random();
			int puissance =
					rand.nextInt(effetPotionMax-effetPotionMin)+effetPotionMin;
			if (puissance<7) {
				parler("j'ai prepare une super potion de force"+String.valueOf(puissance));
			}else {
				parler("je n'ai pas trouve tous les ingredients , ma potion est seulement de force"+String.valueOf(puissance));
			}
			forcePotion=puissance;
			return puissance;
		}
		
			}
			
			
		}

		}


