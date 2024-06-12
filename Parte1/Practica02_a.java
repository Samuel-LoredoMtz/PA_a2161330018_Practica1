package Parte1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Practica02_a extends JFrame {

    private JPanel PanelPrincipal;
    private JButton Bsalir;

    public Practica02_a() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setTitle("Frame Practica02_a");
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
