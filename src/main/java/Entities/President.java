package Entities;

public class President extends Membre {

    public President(String nom, String role) {
        super(nom, role);
    }

    public void structurerDepartement(Departement departement) {
        // Logique pour structurer un département
    }

    public void validerTache(Ticket ticket) {
        // Logique pour valider une tâche
    }

    public void appliquerPenalite(Ticket ticket) {
        // Logique pour appliquer une pénalité
    }
}