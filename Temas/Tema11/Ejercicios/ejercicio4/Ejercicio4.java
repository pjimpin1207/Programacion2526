package Tema11.Ejercicios.ejercicio4;

import java.awt.*;

public class Ejercicio4 {

    public static void main(String[] args) {
        Frame frame = new Frame("Panel de Ascensor");
        frame.setSize(300, 400);

        // poner cuadricula de 2 filas y 2 columnas
        frame.setLayout(new GridLayout(2, 2));

        // crear y añadir botones al frame.
        frame.add(new Button("Piso 3"));
        frame.add(new Button("Piso 4"));
        frame.add(new Button("Piso 1"));
        frame.add(new Button("Piso 2"));

        // mostrar
        frame.setVisible(true);
    }
}