package teste1_erros;

import java.sql.SQLException;

//What will be the result of compiling and executing this class?
public class Questao42 {
    private static void availableSeats() throws SQLException {
        throw null; //Line 7
    }
 
    public static void main(String[] args) {
        try {
            availableSeats(); //Line 12
        } catch(SQLException e) {
            System.out.println("SEATS NOT AVAILABLE");
        }
    }
}