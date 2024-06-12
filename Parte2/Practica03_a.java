package Parte2;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Practica03_a extends JFrame {

    private JPanel contentPane;
    
    // Objetos para el manejo de categorias y productos
    ListaInsumos listainsumo;
    ListaCategorias listacategorias;
    
    // Objetos de los controladores
    private JComboBox ComboCategoria;
    private JTextField Tid, Tinsumo;
    private JButton Bagregar, Beliminar, Bsalir;
    private JTextArea areaProductos;
    private JPanel panelFormulario;
    
    public Practica03_a() {
        super("Administracion de productos");
        
        // Inicializamos las listas para el manejo de datos 
        this.inicializarcategorias();
        this.listainsumo = new ListaInsumos();
        setBounds(0, 0, 390, 370);
        panelFormulario = new JPanel();
        panelFormulario.setLayout(null);
        getContentPane().add(panelFormulario, BorderLayout.CENTER);
        
        JLabel labelCategoria = new JLabel("Categoria:");
        labelCategoria.setBounds(10, 66, 71, 20);
        ComboCategoria = new JComboBox(this.listacategorias.CategoriasArreglo());
        ComboCategoria.setEditable(true);
        ComboCategoria.setBounds(91, 66, 160, 20);
        panelFormulario.add(labelCategoria);
        panelFormulario.add(ComboCategoria);
        
        JLabel labelId = new JLabel("ID:");
        labelId.setBounds(10, 9, 71, 20);
        this.Tid = new JTextField(10);
        this.Tid.setEditable(false);
        this.Tid.setBounds(91, 9, 147, 20);
        panelFormulario.add(labelId);
        panelFormulario.add(Tid);
        
        JLabel labelInsumo = new JLabel("Insumo:");
        labelInsumo.setBounds(10, 34, 71, 20);
        this.Tinsumo = new JTextField(20);
        Tinsumo.setBounds(91, 40, 147, 20);
        this.Tinsumo.setEditable(false);
        panelFormulario.add(labelInsumo);
        panelFormulario.add(Tinsumo);
        
        this.Bagregar = new JButton("Agregar");
        this.Bagregar.setBounds(20, 104, 111, 20);
        panelFormulario.add(Bagregar);
        
        this.Beliminar = new JButton("Eliminar");
        this.Beliminar.setBounds(153, 104, 111, 20);
        panelFormulario.add(Beliminar);
        
        this.Bsalir = new JButton("Salir");
        this.Bsalir.setBounds(274, 104, 79, 20);
        panelFormulario.add(Bsalir);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 132, 357, 179);
        panelFormulario.add(scrollPane);
        this.areaProductos = new JTextArea(10, 40);
        scrollPane.setViewportView(areaProductos);
        this.areaProductos.setEditable(false);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void inicializarcategorias() {
        this.listacategorias = new ListaCategorias();
        
        Categoria nodo1 = new Categoria("01", "Materiales");
        Categoria nodo2 = new Categoria("02", "Mano de obra");
        Categoria nodo3 = new Categoria("03", "Maquinaria y Equipo");
        Categoria nodo4 = new Categoria("04", "Servicios");
        
        this.listacategorias.agregarCategoria(nodo1);
        this.listacategorias.agregarCategoria(nodo2);
        this.listacategorias.agregarCategoria(nodo3);
        this.listacategorias.agregarCategoria(nodo4);
    }

    public JComboBox getComboCategoria() {
        return ComboCategoria;
    }

    public JTextField getTid() {
        return Tid;
    }

    public JTextField getTinsumo() {
        return Tinsumo;
    }

    public JButton getBagregar() {
        return Bagregar;
    }

    public JButton getBeliminar() {
        return Beliminar;
    }

    public JButton getBsalir() {
        return Bsalir;
    }

    public JTextArea getAreaProductos() {
        return areaProductos;
    }

    public ListaInsumos getListainsumo() {
        return listainsumo;
    }

    public ListaCategorias getListacategorias() {
        return listacategorias;
    }

    public void Volveralinicio() {
        this.Bagregar.setText("Agregar");
        this.Bsalir.setText("Salir");
        this.Beliminar.setEnabled(true);
        this.Tid.setEditable(false);
        this.Tinsumo.setEditable(false);
        this.ComboCategoria.setEditable(false);
        this.Tid.setText("");
        this.Tinsumo.setText("");
        this.ComboCategoria.setSelectedIndex(0);
    }

    public void Altas() {
        if (this.Bagregar.getText().compareTo("Agregar") == 0) {
            this.Bagregar.setText("Salvar");
            this.Bsalir.setText("Cancelar");
            this.Beliminar.setEnabled(false);
            this.Tid.setEditable(true);
            this.Tinsumo.setEditable(true);
            this.ComboCategoria.setEditable(true);
            this.ComboCategoria.setFocusable(true);
        } else {
            if (esdatoscompletos()) {
                String id, insumo, idcategoria;
                id = this.Tid.getText().trim();
                insumo = this.Tinsumo.getText().trim();
                idcategoria = ((Categoria)this.ComboCategoria.getSelectedItem()).getIdcategoria().trim();
                Insumo nodo = new Insumo(id, insumo, idcategoria);
                if (!this.listainsumo.agregarInsumo(nodo)) {
                    JOptionPane.showMessageDialog(this, " Lo siento el id " + id + " ya existe lo tiene asignado " + this.listainsumo.buscarInsumo(id));
                } else {
                    this.areaProductos.setText(this.listainsumo.toString());
                }
            }
        }
        this.Volveralinicio();
    }

    private boolean esdatoscompletos() {
        return !this.Tid.getText().trim().isEmpty() && !this.Tinsumo.getText().trim().isEmpty();
    }

    public void Eliminar() {
        Object[] opciones = this.listainsumo.idinsumos();
        String id = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion:", "Eliminacion de insumos", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        if (id != null && !id.isEmpty()) {
            if (!this.listainsumo.eliminarInsumoPorId(id)) {
                JOptionPane.showMessageDialog(this, "No existe este id");
            } else {
                this.areaProductos.setText(this.listainsumo.toString());
            }
        }
    }
}
