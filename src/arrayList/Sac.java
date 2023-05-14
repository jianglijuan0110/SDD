package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Sac<T extends PoidsAndType> {
	private double poidsMax;
	private double poidsActuel;
	private ArrayList<T> items;

	public Sac(double pM) {
		this.setPoidsMax(pM);
		this.poidsActuel = 0;
		this.items = new ArrayList<T>();
	}

	public void setPoidsMax(double pM) {
		if (pM > 0) {
			this.poidsMax = pM;
		}
		else {
			System.err.println("POIDS MAXIMAL NE PEUT PAS ÊTRE NEGATIF");
		}
	}
	
	public double getPoidsMax() {
		return this.poidsMax;
	}
	
	public double getPoidsActuel() {
		return this.poidsActuel;
	}
	
	public double getPoidsRestant() {
		return (this.poidsMax - this.poidsActuel);
	}
	public int Taille() {
		return this.items.size(); 
	}
	
	public boolean isFull() {
		return (this.poidsActuel >= this.poidsMax);
	}

	public T get(T chose) {
		if (this.items.contains(chose)) {
			System.out.println("Element existant !");
			return chose;
		}
		else {
			System.out.println("Element inexistant ! ");
			return null;
		}
	}
	
	public void addItem(T chose) {
		if(this.isFull()) {
			System.out.println("Sac plein, veuillez creer un nouveau sac, ou enelevez des elements !");
		}
		else {
			if (((chose.getPoids() + this.poidsActuel) > this.poidsMax) || (chose.getPoids() <= 0)) {
				System.out.println("Le poid de l'element pose un problème, le rajout ne s'est pas effectué !");
			}
			else {
				if (this.items.contains(chose)) {
					System.out.println("Element existant, sac inchangé ! ");
				}
				else {
				this.items.add(chose);
				this.poidsActuel += chose.getPoids();
				System.out.println("Element rajouté avec succés !");
			}
			}
		}
	}
	
	public void removeItem(T chose) {
		if ((this.poidsActuel > 0) && (this.items.contains(chose))) {
			this.items.remove(chose);
			this.poidsActuel -= chose.getPoids();
			System.out.println("Element enlevé de votre sac avec succés !");
		}
		else {
			System.out.println("Element inexistant, le sac est inchangé !");
		}
	}
	
	
	public void Info() {
		System.out.println("Capacité du sac :" +this.getPoidsMax());
		System.out.println("Poids actuel total du sac : "+this.poidsActuel);
		System.out.println("Poids restant du sac : "+(this.poidsMax-this.poidsActuel));
		System.out.println("Elements du sac : ");
		for (T element :this.items) {
			System.out.println("\t"+element.toString());
		}
	}
	
	public ArrayList<T> getByType(String s){
		if (this.items.isEmpty()) {
			System.out.println("Aucun élement corréspend à ce type");
			return null;
		}
		else {
			ArrayList<T> type = new ArrayList<T>();
			for (T element : this.items) {
				if (element.getType().equals(s)) {
					type.add(element);
				}
			}
			if (type.isEmpty()) {
				System.out.println("Aucun élement corréspend à ce type");
				return null;
			}
			else {
				return type;
				}
			}
	}
	
	public ArrayList<T> getByPoids(double d) {
		if (this.items.isEmpty()) {
			System.out.println("Aucun élement corréspend à ce poids");
			return null;
	}
		else {
			ArrayList<T> poids = new ArrayList<T>();
			for (T element : this.items) {
				if (element.getPoids() == d) {
					poids.add(element);
				}
			}
			if (poids.isEmpty()) {
				System.out.println("Aucun élement corréspend à ce poids");
				return null;
			}
			else {
				return poids;
			}
		}
		
	}
	
	public ArrayList<T> getItemsLourds() {
		if (this.items.isEmpty()) {
			System.out.println("Pas d'elements lourds");
			return null;
		}
		ArrayList<T> heavy = new ArrayList<T>();
		double mw = 0 ;
		// Recherche du plus grand poids
		for (T element: this.items) {
			if (element.getPoids() > mw) {
				mw = element.getPoids();
			}
		}
		// Recherche des items avec le plus grands poids
		for (T element : this.items) {
			if (element.getPoids() == mw) {
				heavy.add(element);
			}
		}
		return heavy;
	}
	public void removeByPoids(double p) {
		ArrayList<T> A = this.getByPoids(p);
		if (A != null) {
			double erased = 0;
			for (T element : A) {
				erased += element.getPoids();
			}
			this.items.removeAll(A);
			this.poidsActuel -= erased;
			System.out.println("Element(s) retiré(s) avec succés !");
		}
	}
	
	public void removeByType(String s) {
		ArrayList<T> A = this.getByType(s);
		if (A != null) {
			double erased = 0;
			for (T element : A) {
				erased += element.getPoids();
			}
			this.items.removeAll(A);
			this.poidsActuel -= erased;
			System.out.println("Element(s) retiré(s) avec succés !");
		}

	}
	public ArrayList<T> getByTypeStream(String type) {
	    return this.items.stream()
	                     .filter(item -> item.getType().equals(type))
	                     .collect(Collectors.toCollection(ArrayList::new));
	}
	
	public ArrayList<T> getByTypeIter(String s) {
	    ArrayList<T> result = new ArrayList<>();
	    Iterator<T> iter = this.items.iterator();
	    while (iter.hasNext()) {
	        T element = iter.next();
	        if (element.getType().equals(s)) {
	            result.add(element);
	        }
	    }
	    if (result.isEmpty()) {
	        System.out.println("Aucun élément ne correspond à ce type.");
	        return null;
	    } else {
	        return result;
	    }
	}
	
}
