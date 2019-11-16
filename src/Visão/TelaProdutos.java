package view;

import javax.swing.*;

public class TelaProdutos extends JFrame {

    // Variables declaration - do not modify
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JSeparator upper;
    private JSeparator upperMinor;
    private JSeparator leftSide;
    private JSeparator rightSide;
    private JTextField text;
    private JSeparator bottom;
    private JLabel jLabelNomePrincipal;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JScrollPane pane;
    private javax.swing.JLabel jLabelTelaPrincipal;

// End of variables declaration

    public TelaProdutos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        // Home layout null for background image
        getContentPane().setLayout(null);
        // End

        // Home
        jButton1 = new JButton();
        jButton1.setText("+");
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 360, 70, 40);
        // End

        // Home
        jButton2 = new JButton();
        jButton2.setText("-");
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 360, 70, 40);
        // End

        // Home
        jButton3 = new JButton();
        jButton3.setText("ADICIONAR");
        getContentPane().add(jButton3);
        jButton3.setBounds(220, 360, 100, 40);
        // End

        // Home
        jButton4 = new JButton();
        jButton4.setText("EDITAR");
        getContentPane().add(jButton4);
        jButton4.setBounds(330, 360, 100, 40);
        // End

        // Home
        jButton5 = new JButton();
        jButton5.setText("EXCLUIR");
        getContentPane().add(jButton5);
        jButton5.setBounds(440, 360, 100, 40);
        // End
        
        // Start text
        text = new JTextField();
        getContentPane().add(text);
        text.setBounds(610, 370, 180, 30);
        // End text

        // Home
        jLabelNomePrincipal = new javax.swing.JLabel();
        jLabelNomePrincipal.setText("PRODUTOS");
        getContentPane().add(jLabelNomePrincipal);
        jLabelNomePrincipal.setBounds(30, 25, 100, 14);
        // End
        
     // Start upper
        upper = new JSeparator();
        getContentPane().add(upper);
        upper.setBounds(100, 30, 730, 10);
        // End upper
        
        // Start upperMinor
        upperMinor = new JSeparator();
        getContentPane().add(upperMinor);
        upperMinor.setBounds(10, 30, 10, 10);
        // End upperMinor
        
        // Start leftSide
        leftSide = new JSeparator();
        leftSide.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(leftSide);
        leftSide.setBounds(10, 30, 10, 310);
        // End leftSide
        
        // Start rightSide
        rightSide = new JSeparator();
        rightSide.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(rightSide);
        rightSide.setBounds(830, 30, 10, 310);
        // End rightSide
        
        // Start bottom
        bottom = new JSeparator();
        getContentPane().add(bottom);
        bottom.setBounds(10, 340, 820, 10);
        // End bottom

        // Home
        jTableProdutos = new javax.swing.JTable();

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null}
        },
        new String [] {
            "ID", "Nome", "Sertor", "Descrição", "Quantidade", "Valor"
        }
    ));
        jTableProdutos.setColumnSelectionAllowed(true);
        
        // Start pane
        pane = new JScrollPane();
        pane.setViewportView(jTableProdutos);
        getContentPane().add(pane);
        pane.setBounds(20, 60, 800, 250);
        // End pane

        jLabelTelaPrincipal = new JLabel();
        jLabelTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela-princiapal.PNG"))); // NOI18N
        getContentPane().add(jLabelTelaPrincipal);
        jLabelTelaPrincipal.setBounds(0, -30, 900, 470);
    }
}
