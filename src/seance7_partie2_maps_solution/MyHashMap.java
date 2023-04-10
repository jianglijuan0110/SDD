package seance7_partie2_maps_solution;

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
		if (table.length == this.size())
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
	
	// methodes a ecrire
	// méthode affichant tout le tableau, mêmes les entrées
	// vide (égales à null)

	public String toString() {
		String s="";
		for (MyEntry e : table)
		{
			s+=e+"\n";
		}
		return s;
	}
	
	// methode retournant l'ensemble de clefs
	@Override
	public Set<K> keySet() {
		Set<K> res = new HashSet<K>();
		for (MyEntry<K,V> e: table)
			if (e!=null)
				res.add(e.key);
		return res;
	}
	
	@Override
	public boolean containsKey(Object key) {
		// retourne vrai si keySet() contient key
		return this.keySet().contains(key);
	}
	
	@Override
	public int size() {
		return this.size;
	}
	
	@Override
	public boolean isEmpty() {
		return size()==0;
	}

	@Override
	public V get(Object key) {
		// si la Map ne contient pas la clef, on retourne null
		if (! this.containsKey(key))
			return null;
		// on applique la fonction de hachage a la clef key
		// cela donne un indice
		 int hashCourant = key.hashCode()%table.length;
		// si l'entree stockee a cet indice a bien la clef key
		// elle la retourne,
		// sinon c'est qu'il y a eu une collision
		// on fait une recherche séquentielle jusqu'a rencontrer la clef
		while (table[hashCourant].key!=key) {
				hashCourant++;
				if (hashCourant == table.length)
					hashCourant = hashCourant%table.length;
			}	
		return (V)(table[hashCourant].value);
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
