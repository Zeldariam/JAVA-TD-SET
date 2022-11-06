package List;

import java.util.Comparator;

public class CompareByName  implements Comparator<Etudiant> {

    @Override
    public int compare(Etudiant s1, Etudiant s2) {
        return s1.getNom().compareTo(s2.getNom());
    }
}
