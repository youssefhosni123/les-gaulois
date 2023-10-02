package personnages;

public class Romain {
		private String nom;
		private int force;
		private Romain[] Equipement;
		private int nbEquipement=0;

		public Romain(String nom, int force) {
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
			return "Le romain " + nom + " : ";
		}

		public void recevoirCoup(int forceCoup,int newforce) {
			assert force>0;
			force -= forceCoup;
			if (force > 0) {
				parler("Aïe");
			} else {
				parler("J'abandonne...");
			newforce=force-forceCoup;
			assert newforce>0;
			}
			assert invariantEstvalide();
		}
		private boolean invariantEstvalide() {
			return force>0;
		}
		
		public static void main(String[]args) {
			
			Romain Minus;{
			Minus=new Romain("Minus",-6);
		}
		}
		public void sEquiper(Equipement equipement) {
			int nbEquiment=0;
			switch(equipement) {
			case CASQUE:
				nbEquipement=2;
				break;
			case BOUCLIER:
				nbEquipement=1;
				break;
			}
			
			
		}
		
}



