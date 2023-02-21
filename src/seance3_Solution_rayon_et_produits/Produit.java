package seance3_Solution_rayon_et_produits;

public class Produit implements ObjetAvecEtiquette<String> {
	
	// autre variante intéressante à creuser et 
	// encore plus générale que vous pouvez mettre en place :
	// public class Produit<TypeEtiquette> implements ObjetAvecEtiquette<TypeEtiquette>
	
	private String nomProduit;
	private String codeProduit;
	public Produit() { }
	public Produit(String nomProduit, String codeProduit) {
	this.nomProduit = nomProduit;
	this.codeProduit = codeProduit;
	}
	public String getNomProduit() {
	return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
	this.nomProduit = nomProduit;
	}
	public String getCodeProduit() {
	return codeProduit;
	}
	public void setCodeProduit(String codeProduit) {
	this.codeProduit = codeProduit;
	}
	public String etiquette()
	{return this.nomProduit+" "+this.codeProduit;}
}
