package List;

public class Main {
    public static void main(String[] args) {

    Enseignant e1 = new Enseignant(1,"Ahmed","bouslama");
    Enseignant e2 = new Enseignant(2,"moez","chose");
    Enseignant e3 = new Enseignant(3,"bbb","ggg");
        System.out.println(e1.equals(e2));
        System.out.println(e1);
//>>>>> HASHSET >>>>>
        EspritHashSet hSet = new EspritHashSet();
        hSet.ajouterEnseignant(e3);
        hSet.ajouterEnseignant(e1);
        hSet.ajouterEnseignant(e2);

        //Afficher tous les ENS de hSet
        System.out.print(" \nHashSet initial print\n");
        hSet.displayEnseignants();

        //Rechercher si obj ENS existe dans hSet
        System.out.println(hSet.rechercherEnseignant(e3));
        //Rechercher si  ENS existe dans hSet  BY ID
        System.out.println(hSet.rechercherEnseignant(4));
//>>>>> TREESET >>>>>
        
/*
        //UNSORTED LIST
        System.out.println("\nUNSORTED LIST :");
        ar.printList();
        //tri par ID
        System.out.println("\nSorted by ID : ");
        ar.trierEtudiantsParId();
        ar.printList();
        //tri par NOM
        System.out.println("\nSorted by NAME : ");
        ar.trierEtudiantsParNom();
        ar.printList();
        */
    }
}