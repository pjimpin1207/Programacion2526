package Tema10.EjerciciosDeRefuerzo.Ejercicio1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCoche {
    public static void main(String[] args) {
        // crear conexion base de datos
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/TestCoche.odb");
        EntityManager em = emf.createEntityManager();

        // comenzar trasaccion
        em.getTransaction().begin();

        // crear coches
        Coche c1 = new Coche("Rojo");
        Coche c2 = new Coche("Verde");
        Coche c3 = new Coche("Azul");

        // hacer persistencia
        em.persist(c1);
        em.persist(c2);
        em.persist(c3);

        // Confirmar
        em.getTransaction().commit();

        // Cerrar conexion
        em.close();
        emf.close();
        }
}