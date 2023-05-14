package enumSet;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Sac {
	
	//ATTRIBUTS
	
	private double poidsMax;
	private double poidsActuel;
	private EnumSet<Potato> items;
	
	
	
	//CONSTRUCTEUR
	
	public Sac(double pM) {
		this.setPoidsMax(pM);
		this.poidsActuel = 0;
		this.items = EnumSet.noneOf(Potato.class);
	}
	
	
	
	//ACCESSEURS POUR LE POIDS MAX
	
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
	
	
	
	//ACCESSEURS POUR LE POIDS ACTUEL
	
	public double getPoidsActuel() {
		return this.poidsActuel;
	}
	
	
	
	//ACCESSEURS POUR LE POIDS RESTANT
	
	public double getPoidsRestant() {
		return (this.poidsMax - this.poidsActuel);
	}
	
	
	
	//METHODE POUR VERIFIER LA ATILE DU SAC
	
	public int Taille() {
		return this.items.size(); 
	}
	
	
	
	//METHODE POUR VERIFIER SI LE SAC EST PLEIN
	
	public boolean isFull() {
		return (this.poidsActuel >= this.poidsMax);
	}
	
	
	
	//METHODE POUR AJOUTER UN ELEMENT
	
	public void addItem(Potato chose) {
		if(this.isFull()) {
			System.out.println("Sac plein, veuillez creer un nouveau sac, ou enelevez des elements !");
		}
		else {
			if (((chose.getPoids() + this.poidsActuel) > this.poidsMax)) {
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
	
	
	
	//METHODE POUR SUPPRIMER UN ELEMENT
	
	public void removeItem(Potato chose) {
		if (!this.items.contains(chose)) {
			System.out.println("Element inexistant, le sac est inchangé !");
		}
		else {
			double erased = chose.getPoids();
			this.poidsActuel -= erased;
			this.items.remove(chose);
			System.out.println("Element enlevé de votre sac avec succés !");
		}
	}
	
	
	
	//METHODE POUR SUPPRIMER UN ELEMENT PAR TYPE
	
	public void removeByType(String s) {
		List<Potato> patate = items.stream()
				.filter(e -> e.getType().equals(s)).collect(Collectors.toList());
		patate.forEach(p -> {
			double erased = p.getPoids();
			this.poidsActuel -= erased;
			this.items.remove(p);
			System.out.println("Element(s) retiré(s) avec succés !");
		});
	}
	
	

	//METHODE POUR SUPPRIMER UN ELEMENT PAR POIDS
	
	public void removeByPoids(double p) {
	    if (!this.items.isEmpty()) {
	        Iterator<Potato> it = this.items.iterator();
	        while (it.hasNext()) {
	            Potato potato = it.next();
	            if (potato.getPoids() == p) {
	                double erased = potato.getPoids();
	                System.out.println(erased);
	                items.remove(potato);
	                this.poidsActuel -= erased;
	                System.out.println("Element(s) retiré(s) avec succès !");
	            }
	        }
	    }
	}
	
	
	
	//METHODE POUR ACCEDER A(AUX) LE(S) ELEMENT(S) LOURDS
	
	public EnumSet<Potato> getItemsLourds() {
	    if (this.items.isEmpty()) {
	        System.out.println("Pas d'éléments lourds");
	        return null;
	    } else {
	        EnumSet<Potato> heavy = EnumSet.noneOf(Potato.class);
	        double mw = 0;
	        
	        // Recherche du plus grand poids
	        Iterator<Potato> it = items.iterator();
	        while (it.hasNext()) {
	            Potato potato = it.next();
	            if (potato.getPoids() > mw) {
	                mw = potato.getPoids();
	            }
	        }
	        
	        // Recherche des items avec le plus grand poids
	        it = items.iterator();  // Réinitialisation de l'itérateur
	        
	        while (it.hasNext()) {
	            Potato potato = it.next();
	            if (potato.getPoids() == mw) {
	                heavy.add(potato);
	            }
	        }
	        
	        return heavy;
	    }
	}
	
	
	
	//METHODE POUR ACCEDER A UN ELEMENT (PATATE)
	
	public Potato get(Potato chose) {
		if (this.items.contains(chose)) {
			System.out.println("Element existant !");
			return chose;
		}
		else {
			System.out.println("Element inexistant ! ");
			return null;
		}
	}
	
	
	
	//METHODE POUR ACCEDER A UN ELEMENT PAR SON TYPE
	
	public Potato getByType(Potato s){
		if (this.items.isEmpty()) {
			System.out.println("Aucun élement corréspend à ce type");
			return null;
		}
		else {
			return this.get(s);
		}
	}
	
	
	
	//METHODE POUR ACCEDER A UN ELEMENT PAR SON POIDS
	
	public EnumSet<Potato> getByPoids(double d) {
		if (this.items.isEmpty()) {
			System.out.println("Aucun élement corréspend à ce poids");
			return null;
		}
		else {
			EnumSet<Potato> search = EnumSet.noneOf(Potato.class);
			Iterator<Potato> it = this.items.iterator();
	        while (it.hasNext()) {
	            Potato potato = it.next();
	            if (potato.getPoids() == d) {
	                search.add(potato);
	            }
	        }
	        return search;
		}	
	}
	
	
	
	//POUR OBTENIR TOUS LES INFOS DU SAC
	
	public void Info() {
		System.out.println("Capacité du sac :" +this.getPoidsMax());
	    System.out.println("Poids actuel total du sac : "+this.poidsActuel);
	    System.out.println("Poids restant du sac : "+(this.poidsMax-this.poidsActuel));
	    System.out.println("Elements du sac : ");
		System.out.println("\t"+this.items.toString());
	}
}
