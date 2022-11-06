package List;

import java.util.Objects;

public class Etudiant {
    private int id;
    private String Nom;
    private String Prenom;
//CONSTRUCTERS
    public Etudiant() {
    }

    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        Nom = nom;
        Prenom = prenom;
    }
//GETTERS & SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (!(o instanceof Etudiant)){
            return false;
        }
        Etudiant etudiant = (Etudiant) o;
        return getId() == etudiant.getId();
    }
    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                '}';
    }
}
