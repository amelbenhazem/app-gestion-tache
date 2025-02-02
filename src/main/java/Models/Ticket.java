package Models;

import java.util.Date;
import java.util.Objects;


public class Ticket {
    private int id_ticket;
    private String titre;
    private String description;
    private Date date_deadline;
    private int points;
    private int penalite;
    private Priorite priorite;
    private Etat etat;

    public enum Priorite { high, medium, low }

    public enum Etat { OPEN, IN_PROGRESS, DONE }

    public Ticket(int id_ticket, String titre, String description, Date date_deadline, int points, int penalite, Priorite priorite, Etat etat) {
        this.id_ticket = id_ticket;
        this.titre = titre;
        this.description = description;
        this.date_deadline = date_deadline;
        this.points = points;
        this.penalite = penalite;
        this.priorite = priorite;
        this.etat = etat;
    }

    public int getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(int id_ticket) {
        this.id_ticket = id_ticket;
    }

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

    public Date getDate_deadline() {
        return date_deadline;
    }

    public void setDate_deadline(Date date_deadline) {
        this.date_deadline = date_deadline;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPenalite() {
        return penalite;
    }

    public void setPenalite(int penalite) {
        this.penalite = penalite;
    }

    public Priorite getPriorite() {
        return priorite;
    }

    public void setPriorite(Priorite priorite) {
        this.priorite = priorite;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id_ticket == ticket.id_ticket && points == ticket.points && penalite == ticket.penalite && Objects.equals(titre, ticket.titre) && Objects.equals(description, ticket.description) && Objects.equals(date_deadline, ticket.date_deadline) && priorite == ticket.priorite && etat == ticket.etat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_ticket, titre, description, date_deadline, points, penalite, priorite, etat);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id_ticket=" + id_ticket +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", date_deadline=" + date_deadline +
                ", points=" + points +
                ", penalite=" + penalite +
                ", priorite=" + priorite +
                ", etat=" + etat +
                '}';
    }


}
