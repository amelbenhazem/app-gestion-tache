package Entities;

public class Responsable extends Membre {

    public Responsable(String nom, String role) {
        super(nom, role);
    }

    public void envoyerNotification(String message) {
        // Logique pour envoyer une notification
    }
}