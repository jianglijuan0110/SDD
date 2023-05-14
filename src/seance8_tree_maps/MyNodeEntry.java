package seance8_tree_maps;

import java.util.*;



public class MyNodeEntry<K extends Comparable<K>,V> extends MyEntry<K,V> {
	MyNodeEntry<K,V> left = null;
	MyNodeEntry<K,V> right = null;
	MyNodeEntry<K,V> parent;
	
	public MyNodeEntry(K key, V value, MyNodeEntry<K,V> parent) {
		super(key,value);
		this.parent=parent;
	}
	
	// écriture récursive de la méthode auxiliaire
	// appelée dans toString() de MyTreeMap
	
	public String toStringRec(String decalage) {
		String res = decalage+this.key.toString()+"\n";
		if (this.left != null)
				res += this.left.toStringRec(decalage+"  ");
		else res+= decalage+"  "+"."+"\n";
		if (this.right != null)
				res += this.right.toStringRec(decalage+"  ");
		else res+= decalage+"  "+"."+"\n";
		return res;
	}
	
	// méthodes demandées
	
	// écriture récursive de la méthode auxiliaire appelée 
	// par V get(K key) de MyTreeMap
	// de recherche d'une clef afin de retourner la valeur associée
	
	public V get(K key) {
		// si la clef est égale à key
		// retourner la valeur associée
		if(this.key.compareTo(key)==0)
			return this.value;
		
		
		// si la clef de la racine est inférieure à la clef cherchée
		// on appelle get sur le sous-arbre gauche 
		if(this.key.compareTo(key)>0 && this.left!=null) // a.compareTo(b)<0 => a<b
			return this.left.get(key);
		
		// si la clef de la racine est supérieure à la clef cherchée
		// on appelle get sur le sous-arbre droite
		if(this.key.compareTo(key)<0 && this.right!=null)
			return this.right.get(key);
		
		return null;
	}
	
	public void keySet(Set<K> res) {
		res.add(this.getKey());
		if(this.left!=null)
			this.left.keySet(res);
		if(this.right!=null)
			this.right.keySet(res);
			
		
	}
	
	public void keySetPrefixe(ArrayList<K> res) {
		// à écrire
	}

	public int nbFeuilles() {
		int cmp = 0;
		if(this.left==null && this.right==null)
			cmp++;
		if(this.left!=null)
			cmp+=this.left.nbFeuilles();
		if(this.right!=null)
			cmp+=this.right.nbFeuilles();
		return cmp;
	}
}
