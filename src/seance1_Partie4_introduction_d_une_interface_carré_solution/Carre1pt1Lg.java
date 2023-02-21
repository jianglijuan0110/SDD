package seance1_Partie4_introduction_d_une_interface_carré_solution;

import java.util.Scanner;

public class Carre1pt1Lg extends Rectangle implements IntCarre {
	
	private int cote;

	public Carre1pt1Lg() {
	}
	
	public Carre1pt1Lg(Point2d pointHG, int cote) {
		super(pointHG);
		this.setCote(cote);
	}

	public int getCote() {
		return cote;
	}

	public void setCote(int cote) {
		if (cote>=0) this.cote = cote;
	}
	
	@Override
	public Point2d getPointBD() {
		return new Point2d(this.pointHG.getX()+this.getCote(),
				this.pointHG.getY()+this.getCote());
	}

	@Override
	public int getLgX() {
		return this.cote;
	}

	@Override
	public int getLgY() {
		return this.cote();
	}

	@Override
	public void saisie(Scanner clavier) {
		System.out.println("Entrer d'un carré");	
		super.saisie(clavier);
		System.out.println("Entrer le côté du carré");
		this.setCote(clavier.nextInt());
	}

	@Override
	public int cote() {
		// TODO Auto-generated method stub
		return 0;
	}

}
