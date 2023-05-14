	package arrayList;
	
	import java.util.ArrayList;
import java.util.Stack;
	
	public class Performance_tester {
	
		public static void main(String[] args) {
			
			long petit = 10000000;
			//int moyen =  1000000;
			//long grand = 10000000;
			
			
			
			//Les chronos
			Chrono chrono = new Chrono("NanoTime Et MilliSec");
			ChronoCPU chronoCPU = new ChronoCPU("ChronoCPU");
			ChronoInstant chronoInstant=new ChronoInstant("ChronoInstant");
			ChronoCPU chronoCPUuser=new ChronoCPU("ChronoCPUser");
			
			// ######################### petit #########################
			
													// CHRONO NORMAL
			System.out.println("Boucle 1");
			System.out.println();
			System.out.println();
			System.out.println("#############################################################################################");
			System.out.println();
			//ArrayList
			ArrayList<Integer> ALpetit11 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
				chrono.start("rajout AL11");
				ALpetit11.add(i);
				chrono.stop("rajout AL11");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  NanoTime Et MilliSec est : "+chrono.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit11 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
				chrono.start("rajout stack11");
			    stackPetit11.push(i);
			    chrono.stop("rajout stack11");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  NanoTime Et MilliSec est  : "+chrono.getResult()/1000000.0+" ms");
													// CHRONO CPU
			System.out.println("-----------------------------------------------------------------------");
			ArrayList<Integer> ALpetit12 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
				chronoCPU.start("rajout AL12");
				ALpetit12.add(i);
				chronoCPU.stop("rajout AL12");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  ChronoCPU est : "+chronoCPU.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit12 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
				chronoCPU.start("rajout stack12");
			    stackPetit12.push(i);
			    chronoCPU.stop("rajout stack12");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  ChronoCPU  est  : "+chronoCPU.getResult()/1000000.0+" ms");
													// CHRONO INSTANT
			System.out.println("-----------------------------------------------------------------------");
			ArrayList<Integer> ALpetit13 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
				chronoInstant.startInstant("rajout AL13");
				ALpetit13.add(i);
				chronoInstant.stopInstant("rajout AL13");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  ChronoInstant est : "+chronoInstant.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit13 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
				chronoInstant.startInstant("rajout stack13");
			    stackPetit13.push(i);
			    chronoInstant.stopInstant("rajout stack13");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  ChronoInstant est  : "+chronoInstant.getResult()/1000000.0+" ms");
													// CHRONO CPU user
			System.out.println("-----------------------------------------------------------------------");
			ArrayList<Integer> ALpetit14 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
			chronoCPUuser.startUser("rajout AL14");
			ALpetit14.add(i);
			chronoCPUuser.stopUser("rajout AL14");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  Chrono CPU user est : "+chronoCPUuser.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit14 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
			chronoCPUuser.startUser("rajout stack14");
			stackPetit14.push(i);
			chronoCPUuser.stopUser("rajout stack14");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  Chrono CPU user est  : "+chronoCPUuser.getResult()/1000000.0+" ms");
			
			System.out.println();
			System.out.println();
			System.out.println("Boucle 2");
			
			Chrono chrono2 = new Chrono("NanoTime Et MilliSec");
			ChronoCPU chronoCPU2 = new ChronoCPU("ChronoCPU");
			ChronoInstant chronoInstant2=new ChronoInstant("ChronoInstant");
			ChronoCPU chronoCPUuser2=new ChronoCPU("ChronoCPUser");
			
			System.out.println();
			System.out.println("#############################################################################################");
			System.out.println();
			//ArrayList
			ArrayList<Integer> ALpetit21 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
				chrono2.start("rajout AL21");
				ALpetit21.add(i);
				chrono2.stop("rajout AL21");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  NanoTime Et MilliSec est : "+chrono2.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit21 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
				chrono2.start("rajout stack21");
			    stackPetit21.push(i);
			    chrono2.stop("rajout stack21");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  NanoTime Et MilliSec est  : "+chrono2.getResult()/1000000.0+" ms");
													// CHRONO CPU
			System.out.println("-----------------------------------------------------------------------");
			ArrayList<Integer> ALpetit22 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
				chronoCPU2.start("rajout AL22");
				ALpetit22.add(i);
				chronoCPU2.stop("rajout AL22");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  ChronoCPU est : "+chronoCPU2.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit22 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
				chronoCPU2.start("rajout stack22");
			    stackPetit22.push(i);
			    chronoCPU2.stop("rajout stack22");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  ChronoCPU  est  : "+chronoCPU2.getResult()/1000000.0+" ms");
													// CHRONO INSTANT
			System.out.println("-----------------------------------------------------------------------");
			ArrayList<Integer> ALpetit23 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
				chronoInstant2.startInstant("rajout AL23");
				ALpetit23.add(i);
				chronoInstant2.stopInstant("rajout AL23");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  ChronoInstant est : "+chronoInstant2.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit23 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
				chronoInstant2.startInstant("rajout stack23");
			    stackPetit23.push(i);
			    chronoInstant2.stopInstant("rajout stack23");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  ChronoInstant est  : "+chronoInstant2.getResult()/1000000.0+" ms");
													// CHRONO CPU user
			System.out.println("-----------------------------------------------------------------------");
			ArrayList<Integer> ALpetit24 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
			chronoCPUuser2.startUser("rajout AL24");
			ALpetit24.add(i);
			chronoCPUuser2.stopUser("rajout AL24");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  Chrono CPU user est : "+chronoCPUuser2.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit24 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
			chronoCPUuser2.startUser("rajout stack24");
			stackPetit24.push(i);
			chronoCPUuser2.stopUser("rajout stack24");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  Chrono CPU user est  : "+chronoCPUuser2.getResult()/1000000.0+" ms");
			
			System.out.println();
			System.out.println();
			System.out.println("Boucle 3");
			
			Chrono chrono3 = new Chrono("NanoTime Et MilliSec");
			ChronoCPU chronoCPU3 = new ChronoCPU("ChronoCPU");
			ChronoInstant chronoInstant3=new ChronoInstant("ChronoInstant");
			ChronoCPU chronoCPUuser3=new ChronoCPU("ChronoCPUser");
			
			System.out.println();
			System.out.println("#############################################################################################");
			System.out.println();
			//ArrayList
			ArrayList<Integer> ALpetit31 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
				chrono3.start("rajout AL31");
				ALpetit31.add(i);
				chrono3.stop("rajout AL31");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  NanoTime Et MilliSec est : "+chrono3.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit31 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
				chrono3.start("rajout stack31");
			    stackPetit31.push(i);
			    chrono3.stop("rajout stack31");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  NanoTime Et MilliSec est  : "+chrono3.getResult()/1000000.0+" ms");
													// CHRONO CPU
			System.out.println("-----------------------------------------------------------------------");
			ArrayList<Integer> ALpetit32 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
				chronoCPU3.start("rajout AL32");
				ALpetit32.add(i);
				chronoCPU3.stop("rajout AL32");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  ChronoCPU est : "+chronoCPU3.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit32 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
				chronoCPU3.start("rajout stack32");
			    stackPetit32.push(i);
			    chronoCPU3.stop("rajout stack32");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  ChronoCPU  est  : "+chronoCPU3.getResult()/1000000.0+" ms");
													// CHRONO INSTANT
			System.out.println("-----------------------------------------------------------------------");
			ArrayList<Integer> ALpetit33 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
				chronoInstant3.startInstant("rajout AL33");
				ALpetit33.add(i);
				chronoInstant3.stopInstant("rajout AL33");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  ChronoInstant est : "+chronoInstant3.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit33 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
				chronoInstant3.startInstant("rajout stack33");
			    stackPetit33.push(i);
			    chronoInstant3.stopInstant("rajout stack33");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  ChronoInstant est  : "+chronoInstant3.getResult()/1000000.0+" ms");
													// CHRONO CPU user
			System.out.println("-----------------------------------------------------------------------");
			ArrayList<Integer> ALpetit34 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
			chronoCPUuser3.startUser("rajout AL34");
			ALpetit34.add(i);
			chronoCPUuser3.stopUser("rajout AL34");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  Chrono CPU user est : "+chronoCPUuser3.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit34 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
			chronoCPUuser3.startUser("rajout stack34");
			stackPetit34.push(i);
			chronoCPUuser3.stopUser("rajout stack34");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  Chrono CPU user est  : "+chronoCPUuser3.getResult()/1000000.0+" ms");
			
			System.out.println();
			System.out.println();
			System.out.println("Boucle 4");
			
			Chrono chrono4 = new Chrono("NanoTime Et MilliSec");
			ChronoCPU chronoCPU4 = new ChronoCPU("ChronoCPU");
			ChronoInstant chronoInstant4=new ChronoInstant("ChronoInstant");
			ChronoCPU chronoCPUuser4=new ChronoCPU("ChronoCPUser");
			
			System.out.println();
			System.out.println("#############################################################################################");
			System.out.println();
			//ArrayList
			ArrayList<Integer> ALpetit41 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
				chrono4.start("rajout AL41");
				ALpetit41.add(i);
				chrono4.stop("rajout AL41");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  NanoTime Et MilliSec est : "+chrono4.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit41 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
				chrono4.start("rajout stack41");
			    stackPetit41.push(i);
			    chrono4.stop("rajout stack41");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  NanoTime Et MilliSec est  : "+chrono4.getResult()/1000000.0+" ms");
													// CHRONO CPU
			System.out.println("-----------------------------------------------------------------------");
			ArrayList<Integer> ALpetit42 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
				chronoCPU4.start("rajout AL42");
				ALpetit42.add(i);
				chronoCPU4.stop("rajout AL42");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  ChronoCPU est : "+chronoCPU4.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit42 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
				chronoCPU4.start("rajout stack42");
			    stackPetit42.push(i);
			    chronoCPU4.stop("rajout stack42");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  ChronoCPU  est  : "+chronoCPU4.getResult()/1000000.0+" ms");
													// CHRONO INSTANT
			System.out.println("-----------------------------------------------------------------------");
			ArrayList<Integer> ALpetit43 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
				chronoInstant4.startInstant("rajout AL43");
				ALpetit43.add(i);
				chronoInstant4.stopInstant("rajout AL43");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  ChronoInstant est : "+chronoInstant4.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit43 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
				chronoInstant4.startInstant("rajout stack43");
			    stackPetit43.push(i);
			    chronoInstant4.stopInstant("rajout stack43");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  ChronoInstant est  : "+chronoInstant4.getResult()/1000000.0+" ms");
													// CHRONO CPU user
			System.out.println("-----------------------------------------------------------------------");
			ArrayList<Integer> ALpetit44 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
			chronoCPUuser4.startUser("rajout AL44");
			ALpetit44.add(i);
			chronoCPUuser4.stopUser("rajout AL44");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  Chrono CPU user est : "+chronoCPUuser4.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit44 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
			chronoCPUuser4.startUser("rajout stack44");
			stackPetit44.push(i);
			chronoCPUuser4.stopUser("rajout stack44");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  Chrono CPU user est  : "+chronoCPUuser4.getResult()/1000000.0+" ms");
			
			System.out.println();
			System.out.println();
			System.out.println("Boucle 5");
			
			Chrono chrono5 = new Chrono("NanoTime Et MilliSec");
			ChronoCPU chronoCPU5 = new ChronoCPU("ChronoCPU");
			ChronoInstant chronoInstant5=new ChronoInstant("ChronoInstant");
			ChronoCPU chronoCPUuser5=new ChronoCPU("ChronoCPUser");
			
			System.out.println();
			System.out.println("#############################################################################################");
			System.out.println();
			//ArrayList
			ArrayList<Integer> ALpetit51 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
				chrono5.start("rajout AL51");
				ALpetit51.add(i);
				chrono5.stop("rajout AL51");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  NanoTime Et MilliSec est : "+chrono5.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit51 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
				chrono5.start("rajout stack51");
			    stackPetit51.push(i);
			    chrono5.stop("rajout stack51");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  NanoTime Et MilliSec est  : "+chrono5.getResult()/1000000.0+" ms");
													// CHRONO CPU
			System.out.println("-----------------------------------------------------------------------");
			ArrayList<Integer> ALpetit52 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
				chronoCPU5.start("rajout AL52");
				ALpetit52.add(i);
				chronoCPU5.stop("rajout AL52");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  ChronoCPU est : "+chronoCPU5.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit52 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
				chronoCPU5.start("rajout stack52");
			    stackPetit52.push(i);
			    chronoCPU5.stop("rajout stack52");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  ChronoCPU  est  : "+chronoCPU5.getResult()/1000000.0+" ms");
													// CHRONO INSTANT
			System.out.println("-----------------------------------------------------------------------");
			ArrayList<Integer> ALpetit53 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
				chronoInstant5.startInstant("rajout AL53");
				ALpetit53.add(i);
				chronoInstant5.stopInstant("rajout AL53");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  ChronoInstant est : "+chronoInstant5.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit53 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
				chronoInstant5.startInstant("rajout stack53");
			    stackPetit53.push(i);
			    chronoInstant5.stopInstant("rajout stack53");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  ChronoInstant est  : "+chronoInstant5.getResult()/1000000.0+" ms");
													// CHRONO CPU user
			System.out.println("-----------------------------------------------------------------------");
			ArrayList<Integer> ALpetit54 = new ArrayList<>();
			for(int i = 0 ; i<= petit; i++) {
			chronoCPUuser5.startUser("rajout AL54");
			ALpetit54.add(i);
			chronoCPUuser5.stopUser("rajout AL54");
			}			
			System.out.println("La durée d'ajout de "+petit+" elements dans ArrayList avec  Chrono CPU user est : "+chronoCPUuser5.getResult()/1000000.0+" ms");		
			//Stack
			Stack<Integer> stackPetit54 = new Stack<>();
			for(int i = 0 ; i <= petit; i++) {
			chronoCPUuser5.startUser("rajout stack54");
			stackPetit54.push(i);
			chronoCPUuser5.stopUser("rajout stack54");
			}
			System.out.println("La durée d'ajout de "+petit+" elements dans Stack avec  Chrono CPU user est  : "+chronoCPUuser5.getResult()/1000000.0+" ms");
			
			
			
		}}
			
			
	

