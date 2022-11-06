package List;

public interface University {
    public void ajouterEtudiant(Etudiant e);
    public boolean rechercherEtudiant(Etudiant e);
    public boolean rechercherEtudiant(String nom);
    public void supprimerEtudiant(Etudiant e);
    public void displayEtudiant();
    public void trierEtudiantsParId();
    public void trierEtudiantsParNom();
}
