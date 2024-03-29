package seance6_List;

import java.util.*;

public class MyLinkedList <E>
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

	public MyLinkedList() {} 
	
	// une liste vide est telle que first == null && last == null
	@Override   
	public boolean isEmpty() {
		/*if(size == 0)
			return true;
		else
			return false;*/
		
		return size == 0;
	}
	
	// ajout à la fin de la chaîne
	@Override 
	public boolean add(E element) {
		
		return true;
	}
	
	// cherche si l'élément est dans la liste
	@Override 
	public boolean contains(Object element) {
		// TODO
		return true;
	}
	
	@Override
	public int size() {
		// TODO
		return 0;
	}
	
	@Override
	public E get(int i) {
		// TODO
		return null;
	}
	
	@Override
	public String toString() {
		// TODO
		return "Ecrivez-moi !";
	}	
	
	public String toStringInverse() {
		// TODO
		return "Ecrivez-moi !";
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