package Tema10.Ejercicios.ejercicio12;

import java.sql.*;

public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
        try {
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/tienda", "fran", "Fr4n");
            Statement stmt = con.createStatement();

            System.out.println("Conexión establecida");

            // Extraer metadatos
            DatabaseMetaData meta = con.getMetaData();

            // Imprimir información general
            System.out.println("Usuario conectado: " + meta.getUserName());
            System.out.println("URL: " + meta.getURL());
            System.out.println("Driver utilizado: " + meta.getDriverName() + " | Versión: " + meta.getDriverVersion());
            System.out.println("SGBD: " + meta.getDatabaseProductName() + " | Versión: " + meta.getDatabaseProductVersion());

            // Imprimir tablas de la base de datos tienda
            System.out.println("\nTablas de la base de datos tienda");
            ResultSet tablas = meta.getTables("tienda", null, "%", new String[]{"TABLE"});
            while (tablas.next()) {
                System.out.println("- " + tablas.getString("TABLE_NAME"));
            }
            tablas.close();

            // Imprimir columnas de la tabla producto
            System.out.println("\nColumnas de la tabla producto");
            ResultSet columnas = meta.getColumns("tienda", null, "producto", "%");
            while (columnas.next()) {
                System.out.println("Campo: " + columnas.getString("COLUMN_NAME") + " | Tipo: " + columnas.getString("TYPE_NAME") + " | Tamaño: " + columnas.getInt("COLUMN_SIZE") + "px");
            }

            // cerrrar conexiones
            columnas.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.err.println("No se pudo conectar");
        }
    }
}