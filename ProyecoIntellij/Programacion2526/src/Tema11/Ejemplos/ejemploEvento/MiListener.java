package Tema11.Ejemplos.ejemploEvento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Has pulsado el botón");
    }
}
