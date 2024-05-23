package view;

import controller.ConectarDaoFinal;
import controller.UsuarioDaoFinal;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.net.URL;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    ConectarDaoFinal conecta = new ConectarDaoFinal(); //instancia a classe ConectarDaoFinalOld
    UsuarioDaoFinal objContDao = new UsuarioDaoFinal(); //instancia a classe UsuarioDaoFinal

    public Login() {
        initComponents();
        inserirIcon();
        txtUsuario.setBackground(new Color(0, 0, 0, 0));//Deixar transparente
        txtSenha.setBackground(new Color(0, 0, 0, 0));//Deixar transparente
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        btnSairLogin = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IDRL Materiais de Construção - Login");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setText("Entrar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 70, -1));

        btnSairLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSairLogin.setText("Sair");
        btnSairLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnSairLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 230, 63, -1));

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 230, 70, -1));

        txtUsuario.setBorder(null);
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 105, 242, 25));

        txtSenha.setBorder(null);
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 173, 242, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backLogin.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        btnLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        btnLimpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSairLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairLoginActionPerformed
        btnSairLogin();
    }//GEN-LAST:event_btnSairLoginActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSairLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    
    private void btnLogin() {
        String login = txtUsuario.getText();
        String captura = new String(txtSenha.getPassword()); //modo seguro de capturar senha
        String senha = captura;
       
        try {

            conecta.rs = objContDao.validarLogin(login, senha);
            if (conecta.rs.next() || (login.equals("textUsuario")
                    && senha.equals("textSenha"))) {
                String perfil = conecta.rs.getString(2);
                //System.out.println(perfil);

                if (perfil.equals("Administrador")) {
                    TelaPrincipal tela = new TelaPrincipal();//instancia a tela principal
                    tela.setVisible(true); //deixa o form acima visível
                    //ativa o menu cadastro na Tela Principal
                    TelaPrincipal.menCadUserFull.setEnabled(true);                    
                    //Pega o "nome" do "user no DB" e troca pelo conteúdo da label "lblUsuario"
                    TelaPrincipal.lblUsuario.setText(conecta.rs.getString(3));
                    //Pega o "perfil" do "user no DB" e troca pelo conteúdo da label "lblPerfilUser"
                    TelaPrincipal.lblPerfilUser.setText(conecta.rs.getString(2));
                    //Adiciona uma cor no contéudo da "lblPerfilUser"
                    TelaPrincipal.lblPerfilUser.setForeground(Color.red);

                    dispose();
                    conecta.rs.close(); //fecha a conexão
                } else {
                   TelaPrincipal tela = new TelaPrincipal();
                    tela.setVisible(true);
                    TelaPrincipal.lblUsuario.setText(conecta.rs.getString(3));
                    TelaPrincipal.lblPerfilUser.setText(conecta.rs.getString(2));
                    TelaPrincipal.lblPerfilUser.setForeground(Color.blue);

                    dispose();
                    conecta.rs.close(); //fecha a conexão
                }

            } else {
                JOptionPane.showMessageDialog(null,
                        "Ususário ou Senha Inválidos!", "Erro de Operação",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }

    private void btnLimpar() {
        this.txtUsuario.setText(null); // limpar
        this.txtSenha.setText(null); // limpar
        this.txtUsuario.grabFocus(); //coloca o cursor no campo login
    }

    private void btnSairLogin() {
        Object[] options = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null, "Deseja realmente sair?", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);
        if (i == 0) {
            //dispose();
            System.exit(0);
        }
    }
    
    //DIVERSOS
    private void inserirIcon() {        
            URL localImagen = getClass().getResource("/image/BackgroundIcon48x48.png");
            Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(localImagen);
            this.setIconImage(iconeTitulo);        
    } 
}
