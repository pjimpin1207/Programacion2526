package Tema10.Ejercicios.ejercicio4;

import Tema10.Ejercicios.ejercicio2.Artista;
import Tema10.Ejercicios.ejercicio2.GeneroMusical;
import Tema10.Ejercicios.ejercicio4.EventoMusical;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // crear primer evento
        EventoMusical festival1 = new EventoMusical(10L, "Resurrection Fest", LocalDate.of(2026, 6, 26), new BigDecimal("2450000.50"), GeneroMusical.LATINO, 1);

        // Añadimos artistas
        festival1.addArtista(new Artista("Anuel", 1));
        festival1.addArtista(new Artista("Myke Towers", 1));


        // crear segundo evento
        EventoMusical festival2 = new EventoMusical(20L, "CocaCola Music Festival", LocalDate.of(2026, 7, 18), new BigDecimal("1890000.00"), GeneroMusical.POP, 2);

        festival2.addArtista(new Artista("Aitana", 1));

        // mostrar resultado
        System.out.println(festival1);
        System.out.println("Lista de artistas: " + festival1.getArtistasConfirmados());
        System.out.println();

        System.out.println(festival2);
        System.out.println("Lista de artistas: " + festival2.getArtistasConfirmados());

        // crear conexion base de datos
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventos.odb");
        EntityManager em = emf.createEntityManager();

        // iniciar la transacción
        em.getTransaction().begin();

        // operaciones
        em.persist(festival1);
        em.persist(festival2);

        // confirmar la transacción
        em.getTransaction().commit();

        // cerrar la conexión
        em.close();
        emf.close();

    }
}