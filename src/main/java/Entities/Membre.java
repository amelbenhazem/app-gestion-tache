package Entities;

public class Membre {
    private String nom;
    private String role;
    private int score;

    public Membre(String nom, String role) {
        this.nom = nom;
        this.role = role;
        this.score = 0; // Score initial
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public void soumettreTache(Ticket ticket) {
        // Logique pour soumettre une tâche
    }

    public int consulterScore() {
        return score;
    }
}