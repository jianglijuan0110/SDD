package seance3_1_rayon_la_généricité_bornée;

import java.util.ArrayList;

public class Rayon <E extends ObjetAvecEtiquette> {
	private ArrayList<E> contenu=new ArrayList<E>();

	public Rayon() {
		
	}

	public ArrayList<E> getContenu() {
		return contenu;
	}

	public void setContenu(ArrayList<E> contenu) {
		this.contenu = contenu;
	}
	
	public String listingContenu(){
		String listing="";
		for (E c:contenu)
		listing +=  c.etiquette();
		return listing;
	}
	
	public void ajoute(E e) {
		if (!contenu.contains(e))
			contenu.add(e);	
	}
	
	
	
}
