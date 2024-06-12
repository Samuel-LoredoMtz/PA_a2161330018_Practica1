package Parte1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Practica01_01 extends JFrame {

    private JPanel contentPane;

    public Practica01_01() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setTitle("Frame Practica01_01");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
    }

    public JPanel getContentPane() {
        return contentPane;
    }
}
