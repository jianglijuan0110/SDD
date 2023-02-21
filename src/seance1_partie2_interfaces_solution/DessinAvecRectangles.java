package seance1_partie2_interfaces_solution;

import java.util.ArrayList;

public class DessinAvecRectangles {
	
	// attributs
	
	private ArrayList<Rectangle1pt2lg> listeRectangles
										= new ArrayList<>();
	
	// constructeurs
	
	public DessinAvecRectangles() {}
	
	// méthodes
	
	public void ajoute(Rectangle1pt2lg r) {
		if (! listeRectangles.contains(r))
			listeRectangles.add(r);
	}
	
	public double aireMoyenne() {
		int sommeAires=0;
		for (Rectangle1pt2lg r : listeRectangles)
			sommeAires+=r.aire();
		if (listeRectangles.isEmpty())
		{
			return 0;
		}
		else 
		{
			return sommeAires/listeRectangles.size();
		}
	}

}
