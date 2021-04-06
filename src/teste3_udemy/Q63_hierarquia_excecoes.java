package teste3_udemy;

import java.io.IOException;
import java.sql.SQLException;

public class Q63_hierarquia_excecoes {
    public static void main(String[] args) {
       try {
    	   save();
    	   log();
       }catch(Exception | RuntimeException e) {}
       
       try {
    	   save();
    	   log();
       }catch(Exception e) {}
       
       try {
    	   save();
    	   log();
       }catch(SQLException | Exception e) {}
       
       try {
    	   save();
    	   log();
       }catch(SQLException | IOException e) {}
       
       try {
    	   save();
    	   log();
       }catch(IOException | SQLException e) {}
       
       
       
       try {
    	   save();
    	   log();
       }catch(Exception e) {}
    }
 
    private static void save() throws IOException {}
 
    private static void log() throws SQLException {}
}
