package seance1_partie3_interfaces_rectangle;

import java.util.ArrayList;

public class DessinAvecRectangles {
	
	// attributs
	
	private ArrayList<IntRectangle> listeRectangles
										= new ArrayList<>();
	
	// constructeurs
	
	public DessinAvecRectangles() {}
	
	// méthodes
	
	public void ajoute(IntRectangle r) {
		if (! listeRectangles.contains(r))
			listeRectangles.add(r);
	}
	
	public int aireMoyenne() {
		int sommeAires=0;
		for (IntRectangle r : listeRectangles)
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
