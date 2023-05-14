package arrayList;

public class Potato implements PoidsAndType{
	private String type ="Pas de type";
	private double poids;
	
	public Potato(String t, double p) {
		this.setType(t);
		this.setPoids(p);
	}
	
	
	public void setType(String t) {
		this.type = t;
	}
	
	public void setPoids(double p) {
		if(p <= 0) {
			System.err.println("POIDS DE " +this.getType()+" EST INVALIDE -> "+p);	
		}
		else {
			this.poids=p;
		}
	}
		
	public String getType() {
		return this.type;
	}
	
	public String toString() {
		return "potato [type=" + type + ", poids=" + poids + "]";
	}


	public double getPoids() {
		return this.poids;
	}

}
