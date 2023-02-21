package seance2_Solutions_des_exercices_sur_la_généricité_simple;

public class Personne {
	private String nom;

	public Personne() {}
	
	public Personne(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Personne : "+ this.nom;
	}

}
