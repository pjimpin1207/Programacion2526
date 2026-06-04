package Tema11.Ejercicios.ejercicio1;

import java.awt.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Frame frame = new Frame("Hola Mundo");
        frame.setSize(300, 200);
        frame.setVisible(true);


        // crear boton para enviar
        Button boton = new Button("Salir");
        frame.add(boton);
        frame.setLayout(new FlowLayout());

        Button botonLimpiar = new Button("Limpiar");
        frame.add(botonLimpiar);
        frame.setLayout(new FlowLayout());

        // campo de texto para escribir
        TextField texto = new TextField("Escribe algo..");
        frame.add(texto);


    }

}
