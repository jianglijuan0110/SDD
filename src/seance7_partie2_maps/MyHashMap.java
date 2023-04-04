package seance7_partie2_maps;

//https://repl.it/join/lyylkptp-mariannehuchard

import java.util.*;

public class MyHashMap<K,V>
		implements Map<K,V>
{
	// pour stocker les associations
	
	private MyEntry<K,V>[] table;
	private int size; 
	
	public MyHashMap() {
		// on cree la HashMap avec une premiere taille
		// estimative de 10
		// et on ne sait pas combien d'associations
		// on devra stocker au fil du temps
		
		this.table = new MyEntry[10];
	}

	// methode agrandissant la table quand c'est nécessaire
	private void agrandir() {
		// on crée une nouvelle table augmentee de 10 cases
		// on remet les associations existantes
		// en repassant par la fonction de hachage
		MyEntry<K,V>[] ancienneTable = table;
		table = new MyEntry[table.length+10];
		for (MyEntry<K,V> e: ancienneTable)
			this.put(e.key, e.value);
	}
	
	@Override
	public V put(K key, V value) {
		// si la table est pleine, on appelle la fonction agrandir
		if (table.length == this.size)
			this.agrandir();
		// on applique la fonction de hachage a la clef key
		// et on ramène la valeur dans [0,table.length[
		// cela donne un indice
		 int hashCourant = key.hashCode()%table.length;
		// si la table contient null a cet indice, c'est libre
		// et on y range l'association
		// sinon on cherche la premiere case du tableau qui contient null
		// comme la table n'est pas pleine, on est sûr qu'il en existe une
		while (table[hashCourant]!=null) {
			hashCourant++;
			if (hashCourant == table.length)
				hashCourant = hashCourant%table.length;
		}
		table[hashCourant]= new MyEntry(key, value);
		size++;
		return value;
	}
	
	// methodes A ECRIRE
	// méthode affichant tout le tableau, mêmes les entrées
	// vide (égales à null)

	public String toString() {
		return "";
	}
	
	// methode retournant l'ensemble de clefs
	@Override
	public Set<K> keySet() {
		Set<K> res = new HashSet<K>();
		// A COMPLETER ! 
		return res;
	}
	
	@Override
	public boolean containsKey(Object key) {
		// retourne vrai si keySet() contient key
		return false;
	}
	
	@Override
	public int size() {
		// A ECRIRE
		return 0;
	}
	
	@Override
	public boolean isEmpty() {
		// A ECRIRE
		return false;
	}

	@Override
	public V get(Object key) {
		// A ECRIRE
		return null;
	}
	
	// Methodes a ne pas ecrire
	// presentes seulement pour respecter l'interface
	// seraient écrites dans une version complete

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
