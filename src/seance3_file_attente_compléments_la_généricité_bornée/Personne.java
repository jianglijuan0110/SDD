package seance3_file_attente_compléments_la_généricité_bornée;

import java.util.Objects;

public class Personne implements IsInvite{
	private String nom;
	private boolean isInvite;//par defaul false

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
	public boolean isInvite() {
		return isInvite;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + "]";
	}
	
	
}
