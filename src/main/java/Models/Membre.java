package Models;

import java.util.Objects;

public class Membre {

    private int id;
    private String nom_complet;
    private String role;
    private int score;


    public Membre(int id, String nom_complet, String role, int score) {
        this.id = id;
        this.nom_complet = nom_complet;
        this.role = role;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_complet() {
        return nom_complet;
    }

    public void setNom_complet(String nom_complet) {
        this.nom_complet = nom_complet;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Membre{" +
                "id=" + id +
                ", nom_complet='" + nom_complet + '\'' +
                ", role='" + role + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Membre membre = (Membre) o;
        return id == membre.id && score == membre.score && Objects.equals(nom_complet, membre.nom_complet) && Objects.equals(role, membre.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom_complet, role, score);
    }
}
