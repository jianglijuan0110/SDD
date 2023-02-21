package seance1_Partie4_introduction_d_une_interface_carré_solution;

import java.util.Scanner;

/*
 * On s'intéresse aux rectangles en coordonnées entières 
 * dans un plan. 
 * Le point en haut à gauche du plan a pour cooordonnées (0,0).
 * Les coordonnées vont croissantes en descendant, donc
 * seront toujours positives ou nulles.
 * 
 * Dans cette classe rectangle, on stocke comme attributs
 * - le point en haut à gauche
 * - la longueur sur la dimension des abscisses ("en x")
 * - la longueur sur la dimension des ordonnées ("en y")
 */

public class Rectangle1pt2lg extends Rectangle{

	// attributs
	
	private int lgX, lgY;

	// constructeurs
	
	public Rectangle1pt2lg() {}
	public Rectangle1pt2lg(Point2d pointHG, int lgx, int lgy) {
		super(pointHG);
		this.setLgX(lgx);this.setLgY(lgy);
	}
	
	// accesseurs qui vérifient les valeurs
	
	public int getLgX() {
		return lgX;
	}
	public void setLgX(int lgx) {
		if (lgx>=0) this.lgX = lgx;
	}
	public int getLgY() {
		return lgY;
	}
	public void setLgY(int lgy) {
		if (lgy>=0) this.lgY = lgy;
	}
	
	// méthodes	
		
	@Override
		public void saisie(Scanner clavier) {	
		super.saisie(clavier);
		System.out.println("Entrer la longueur sur la dimension des abscisses (en x)");
		this.setLgX(clavier.nextInt());
		System.out.println("Entrer la longueur sur la dimension des ordonnées (en y)");
		this.setLgY(clavier.nextInt());
	}
	
	@Override
	public Point2d getPointBD() {
		return new Point2d(this.pointHG.getX()+this.getLgX(),
				this.pointHG.getY()+this.getLgY());
	}
}
