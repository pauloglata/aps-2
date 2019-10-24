package Vis�o;

// import Controller.LoginController;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButtonAcessar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jSeparatorSuperior = new javax.swing.JSeparator();
        jSeparatorLateralDireito = new javax.swing.JSeparator();
        jLabelTexto = new javax.swing.JLabel();
        jSeparatorSuperioMenor = new javax.swing.JSeparator();
        jSeparatorLateralEsquerdo = new javax.swing.JSeparator();
        jSeparatorInferior = new javax.swing.JSeparator();
        jLabelLogoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonAcessar.setText("ACESSAR");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(130, 190, 80, 30);

        jButton2.setText("SAIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 190, 90, 30);

        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 90, 40, 14);

        jLabelUsuario.setText("Usu�rio:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(120, 60, 60, 20);
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(180, 60, 150, 20);

        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(180, 90, 150, 20);
        getContentPane().add(jSeparatorSuperior);
        jSeparatorSuperior.setBounds(170, 30, 190, 10);

        jSeparatorLateralDireito.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparatorLateralDireito);
        jSeparatorLateralDireito.setBounds(360, 30, 10, 130);

        jLabelTexto.setText("Tela de Login");
        getContentPane().add(jLabelTexto);
        jLabelTexto.setBounds(100, 20, 90, 20);
        getContentPane().add(jSeparatorSuperioMenor);
        jSeparatorSuperioMenor.setBounds(70, 30, 20, 10);

        jSeparatorLateralEsquerdo.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparatorLateralEsquerdo);
        jSeparatorLateralEsquerdo.setBounds(70, 30, 20, 130);
        getContentPane().add(jSeparatorInferior);
        jSeparatorInferior.setBounds(70, 160, 290, 10);

        jLabelLogoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LogoLogin.PNG"))); // NOI18N
        getContentPane().add(jLabelLogoLogin);
        jLabelLogoLogin.setBounds(0, 0, 460, 289);

        setSize(new java.awt.Dimension(475, 328));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    }                                        

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        //LoginController logar = new LoginController();
        //logar.entrarSistema();
    }                                              


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelLogoLogin;
    private javax.swing.JLabel jLabelTexto;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JSeparator jSeparatorInferior;
    private javax.swing.JSeparator jSeparatorLateralDireito;
    private javax.swing.JSeparator jSeparatorLateralEsquerdo;
    private javax.swing.JSeparator jSeparatorSuperioMenor;
    private javax.swing.JSeparator jSeparatorSuperior;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration                   
}
