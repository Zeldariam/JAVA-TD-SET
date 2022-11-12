package List;

public class Main {
    public static void main(String[] args) {

    Enseignant e1 = new Enseignant(1,"Ahmed","bouslama");
    Enseignant e2 = new Enseignant(2,"moez","chose");
    Enseignant e3 = new Enseignant(3,"bbb","ggg");
        System.out.println(e1.equals(e2));
        System.out.println(e1);
//>>>>> HASHSET >>>>>
        System.out.println(" #### HASHSET ####");
        EspritHashSet hSet = new EspritHashSet();
        hSet.ajouterEnseignant(e2);
        hSet.ajouterEnseignant(e3);
        hSet.ajouterEnseignant(e1);

        //Afficher tous les ENS de hSet
        System.out.print(" \nHashSet print\n");
        hSet.displayEnseignants();

        //Rechercher si obj ENS existe dans hSet
        System.out.println("Recherche enseignant e3 : "+hSet.rechercherEnseignant(e3));
        //Rechercher si  ENS existe dans hSet  BY ID
        System.out.println("Recherche enseignant avec id 4 : "+hSet.rechercherEnseignant(4));
        /*
            //Supression
            hSet.supprimerEnseignant(e1);
         */

//>>>>> TREESET >>>>>
        System.out.println(" #### TREESET ####");
        EspritTreeSet tSet = new EspritTreeSet();
        //Insertion
        tSet.ajouterEnseignant(e3);
        tSet.ajouterEnseignant(e1);
        tSet.ajouterEnseignant(e2);
        //Affichage du tSET
        System.out.println("TreeSet print");
        tSet.displayEnseignants();
        //Rechercher si obj ENS existe dans tSet
        System.out.println("Recherche enseignant e3 : "+tSet.rechercherEnseignant(e3));
        //Rechercher si  ENS existe dans tSet  BY ID
        System.out.println("Recherche enseignant avec id 4 : "+tSet.rechercherEnseignant(4));
        /*
            //Supression
            tSet.supprimerEnseignant(e1);
         */
    }
}