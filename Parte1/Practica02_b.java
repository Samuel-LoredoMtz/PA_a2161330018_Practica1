package Parte1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Practica02_b extends JFrame {

    private JPanel PanelPrincipal;
    private JButton Bsalir;

    public Practica02_b() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setTitle("Frame Practica02_b");
        PanelPrincipal = new JPanel();
        PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(PanelPrincipal);
        PanelPrincipal.setLayout(null);
        Bsalir = new JButton("Salir");
        Bsalir.setBounds(145, 124, 89, 23);
        PanelPrincipal.add(Bsalir);
    }

    public JPanel getPanelPrincipal() {
        return PanelPrincipal;
    }

    public JButton getBsalir() {
        return Bsalir;
    }
}
