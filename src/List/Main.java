package List;

public class Main {
    public static void main(String[] args) {

    Etudiant e1 = new Etudiant(1,"Ahmed","bouslama");
    Etudiant e2 = new Etudiant(2,"moez","chose");
    Etudiant e3 = new Etudiant(3,"bbb","ggg");
        System.out.println(e1.equals(e2));
        System.out.println(e1);

        EspritArrrayList ar = new EspritArrrayList();
        ar.ajouterEtudiant(e3);
        ar.ajouterEtudiant(e2);
        ar.ajouterEtudiant(e1);

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
    }
}