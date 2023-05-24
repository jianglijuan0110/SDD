package seance5_streamsIterateurs_solution;

import java.util.Iterator;

public class IterateurDirectionLycee implements Iterator<EmployeLycee> {

	private DirectionLycee dir;
	private int nbEmployesDirRetournes;
	
	IterateurDirectionLycee(DirectionLycee dir){
		this.dir = dir;
	}
	
	@Override
	public boolean hasNext() {
		return nbEmployesDirRetournes < 5;
	}

	@Override
	public EmployeLycee next() {
		EmployeLycee e = null;
		switch(nbEmployesDirRetournes) {
		case 0: e = dir.getProviseur();break;
		case 1: e = dir.getProviseurAdjoint();break;
		case 2: e = dir.getConseillerPrincipaldEducation();break;
		case 3: e = dir.getGestionnaire();break;
		case 4: e = dir.getChefDeTravaux();break;
		}
		nbEmployesDirRetournes++;
		return e;
	}

}
