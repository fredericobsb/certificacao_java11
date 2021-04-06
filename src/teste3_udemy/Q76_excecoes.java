package teste3_udemy;

import java.sql.SQLException;

//public class Q76_excecoes {

public class Q76_excecoes {
    private static void m() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            throw e;
        }
    }
 
    public static void main(String[] args) {
        try {
            m();
        } catch(SQLException e) {
            System.out.println("CAUGHT SUCCESSFULLY");
        }
    }
}
