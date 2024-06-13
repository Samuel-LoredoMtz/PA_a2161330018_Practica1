package Parte1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorPractica02_c {

    public ControladorPractica02_c() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Practica02_c frame = new Practica02_c();
                    frame.setVisible(true);
                    frame.getBsalir().addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            String cadena = "valor de Jtextfield: " + frame.getCampoTexto().getText().trim();
                            cadena += "\nvalor de JPasswordField: "
                                    + new String(frame.getCampoPassword().getPassword());
                            cadena += "\nvalor de JTextArea: " + frame.getAreaTexto().getText();
                            cadena += "\nvalor de JFormattedTextField: " + frame.getCampoFormateado().getText();
                            cadena += "\nvalor de JSpinner: " + frame.getSpinner().getValue().toString();
                            cadena += "\nvalor de JSlider: " + frame.getSlider().getValue();
                            if (frame.getComboBox().getSelectedIndex() > -1)
                                cadena += "\nvalor de JComboBox: " + frame.getComboBox().getSelectedItem().toString();
                            JOptionPane.showMessageDialog(frame, cadena);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
