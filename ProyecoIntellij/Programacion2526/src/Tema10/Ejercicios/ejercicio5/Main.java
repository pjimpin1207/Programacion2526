package Tema10.Ejercicios.ejercicio5;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventos.odb");
        EntityManager em = emf.createEntityManager();

        EventoMusical primerEvento = em.find(EventoMusical.class, 10L);
        System.out.println(primerEvento);


        TypedQuery<EventoMusical> query = em.createNamedQuery("buscarEventoPorIdEstatico", EventoMusical.class);
        query.setParameter("idParam", 10L);
        EventoMusical primerEvento1 = query.getSingleResult();
        System.out.println(primerEvento1);

        // estatica
        TypedQuery<EventoMusical> queryEstatica = em.createNamedQuery("buscarEventoPorIdEstatico", EventoMusical.class);
        queryEstatica.setParameter("idParam", 20L);
        EventoMusical segundoEvento = queryEstatica.getSingleResult();
        System.out.println(segundoEvento);

        // dinamica
        TypedQuery<EventoMusical> queryDinamica = em.createQuery("SELECT e FROM EventoMusical e WHERE e.id = :idParam", EventoMusical.class);
        queryDinamica.setParameter("idParam", 10L);
        EventoMusical primerEvento2 = queryDinamica.getSingleResult();
        System.out.println(primerEvento2);

        em.close();
        emf.close();
    }
}
