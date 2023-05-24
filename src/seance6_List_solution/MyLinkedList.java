package seance6_List_solution;

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
	return this.size()==0;
}

// ajout à la fin de la chaîne
@Override 
public boolean add(E element) {
	MyNode<E> nouveauNoeud = new MyNode<>(null,element,null);
	if (isEmpty()){
		this.first=nouveauNoeud;
		this.last=nouveauNoeud;
	}
	else {
		nouveauNoeud.prev=this.last;
		this.last.next=nouveauNoeud;
		this.last=nouveauNoeud;
	}
	this.size++;
	return true;
}	

// cherche si l'élément est dans la liste
@Override 
public boolean contains(Object element) {
	MyNode courant = this.first;
	while (courant !=null) {
		if(courant.item.equals(element))
			return true;
		courant = courant.next;
	}
	return false;
}

@Override
public int size() {
	return this.size;
}

@Override
public E get(int i) {
	if(i>=0 && i< this.size()) {
		int compteur=0;
		MyNode<E> courant = this.first;
		while (compteur<i) {
			courant = courant.next;
			compteur++;
		}
		return courant.item;
	}
	System.out.println("indice hors des bornes !");
	return null;
}

@Override
public String toString() {
	String res="";
	MyNode<E> courant = this.first;
	while (courant !=null) {
		res+=courant.item;
		courant = courant.next;
	}
	return res;
}

public String toStringInverse() {
	String res="";
	MyNode<E> courant = this.last;
	while (courant !=null) {
		res+=courant.item;
		courant = courant.prev;
	}
	return res;
}

// methode ecrite pour respecter l'interface mais que l'on ne va
// pas implementer dans ce TP
@Override
public ListIterator<E> listIterator(int index) {
	throw new UnsupportedOperationException();
}

public void removeLast() {
	
}
}