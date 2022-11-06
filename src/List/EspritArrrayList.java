package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EspritArrrayList implements University  {
    List<Etudiant> listEtudiant = new ArrayList<>() ;
    public EspritArrrayList() {
    }

    public EspritArrrayList(List<Etudiant> listEtudiant) {
        this.listEtudiant = listEtudiant;
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {
        listEtudiant.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return listEtudiant.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (int i = 0; i < listEtudiant.size(); i++) {
            if (listEtudiant.get(i).getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void displayEtudiant() {
        for (Etudiant e : listEtudiant) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(listEtudiant,new CompareById());
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(listEtudiant,new CompareByName());
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        listEtudiant.remove(e);
    }
    public void printList(){


            for (int i=0; i<listEtudiant.size(); i++)
                System.out.println(listEtudiant.get(i));
        }
    }
