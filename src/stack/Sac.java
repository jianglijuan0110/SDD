package stack;
import java.util.Stack;

import java.util.Iterator;

import java.util.stream.Collectors;


public class Sac<T extends PoidsAndType> {
	private double poidsMax; // represents the maximum weight capacity of the bag.
	private double poidsActuel; //represents the current total weight of the items in the bag.
	private Stack<T> items;//a stack that stores the items in the bag.

	//constructor that initializes the maximum weight capacity of the bag and the items stack.
	public Sac(double pM) {
		this.setPoidsMax(pM);
		this.poidsActuel = 0;
		this.items = new Stack<T>();
	}

	//sets the maximum weight capacity of the bag to a given value.
	public void setPoidsMax(double pM) {
		if (pM > 0) {
			this.poidsMax = pM;
		}
		else {
			System.err.println("POIDS MAXIMAL NE PEUT PAS ÊTRE NEGATIF");
		}
	}
	
	//returns the maximum weight capacity of the bag
	public double getPoidsMax() {
		return this.poidsMax;
	}
	
	
	// returns the current total weight of the items in the bag.
	public double getPoidsActuel() {
		return this.poidsActuel;
	}
	
	// returns the remaining weight capacity of the bag.
	public double getPoidsRestant() {
		return (this.poidsMax - this.poidsActuel);
	}
	
	//returns the number of items in the bag.
	public int Taille() {
		return this.items.size(); 
	}
	
	
	/*returns true if the bag is full, i.e.,
	 *  if the current total weight of the items in the bag is equal to 
	 *  the maximum weight capacity of the bag.*/
	public boolean isFull() {
		return (this.poidsActuel >= this.poidsMax);
	}

	
	//returns an item from the bag if it exists, or null otherwise.
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
	
	
	//adds an item to the bag if it is not already in the bag and if the bag is not full.
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
					this.items.push(chose);
					this.poidsActuel += chose.getPoids();
					System.out.println("Element rajouté avec succès !");
				}
			}
		}
	}
	
	/*removes an item from the bag if it exists in the bag and updates the
	 *  current total weight of the items in the bag accordingly.*/
	
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
	
	
	
	/*prints the current state of the bag, including its maximum weight capacity, current total weight, 
	 * remaining weight capacity, and the items in the bag.*/
	public void Info() {
		System.out.println("Capacité du sac :" +this.getPoidsMax());
		System.out.println("Poids actuel total du sac : "+this.poidsActuel);
		System.out.println("Poids restant du sac : "+(this.poidsMax-this.poidsActuel));
		System.out.println("Elements du sac : ");
		for (T element :this.items) {
			System.out.println("\t"+element.toString());
		}
	}
	
	
	/*returns a stack of items in the bag that have a given type, 
	 * or null if there are no items of that type in the bag.*/
	public Stack<T> getByType(String s){
		if (this.items.isEmpty()) {
			System.out.println("Aucun élement corréspend à ce type");
			return null;
		}
		else {
			Stack<T> type = new Stack<T>();
			for (T element : this.items) {
				if (element.getType().equals(s)) {
					type.push(element);//the element is pushed onto the type stack.
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
	
	
	/*returns a stack of items in the bag that have a given weight, 
	 * or null if there are no items of that weight in the bag.*/
	public Stack<T> getByPoids(double d) {
		if (this.items.isEmpty()) {
			System.out.println("Aucun élement corréspend à ce poids");
			return null;
	}
		else {
			Stack<T> poids = new Stack<T>();
			for (T element : this.items) {
				if (element.getPoids() == d) {
					poids.push(element);
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
	
	/*returns a stack of items in the bag that have the heaviest weight,
	 *  or null if there are no items in the bag.*/
	public Stack<T> getItemsLourds() {
	    if (this.items.isEmpty()) {
	        System.out.println("Pas d'elements lourds");
	        return null;
	    }
	    Stack<T> heavy = new Stack<T>();
	    double mw = 0 ;
	    // Finding the largest weight
	    for (T element: this.items) {
	        if (element.getPoids() > mw) {
	            mw = element.getPoids();
	        }
	    }
	    // Finding items with the highest weight
	    for (T element : this.items) {
	        if (element.getPoids() == mw) {
	            heavy.push(element);
	        }
	    }
	    return heavy;
	}

	/*removes all items in the bag that have a given weight and 
	 * updates the current total weight of the items in the bag accordingly.*/
	public void removeByPoids(double p) {
	    Stack<T> A = new Stack<T>();
	    while (!this.items.isEmpty()) {
	    	
	    	/*removes and returns the top element of the stack items. 
	    	 * It assigns the returned element to the variable element 
	    	 * of type T.*/
	        T element = this.items.pop();
	        if (element.getPoids() != p) {
	            A.push(element);
	        } else {
	            this.poidsActuel -= element.getPoids();
	        }
	    }
	    while (!A.isEmpty()) {
	    	
	    	/*pushes the elements from stack A back onto the original stack items,
	    	 *  in the same order they were popped from items earlier in the method.
	    	 *   This effectively removes any elements of type s from the original 
	    	 *   stack items while preserving the order of the remaining elements.*/
	        this.items.push(A.pop());
	    }
	    if (A.size() == this.items.size()) {
	        System.out.println("Aucun element n'a été retiré !");
	    } else {
	        System.out.println("Element(s) retiré(s) avec succés !");
	    }
	}
	
	
	//removes elements from a stack based on their type

	public void removeByType(String s) {
	    Stack<T> A = new Stack<T>();
	    while (!this.items.isEmpty()) {
	        T element = this.items.pop();
	        if (!element.getType().equals(s)) {
	            A.push(element);
	        } else {
	            this.poidsActuel -= element.getPoids();
	        }
	    }
	    while (!A.isEmpty()) {
	        this.items.push(A.pop());
	    }
	    if (A.size() == this.items.size()) {
	        System.out.println("Aucun element n'a été retiré !");
	    } else {
	        System.out.println("Element(s) retiré(s) avec succés !");
	    }
	}
	
	public Stack<T> getByTypeStream(String type) {
	    return this.items.stream()
	                     .filter(item -> item.getType().equals(type))
	                     .collect(Collectors.toCollection(Stack::new));
	}

	
	public Stack<T> getByTypeIter(String type) {
	    Stack<T> result = new Stack<>();
	    Iterator<T> iter = this.items.iterator();
	    while (iter.hasNext()) {
	        T element = iter.next();
	        if (element.getType().equals(type)) {
	            result.push(element);
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
