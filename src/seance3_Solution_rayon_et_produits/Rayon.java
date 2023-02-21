package seance3_Solution_rayon_et_produits;

import java.util.ArrayList;

public class Rayon<E extends ObjetAvecEtiquette> {
private ArrayList<E> contenu=new ArrayList<E>();
public Rayon(){}
public void MetEnRayon(E p)
{
if (!contenu.contains(p))
contenu.add(p);
}
public String listingContenu()
{
String listing="";
for (E c:contenu)
listing += c.etiquette()+" ";;
return listing;
}
}
