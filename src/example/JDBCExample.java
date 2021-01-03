package example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {

    public static void main(String[] args) {

    	String url      = "jdbc:postgresql://127.0.0.1:5432/immo_db";
    	String user     = "postgres";
    	String password = "postgres";
    	
        // auto close connection
    	// Enregistrer la classe de pilote
    	// Créer une connexion
        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
