package Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) {
        // Obtient l'instance de DataSource
        DataSource dataSource = DataSource.getDataSource();

        // Appelle la méthode pour insérer un membre
        insertMember(dataSource.getConn(), "Amal", "Développeur");
    }

    // Méthode pour insérer un membre dans la base de données
    public static void insertMember(Connection connection, String nom, String role) {
        String query = "INSERT INTO Membre (nom, role) VALUES (?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            // Définit les valeurs des paramètres
            preparedStatement.setString(1, nom);
            preparedStatement.setString(2, role);

            // Exécute la requête
            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Un nouveau membre a été inséré avec succès !");
            }
        } catch (SQLException e) {
            System.err.println("Erreur lors de l'insertion du membre : " + e.getMessage());
        }
    }
}