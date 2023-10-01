package personnages;

public class Village {
	
		private String nom;
		private Chef chef ;
		private Gaulois[] villageois;
		private int nbVillageois=0;
		

		public Village(String nom,int nbvillageoismax) {
			this.nom = nom;
			this.villageois=new Gaulois[nbvillageoismax];
		}
		public void setChef (Chef chef ) {
			this.chef=chef;
			
		}
		
		public String getNom() {
			return nom;
		}
		public void ajouterHabitant(Gaulois gaulois) {
			if(nbVillageois<villageois.length) {
				villageois[nbVillageois]=gaulois;
				nbVillageois+=1;
			}
		}
		public Gaulois trouverHabitant(int numero) {
			Gaulois bata=villageois[numero-1];
			return bata;
			
		}
		public static void main (String[]args) {
			Village  villageirreductible;
			villageirreductible=new Village ("Irreductibles",30);	
		//Gaulois gaulois = village.trouverHabitant(30);
		//car le dernier element est 29 pas 30
		   Chef chef;
		   chef=new Chef("Abraracourcix",6,villageirreductible);
		   Gaulois asterix;
		   asterix= new Gaulois ("Asterix",8);
		   villageirreductible.ajouterHabitant(asterix);
		   Gaulois obelix;
		   obelix= new Gaulois ("Obelix",25);
		   villageirreductible.ajouterHabitant(obelix);
		}
		public void afficherVillageois() {
			System.out.println("dans village du chef "+chef.getNom()+"vivent les legendaires gaulois");
			for (int i=0;i<villageois.length;i++) {
				if (villageois[i]!= null) {
					System.out.println(villageois[i].getNom());	
				}
					
			}
		}
		
	   }




 