package seance3_rayon_la_généricité_bornée;

public class main {

	public static void main(String[] args) {
		
		Rayon<Livre> r1 = new Rayon<>();
		Rayon<Produit> r2 = new Rayon<>();
		Livre l1 = new Livre("1");
		Livre l2 = new Livre("2");
		Produit p1 = new Produit("3");
		Produit p2 = new Produit("4");
		
		r1.ajoute(l1);
		r1.ajoute(l2);
		
		r2.ajoute(p1);
		r2.ajoute(p2);
		r2.ajoute(l1);
		r2.ajoute(l2);
		
		System.out.println(r1.listingContenu());
		System.out.println(r2.listingContenu());
		
		

	}

}
