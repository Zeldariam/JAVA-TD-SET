package List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EspritHashSet implements GestionEnseignant{
    Set<Enseignant> enseignantHashSet = new HashSet<>();
    Iterator<Enseignant> i = enseignantHashSet.iterator();

    @Override
    public void ajouterEnseignant(Enseignant e) {
        enseignantHashSet.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return enseignantHashSet.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (Enseignant ens: enseignantHashSet) {
            if (ens.getId()==id){
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        enseignantHashSet.remove(e);
    }

    @Override
    public void displayEnseignants() {
        for (Object ens:enseignantHashSet
             ) {
            System.out.println(ens);
        }
    }
}
