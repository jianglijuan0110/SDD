package seance1_Partie4_introduction_d_une_interface_carré_solution;

import java.util.Scanner;

public abstract class Rectangle implements IntRectangle {
	
	// attribut
	Point2d pointHG = new Point2d();
	
	// constructeurs

	public Rectangle() {
	}
	
	public Rectangle(Point2d pointHG) {
		if (pointHG==null) this.pointHG = new Point2d();
		else this.setPointHG(pointHG);
	}
	
	//Accesseurs
	@Override
	public Point2d getPointHG() {
		return pointHG;
	}
	
	public void setPointHG(Point2d pointHG) {
		if (pointHG!=null) this.pointHG = pointHG;
		//sinon le point est inchangé
	}
	
	// regarder quelles méthodes sont nécessaires ici

	@Override
	public void saisie(Scanner clavier) {
		System.out.println("Entrer le point en haut à gauche");
		pointHG.saisie(clavier);
	}

}
