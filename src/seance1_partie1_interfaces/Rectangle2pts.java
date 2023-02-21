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
 * - le point en bas à droite, dont les coordonnées doivent 
 * être supérieures à celles du point en haut à gauche
 * 
 */

public class Rectangle2pts {
	
	// TODO : écrire les attributs
	private Point2d p1;
	private Point2d p2;
	
	// TODO : écrire les constructeurs
	
	public Rectangle2pts() {
		
	}
	
	public Rectangle2pts(Point2d p1, Point2d p2) {
	
		this.p1 = p1;
		this.p2 = p2;
	}

	// TODO : écrire des accesseurs qui vérifient les valeurs

	public Point2d getP1() {
		return p1;
	}

	public void setP1(Point2d p1) {
		this.p1 = p1;
	}

	public Point2d getP2() {
		return p2;
	}

	public void setP2(Point2d p2) {
		if(p2.getX()>p1.getX() && p2.getY()>p1.getY())
			this.p2 = p2;
	}
	// TODO : écrire le code des méthodes ci-dessous

	public int aire() {
		return (p2.getX()-p1.getX())*(p2.getY()-p1.getY());
	}
	
	
	public int perimetre() {
		return 2*((p2.getX()-p1.getX())+(p2.getY()-p1.getY()));
	}	
	
	public void saisie(Scanner clavier) {
		
		System.out.println("saisie le point origine");
		this.p1.saisie(clavier);
		System.out.println("saisie le point en bas à droite");
		this.p2.saisie(clavier);
		
	}


}
