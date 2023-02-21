package seance2_Solutions_des_exercices_sur_la_généricité_simple;

public class PaireHomogene<A> extends Paire<A,A> {
	public PaireHomogene() {}
	public PaireHomogene(A f, A s) {super(f, s);}
}
