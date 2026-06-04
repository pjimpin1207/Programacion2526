package Tema11.Ejercicios.ejercicio3;

import java.awt.*;
import java.awt.event.*;

public class EjemploFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("Ejemplo FlowLayout");
        frame.setSize(400, 150);

        // Establecemos el FlowLayout (Por defecto se centran)
        frame.setLayout(new FlowLayout());

        // Añadimos varios botones para ver cómo fluyen
        frame.add(new Button("Botón 1"));
        frame.add(new Button("Botón 2"));
        frame.add(new Button("Un botón con texto mas largo"));
        frame.add(new Button("Botón 4"));
        frame.add(new Button("Botón 5"));

        frame.setVisible(true);


    }
}