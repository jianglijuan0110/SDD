package seance1_interfaces;

import java.util.Scanner;

/*
 * Cette classe doit décrire des points en 2 dimensions
 * en coordonnées entières et positives.
 * On placera comme attributs les 2 coordonnées :
 * - en abscisse (x)
 * - en ordonnées (y)
 */

public class Point2d {
	
	// les attributs
	private int x;
	private int y;
	
	// les constructeurs
	
	public Point2d(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	public Point2d() {
		
	}

	// des accesseurs qui vérifient les valeurs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		if(x>=0)
			this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if(y >= 0)
			this.y = y;
	}
	
	public void saisie(Scanner clavier) {
		System.out.println("saisie l'abscisse x :");
		this.setX(clavier.nextInt());
		System.out.println("saisie l'ordonnée y :");
		this.setY(clavier.nextInt());
	}

}
