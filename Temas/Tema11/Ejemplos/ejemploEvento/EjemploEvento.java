package Tema11.Ejemplos.ejemploEvento;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// listener oara mi boton
public class EjemploEvento {
    public static void main(String[] args) {
        Frame ventana = new Frame("Eventos");
        ventana.setSize(300, 150);
        ventana.setLayout(new FlowLayout());

        Button miBoton = new Button("Click aquí");
        ventana.add(miBoton);

        miBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has pulsado el botón");
            }
        });

        ventana.setVisible(true);
    }
}
