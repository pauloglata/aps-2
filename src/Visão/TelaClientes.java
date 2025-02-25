package view;

import javax.swing.*;

public class TelaClientes extends JFrame {

    public TelaClientes() {
        initComponents();
    }

    // Variables declaration
    private JButton add;
    private JButton search;
    private JButton edit;
    private JButton delete;
    private JLabel title;
    private JTextField text;
    private JSeparator bottom;
    private JSeparator rigthSide;
    private JSeparator leftSide;
    private JSeparator upperMinor;
    private JSeparator upper;
    private JTable tableClientes;
    private JScrollPane jScrollPane1;
    private JLabel telaPrincipal;

// End variables

    @SuppressWarnings("unchecked")
    private void initComponents() {

        // Start layout for background null
        getContentPane().setLayout(null);
        // End layout

        // Start add
        add = new JButton();
        add.setText("ADICIONAR");
        getContentPane().add(add);
        add.setBounds(370, 370, 100, 40);
        // End add

        // Start search
        search = new JButton();
        search.setText("BUSCAR");
        getContentPane().add(search);
        search.setBounds(500, 370, 90, 40);
        // End search

        // Start edit
        edit = new JButton();
        edit.setText("EDITAR");
        getContentPane().add(edit);
        edit.setBounds(90, 370, 100, 40);
        // End edit

        // Start delete
        delete = new JButton();
        delete.setText("EXCLUIR");
        getContentPane().add(delete);
        delete.setBounds(230, 370, 90, 40);
        // End delete

        // Start title
        title = new JLabel();
        title.setText("CLIENTES");
        getContentPane().add(title);
        title.setBounds(40, 20, 60, 20);
        // End title

        // Start text
        text = new JTextField();
        getContentPane().add(text);
        text.setBounds(610, 375, 180, 30);
        // End text

        // Start bottom
        bottom = new JSeparator();
        getContentPane().add(bottom);
        bottom.setBounds(20, 360, 830, 20);
        // End bottom

        // Start rigthSide
        rigthSide = new JSeparator();
        rigthSide.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(rigthSide);
        rigthSide.setBounds(850, 30, 10, 330);
        // End rigthSide

        // Start leftSide
        leftSide = new JSeparator();
        leftSide.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(leftSide);
        leftSide.setBounds(20, 30, 10, 330);
        // End leftSide

        // start upperMinor
        upperMinor = new JSeparator();
        getContentPane().add(upperMinor);
        upperMinor.setBounds(20, 30, 10, 10);
        // End upperMinor

        // Start upper
        upper = new JSeparator();
        getContentPane().add(upper);
        upper.setBounds(100, 30, 750, 10);
        // End upper

        // Start tableClientes
        tableClientes = new JTable();
        getContentPane().add(tableClientes);

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null}
        },
        new String [] {
            "ID", "Nome", "CPF", "Telefone", "Data de Nascimento"
        }
    ));
        // End

        // Start jScrollPane1
        jScrollPane1 = new JScrollPane();
        jScrollPane1.setViewportView(tableClientes);
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 60, 750, 280);
        // End jScrollPane1
        
        // Start telaPrincipal
        telaPrincipal = new JLabel();
        telaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela-princiapal.PNG"))); // NOI18N
        telaPrincipal.setIconTextGap(5);
        getContentPane().add(telaPrincipal);
        telaPrincipal.setBounds(0, -30, 900, 470);
        // End telaPrincipal
    }
}
