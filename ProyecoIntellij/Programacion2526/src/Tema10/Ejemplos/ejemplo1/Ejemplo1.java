package Tema10.Ejemplos.ejemplo1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Ejemplo1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/coches.odb");
        EntityManager em = emf.createEntityManager();

        // iniciar la transacción
        em.getTransaction().begin();

        // operaciones
        Coche c1 = new Coche();
        c1.setColor("Rojo");

        Coche c2 = new Coche();
        c2.setColor("Verde");

        em.persist(c1);
        em.persist(c2);

        // confirmar la transacción
        em.getTransaction().commit();

        // cerrar la conexión
        em.close();
        emf.close();
    }
}
