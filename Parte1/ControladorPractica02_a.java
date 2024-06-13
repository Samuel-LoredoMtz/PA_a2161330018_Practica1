package Parte1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPractica02_a {

    public ControladorPractica02_a() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Practica02_a frame = new Practica02_a();
                    frame.setVisible(true);
                    frame.getBsalir().addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            frame.dispose();
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
