package seance4_pile;

import java.util.ArrayList;

public class Pile<T> implements IPile<T> {
	// structure de stockage interne des  ́el ́ements
	private ArrayList<T> elements;
	// Mise en oeuvre des op ́erations
	
	public Pile(){
		initialiser();
		assert this.estVide(): "elle est pas vide" ;
	}
	
	public T depiler() throws PileVideException{
		if (this.estVide())
			throw new PileVideException("en d ́epilant");
		T sommet = elements.get(elements.size()-1);
		elements.remove(sommet);
		return sommet;
	}
	public void empiler(T t) throws PileVideException {
		elements.add(t);
		//elements.add(null);
		assert this.sommet()==t : "dernier empile ="+this.sommet();
	}
	
	public boolean estVide() {
		return elements.isEmpty();
	}
	
	public void initialiser() {
		elements = new ArrayList<T>();
	}
	
	public T sommet() throws PileVideException{
		if (this.estVide())
			throw new PileVideException("en d ́epilant");
		return elements.get(elements.size()-1);
	}
	
	public int taille(){
		return elements.size();
	}
	
	public String toString(){
		return "Pile = "+ elements;
	}

}
