	package stack;
	
	import java.util.ArrayList;
	import java.util.Stack;
	
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
			// long debut = System.nanoTime();
			Stack<Integer> stackPetit = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
			    stackPetit.push(i);
			}

			fin = System.nanoTime();
			duree = (fin - debut)/ 1000000;
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack est de  : "+duree+" ms");
			
			
			//EnumSet
			debut = System.nanoTime();
			// METHODE DE RAJOUT
			fin = System.nanoTime();
			duree = (fin - debut)/ 1000000;
			System.out.println("La durée d'ajout de "+petit+" elements dans EnumSet est de  : "+duree+" ms");
			
			
			
	
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
			Stack<Integer> stackMoyen = new Stack<>();
			for(int i = 0 ; i <= moyen; i++) {
			    stackMoyen.push(i);
			}

			fin = System.nanoTime();
			duree = (fin - debut)/ 1000000;
			System.out.println("La durée d'ajout de "+moyen+" elements dans Stack est de  : "+duree+" ms");
			
			
			//EnumSet
			debut = System.nanoTime();
			// METHODE DE RAJOUT
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
			// 
		
			Stack<Long> stackGrand = new Stack<>();
			for(long i = 0 ; i <= grand; i++) {
			    stackGrand.push(i);
			}

			fin = System.nanoTime();
			duree = (fin - debut) / 1000000;

			fin = System.nanoTime();
			duree = (fin - debut)/ 1000000;
			System.out.println("La durée d'ajout de "+grand+" elements dans Stack est de  : "+duree+" ms");
			
			
			//EnumSet
			debut = System.nanoTime();
			// METHODE DE RAJOUT
			fin = System.nanoTime();
			duree = (fin - debut)/ 1000000;
			System.out.println("La durée d'ajout de "+grand+" elements dans EnumSet est de  : "+duree+" ms");
	
		}

}
