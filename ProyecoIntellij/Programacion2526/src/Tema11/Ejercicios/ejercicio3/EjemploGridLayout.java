package Tema11.Ejercicios.ejercicio3;

import java.awt.*;
import java.awt.event.*;

public class EjemploGridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("Ejemplo GridLayout");
        frame.setSize(300, 200);

        // cuadrícula de 2 filas y 3 columnas
        frame.setLayout(new GridLayout(2, 3));

        frame.add(new Button("F1 - C1"));
        frame.add(new Button("F1 - C2"));
        frame.add(new Button("F1 - C3"));
        frame.add(new Button("F2 - C1"));
        frame.add(new Button("F2 - C2"));
        frame.add(new Button("F2 - C3"));
    }

}