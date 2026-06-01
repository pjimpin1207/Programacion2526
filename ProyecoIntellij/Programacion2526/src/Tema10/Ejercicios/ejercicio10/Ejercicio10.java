package Tema10.Ejercicios.ejercicio10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        try {
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/tienda", "fran", "Fr4n");
            Statement stmt = con.createStatement();

            System.out.println("Conexión establecida");

            // borrar registros existentes
            stmt.executeUpdate("DELETE FROM producto");

            // insertar 3 nuevos registros
            stmt.executeUpdate("INSERT INTO producto VALUES ('1', 'manzana', 'Manzanas golden', 50, 'Francia')");
            stmt.executeUpdate("INSERT INTO producto VALUES ('2', 'pera', 'Peras conferencia', 25, 'Espana')");
            stmt.executeUpdate("INSERT INTO producto VALUES ('3', 'uva', 'Uvas groumet', 30, 'Espana')");

            // cambiar el precio de la pera a 20 centimos
            stmt.executeUpdate("UPDATE producto SET precio = 20 WHERE id = '2'");

            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.err.println("No se pudo conectar");
        }
    }
}