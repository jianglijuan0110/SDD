package seance1_Partie4_introduction_d_une_interface_carré_solution;

import java.util.Scanner;

public class MainRectangles {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		Point2d p1 = new Point2d(1,2);
		Point2d p2 = new Point2d(3,3);
		Point2d p3 = new Point2d(4,5);

		Rectangle1pt2lg r1 = new Rectangle1pt2lg(p1, 2, 3);
		Rectangle1pt2lg r2 = new Rectangle1pt2lg(p2, 3, 4);
		System.out.println("aire r1="+r1.aire());
		System.out.println("aire r2="+r2.aire());
		System.out.println("perimetre r1="+r1.perimetre());
		System.out.println("perimetre r2="+r2.perimetre());
		
		
		Rectangle2pts r3 = new Rectangle2pts(p1,p2);
		Rectangle2pts r4 = new Rectangle2pts(p1,p3);	
		System.out.println("aire r3="+r3.aire());
		System.out.println("aire r4="+r4.aire());
		System.out.println("perimetre r3="+r3.perimetre());
		System.out.println("perimetre r4="+r4.perimetre());
		
		Carre1pt1Lg c1 = new Carre1pt1Lg(p1,4);
		Carre1pt1Lg c2 = new Carre1pt1Lg(p2,2);
		c2.saisie(sc);
		
		DessinAvecRectangles dessin1 = new DessinAvecRectangles();
		dessin1.ajoute(r1);
		dessin1.ajoute(r2);	
		dessin1.ajoute(r3);
		dessin1.ajoute(r4);	
		dessin1.ajoute(c1);
		dessin1.ajoute(c2);
		System.out.println("aire moyenne "+dessin1.aireMoyenne());
	}
}
