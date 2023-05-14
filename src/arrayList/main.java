package arrayList;

import arrayList.Potato;
import arrayList.Sac;

public class main {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis(); 
		
		// Creation de no patates avec des erreurs
		Potato patate1 = new Potato("french",100);
		Potato patate2 = new Potato("tunisian",20);
		Potato patate3 = new Potato("norwegian",-2);
		
		System.out.println("Ancien poid mal écrit : "+patate3.getPoids());
		
		// Rectification de l'erreure
		patate3.setPoids(58);
		System.out.println("Nouveau poid : "+patate3.getPoids());
		System.out.println();
		
		// Creation de nos sac à patates
		System.out.println("########################################################################");
		System.out.println("\t\t\tCréation des sacs de patates ");
		System.out.println("########################################################################");
		Sac<Potato> SacPatate1 = new Sac<Potato>(1000);
		Sac<Potato> SacPatate2 = new Sac<Potato>(100);
		System.out.println("Taille du sac 1 : "+SacPatate1.Taille());
		SacPatate1.Info();
		System.out.println();
		System.out.println("Taille du sac 2 : "+SacPatate2.Taille());
		SacPatate2.Info();
		System.out.println();
		
		//Rajout des patates à 20 g
		System.out.println("########################################################################");
		System.out.println("\t\t\tRajout des patate à 20g");
		System.out.println("########################################################################");
		SacPatate1.addItem(patate2);
		SacPatate2.addItem(patate2);
		System.out.println();
		System.out.println("Taille du sac 1 : "+SacPatate1.Taille());
		SacPatate1.Info();
		System.out.println();
		System.out.println("Taille du sac 2 : "+SacPatate2.Taille());
		SacPatate2.Info();
		System.out.println();
		//Rajout des patates à 58 g

		System.out.println("########################################################################");
		System.out.println("\t\t\tRajout des patate à 58g");
		System.out.println("########################################################################");
		SacPatate1.addItem(patate3);
		SacPatate2.addItem(patate3);
		System.out.println();
		System.out.println("Taille du sac 1 : "+SacPatate1.Taille());
		SacPatate1.Info();
		System.out.println();
		System.out.println("Taille du sac 2 : "+SacPatate2.Taille());
		SacPatate2.Info();
		System.out.println();
		
		//Rajout des patates à  100 g
		System.out.println("########################################################################");
		System.out.println("\t\t\tRajout des patate à 100g");
		System.out.println("########################################################################");
		SacPatate1.addItem(patate1);
		SacPatate2.addItem(patate1);
		System.out.println();
		System.out.println("Taille du sac 1 : "+SacPatate1.Taille());
		SacPatate1.Info();
		System.out.println();
		System.out.println("Taille du sac 2 : "+SacPatate2.Taille());
		SacPatate2.Info();
		System.out.println();
		
		//Création de nouveai elements
		Potato patate4 = new Potato("italian",100);
		Potato patate5 = new Potato("senegalese",22);
		Potato patate6 = new Potato("russian",-2);
		
		
		//Rajout des patates à  g22
		System.out.println("########################################################################");
		System.out.println("\t\t\tRajout des patate à 22g");
		System.out.println("########################################################################");
		SacPatate1.addItem(patate5);
		SacPatate2.addItem(patate5);
		System.out.println();
		System.out.println("Taille du sac 1 : "+SacPatate1.Taille());
		SacPatate1.Info();
		System.out.println();
		System.out.println("Taille du sac 2 : "+SacPatate2.Taille());
		SacPatate2.Info();
		System.out.println();
		
		//Rajout des patate 100g italienne
		System.out.println("########################################################################");
		System.out.println("\t\t\tRajout des patate à poids invalide (Russian)");
		System.out.println("########################################################################");
		SacPatate1.addItem(patate6);
		SacPatate2.addItem(patate6);
		System.out.println();
		System.out.println("Taille du sac 1 : "+SacPatate1.Taille());
		SacPatate1.Info();
		System.out.println();
		System.out.println("Taille du sac 2 : "+SacPatate2.Taille());
		SacPatate2.Info();
		System.out.println();
		
		//Essayer de rajouter le même element
		System.out.println("########################################################################");
		System.out.println("\t\t\tRajout des patates déjà existentes");
		System.out.println("########################################################################");
		SacPatate1.addItem(patate1);
		SacPatate2.addItem(patate1);
		System.out.println();
		System.out.println("Taille du sac 1 : "+SacPatate1.Taille());
		SacPatate1.Info();
		System.out.println();
		System.out.println("Taille du sac 2 : "+SacPatate2.Taille());
		SacPatate2.Info();
		System.out.println();
		
		//Enlever un element
		System.out.println("########################################################################");
		System.out.println("\t\t\tEnlevement des patates");
		System.out.println("########################################################################");
		SacPatate1.removeItem(patate2);
		SacPatate2.removeItem(patate2);
		System.out.println();
		System.out.println("Taille du sac 1 : "+SacPatate1.Taille());
		SacPatate1.Info();
		System.out.println();
		System.out.println("Taille du sac 2 : "+SacPatate2.Taille());
		SacPatate2.Info();
		System.out.println();
		//Enlever des elements inexistants
		System.out.println("########################################################################");
		System.out.println("\t\t\tEnlevement des patates inexistantes");
		System.out.println("########################################################################");
		SacPatate1.removeItem(patate1);
		SacPatate2.removeItem(patate1);
		System.out.println();
		System.out.println("Taille du sac 1 : "+SacPatate1.Taille());
		SacPatate1.Info();
		System.out.println();
		System.out.println("Taille du sac 2 : "+SacPatate2.Taille());
		SacPatate2.Info();
		System.out.println();
		
		//Ajouter un dernier element de 100g
		System.out.println("########################################################################");
		System.out.println("\t\t\tRajout des patate à 100g");
		System.out.println("########################################################################");
		SacPatate1.addItem(patate1);
		SacPatate1.addItem(patate4);
		System.out.println();
		System.out.println("Taille du sac 1 : "+SacPatate1.Taille());
		SacPatate1.Info();
		System.out.println();
		System.out.println("Taille du sac 2 : "+SacPatate2.Taille());
		SacPatate2.Info();
		System.out.println();
		
		//Information sur les elements les plus lourds
		System.out.println("########################################################################");
		System.out.println("\t\t\tElements lourds");
		System.out.println("########################################################################");
		System.out.println();
		System.out.println("Les plus lourds du sac 1 : ");
		System.out.println(SacPatate1.getItemsLourds());
		System.out.println();
		System.out.println("Les plus Lourds du sac 2 : "+SacPatate2.Taille());
		System.out.println(SacPatate2.getItemsLourds());
		System.out.println();
		
		//Creation des patates avec les mêmes types mais pas le même objet
		System.out.println("########################################################################");
		System.out.println("\t\t\tActualisation de nos sacs");
		System.out.println("########################################################################");
		Potato patate100 = new Potato("tunisian",12);
		SacPatate2.removeItem(patate3);
		SacPatate1.addItem(patate100);
		SacPatate2.addItem(patate100);
		SacPatate1.addItem(patate2);
		SacPatate2.addItem(patate2);		
		System.out.println();
		System.out.println("Taille du sac 1 : "+SacPatate1.Taille());
		SacPatate1.Info();
		System.out.println();
		System.out.println("Taille du sac 2 : "+SacPatate2.Taille());
		SacPatate2.Info();
		System.out.println();

		//Les méthodes Get
		System.out.println("########################################################################");
		System.out.println("\t\t\tRecherche des Elements par poids");
		System.out.println("########################################################################");
		System.out.println();
		System.out.println("-Sac 1 : recherche des elements avec un poids 140");
		System.out.println("-> "+SacPatate1.getByPoids(140));
		System.out.println("-Sac 1 : recherche des elements avec un poids 100");
		System.out.println("-> "+SacPatate1.getByPoids(100));
		System.out.println("-Sac 2 : recherche des elements avec un poids 12");
		System.out.println("-> "+SacPatate2.getByPoids(12));
		System.out.println();
		System.out.println("########################################################################");
		System.out.println("\t\t\tRecherche des Elements par type");
		System.out.println("########################################################################");
		System.out.println();
		System.out.println("-Sac 1 : recherche des elements avec un type 'spanish'");
		System.out.println("-> "+SacPatate1.getByType("spanish"));
		System.out.println("-Sac 1 : recherche des elements avec un type 'norwegian'");
		System.out.println("-> "+SacPatate1.getByType("norwegian"));
		System.out.println("-Sac 2 : recherche des elements avec un type 'tunisian");
		System.out.println("-> "+SacPatate2.getByType("tunisian"));
		System.out.println();
		
		System.out.println("########################################################################");
		System.out.println("\t\t\tRecherche des Elements par typeStream");
		System.out.println("########################################################################");
		System.out.println();
		System.out.println("-Sac 1 : recherche des elements avec un type 'spanish'");
		System.out.println("-> "+SacPatate1.getByTypeStream("spanish"));
		System.out.println("-Sac 1 : recherche des elements avec un type 'norwegian'");
		System.out.println("-> "+SacPatate1.getByTypeStream("norwegian"));
		System.out.println("-Sac 2 : recherche des elements avec un type 'tunisian");
		System.out.println("-> "+SacPatate2.getByTypeStream("tunisian"));
		System.out.println();
		//La suppression	
		System.out.println("########################################################################");
		System.out.println("\t\t\tSuppression des Elements par poids");
		System.out.println("########################################################################");
		System.out.println("\t SAC 1 ");
		System.out.println();
		SacPatate1.Info();
		System.out.println();
		System.out.println("-Sac 1 : suppression des elements avec un poids 140");
		SacPatate1.removeByPoids(140);
		System.out.println("-Sac 1 : suppression des elements avec un poids 100");
		SacPatate1.removeByPoids(100);
		System.out.println();
		SacPatate1.Info();
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println("\t SAC 2 ");
		System.out.println();
		System.out.println();
		SacPatate2.Info();
		System.out.println();
		System.out.println("-Sac 2 : suppression des elements avec un poids 22");
		SacPatate2.removeByPoids(22);
		System.out.println();
		SacPatate2.Info();
		System.out.println();
		System.out.println("########################################################################");
		System.out.println("\t\t\tSuppression des Elements par type");
		System.out.println("########################################################################");
		System.out.println("\t SAC 1 ");
		System.out.println();
		SacPatate1.Info();
		System.out.println();
		System.out.println("-suppression des elements avec le type 'french'");
		SacPatate1.removeByType("french");
		System.out.println("-suppression des elements avec le type 'norwegian'");
		SacPatate1.removeByType("norwegian");
		System.out.println();
		SacPatate1.Info();
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println("\t SAC 2 ");
		System.out.println();
		SacPatate2.Info();
		System.out.println();
		System.out.println("-suppression des elements avec le type 'tunisian'");
		SacPatate2.removeByType("tunisian");
		System.out.println();
		SacPatate2.Info();
		System.out.println();
		
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println();
		System.out.println();
		System.out.println("Time taken by main method: " + duration + " milliseconds");
		
		
	}
		
		
		
	
		
		
	

}
