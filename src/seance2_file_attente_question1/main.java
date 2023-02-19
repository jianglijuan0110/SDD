package seance2_file_attente_question1;

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
		
		System.out.print(f1);
		System.out.print(f2);
		
		

	}

}
