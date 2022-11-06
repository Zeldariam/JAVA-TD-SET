package List;

import java.util.Comparator;

public class CompareById implements Comparator<Etudiant> {

    @Override
    public int compare(Etudiant s1, Etudiant s2) {
        return Integer.toString(s1.getId()).compareTo(Integer.toString(s2.getId()));
    }
}
