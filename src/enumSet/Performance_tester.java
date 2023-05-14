	package enumSet;
	
	import java.util.ArrayList;
import java.util.EnumSet;
	
	public class Performance_tester {
	
		public static void main(String[] args) {
			
			int petit = 10000;
			int moyen = 1000000;
			long grand = 10000000;
			
			long debut, fin , duree;
			
			// ######################### petit #########################
			System.out.println();
			System.out.println("#############################################################################################");
			System.out.println();
			//ArrayList
			debut = System.nanoTime();
			ArrayList<Integer> ALpetit = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
				ALpetit.add(i);
			}
			fin = System.nanoTime();
			duree = (fin - debut)/ 1000000;
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList est de  : "+duree+" ms");
			
			
			//Stack
			debut = System.nanoTime();
			// METHODE DE RAJOUT
			fin = System.nanoTime();
			duree = (fin - debut)/ 1000000;
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList est de  : "+duree+" ms");
			
			
			//EnumSet
			debut = System.nanoTime();
			EnumSet<Potato> ESpetit = EnumSet.noneOf(Potato.class);
			EnumSet<Potato> items = EnumSet.of(Potato.French);
			for(int i = 0 ; i<= petit; i++) {
				ESpetit.addAll(items);
			}
			fin = System.nanoTime();
			duree = (fin - debut)/ 1000000;
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList est de  : "+duree+" ms");
			
			
			
	
			// ######################### moyen #########################
			System.out.println();
			System.out.println("#############################################################################################");
			System.out.println();
			//ArrayList
			debut = System.nanoTime();
			ArrayList<Integer> ALmoyen = new ArrayList<>();
			for(int i = 0 ; i<= moyen; i++) {
				ALmoyen.add(i);
			}
			fin = System.nanoTime() ;
			duree = (fin - debut)/ 1000000;
			System.out.println("La durée d'ajout de "+moyen+" elements dans ArrayList est de  : "+duree+" ms");
			
			
			//Stack
			debut = System.nanoTime();
			// METHODE DE RAJOUT
			fin = System.nanoTime();
			duree = (fin - debut)/ 1000000;
			System.out.println("La durée d'ajout de "+moyen+" elements dans Stack est de  : "+duree+" ms");
			
			
			//EnumSet
			debut = System.nanoTime();
			EnumSet<Potato> ESmoyen = EnumSet.noneOf(Potato.class);
			for(int i = 0 ; i<= moyen; i++) {
				ESmoyen.addAll(items);
			}
			fin = System.nanoTime();
			duree = (fin - debut)/ 1000000;
			System.out.println("La durée d'ajout de "+moyen+" elements dans EnumSet est de  : "+duree+" ms");
			
			
			
			
			// ######################### grand #########################
			System.out.println();
			System.out.println("#############################################################################################");
			System.out.println();
			//ArrayList
			debut = System.nanoTime();
			ArrayList<Long> ALgrand = new ArrayList<>();
			for(long i = 0 ; i<= grand; i++) {
				ALgrand.add(i);
			}
			fin = System.nanoTime();
			duree = (fin - debut) / 1000000;
			System.out.println("La durée d'ajout de "+grand+" elements dans ArrayList est de  : "+duree+" ms");
			
			
			//Stack
			debut = System.nanoTime();
			// METHODE DE RAJOUT
			fin = System.nanoTime();
			duree = (fin - debut)/ 1000000;
			System.out.println("La durée d'ajout de "+grand+" elements dans Stack est de  : "+duree+" ms");
			
			
			//EnumSet
			debut = System.nanoTime();
			EnumSet<Potato> ESgrand = EnumSet.noneOf(Potato.class);
			for(int i = 0 ; i<= grand; i++) {
				ESgrand.addAll(items);
			}
			fin = System.nanoTime();
			duree = (fin - debut)/ 1000000;
			System.out.println("La durée d'ajout de "+grand+" elements dans EnumSet est de  : "+duree+" ms");
	
		}

}
