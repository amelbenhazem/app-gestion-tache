package Entities;

import java.util.ArrayList;
import java.util.List;

public class Departement {
    private String nom;
    private List<Membre> listeMembers;
    private List<Ticket> listeTaches;

    public Departement(String nom) {
        this.nom = nom;
        this.listeMembers = new ArrayList<>();
        this.listeTaches = new ArrayList<>();
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Membre> getListeMembers() {
        return listeMembers;
    }

    public void ajouterMembre(Membre membre) {
        this.listeMembers.add(membre);
    }

    public List<Ticket> getListeTaches() {
        return listeTaches;
    }

    public void creerTicket(Ticket ticket) {
        this.listeTaches.add(ticket);
    }
}