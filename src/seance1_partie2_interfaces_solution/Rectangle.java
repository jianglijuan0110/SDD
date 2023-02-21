package seance1_partie2_interfaces_solution;

import java.util.Scanner;

public abstract class Rectangle implements IRectangle  {
	private Point2d pointHG = new Point2d();
	
	

	public Rectangle() {
		
	}



	public Rectangle(Point2d pointHG) {
	
		this.pointHG = pointHG;
	}
	
	
	public Point2d getPointHG() {
		return pointHG;
	}



	public void setPointHG(Point2d pointHG) {
		this.pointHG = pointHG;
	}



	public void saisie(Scanner clavier) {
		System.out.println("Point haut gauche ?");
		pointHG.saisie(clavier);
	}
	
	
}
