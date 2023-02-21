package seance1_partie3_interfaces_rectangle;

import java.util.Scanner;

/*
 * Cette classe doit décrire des points en 2 dimensions
 * en coordonnées entières et positives.
 * On placera comme attributs les 2 coordonnées :
 * - en abscisse (x)
 * - en ordonnées (y)
 */

public class Point2d {
	
	// attributs
	private int x, y;
	
	// constructeurs
	
	public Point2d() {
	}

	public Point2d(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	// accesseurs qui vérifient les valeurs	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x>0) this.x = x; 
		// sinon x non modifié
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y>0) this.y = y;
		// sinon y non modifié
	}

	//méthodes
		
	public void saisie(Scanner clavier) {
		System.out.println("Entrer l'abscisse (x)");
		this.setX(clavier.nextInt());
		System.out.println("Entrer l'ordonnée (y)");
		this.setY(clavier.nextInt());
	}

	@Override
	public String toString() {
		return "Point2d [x=" + x + ", y=" + y + "]";
	}

}
