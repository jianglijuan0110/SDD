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
 * - la longueur >=0 sur la dimension des abscisses ("en x")
 * - la longueur >=0 sur la dimension des ordonnées ("en y")
 */

public class Rectangle1pt2lg extends Rectangle{

	// attributs
	

	private int lgx, lgy;
	
	// constructeurs
	
	public Rectangle1pt2lg() {}
	public Rectangle1pt2lg(Point2d pointHG, int lgx, int lgy) {
		super(pointHG);this.setLgx(lgx);this.setLgy(lgy);
	}
	
	// accesseurs qui vérifient les valeurs


	
	public int getLgx() {
		return lgx;
	}
	public void setLgx(int lgx) {
		if (lgx>=0) this.lgx = lgx;
	}
	public int getLgy() {
		return lgy;
	}
	public void setLgy(int lgy) {
		if (lgy>=0) this.lgy = lgy;
	}
	
	public void saisie(Scanner clavier) {	
		super.saisie(clavier);
		System.out.println("lgx ?");
		this.setLgx(clavier.nextInt());
		System.out.println("lgy ?");
		this.setLgy(clavier.nextInt());
	}
	
	
	// méthodes
	public Point2d getPointBD() {
		return new Point2d(this.getPointHG().getX()+this.lgx, this.getPointHG().getY()+this.lgy);
	}
	


	

}
