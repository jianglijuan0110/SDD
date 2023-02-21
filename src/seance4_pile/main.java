package seance4_pile;

public class main {

	public static void main(String[] args) {
		
		try {
			Pile<Integer> p = new Pile<>();
			p.empiler(1);
			p.empiler(2);
			p.depiler();
			p.depiler();
			p.depiler();
		}
		catch(PileVideException e){
			System.out.println("erreur"+e.getMessage()); 
		}
	
						

	}

}
