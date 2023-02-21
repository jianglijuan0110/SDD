package seance3_Solution_rayon_et_produits;

public class Livre implements ObjetAvecEtiquette<String> {
	//classe minimale à developper

	private String titre;

	public Livre(String titre) {
		this.titre=titre;
	}

	@Override
	public String etiquette() {
		return this.titre;
	}

}
