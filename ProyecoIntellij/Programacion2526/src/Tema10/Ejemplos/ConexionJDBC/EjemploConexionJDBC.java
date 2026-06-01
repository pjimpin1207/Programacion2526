package Tema10.Ejemplos.ConexionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EjemploConexionJDBC {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/tienda?allowPublicKeyRetrieval=true&useSSL=false","pablo", "usuario");
            Statement stmt = con.createStatement();
            stmt.executeQuery("Select...");

            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }
