package seance4_pile_bornée_assertionsExceptionsSolution;

public interface IPile<T> {
	void initialiser();	
	void empiler(T t) throws PilePleineException ;
	T depiler()throws PileVideException;;
	T sommet() throws PileVideException;
	boolean estVide();
	int taille();
}
