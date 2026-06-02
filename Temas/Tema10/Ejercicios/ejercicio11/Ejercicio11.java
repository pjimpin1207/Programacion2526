package Tema10.Ejercicios.ejercicio11;

import java.sql.*;

public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        try {
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/tienda", "fran", "Fr4n");
            Statement stmt = con.createStatement();

            System.out.println("Conexión establecida");

            // usar execute para productos españoles
            boolean tieneResultSet = stmt.execute("SELECT * FROM producto WHERE pais = 'Espana'");

            if (tieneResultSet) {
                ResultSet rs = stmt.getResultSet();
                System.out.println("Productos Españoles usando execute()");
                while (rs.next()) {
                    System.out.println("- " + rs.getString("nombre") + " (" + rs.getString("descripcion") + ")");
                }
                rs.close();
            }

            // Ejecutar lote con consultas anteriores
            con.setAutoCommit(false);
            stmt.addBatch("DELETE FROM producto");
            stmt.addBatch("INSERT INTO producto VALUES ('1', 'manzana', 'Manzanas golden', 50, 'Francia')");
            stmt.addBatch("INSERT INTO producto VALUES ('2', 'pera', 'Peras conferencia', 20, 'Espana')");
            stmt.addBatch("INSERT INTO producto VALUES ('3', 'uva', 'Uvas groumet', 30, 'Espana')");

            stmt.executeBatch();
            con.commit();

            // nuevos
            stmt.addBatch("INSERT INTO producto VALUES ('4', 'kiwi', 'Zaspri gold', 120, 'Nueva Zelanda')");
            stmt.addBatch("INSERT INTO producto VALUES ('5', 'perito', 'Peritos de Tavizna', 18, 'Espana')");
            stmt.addBatch("INSERT INTO producto VALUES ('6', 'plátano', 'Plátano canario', 40, 'Espana')");

            stmt.executeBatch();
            con.commit();

            System.out.println("\nTodos los lotes se han procesado de manera correcta.");

            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.err.println("No se pudo conectar");
        }
    }
}