package seance1_partie2_interfaces_solution;


public class MainRectangles {

	public static void main(String[] arg) {
		Point2d p1 = new Point2d(1,2);
		Point2d p2 = new Point2d(3,3);
		Point2d p3 = new Point2d(4,5);

		Rectangle1pt2lg r1 = new Rectangle1pt2lg(p1, 2, 3);
		Rectangle1pt2lg r2 = new Rectangle1pt2lg(p2, 3, 4);
		
		Rectangle2pts r3 = new Rectangle2pts(p1,p2);
		Rectangle2pts r4 = new Rectangle2pts(p1,p3);	
			
		DessinAvecRectangles dessin1 = new DessinAvecRectangles();
		dessin1.ajoute(r1);
		dessin1.ajoute(r2);	
		System.out.println("aire moyenne "+dessin1.aireMoyenne());
		
		// On ne peut pas insérer r3 et r4 dans le dessin de rectangles 
		// dessin1 car ils ne sont pas du bon type
		// Dans DessinAvecRectangles la liste contient des Rectangle1pt2lg
		
		// Solutions possibles :
		// - Faire une copie de DessinAvecRectangles, sous un autre nom
		//   et changer le type des éléments stockés dans la liste
		// - Transformer DessinAvecRectangles : stocker dans la liste des éléments 
		//   du type d'une super-classe de Rectangle1pt2lg et Rectangle2pts

	}
}
