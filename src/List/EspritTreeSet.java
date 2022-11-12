package List;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EspritTreeSet implements GestionEnseignant {
    TreeSet<Enseignant> enseignantTreeSet = new TreeSet<Enseignant>();
    Iterator<Enseignant> i = enseignantTreeSet.iterator();
    @Override
    public void ajouterEnseignant(Enseignant e) {
        enseignantTreeSet.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return enseignantTreeSet.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (Enseignant ens: enseignantTreeSet) {
            if (ens.getId()==id){
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        enseignantTreeSet.remove(e);
    }

    @Override
    public void displayEnseignants() {
        for (Enseignant ens:enseignantTreeSet) {
            System.out.println("||"+ens);
        }
    }

    @Override
    public String toString() {
        return "EspritTreeSet{" +
                "enseignantTreeSet=" + enseignantTreeSet +
                '}';
    }
}
