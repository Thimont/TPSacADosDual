/**
 * Cette classe principale permet d'appeler le générateur d'instances (classe generator)
 * en en donnant les paramètres nombre d'instances, nombre d'objets, ordre de
 * grandeur pour les tailles et les utilités (poids)
 *
 *
 * c est une classe a completer
 *
 * @author charge TD
 * @version 2016-2017 pour completer c
 */


public class Testmain {

    /**
    * fonction de decomposition en base 2
    * @param indice le nombre a decomposer
    * @param taille la decomposition en base taille
    *decomp en base 2 de j et remplissage du tableau de booleens
    */
    public static boolean[] decomposition(int indice, int taille){
        boolean[] x = new boolean[taille];
        int puissance=2;
        int j= indice;
        int reste;
        for(int i=0;i<taille-1;i++){
            reste=j%puissance;
            x[i]=(reste >0);
            j=(j-reste);
            puissance=puissance*2;
        }
        return x;   
    }
	
    public static void main(String[] args) {
      int taille=5;
      Instance I;
      Solution S;  
      Generator xtest= new Generator(taille,10,7);
      boolean solution[];

      System.out.println("debut");
      I=xtest.makeInstance();
      I.afficheInstance();

      S = new Solution(I.getLesObjets());
      S.construitListe(10, 7);
  }
  
}
