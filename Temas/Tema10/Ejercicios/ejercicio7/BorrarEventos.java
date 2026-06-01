package Tema10.Ejercicios.ejercicio7;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;

public class BorrarEventos {
    public static void main(String[] args) {
        // crear la conexion
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventos.odb");
        EntityManager em = emf.createEntityManager();

        // copiar y eliminar primer evento
        em.getTransaction().begin();

        // buscar el primer evento por su ID
        EventoMusical primerEvento = em.find(EventoMusical.class, 10L);

        // crear copia
        EventoMusical copiaEvento = new EventoMusical(
                null,
                primerEvento.getNombre() + " (Copia)",
                primerEvento.getFecha(),
                primerEvento.getRecaudacion(),
                primerEvento.getGenero(),
                primerEvento.getControl()
        );
        // duplicar seleccion de artistas
        copiaEvento.setArtistasConfirmados(new ArrayList<>(primerEvento.getArtistasConfirmados()));

        // persistir la copia antes de borrar el original
        em.persist(copiaEvento);

        // eliminar el evento original de la base de datos usando el identificador
        em.remove(primerEvento);

        em.getTransaction().commit();
        System.out.println("Primer evento copiado y eliminado mediante identificador con éxito.");

        // eliminar segundo evento jpql dimanico
        em.getTransaction().begin();
        Query queryDinamica = em.createQuery("DELETE FROM EventoMusical e WHERE e.id = 20");
        int eliminadosDin = queryDinamica.executeUpdate();
        em.getTransaction().commit();
        System.out.println("Registros eliminados con JPQL Dinámica: " + eliminadosDin);

        // eliminar segundo evento jpq estatica
        em.getTransaction().begin();
        Query queryEstatica = em.createNamedQuery("borrarEventoEstatico");
        queryEstatica.setParameter("idParam", 20L);
        int eliminadosEst = queryEstatica.executeUpdate();
        em.getTransaction().commit();
        System.out.println("Registros eliminados con JPQL Estática: " + eliminadosEst);

        // Cerrar conexion
        em.close();
        emf.close();
    }
}