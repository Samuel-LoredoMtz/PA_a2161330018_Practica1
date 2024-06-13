package Parte1;

import javax.swing.JDialog;

public class ControladorPractica01_03 {

    public ControladorPractica01_03() {
        try {
            Practica01_03 dialog = new Practica01_03();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
