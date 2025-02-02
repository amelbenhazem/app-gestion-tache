package Entities;

import java.util.Date;

public class Ticket {
    private String titre;
    private String description;
    private Date dateLimite;
    private int points;
    private int penalties;
    private String priorite;
    private String etat;

    public Ticket(String titre, String description, Date dateLimite, int points, String priorite) {
        this.titre = titre;
        this.description = description;
        this.dateLimite = dateLimite;
        this.points = points;
        this.priorite = priorite;
        this.etat = "À faire"; // État initial
    }

    // Getters et Setters
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateLimite() {
        return dateLimite;
    }

    public void setDateLimite(Date dateLimite) {
        this.dateLimite = dateLimite;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPenalties() {
        return penalties;
    }

    public void setPenalties(int penalties) {
        this.penalties = penalties;
    }

    public String getPriorite() {
        return priorite;
    }

    public void setPriorite(String priorite) {
        this.priorite = priorite;
    }

    public String getEtat() {
        return etat;
    }

    public void modifierEtat(String nouvelEtat) {
        this.etat = nouvelEtat;
    }
}