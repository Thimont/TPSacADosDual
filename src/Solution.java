import java.util.*;

/**
 * Cette classe pour manipuler les solutions
 *
 *
 * c est une classe a completer
 *
 * @author charge TD
 * @version 2016-2017 
 */
 
 public class Solution{
    ListeObjets listeATriee;
    boolean tableau[];
    int tailleListe;
    int poidsTotal;
 
        
    public Solution(ListeObjets liste){
        listeATriee = liste;
        tailleListe = liste.getListe().size();
        tableau = new boolean[tailleListe];
        poidsTotal = 0;
        for (int c = 0; c < tailleListe; c++) {
            tableau[c] = false;
        }
    }

    public void construitListe(int poidsMax, int utilMin){
        int tmp = 0;
        for (int i = 0; i < tailleListe; i++) {
            for (int j = 0; j < listeATriee.getListe().size(); j++) {
                if(listeATriee.get(tmp).getRatio() < listeATriee.get(j).getRatio()) {
                    tmp = j;
                    //System.out.println("Tmp = " + tmp);
                }
            }
            if(poidsTotal+listeATriee.getListe().get(tmp).getPoids() <= poidsMax) {
                poidsTotal += listeATriee.getListe().get(tmp).getPoids();
                tableau[tmp] = true;
            } else {
                tableau[tmp] = false;
            }
            listeATriee.getListe().set(tmp, new Objet(listeATriee.get(tmp).getNum(), -1, 1));
            tmp = 0;
        }
        for (int c = 0; c < tableau.length; c++) {
            int num = c+1;
            System.out.println("Element " + num + " : " + tableau[c]);
        }
    }

    @Override
    public String toString() {
        return "Solution{" +
                "tableau=" + Arrays.toString(tableau) +
                '}';
    }
}