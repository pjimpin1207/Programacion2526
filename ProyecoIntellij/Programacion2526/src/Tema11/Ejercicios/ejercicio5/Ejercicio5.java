package Tema11.Ejercicios.ejercicio5;

import java.awt.*;
import java.awt.event.*;

public class Ejercicio5 {
    public static void main(String[] args) {

        // crear ventana
        Frame frame = new Frame("Editor de Texto");
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // 2. Creación de la etiqueta central
        Label lblTexto = new Label("Texto de prueba", Label.CENTER);
        frame.add(lblTexto, BorderLayout.CENTER);

        // crear la barra del menu
        MenuBar barraMenu = new MenuBar();

        // menu de estilo
        Menu menuEstilo = new Menu("Estilo");
        MenuItem Negrita = new MenuItem("Negrita");
        MenuItem Normal = new MenuItem("Normal");
        menuEstilo.add(Negrita);
        menuEstilo.add(Normal);


        // menu color
        Menu menuColor = new Menu("Color");
        MenuItem Rojo = new MenuItem("Rojo");
        MenuItem Azul = new MenuItem("Azul");
        MenuItem Negro = new MenuItem("Negro");
        menuColor.add(Rojo);
        menuColor.add(Azul);
        menuColor.add(Negro);

        // añadir opciones a la barra desplegable
        barraMenu.add(menuEstilo);
        barraMenu.add(menuColor);


        // hacer visible
        frame.setMenuBar(barraMenu);
        frame.setVisible(true);
    }
}