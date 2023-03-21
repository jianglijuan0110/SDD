package seance6_List;

import java.util.*;

public class MyLinkedList_Wassim <E>
       extends AbstractSequentialList<E>
       implements List<E>
{
	private int size = 0; 
       /**
        * Pointer to first node.
        * Invariant: (first == null && last == null) ||
        *            (first.prev == null && first.item != null)
        */
	private MyNode<E> first=null;
       /**
        * Pointer to last node.
        * Invariant: (first == null && last == null) ||
        *            (last.next == null && last.item != null)
        */
	private MyNode<E> last=null;

	public MyLinkedList_Wassim() {} 
	
	// une liste vide est telle que first == null && last == null
	@Override   
	public boolean isEmpty() {
		return this.first == null && this.last == null;
	}
	
	// ajout à la fin de la chaîne
	@Override 
	public boolean add(E element) {
		MyNode<E> addition = new MyNode<E>(null, element, null);
		
		this.size ++;
		
		if(this.isEmpty() == true) {
			this.first = addition;
			this.last = addition;
		}
		else {
			this.last.next = addition;
			addition.prev = this.last;
			this.last = addition;
		}
		return true;
	}
	
	// cherche si l'élément est dans la liste
	@Override 
	public boolean contains(Object element) {
		if (this.isEmpty() == true) {
			return false;
		}
		else {

			MyNode<E> iterateur = this.first;
			while(iterateur !=null) {
				if (iterateur.item.equals(element)) {			
					return true;
													}
				else {
				iterateur = iterateur.next;
						}
									}
		}
		
		return false;
	}
	
	@Override
	public int size() {
		return this.size;
	}
	
	@Override
	public E get(int i) {
		if (this.isEmpty() == true) {
			System.out.println("Liste vide");
			return null;
		}
		if (i > this.size) {
			System.err.println("OUT OF BOUNDS");
			return null;
		}
		else {
			MyNode<E> iterateur = this.first;
			int j = 0;
			while(iterateur !=null) {
				if(i == j) {
					return iterateur.item;
				}
				j ++;
				iterateur = iterateur.next;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		String res = "";
		MyNode<E> iterateur = this.first;
		while(iterateur !=null) {
				res = res + iterateur.item+" / ";
				iterateur = iterateur.next;
			}
		return res;
	}
	
	public String toStringInverse() {
		String res = "";
		MyNode<E> iterateur = this.last;
		while(iterateur !=null) {
				res = res + iterateur.item+" / ";
				iterateur = iterateur.prev;
			}
		return res;
	}	
	
	// methode ecrite pour respecter l'interface mais que l'on ne va
	// pas implementer dans ce TP
	@Override
	public ListIterator<E> listIterator(int index) {
		throw new UnsupportedOperationException();
	}
	
	// méthodes plus difficiles pour les avancés :
	// ajout à une position i quelconque
	// retrait à une position i quelconque
}