package personnages;

public enum Equipement {
	CASQUE("casque"),
	BOUCLIER("bouclier");
	private String nom;
	private Equipement (String nom) {
		this.nom=nom;
	}
	public String getNom() {
		return nom;
	}
	public String toString() {
		return nom;
	}
	public static Equipement getEquipementParNom() {
		for(Equipement equipement : values()) {
			if (equipement.nom.equals(nom)) {
				return equipement;
			}
		}
	}

}
