package seance1_partie1_interfaces;

import java.util.Scanner;

public class MainRectangles {

	public static void main(String[] arg) {
		Scanner clavier = new Scanner(System.in);
		Point2d p1 = new Point2d();
		Point2d p2 = new Point2d();
		Point2d p3 = new Point2d();
		
		Rectangle1pt2lg r1 = new Rectangle1pt2lg();
		Rectangle1pt2lg r2 = new Rectangle1pt2lg();
		
		Rectangle2pts r3 = new Rectangle2pts();
		Rectangle2pts r4 = new Rectangle2pts();
		
		DessinAvecRectangles dessin1 = new DessinAvecRectangles();
		dessin1.ajoute(r1);
		dessin1.ajoute(r2);	
		r1.saisie(clavier);
		r2.saisie(clavier);
		System.out.println("aire moyenne "+dessin1.aireMoyenne());
	}
}
