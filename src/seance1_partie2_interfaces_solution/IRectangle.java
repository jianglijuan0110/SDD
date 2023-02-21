package seance1_partie2_interfaces_solution;

import java.util.Scanner;

public interface IRectangle {
	public abstract Point2d getPointHG();
	public abstract Point2d getPointBD();
	public abstract int getLgx();
	public abstract int getLgy();
	public default int aire() {return this.getLgx()*this.getLgy();}
	public default int perimetre() {return 2*(this.getLgx()+this.getLgy());}
	public abstract void saisie(Scanner clavier);
	
}
