package seance5_streamsIterateurs;

import java.util.ArrayList;

public class DirectionLycee{
	private EmployeLycee proviseur,
						proviseurAdjoint,
						conseillerPrincipaldEducation,
						gestionnaire,
						chefDeTravaux;

	public DirectionLycee() {
	}

	public EmployeLycee getProviseur() {
		return proviseur;
	}

	public void setProviseur(EmployeLycee proviseur) {
		this.proviseur = proviseur;
	}

	public EmployeLycee getProviseurAdjoint() {
		return proviseurAdjoint;
	}

	public void setProviseurAdjoint(EmployeLycee proviseurAdjoint) {
		this.proviseurAdjoint = proviseurAdjoint;
	}

	public EmployeLycee getConseillerPrincipaldEducation() {
		return conseillerPrincipaldEducation;
	}

	public void setConseillerPrincipaldEducation(EmployeLycee conseillerPrincipaldEducation) {
		this.conseillerPrincipaldEducation = conseillerPrincipaldEducation;
	}

	public EmployeLycee getGestionnaire() {
		return gestionnaire;
	}

	public void setGestionnaire(EmployeLycee gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	public EmployeLycee getChefDeTravaux() {
		return chefDeTravaux;
	}

	public void setChefDeTravaux(EmployeLycee chefDeTravaux) {
		this.chefDeTravaux = chefDeTravaux;
	}
	
	public String toString() {
		String res ="Direction du lycee "
				+"\nproviseur "+this.getProviseur()
				+"\nproviseur adjoint "+this.getProviseurAdjoint()	
				+"\ngestionnaire "+this.getGestionnaire()		
				+"\nCPE "+this.getConseillerPrincipaldEducation()	
				+"\nChef de travaux "+this.getChefDeTravaux();
		return res;
	}
	
	public int ageMoyen() {
		 return (this.getProviseur().getAge()+
				this.getProviseurAdjoint().getAge()+
				this.getConseillerPrincipaldEducation().getAge()+
				this.getGestionnaire().getAge()+
				this.getChefDeTravaux().getAge())/5;
	}
		
	// Methode qui affiche les noms des employés sur la sortie standard 
	
	public void afficheNoms() {
		//TODO
	}
	
	// Methode qui retourne la liste des employes recrutes 
	// apres une certaine annee passee en parametre
	
	public ArrayList<EmployeLycee> recruteApres(int annee) {
		ArrayList<EmployeLycee> res = new ArrayList<>();
		//TODO
		return res;
	}


	
	//********* ITERATEUR ******************

	// Après avoir écrit l'itérateur et avoir transformé la
	// classe DirectionLycee en classe Iterable ...
	
	// Ecrire afficheNoms avec for (quand l'iterateur existe)
		
	// Ecrire recruteApres avec for (quand l'iterateur existe)

	
	//********* STREAM ******************
	
	// Stream 1 - Ecrire une methode retournant une liste contenant les membres de la direction
	// la liste peut être utilisée ci-dessous pour obtenir un stream puis
	// le naviguer
	
	// Stream 2 - Ecrire aussi une methode retournant un stream sur les membres
	// de la direction à partir de l'itérateur
	
	// Ecrire ageMoyen avec les 2 streams obtenus comme indiqué précédemment 
	
	// Ecrire afficheNoms avec l'un des 2 streams
	
	// Ecrire recruteApres avec l'un des 2 streams
			
	
}
