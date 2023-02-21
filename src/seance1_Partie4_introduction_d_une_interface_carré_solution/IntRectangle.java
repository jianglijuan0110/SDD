package seance1_Partie4_introduction_d_une_interface_carré_solution;

import java.util.Scanner;

public interface IntRectangle {
	// attribut public static final	
	
	int nbCotes=4;

	// méthodes public abstract
	
	Point2d getPointHG();
	Point2d getPointBD();
	int getLgX();
	int getLgY();	
	void saisie(Scanner clavier); 
			
	// méthodes public default
	
	// On ne peut pas mettre de méthode toString 
	default public String infos() {
		return "rectangle, d'aire "+this.aire();
	}
	
	default int aire() {
		return this.getLgX()*this.getLgY();
	}
	
	default int perimetre() {
		return 2*(this.getLgX()+this.getLgY());
	}
		
	// méthode public static
	
	static boolean deMemeAire(IntRectangle r1, IntRectangle r2) {
		return r1.aire() == r2.aire();
	}
}
