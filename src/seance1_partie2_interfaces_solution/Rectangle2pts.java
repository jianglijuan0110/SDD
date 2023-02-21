package seance1_partie2_interfaces_solution;

import java.util.Scanner;

/*
 * On s'intéresse aux rectangles en coordonnées entières 
 * dans un plan. 
 * Le point en haut à gauche du plan a pour cooordonnées (0,0).
 * Les coordonnées vont croissantes en descendant, donc
 * seront toujours positives.
 * 
 * Schéma :
 * 
 * Dans cette classe rectangle, on stocke comme attributs
 * - le point en haut à gauche
 * - le point en bas à droite, dont les coordonnées doivent 
 *   être supérieures à celles du point en haut à gauche
 * 
 */

public class Rectangle2pts extends Rectangle{
	
	// attributs
	
	
	private Point2d pointBD = new Point2d();
	
	// constructeurs
	
	public Rectangle2pts() {}
	
	public Rectangle2pts(Point2d pointHG, Point2d pointBD) {
		super(pointHG);
		this.pointBD=pointBD;
	}	

	// accesseurs qui vérifient les valeurs
	
	
	public Point2d getPointBD() {
		return pointBD;
	}
	
	public void saisie(Scanner clavier) {
		super.saisie(clavier);
		System.out.println("Point bas droite ?");
		pointBD.saisie(clavier);
	}
	
	// méthodes

	
	
	public  int getLgx() {
		return this.pointBD.getX()-super.getPointHG().getX();
	}
	
	public  int getLgy() {
		return this.pointBD.getY()-super.getPointHG().getY();
	}
	
	
	
}
