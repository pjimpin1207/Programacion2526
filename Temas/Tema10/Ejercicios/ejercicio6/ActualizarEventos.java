package Tema10.Ejercicios.ejercicio6;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ActualizarEventos {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventos.odb");
        EntityManager em = emf.createEntityManager();

        // modificar el primer evento
        em.getTransaction().begin();
        EventoMusical primerEvento = em.find(EventoMusical.class, 10L);
        primerEvento.setNombre(primerEvento.getNombre().toUpperCase());
        em.getTransaction().commit();
        System.out.println("Primer evento actualizado mediante identificador.");

        // modificar segundo evento
        em.getTransaction().begin();
        String nombreActual = em.find(EventoMusical.class, 20L).getNombre().toUpperCase();

        // ejectutar la query dinámica
        Query queryDinamica = em.createQuery("UPDATE EventoMusical e SET e.nombre = :nombreMayus WHERE e.id = 20");
        queryDinamica.setParameter("nombreMayus", nombreActual);
        queryDinamica.executeUpdate();
        em.getTransaction().commit();
        System.out.println("Segundo evento actualizado mediante JPQL Dinámica.");

        // modificar segunda con estatica
        em.getTransaction().begin();
        Query queryEstatica = em.createNamedQuery("actualizarNombreEstatico"); //
        queryEstatica.setParameter("idParam", 20L);
        queryEstatica.setParameter("nombreMayus", em.find(EventoMusical.class, 20L).getNombre().toUpperCase());
        queryEstatica.executeUpdate(); //
        em.getTransaction().commit();
        System.out.println("Segundo evento actualizado mediante JPQL Estática.");

        em.close();
        emf.close();
    }
}