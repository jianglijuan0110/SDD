package seance3_file_attente_compléments_la_généricité_bornée;

import java.util.ArrayList;

public class FileAttente<E extends IsInvite> {
	private String nomFile;
	private static int nbEntreesTotal = 0;
	private  ArrayList<E> contenu;
	
	public FileAttente(){contenu=new ArrayList<E>();}
	
	public void entre(E e){
		if (e.isInvite()) contenu.add(e);
		else System.out.println("non invite");
		nbEntreesTotal++;
	}
	

	public E sort()
	{
		E e=null;
		if (!contenu.isEmpty())
		{e=contenu.get(0);
		contenu.remove(0);}
		return e;
	}
	
	public static int nbEntreT() {
		return nbEntreesTotal;	
	}
	
	public static<T extends IsInvite> boolean memeType(FileAttente<T> f,FileAttente<T> f2) {
		boolean estMemeType = false;
		if (f.contenu.equals(f2.contenu))
			estMemeType = true;
		return estMemeType;
	}
	public boolean memeType2(FileAttente<E> f) {
		return memeType(f, this);
		
	}
	public  boolean memeLongeur(FileAttente<?> f) {
		boolean estMemeLongueur = false;
		if(f.contenu.size()==this.contenu.size())
			estMemeLongueur = true;
		return estMemeLongueur;
	}
	

	public int nbElements(){return contenu.size();}
	
	public boolean estVide(){return contenu.isEmpty();}
	
	public String toString(){return ""+descriptionContenu();}
	
	private String descriptionContenu()
	{
		String resultat = "";
		for (E e:this.contenu)
		resultat += e + " ";
		return resultat;
	}

}
