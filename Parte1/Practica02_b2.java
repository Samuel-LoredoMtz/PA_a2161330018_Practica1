package Parte1;

import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Practica02_b2 extends JFrame {

    private JPanel PanelPrincipal;
    private JButton Bsalir;

    public Practica02_b2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 348, 233);
        setTitle("Frame Practica02_b2");
        PanelPrincipal = new JPanel();
        PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(PanelPrincipal);
        PanelPrincipal.setLayout(null);
        Bsalir = new JButton("Salir");
        Bsalir.setBounds(145, 124, 89, 23);
        Bsalir.setMnemonic(KeyEvent.VK_S);
        Bsalir.setDisplayedMnemonicIndex(0);
        PanelPrincipal.add(Bsalir);
    }

    public JPanel getPanelPrincipal() {
        return PanelPrincipal;
    }

    public JButton getBsalir() {
        return Bsalir;
    }
}
