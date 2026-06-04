package Tema11.Ejercicios.ejercicio2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio2 {
    public static void main(String[] args) {

        // crear frame
        Frame frame = new Frame("Posicionamiento Absoluto");
        frame.setSize(400, 300);

        frame.setLayout(null);

        // crear  los componentes
        Label etiqueta = new Label("Posición personalizada en píxeles:");
        Button boton = new Button("¡Púlsame!");

        // posicionar
        etiqueta.setBounds(50, 80, 250, 30);

        // Coloccolocar botón a 100px del borde izquierdo y 150px del superior
        boton.setBounds(100, 150, 120, 40);

        // añadir componentes
        frame.add(etiqueta);
        frame.add(boton);

        // mostrar ventana
        frame.setVisible(true);
    }
}