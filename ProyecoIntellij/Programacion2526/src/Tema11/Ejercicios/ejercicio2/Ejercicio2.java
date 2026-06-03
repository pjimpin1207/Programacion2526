package Tema11.Ejercicios.ejercicio2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane; // Importamos JOptionPane para el diálogo modal

public class Ejercicio2 {
    public static void main(String[] args) {

        // --- 1. CONFIGURACIÓN DEL CONTENEDOR PRINCIPAL ---
        Frame frame = new Frame("Pantalla de Login");
        frame.setSize(350, 250);
        // Usamos FlowLayout para que los elementos se coloquen uno tras otro
        frame.setLayout(new FlowLayout());

        // EVENTO: Cerrar la ventana al pulsar la 'X'
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Termina la ejecución del programa
            }
        });

        // --- 2. CREACIÓN DE LOS COMPONENTES ---
        Label lblUsuario = new Label("Usuario:");
        TextField txtUsuario = new TextField(25);

        Label lblPass = new Label("Contraseña:");
        TextField txtPass = new TextField(25);
        txtPass.setEchoChar('*'); // Oculta el texto introducido con asteriscos

        Button btnAceptar = new Button("Aceptar");
        Button btnCancelar = new Button("Cancelar");
        Button btnFichero = new Button("Seleccionar Fichero (Opcional)");

        Label lblRutaFichero = new Label("No se ha seleccionado ningún archivo.");

        // --- 3. PROGRAMACIÓN DE LOS EVENTOS (LISTENERS) ---

        // EVENTO: El botón cancelar borra el texto introducido
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUsuario.setText("");
                txtPass.setText("");
            }
        });

        // EVENTO: El botón aceptar muestra un diálogo modal de bienvenida
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuarioIntro = txtUsuario.getText();
                // Mostramos un popup usando JOptionPane de Swing
                JOptionPane.showMessageDialog(frame, "¡Bienvenido al sistema, " + usuarioIntro + "!");
            }
        });

        // EVENTO OPCIONAL: Seleccionar un fichero y mostrar su ruta
        btnFichero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abrimos el explorador de archivos nativo del SO
                FileDialog fd = new FileDialog(frame, "Elige un archivo", FileDialog.LOAD);
                fd.setVisible(true); // Se pausa aquí hasta que el usuario elige algo o cancela

                // Si el usuario ha seleccionado un archivo (no ha cerrado la ventana)
                if (fd.getFile() != null) {
                    String rutaCompleta = fd.getDirectory() + fd.getFile();
                    lblRutaFichero.setText("Archivo: " + rutaCompleta);
                    // Reajustamos la ventana por si la ruta es muy larga
                    frame.pack();
                    frame.setSize(400, 300);
                }
            }
        });

        // --- 4. AÑADIR LOS COMPONENTES AL FRAME ---
        frame.add(lblUsuario);
        frame.add(txtUsuario);
        frame.add(lblPass);
        frame.add(txtPass);
        frame.add(btnAceptar);
        frame.add(btnCancelar);
        frame.add(btnFichero);
        frame.add(lblRutaFichero);

        // --- 5. MOSTRAR LA INTERFAZ ---
        frame.setVisible(true);
    }
}