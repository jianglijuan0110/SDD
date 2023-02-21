package seance3_Solution_rayon_et_produits;

public class MainRayon {
	public static void main(String[] argv){
		Rayon<Produit> rp = new Rayon<>();
		rp.MetEnRayon(new Produit("lait", "34999"));
		rp.MetEnRayon(new Produit("cannelle", "88009"));
		System.out.println(rp.listingContenu());
		Rayon<Livre> rl = new Rayon<>();
		rl.MetEnRayon(new Livre("Otto et Etta"));
		rl.MetEnRayon(new Livre("Un amour impossible"));
		rl.MetEnRayon(new Livre("Au revoir là-haut"));
		System.out.println(rl.listingContenu());
		}
}
