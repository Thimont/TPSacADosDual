/**
 * classe qui modélise une instance d'un problème de sac à dos dual
 * @version 2015-2016
 * @author Charge de TD
 */
public class Instance {
    public int nbObjets;
    public ListeObjets lesObjets;
    public int utiliteMin;
    
    public Instance(int nb, ListeObjets obj, int umin){
        /**
        * Nombre d'objets  a mettre dans le sac
        */ 
        this.nbObjets=nb;
        /**
        * utilite min
        */ 
        this.utiliteMin=umin;
        /**
        * Ensemble d'objets a mettre dans le sac
        */ 
        this.lesObjets=obj;
        //this.lesObjets.trie();
    }
    
    public void afficheInstance(){
       System.out.println("Nombre Objets : " + nbObjets+" Utilite Minimale " +utiliteMin+"\n");
       System.out.println("Numero   " + lesObjets.affichelNum());
       System.out.println("Poids    "+ lesObjets.affichelPoids());
       System.out.println("Utilites " + lesObjets.affichelUtil());
    }

    @Override
    public String toString(){
       String s="Instance de Taille: "+ nbObjets + " avec utilite Min: "+ utiliteMin +"\n";
       for(int i=0; i < nbObjets;i++){ 
          s= s+ lesObjets.get(i).toString()+"\n";
       }
       return s;
    }

    public ListeObjets getLesObjets() {
        return lesObjets;
    }
}
