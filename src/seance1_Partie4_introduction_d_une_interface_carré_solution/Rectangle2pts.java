package seance1_Partie4_introduction_d_une_interface_carré_solution;

import java.util.Scanner;

/*
 * On s'intéresse aux rectangles en coordonnées entières 
 * dans un plan. 
 * Le point en haut à gauche du plan a pour cooordonnées (0,0).
 * Les coordonnées vont croissantes en descendant, donc
 * seront toujours positives.
 * 
 * Dans cette classe rectangle, on stocke comme attributs
 * - le point en haut à gauche
 * - le point en bas à droite, dont les coordonnées doivent 
 * être supérieures à celles du point en haut à gauche
 * 
 */

public class Rectangle2pts extends Rectangle{
	
	// attributs
	
	private Point2d pointBD = new Point2d();
	
	// constructeurs
	
	public Rectangle2pts() {}
	public Rectangle2pts(Point2d pointHG, Point2d pointBD) {
		super(pointHG);
		if (pointBD==null) this.pointBD = new Point2d();
		if (Rectangle2pts.pointsCoherents(pointHG, pointBD))
			this.setPointHGetBD(pointHG, pointBD);
		else {Point2d point00 = new Point2d(0,0); Point2d point11 = new Point2d(1,1);
				this.setPointHGetBD(point00, point11);}
	}	
	
	// accesseurs qui vérifient les valeurs
	
	@Override
	public void setPointHG(Point2d pointHG) {
		if ((pointHG!=null && this.pointBD!=null &&
				Rectangle2pts.pointsCoherents(pointHG, this.pointBD)) 
			|| (pointHG!=null && this.pointBD==null))
			this.pointHG = pointHG;
		//sinon le point est inchangé
	}
	
	public Point2d getPointBD() {
		return this.pointBD;
	}
	public void setPointBD(Point2d pointBD) {
		if (pointBD!=null && 
				Rectangle2pts.pointsCoherents(this.pointHG, pointBD)) 
			this.pointBD = pointBD;
		//sinon le point est inchangé
	}
	
	public void setPointHGetBD(Point2d pointHG, Point2d pointBD) {
		if (Rectangle2pts.pointsCoherents(pointHG, pointBD))
		{this.pointHG = pointHG;this.pointBD = pointBD;}
	}
	public void saisie(Scanner clavier) {
		super.saisie(clavier);
		System.out.println("Point bas droite ?");
		Point2d phb = new Point2d();
		phb.saisie(clavier);
		this.setPointBD(phb);
	}
	
	// méthodes
	
	public static boolean pointsCoherents(Point2d phg, Point2d pbd) {
		System.out.println("phg "+phg);
		System.out.println("pbd "+pbd);
		return (pbd.getX()>=phg.getX())
				&& (pbd.getY()>=phg.getY());
	}
	@Override
	public int getLgX() {
		return pointBD.getX()-pointHG.getX();
	}
	@Override
	public int getLgY() {
		return pointBD.getY()-pointHG.getY();
	}
}

