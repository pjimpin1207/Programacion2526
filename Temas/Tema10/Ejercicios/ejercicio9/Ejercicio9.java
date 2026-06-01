package Tema10.Ejercicios.ejercicio9;

import java.sql.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/tienda", "fran", "Fr4n");
            Statement stmt = con.createStatement();

            System.out.println("Conexión establecida");

            // Consulta SQL ordenando por precio
            String query = "SELECT * FROM producto ORDER BY precio DESC";
            ResultSet resultados = stmt.executeQuery(query);

            System.out.println("Productos ordenados por precio");
            while (resultados.next()) {
                System.out.println("ID: " + resultados.getString("id") + " | Nombre: " + resultados.getString("nombre") + " | Precio: " + resultados.getInt("precio") + " céntimos" + " | País: " + resultados.getString("pais"));
            }

            resultados.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.err.println("No se pudo conectar");
        }
    }
}