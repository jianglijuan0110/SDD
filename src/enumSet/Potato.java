package enumSet;



//Creation de nos patates
public enum Potato implements PoidsAndType {
	
	
	French(100), Tunisian(20), Norwegian(58), Italien(100), Senegalese(22), Russian(58);
	
	
	private double poids;
	
	
	//CONSTRUCTEUR
	private Potato(double p){
		this.poids = p;
	}

	
	@Override
	public double getPoids() {
		return this.poids;
	}

	
	@Override
	public String getType() {
		return this.name();
	}
	
	
	//METHODE D'AFFICHAGE
	public String toString() {
		return "potato [type=" + this.getType() + ", poids=" + this.getPoids() + "]";
	}
}
