package seance2_genericiteSimple_file_attente_question1;

import java.util.Objects;

public class Personne {
	private String nom;

	public Personne(String nom) {
		super();
		this.nom = nom;
	}

	public Personne() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		return Objects.equals(nom, other.nom);
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + "]";
	}
	
	
}
