package seance7_partie2_maps;

public class MyEntry<K,V> {
	K key;
	V value;
	
	public MyEntry(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public String toString() {
		return key+"-"+value;
	}
}
