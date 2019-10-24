package Vis�o;

public class TelaClientes extends javax.swing.JFrame {

    
    public TelaClientes() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabeNomeTela = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonEditar = new javax.swing.JButton();
        jSeparatorMiniSuperior = new javax.swing.JSeparator();
        jSeparatorLateralEsquerda = new javax.swing.JSeparator();
        jSeparatorSuperior = new javax.swing.JSeparator();
        jSeparatorLateralDireita = new javax.swing.JSeparator();
        jSeparatorInferior = new javax.swing.JSeparator();
        jLabelTelaPrincipal = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabeNomeTela.setText("CLIENTES");
        getContentPane().add(jLabeNomeTela);
        jLabeNomeTela.setBounds(40, 20, 60, 20);

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableClientes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 60, 750, 280);

        jButtonExcluir.setText("EXCLUIR");
        getContentPane().add(jButtonExcluir);
        jButtonExcluir.setBounds(230, 380, 90, 40);

        jButtonAdicionar.setText("ADICIONAR");
        getContentPane().add(jButtonAdicionar);
        jButtonAdicionar.setBounds(370, 380, 90, 40);

        jButtonBuscar.setText("BUSCAR");
        getContentPane().add(jButtonBuscar);
        jButtonBuscar.setBounds(500, 380, 90, 40);
        getContentPane().add(jTextFieldBuscar);
        jTextFieldBuscar.setBounds(610, 390, 180, 30);

        jButtonEditar.setText("EDITAR");
        getContentPane().add(jButtonEditar);
        jButtonEditar.setBounds(90, 380, 100, 40);
        getContentPane().add(jSeparatorMiniSuperior);
        jSeparatorMiniSuperior.setBounds(20, 30, 10, 10);

        jSeparatorLateralEsquerda.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparatorLateralEsquerda);
        jSeparatorLateralEsquerda.setBounds(20, 30, 10, 330);
        getContentPane().add(jSeparatorSuperior);
        jSeparatorSuperior.setBounds(90, 30, 760, 10);

        jSeparatorLateralDireita.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparatorLateralDireita);
        jSeparatorLateralDireita.setBounds(850, 30, 10, 330);
        getContentPane().add(jSeparatorInferior);
        jSeparatorInferior.setBounds(20, 360, 830, 20);

        jLabelTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela-princiapal.PNG"))); // NOI18N
        jLabelTelaPrincipal.setIconTextGap(5);
        getContentPane().add(jLabelTelaPrincipal);
        jLabelTelaPrincipal.setBounds(0, 0, 860, 458);

        pack();
    }// </editor-fold>                        

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabeNomeTela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTelaPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatorInferior;
    private javax.swing.JSeparator jSeparatorLateralDireita;
    private javax.swing.JSeparator jSeparatorLateralEsquerda;
    private javax.swing.JSeparator jSeparatorMiniSuperior;
    private javax.swing.JSeparator jSeparatorSuperior;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration                   
}
