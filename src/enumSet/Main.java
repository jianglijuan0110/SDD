package enumSet;

public class Main {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		// Creation de nos patates
		/**
		 * Voir l'enum  Potato*
		 * */
					
		// Creation de nos sac à patates
		System.out.println("########################################################################");
		System.out.println("\t\t\tCréation des sacs de patates ");
		System.out.println("########################################################################");
		Sac SacPatate1 = new Sac(1000);
		Sac SacPatate2 = new Sac(100);
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
		SacPatate1.addItem(Potato.Tunisian);
		SacPatate2.addItem(Potato.Tunisian);
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
		SacPatate1.addItem(Potato.Norwegian);
		SacPatate2.addItem(Potato.Norwegian);
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
		SacPatate1.addItem(Potato.French);
		SacPatate2.addItem(Potato.French);
		System.out.println();
		System.out.println("Taille du sac 1 : "+SacPatate1.Taille());
		SacPatate1.Info();
		System.out.println();
		System.out.println("Taille du sac 2 : "+SacPatate2.Taille());
		SacPatate2.Info();
		System.out.println();					
				
	    //Rajout des patates à  g22
		System.out.println("########################################################################");
		System.out.println("\t\t\tRajout des patate à 22g");
		System.out.println("########################################################################");
		SacPatate1.addItem(Potato.Senegalese);
		SacPatate2.addItem(Potato.Senegalese);
		System.out.println();
		System.out.println("Taille du sac 1 : "+SacPatate1.Taille());
		SacPatate1.Info();
		System.out.println();
		System.out.println("Taille du sac 2 : "+SacPatate2.Taille());
		SacPatate2.Info();
		System.out.println();
		
		
		System.out.println("########################################################################");
		System.out.println("\t\t\tRajout des patate à poids invalide (Russian)");
		System.out.println("########################################################################");
		System.out.println("Non permis");
		System.out.println();
		
		
		
		System.out.println("########################################################################");
		System.out.println("\t\t\tRajout des patates déjà existentes");
		System.out.println("########################################################################");
		System.out.println("Non permis");
		System.out.println();
		
		
		
		System.out.println("########################################################################");
		System.out.println("\t\t\tEnlevement des patates inexistantes");
		System.out.println("########################################################################");
		System.out.println("Non permis");
		System.out.println();
		
		
		
		//Ajouter un dernier element de 100g
		System.out.println("########################################################################");
		System.out.println("\t\t\tRajout des patate à 100g");
		System.out.println("########################################################################");
		SacPatate1.addItem(Potato.French);
		SacPatate1.addItem(Potato.Italien);
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
		SacPatate1.removeItem(Potato.Tunisian);
		SacPatate2.removeItem(Potato.Tunisian);
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
		SacPatate1.addItem(Potato.French);
		SacPatate1.addItem(Potato.Italien);
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
		System.out.println("Les plus Lourds du sac 2 : ");
		System.out.println(SacPatate2.getItemsLourds());
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
		System.out.println("-Sac 1 : recherche des elements avec un type 'norwegian'");
		System.out.println("-> "+SacPatate1.getByType(Potato.Norwegian));
		System.out.println("-Sac 2 : recherche des elements avec un type 'tunisian'");
		System.out.println("-> "+SacPatate2.getByType(Potato.Tunisian));
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
		SacPatate1.removeByType("French");
		System.out.println("-suppression des elements avec le type 'norwegian'");
		SacPatate1.removeByType("Norwegian");
		System.out.println();
		SacPatate1.Info();
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println("\t SAC 2 ");
		System.out.println();
		SacPatate2.Info();
		System.out.println();
		System.out.println("-suppression des elements avec le type 'tunisian'");
		SacPatate2.removeByType("Tunisian");
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
