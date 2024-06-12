package Parte1;

import java.awt.EventQueue;

public class ControladorPractica01_01b {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Practica01_01_b frame = new Practica01_01_b();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
