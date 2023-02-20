package seance3_2_file_attente_compléments_la_généricité_bornée;



public class main {

	public static void main(String[] args) {
		FileAttente<Enfant> f1 = new FileAttente<>();
		FileAttente<Adulte> f2 = new FileAttente<>();
		FileAttente<Personne> f3 = new FileAttente<>();
		Personne p1 = new Personne("a");
		Personne p2 = new Personne("b");
		
		Enfant e1 = new Enfant("d");
		Enfant e2 = new Enfant("c");
		
		Adulte a1 = new Adulte("e");
		Adulte a2 = new Adulte("f");
		
		f1.entre(e1);
		f1.entre(e2);
		
		f2.entre(a1);
		f2.entre(a2);
		
		f3.entre(e2);
		f3.entre(e1);
		f3.entre(p1);
		f3.entre(p2);
		f3.entre(a2);
		f3.entre(a1);
		
	System.out.println(FileAttente.memeType(f1,f1));
	System.out.println(f1.memeLongeur(f2));	
		
		

	}

}
