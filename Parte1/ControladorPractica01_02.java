package Parte1;

import java.awt.EventQueue;

public class ControladorPractica01_02 {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Practica01_02 frame = new Practica01_02();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
