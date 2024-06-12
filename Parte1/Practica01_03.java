package Parte1;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Practica01_03 extends JDialog {

    private JPanel contentPane;

    public Practica01_03() {
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
    }

    public JPanel getContentPane() {
        return contentPane;
    }
}
