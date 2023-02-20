package seance2_genericiteSimple_file_attente_question2;

import seance2_genericiteSimple_file_attente_question2.FileAttente;
import seance2_genericiteSimple_file_attente_question2.Personne;
import seance2_genericiteSimple_file_attente_question2.Tache;

public class main {

	public static void main(String[] args) {
		FileAttente<Personne> f1 = new FileAttente<>();
		FileAttente<Tache> f2 = new FileAttente<>();
		Personne p1 = new Personne("a");
		Personne p2 = new Personne("b");
		
		Tache t1 = new Tache(1,"d");
		Tache t2 = new Tache(2,"c");
		
		f1.entre(p1);
		f1.entre(p2);
		
		f2.entre(t1);
		f2.entre(t2);
		
	System.out.println(FileAttente.memeType(f1,f1));
	System.out.println(f1.memeLongeur(f2));	
		
		

	}

}
