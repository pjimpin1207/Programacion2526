package Tema11.Ejercicios.ejercicio3;

import java.awt.*;
import java.awt.event.*;

public class EjemploBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("Ejemplo BorderLayout");
        frame.setSize(400, 300);

        // establecer  borderlayout
        frame.setLayout(new BorderLayout());

        // añadir los componentes
        frame.add(new Button("Norte (NORTH)"), BorderLayout.NORTH);
        frame.add(new Button("Sur (SOUTH)"), BorderLayout.SOUTH);
        frame.add(new Button("Este (EAST)"), BorderLayout.EAST);
        frame.add(new Button("Oeste (WEST)"), BorderLayout.WEST);
        frame.add(new Button("Centro (CENTER) - Ocupa el resto"), BorderLayout.CENTER);

    }
}