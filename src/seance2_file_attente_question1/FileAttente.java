package seance2_file_attente_question1;

import java.util.ArrayList;

public class FileAttente<E> {
	private String nomFile;
	private static int nbEntreesTotal = 0;
	private ArrayList<E> contenu;
	
	public FileAttente(){contenu=new ArrayList<E>();}
	
	public void entre(E e){contenu.add(e); nbEntreesTotal++;}
	
	public E sort()
	{
		E e=null;
		if (!contenu.isEmpty())
		{e=contenu.get(0);
		contenu.remove(0);}
		return e;
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
