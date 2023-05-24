package seance6_List_solution;

public class MainMyNode {
	public static void main(String[] arg) {
		
		// On cree 3 MyNode isoles contenant les lettres "e", "n", "z"
		
		MyNode<String> e = new MyNode<String>(null, "e", null);
		MyNode<String> n = new MyNode<String>(null, "n", null);
		MyNode<String> z = new MyNode<String>(null, "z", null);
		
		// On attache les noeuds entre eux pour qu'ils soient dans l'ordre
		// "n" "e" "z"	
		// celui qui porte "n" est le premier et a pour suivant celui qui porte "e"
		
		n.next=e;
		
		// celui qui porte "e" a pour suivant celui qui porte "z"
		// et pour précédent celui qui porte "n"
		
		e.next=z;
		e.prev=n;
		
		// celui qui porte "z" pour précédent celui qui porte "e"

		z.prev=e;
		
		// Pour vérifier que la chaine est bien construite du début vers la fin, 
		// on parcourt en partant du noeud contenant "n" 
		
		MyNode<String> courant1 = n;
		while (courant1 !=null) {
			System.out.println(courant1.item);
			courant1 = courant1.next; // on avance
		}
		
		// et on le fait en sens inverse
		
		MyNode<String> courant2 = z;
		while (courant2 !=null) {
			System.out.println(courant2.item);
			courant2 = courant2.prev; // on revient en arrière
		}
		
		// Exercice 0 : ajouter "o" entre "e" et "z" et vérifier que les liens
		// sont bien reconstitués en parcourant dans un sens puis dans l'autre

		MyNode<String> o = new MyNode<String>(null, "o", null);
		o.prev=e;
		o.next=z;
		z.prev=o;
		e.next=o;
		
		System.out.println("après ajout de o - sens avant");
		
		courant1 = n;
		while (courant1 !=null) {
			System.out.println(courant1.item);
			courant1 = courant1.next; // on avance
		}

		System.out.println("après ajout de o - sens arrière");

		courant2 = z;
		while (courant2 !=null) {
			System.out.println(courant2.item);
			courant2 = courant2.prev; // on revient en arrière
		}
		
		
		// Exercice 1 : Creer 4 MyNode isoles contenant les lettres "a", "o", "d", "s"
		
		MyNode<String> a = new MyNode<String>(null, "a", null);
		//MyNode<String> o = new MyNode<String>(null, "o", null);
		MyNode<String> d = new MyNode<String>(null, "d", null);
		MyNode<String> s = new MyNode<String>(null, "s", null);
	
		// Exercice 2 : attacher les MyNode entre eux 
		// pour qu'ils soient dans l'ordre "a" puis "d" puis "o" puis "s"
		
		a.next=d; // le precedent reste null
		d.prev=a; d.next=o;
		o.prev=d; o.next=s;
		s.prev=o; // le suivant reste null
		
		// Exercice 3 : vérifier que la chaine est bien construite du début vers la fin 
		// cela doit afficher "ado"
		
		MyNode<String> courant3 = a;
		while (courant3 !=null) {
			System.out.print(courant3.item);
			courant3 = courant3.next; // on avance
		}
		System.out.println();

		// Exercice 4 : vérifier que la chaine est bien construite de la fin vers le début
		// cela doit afficher "soda"
		
		MyNode<String> courant4 = s;
		while (courant4 !=null) {
			System.out.print(courant4.item);
			courant4 = courant4.prev; // on va en arriere
		}
		System.out.println();

	}
}
