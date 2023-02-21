package seance2_Solutions_des_exercices_sur_la_généricité_simple;

public class MainFileAttente {
	public static void main(String[] args) {
		FileAttente<Personne> f_personnes = new FileAttente<>();
		FileAttente<Tache> f_Taches = new FileAttente<>();
		
		f_personnes.entre(new Personne("Victor"));
		f_personnes.entre(new Personne("Mehdi"));
		f_personnes.entre(new Personne("Anna"));
		
		f_Taches.entre(new Tache("1","Mettre installation sous tension"));
		f_Taches.entre(new Tache("2","Démarrage ordinateurs"));
		f_Taches.entre(new Tache("3","Lancer les jobs"));
		
		System.out.println(f_personnes);
		System.out.println(f_Taches);
		
		System.out.println(f_Taches.equals(f_personnes));	
		
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		Personne p3 = new Personne();
		FileAttente<Personne> f_personnes1 = new FileAttente<>();
		f_personnes1.entre(p1);
		f_personnes1.entre(p2);
		f_personnes1.entre(p3);
		FileAttente<Personne> f_personnes2 = new FileAttente<>();
		f_personnes2.entre(p1);
		f_personnes2.entre(p2);
		f_personnes2.entre(p3);
		
		System.out.println(f_personnes1.equals(f_personnes2));
		System.out.println(f_personnes1.memeContenu(f_personnes2));
	
		System.out.println(f_personnes1.memeLongueur(f_Taches));

		System.out.println(FileAttente.nbElementsEntreesToutesFiles());	
	}
}
