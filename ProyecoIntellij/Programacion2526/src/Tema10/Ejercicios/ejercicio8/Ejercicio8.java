package Tema10.Ejercicios.ejercicio8;

import java.sql.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/tienda", "fran", "Fr4n");
            Statement stmt = con.createStatement();

            System.out.println("Conexión establecida");

            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.err.println("No se pudo conectar");
        }
    }
}