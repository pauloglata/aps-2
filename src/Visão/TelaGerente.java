package Vis�o;

public class TelaGerente extends javax.swing.JFrame {

    public TelaGerente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabelNomePrincipal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaGerentes = new javax.swing.JTable();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jTextFieldTexto = new javax.swing.JTextField();
        jSeparatorMiniSuperior = new javax.swing.JSeparator();
        jSeparatorSuperior = new javax.swing.JSeparator();
        jSeparatorLateralEsquerda = new javax.swing.JSeparator();
        jSeparatorInferior = new javax.swing.JSeparator();
        jSeparatorLateralDireita = new javax.swing.JSeparator();
        jLabelTelaPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelNomePrincipal.setText("GERENTES");
        getContentPane().add(jLabelNomePrincipal);
        jLabelNomePrincipal.setBounds(40, 20, 60, 20);

        jTableTabelaGerentes.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Telefone", "E-mail", "Data de Nascimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableTabelaGerentes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 800, 250);

        jButtonAdicionar.setText("ADICIONAR");
        getContentPane().add(jButtonAdicionar);
        jButtonAdicionar.setBounds(130, 363, 110, 40);

        jButtonExcluir.setText("EXCLUIR");
        getContentPane().add(jButtonExcluir);
        jButtonExcluir.setBounds(280, 363, 110, 40);

        jButtonEditar.setText("EDITAR");
        getContentPane().add(jButtonEditar);
        jButtonEditar.setBounds(430, 360, 110, 40);
        getContentPane().add(jTextFieldTexto);
        jTextFieldTexto.setBounds(610, 370, 120, 30);
        getContentPane().add(jSeparatorMiniSuperior);
        jSeparatorMiniSuperior.setBounds(10, 30, 20, 10);
        getContentPane().add(jSeparatorSuperior);
        jSeparatorSuperior.setBounds(100, 30, 730, 10);

        jSeparatorLateralEsquerda.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparatorLateralEsquerda);
        jSeparatorLateralEsquerda.setBounds(10, 30, 10, 310);
        getContentPane().add(jSeparatorInferior);
        jSeparatorInferior.setBounds(10, 340, 820, 10);

        jSeparatorLateralDireita.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparatorLateralDireita);
        jSeparatorLateralDireita.setBounds(830, 30, 10, 310);

        jLabelTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela-princiapal.PNG"))); // NOI18N
        getContentPane().add(jLabelTelaPrincipal);
        jLabelTelaPrincipal.setBounds(0, 0, 860, 460);

        pack();
    }                        

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("NimbusjButtonAdicionar(info.getName())" != null) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerente().setVisible(true);
            }
        
    });
   }



    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabelNomePrincipal;
    private javax.swing.JLabel jLabelTelaPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatorInferior;
    private javax.swing.JSeparator jSeparatorLateralDireita;
    private javax.swing.JSeparator jSeparatorLateralEsquerda;
    private javax.swing.JSeparator jSeparatorMiniSuperior;
    private javax.swing.JSeparator jSeparatorSuperior;
    private javax.swing.JTable jTableTabelaGerentes;
    private javax.swing.JTextField jTextFieldTexto;
    // End of variables declaration                   
}
