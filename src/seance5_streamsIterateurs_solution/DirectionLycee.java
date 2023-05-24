package seance5_streamsIterateurs_solution;

import java.util.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;


public class DirectionLycee implements Iterable<EmployeLycee>{
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
				+"\nChef de travaux "+this.getProviseurAdjoint();
		return res;
	}
	
	public int ageMoyen() {
		 return (this.getProviseur().getAge()+
				this.getProviseurAdjoint().getAge()+
				this.getConseillerPrincipaldEducation().getAge()+
				this.getGestionnaire().getAge()+
				this.getChefDeTravaux().getAge())/5;
	}
	
	public ArrayList<EmployeLycee> recruteApres(int annee) {
		ArrayList<EmployeLycee> res = new ArrayList<>();
		 if (this.getProviseur().getAnneeRecrutement()>=annee)
			 res.add(this.getProviseur());
		 if (this.getProviseurAdjoint().getAnneeRecrutement()>=annee)
			 res.add(this.getProviseurAdjoint());
		 if (this.getConseillerPrincipaldEducation().getAnneeRecrutement()>=annee)
			 res.add(this.getConseillerPrincipaldEducation());		 
		 if (this.getGestionnaire().getAnneeRecrutement()>=annee)
			 res.add(this.getGestionnaire());
		 if (this.getChefDeTravaux().getAnneeRecrutement()>=annee)
			 res.add(this.getChefDeTravaux());
		return res;
	}
	
	public void afficheNoms() {
		System.out.println(
				"\n"+this.getProviseur().getNom()+" "
				+"\n"+this.getProviseurAdjoint().getNom()+" "
				+"\n"+this.getGestionnaire().getNom()+" "		
				+"\n"+this.getConseillerPrincipaldEducation().getNom()+" "	
				+"\n"+this.getChefDeTravaux().getNom()+" ");
	}
	

	@Override
	public IterateurDirectionLycee iterator() {
		return new IterateurDirectionLycee(this);
	}

	
	//********* ITERATEUR ******************
	
	// Ecrire ageMoyen avec l'itérateur et for
	
	public int ageMoyenIte() {
		int sommeAge = 0;
		for (EmployeLycee e : this) {
			sommeAge+=e.getAge();
		}
		return sommeAge/5;
	}
	
	public int ageMoyenIte2() {
		int sommeAge = 0;
		IterateurDirectionLycee ite = this.iterator();
		while (ite.hasNext()) {
			sommeAge+=ite.next().getAge();
		}
		return sommeAge/5;
	}
	
	// Ecrire recruteApres avec for (quand l'iterateur existe)
	
	public ArrayList<EmployeLycee> recruteApresIte(int annee) {
		ArrayList<EmployeLycee> res = new ArrayList<>();
		for (EmployeLycee e : this)
			if (e.getAnneeRecrutement()>=annee)
				res.add(e);
		return res;
	}
	
	// Ecrire afficheNoms avec for (quand l'iterateur existe)
	
	public void afficheNomsIte() {
		for (EmployeLycee e : this) {
			System.out.println(e.getNom());
		}
	}
	
	// Ecrire afficheNomsRecrutesApres avec for (quand l'iterateur existe)
	
	public void afficheNomsRecrutesApresIte(int annee) {
		for (EmployeLycee e : this)
			if (e.getAnneeRecrutement()>=annee)
				System.out.println(e.getNom());;
	}
	
	//********* STREAM ******************
	
	// Ecrire une methode retournant une liste contenant les membres de la direction
	// Cette liste est un support pour les exercices sur les streams
	
	public ArrayList<EmployeLycee> membres(){
		ArrayList<EmployeLycee> res = new ArrayList<>();
		for (EmployeLycee e : this)
				res.add(e);
		return res;
	}
	
	// Une autre méthode pour créer un stream de membres
	// à partir de l'itérateur
	
	public static <T> Stream<T> iteratorVersStreamSequentiel(Iterator<T> ite)
	{
		// convertit ite en spliterator
		Spliterator<T> spitr = Spliterators.spliteratorUnknownSize(
                               ite, Spliterator.NONNULL);
		// puis convertit le spliterator en stream sequentiel
		// "false" indicates que le stream ne sera pas parallele
		return StreamSupport.stream(spitr, false);
	}
	
	public Stream<EmployeLycee> streamMembres(){
		return iteratorVersStreamSequentiel(new IterateurDirectionLycee(this));
	}
	
	// Ecrire ageMoyen avec un stream sur la liste precedente
	// lui faire retourner un double
	
	public double ageMoyenStream() {
		return this.membres().stream()
				.mapToInt(m -> m.getAge())
				.average()
				.getAsDouble();
	}
	
	// version utilisant le stream créé à partir de l'itérateur
	public double ageMoyenStream2() {
		return this.streamMembres()
				.mapToInt(m -> m.getAge())
				.average()
				.getAsDouble();
	}
	
	// Ecrire recruteApres avec un stream : 2 solutions possibles
	
	public List<EmployeLycee> recruteApresStreamBis(int annee)
	{
		return membres()
		.stream()
		.filter(d->(d.getAnneeRecrutement()>=annee))
		.collect(Collectors.toList());
	
	}
	
	public ArrayList<EmployeLycee> recruteApresStream(int annee) {
		ArrayList<EmployeLycee> res = new ArrayList<>();
		this.membres().stream()
			.filter(m->m.getAnneeRecrutement()>=annee)
			.forEach(m->{res.add(m);});
		return res;
	}
	
	// Ecrire afficheNoms avec un stream
	
	public void afficheNomsStream() {
		this.membres().stream()
		.map(m->m.getNom())
		.forEach(System.out::println);
	}
	//
	
	// Ecrire afficheNomsRecrutesApres avec un stream
	
	public void afficheNomsRecrutesApresStream(int annee) {
		this.membres().stream()
		.filter(m->m.getAnneeRecrutement()>=annee)
		.map(m->m.getNom())
		.forEach(System.out::println);
	}
	
	//********* AUTRES METHODES ******************
	
	// Ecrire une methode retournant l'age moyen 
	// des membres d'une certaine categorie recrutes
	// avant une certaine annee
	
	// version 1 : sans considerer l'iterateur (pas de for)
	
	public double ageMoyenCategorieAvant(Categorie cat, int annee)
	{
		int sommeAge = 0; int nb = 0;
		if (this.getProviseur().getAnneeRecrutement()<=annee &&
				this.getProviseur().getCategorie().equals(cat))
			{sommeAge += this.getProviseur().getAge();nb++;}
		if (this.getProviseurAdjoint().getAnneeRecrutement()<=annee &&
				this.getProviseurAdjoint().getCategorie().equals(cat))
			{sommeAge += this.getProviseurAdjoint().getAge();nb++;}
		if (this.getConseillerPrincipaldEducation().getAnneeRecrutement()<=annee &&
				this.getConseillerPrincipaldEducation().getCategorie().equals(cat))
			{sommeAge += this.getConseillerPrincipaldEducation().getAge();nb++;}	
		if (this.getGestionnaire().getAnneeRecrutement()<=annee &&
				this.getGestionnaire().getCategorie().equals(cat))
			{sommeAge += this.getGestionnaire().getAge();nb++;}	
		if (this.getChefDeTravaux().getAnneeRecrutement()<=annee &&
				this.getChefDeTravaux().getCategorie().equals(cat))
			{sommeAge += this.getChefDeTravaux().getAge();nb++;}	
		if (nb > 0)
			return sommeAge/nb;
		else return 0;
	}
	
	// version 2 : en considérant l'iterateur (avec for)
	
	public double ageMoyenCategorieAvantIte(Categorie cat, int annee)
	{
		int sommeAge = 0; int nb =0;
		for (EmployeLycee e : this)
			if (e.getAnneeRecrutement() <= annee 
					&& e.getCategorie().equals(cat))
				{sommeAge += e.getAge();nb++;}
		if (nb > 0)
			return sommeAge/nb;
		else return 0;
	}
	
	// version 3 : avec un stream
	
	public double ageMoyenCategorieAvantStream(Categorie cat, int annee)
	{
		return this.membres().stream()
			.filter(m->m.getAnneeRecrutement()<=annee)
			.filter(m->m.getCategorie().equals(cat))	
			.mapToInt(m->m.getAge())
			.average()
			.getAsDouble();
	}
	
	//*********  ******************
	
	// Ecrire une methode retournant l'annee de recrutement
	// la plus ancienne pour les employes 
	// d'un certain corps
	
	
	// version 1 : sans considerer l'iterateur (pas de for)
	
	public int anneeRecrutementPlusAnciennePourCorps(String corps)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int dateMin = calendar.get(Calendar.YEAR);
		 if (this.getProviseur().getCorps().equals(corps) 
				 && (this.getProviseur().getAnneeRecrutement() < dateMin))
			 dateMin=this.getProviseur().getAnneeRecrutement();
		 if (this.getProviseurAdjoint().getCorps().equals(corps) 
				 && (this.getProviseurAdjoint().getAnneeRecrutement() < dateMin))
			 dateMin=this.getProviseurAdjoint().getAnneeRecrutement();
		 if (this.getConseillerPrincipaldEducation().getCorps().equals(corps)  
				 && (this.getConseillerPrincipaldEducation().getAnneeRecrutement() < dateMin))
			 dateMin=this.getConseillerPrincipaldEducation().getAnneeRecrutement();	 
		 if (this.getGestionnaire().getCorps().equals(corps) 
				 && (this.getGestionnaire().getAnneeRecrutement()< dateMin))
			 dateMin=this.getGestionnaire().getAnneeRecrutement();
		 if (this.getChefDeTravaux().getCorps().equals(corps) 
				 && (this.getChefDeTravaux().getAnneeRecrutement()< dateMin))
			 dateMin=this.getChefDeTravaux().getAnneeRecrutement();
		return dateMin;
	}	
	// version 2 : en considérant l'iterateur (avec for)
	
	public int anneeRecrutementPlusAnciennePourCorpsIte(String corps)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int dateMin = calendar.get(Calendar.YEAR);
		for (EmployeLycee e : this)
		{
			 if (e.getCorps().equals(corps)  && (e.getAnneeRecrutement() < dateMin))
				 dateMin=e.getAnneeRecrutement();
		}
		return dateMin;
	}
	
	// version 3 : avec un stream
	
	public OptionalInt anneeRecrutementPlusAnciennePourCorpsStream(String corps)
	{
		return this.membres().stream()
			.filter(m->m.getCorps().equals(corps))	
			.mapToInt(m->m.getAnneeRecrutement())
			.min();
	}
}
