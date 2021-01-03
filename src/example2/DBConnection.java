package example2;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
  
public class DBConnection { 
    private static Connection con = null; 
  
    static { 
        String url = "jdbc:postgresql://127.0.0.1:5432/db_cours"; 
        String user = "postgres"; 
        String pass = "postgres";
        
        try { 
            Class.forName("org.postgresql.Driver"); 
            con = DriverManager.getConnection(url, user, pass); 
        } 
        catch (ClassNotFoundException | SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
    
    public static Connection getConnection(){ 
        return con; 
    } 
}