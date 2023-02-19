package seance3_rayon_la_généricité_bornée;

public class Produit implements ObjetAvecEtiquette{
	private String etiquette;

	public Produit(String etiquette) {
		super();
		this.etiquette = etiquette;
	}

	public String etiquette() {
		return etiquette;
	}

	public void setEtiquette(String etiquette) {
		this.etiquette = etiquette;
	}

	@Override
	public String toString() {
		return "Produit [etiquette=" + etiquette + "]";
	}
	
	
	
}
