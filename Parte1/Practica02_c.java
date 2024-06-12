package Parte1;

import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SpinnerNumberModel;

public class Practica02_c extends JFrame {

    String[] opciones = { "Opcion 1", "Opcion 2", "Opcion 3" };
    JComboBox<String> comboBox;
    JPanel panel;
    JButton Bsalir;
    JTextField campoTexto;
    JPasswordField campoPassword;
    JTextArea areaTexto;
    JFormattedTextField campoFormateado;
    JSpinner spinner;
    JSlider slider;

    public Practica02_c() {
        // configuracion basica de la ventana
        setTitle("Ejemplo de componentes de entrada de texto");
        setSize(442, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // crear un panel para contener los componentes
        panel = new JPanel();
        panel.setBounds(0, 0, 403, 365);

        // crear los componentes y agregarlos al panel
        JLabel etiqueta1 = new JLabel("JButton:");
        etiqueta1.setBounds(0, 3, 178, 36);
        Bsalir = new JButton("Haz clic para Salir ");
        Bsalir.setBounds(188, 3, 172, 36);
        panel.setLayout(null);
        panel.add(etiqueta1);
        panel.add(Bsalir);

        JLabel etiqueta2 = new JLabel("JTextField:");
        etiqueta2.setBounds(0, 49, 148, 36);
        campoTexto = new JTextField();
        campoTexto.setBounds(188, 50, 172, 36);
        panel.add(etiqueta2);
        panel.add(campoTexto);

        JLabel etiqueta3 = new JLabel("JPasswordField:");
        etiqueta3.setBounds(0, 95, 148, 36);
        campoPassword = new JPasswordField();
        campoPassword.setBounds(188, 97, 172, 36);
        panel.add(etiqueta3);
        panel.add(campoPassword);

        JLabel etiqueta4 = new JLabel("JTextArea:");
        etiqueta4.setBounds(0, 141, 148, 36);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(188, 141, 172, 36);
        panel.add(etiqueta4);
        panel.add(scrollPane);
        areaTexto = new JTextArea();
        scrollPane.setViewportView(areaTexto);

        JLabel etiqueta5 = new JLabel("JFormattedTextField:");
        etiqueta5.setBounds(0, 187, 141, 36);
        campoFormateado = new JFormattedTextField();
        campoFormateado.setBounds(188, 187, 172, 36);
        campoFormateado.setValue(12345.67);
        panel.add(etiqueta5);
        panel.add(campoFormateado);

        JLabel etiqueta6 = new JLabel("JSpinner:");
        etiqueta6.setBounds(0, 233, 141, 36);
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel(0, 0, 100, 1);
        getContentPane().setLayout(null);
        spinner = new JSpinner(modeloSpinner);
        spinner.setBounds(188, 233, 172, 36);
        panel.add(etiqueta6);
        panel.add(spinner);

        JLabel etiqueta7 = new JLabel("JSlider:");
        etiqueta7.setBounds(0, 279, 148, 36);
        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setPaintLabels(true);
        slider.setMinorTickSpacing(20);
        slider.setBounds(188, 280, 178, 36);
        slider.setMajorTickSpacing(20);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        panel.add(etiqueta7);
        panel.add(slider);

        JLabel etiqueta8 = new JLabel("JComboBox:");
        etiqueta8.setBounds(0, 325, 148, 36);
        comboBox = new JComboBox<>(opciones);
        comboBox.setBounds(188, 325, 172, 36);
        panel.add(etiqueta8);
        panel.add(comboBox);

        // agregar el panel a la ventana
        getContentPane().add(panel);
        // mostrar la ventana
        setVisible(true);
    }

    public JPanel getPanel() {
        return panel;
    }

    public JButton getBsalir() {
        return Bsalir;
    }

    public JTextField getCampoTexto() {
        return campoTexto;
    }

    public JPasswordField getCampoPassword() {
        return campoPassword;
    }

    public JTextArea getAreaTexto() {
        return areaTexto;
    }

    public JFormattedTextField getCampoFormateado() {
        return campoFormateado;
    }

    public JSpinner getSpinner() {
        return spinner;
    }

    public JSlider getSlider() {
        return slider;
    }

    public JComboBox<String> getComboBox() {
        return comboBox;
    }
}
