package Tema11.Ejercicios.ejercicio3;

import java.awt.*;
import java.awt.event.*;

public class EjemploCardLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("Ejemplo CardLayout");
        frame.setSize(300, 200);

        // contedor para las cartas
        CardLayout cardLayout = new CardLayout();
        Panel panelCartas = new Panel(cardLayout);

        // crear las cartas
        panelCartas.add(new Button("Esta es la Carta 1"), "CARTA_1");
        panelCartas.add(new Button("Esta es la Carta 2"), "CARTA_2");
        panelCartas.add(new Button("Esta es la Carta 3"), "CARTA_3");

        // poner panel de cartas en el centro
        frame.add(panelCartas, BorderLayout.CENTER);

        // poner el boton en el sur
        Button btnSiguiente = new Button("Siguiente Tarjeta >>");
        frame.add(btnSiguiente, BorderLayout.SOUTH);

        // cambiar de carta al pulsar boton
        btnSiguiente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(panelCartas);
            }
        });

        frame.setVisible(true);
    }
}