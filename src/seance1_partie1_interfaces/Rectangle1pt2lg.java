package seance1_partie1_interfaces;

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
 * - la longueur sur la dimension des abscisses ("en x")
 * - la longueur sur la dimension des ordonnées ("en y")
 */

public class Rectangle1pt2lg {

	// les attributs
	private Point2d p;
	private int lX;
	private int lY;
	
	//les constructeurs
	
	public Rectangle1pt2lg() {
		p = new Point2d();
	}
	
	
	public Rectangle1pt2lg(Point2d p, int lX, int lY) {

		this.p = p;
		this.lX = lX;
		this.lY = lY;
	}


	// écrire des accesseurs qui vérifient les valeurs
	public Point2d getP() {
		return p;
	}


	public void setP(Point2d p) {
		this.p = p;
	}


	public int getlX() {
		return lX;
	}


	public void setlX(int lX){
		this.lX = lX;
	}


	public int getlY() {
		return lY;
	}


	public void setlY(int lY) {
		this.lY = lY;
	}
	// TODO : écrire le code des méthodes ci-dessous
	
	public int aire() {
		return lX*lY;
	}	
	

	public void saisie(Scanner clavier) {	
		System.out.println("saisie un point");
		this.p.saisie(clavier);
		System.out.println("saisie la longueur l'abscisse");
		this.setlX(clavier.nextInt());
		System.out.println("saisie la longueur l'ordonnée");
		this.setlY(clavier.nextInt());
		
	}
	
}
