package view;

import javax.swing.JOptionPane;

public class FormSplashNew extends javax.swing.JFrame {

    /**
     * Creates new form FormSplashNew
     */
    public FormSplashNew() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);        
        this.desativaTudo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnBase = new javax.swing.JPanel();
        jpnBarraBotoes = new javax.swing.JPanel();
        btnCadastro = new javax.swing.JButton();
        btnPesquisa = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        brnSairSplash = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        btnAcessarSistema = new javax.swing.JButton();
        jpnBody = new javax.swing.JPanel();
        lblBackground = new javax.swing.JLabel();
        menuPrinicpal = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuFilesSair = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenu();
        menuUsersCadastro = new javax.swing.JMenuItem();
        menuProdutos = new javax.swing.JMenu();
        menuProdCadastro = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        menuRepCliente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADS1 - Materiais de Construção");
        setMinimumSize(new java.awt.Dimension(960, 700));
        setResizable(false);

        jpnBase.setBackground(new java.awt.Color(255, 255, 255));
        jpnBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnBarraBotoes.setBackground(new java.awt.Color(0, 68, 111));
        jpnBarraBotoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botao_cadastro_48X48.png"))); // NOI18N
        btnCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastro.setMargin(new java.awt.Insets(14, 6, 14, 6));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        jpnBarraBotoes.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 8, 140, 60));

        btnPesquisa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botao_search_48X48.png"))); // NOI18N
        btnPesquisa.setFocusable(false);
        btnPesquisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPesquisa.setMargin(new java.awt.Insets(14, 6, 14, 6));
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });
        jpnBarraBotoes.add(btnPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 8, 140, 60));

        btnVendas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botao_vendas_48X48.png"))); // NOI18N
        btnVendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVendas.setMargin(new java.awt.Insets(14, 6, 14, 6));
        jpnBarraBotoes.add(btnVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 8, 140, 60));

        brnSairSplash.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        brnSairSplash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botao_sair_48X48.png"))); // NOI18N
        brnSairSplash.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        brnSairSplash.setMargin(new java.awt.Insets(14, 6, 14, 6));
        brnSairSplash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnSairSplashActionPerformed(evt);
            }
        });
        jpnBarraBotoes.add(brnSairSplash, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 8, 140, 60));

        btnRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botao_relatorio_48X48.png"))); // NOI18N
        btnRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRelatorio.setMargin(new java.awt.Insets(14, 6, 14, 6));
        jpnBarraBotoes.add(btnRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 8, 140, 60));

        btnAcessarSistema.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAcessarSistema.setText("ACESSAR O SISTEMA");
        btnAcessarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarSistemaActionPerformed(evt);
            }
        });
        jpnBarraBotoes.add(btnAcessarSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 8, 200, 60));

        jpnBase.add(jpnBarraBotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2158, 77));

        jpnBody.setBackground(new java.awt.Color(255, 255, 255));
        jpnBody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/SplashBackgroundIcon511X488.jpg"))); // NOI18N
        jpnBody.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 526, 570));

        menuPrinicpal.setBackground(new java.awt.Color(153, 153, 153));
        menuPrinicpal.setMargin(new java.awt.Insets(5, 0, 5, 0));

        menuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu_files.png"))); // NOI18N
        menuArquivo.setText("Arquivo");
        menuArquivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArquivoActionPerformed(evt);
            }
        });

        menuFilesSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuFilesSair.setText("Sair");
        menuFilesSair.setMargin(new java.awt.Insets(6, 8, 6, 8));
        menuFilesSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFilesSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuFilesSair);

        menuPrinicpal.add(menuArquivo);

        menuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu_users.jpg"))); // NOI18N
        menuUsuarios.setText("Usuários");
        menuUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        menuUsersCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuUsersCadastro.setText("Cadastro");
        menuUsersCadastro.setMargin(new java.awt.Insets(6, 8, 6, 8));
        menuUsersCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsersCadastroActionPerformed(evt);
            }
        });
        menuUsuarios.add(menuUsersCadastro);

        menuPrinicpal.add(menuUsuarios);

        menuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu_product.png"))); // NOI18N
        menuProdutos.setText("Produtos");
        menuProdutos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        menuProdCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuProdCadastro.setText("Cadastro");
        menuProdCadastro.setMargin(new java.awt.Insets(6, 8, 6, 8));
        menuProdCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdCadastroActionPerformed(evt);
            }
        });
        menuProdutos.add(menuProdCadastro);

        menuPrinicpal.add(menuProdutos);

        menuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu_report.png"))); // NOI18N
        menuRelatorios.setText("Relatórios");
        menuRelatorios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        menuRepCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuRepCliente.setText("Relatório Clientes");
        menuRepCliente.setMargin(new java.awt.Insets(6, 8, 6, 8));
        menuRelatorios.add(menuRepCliente);

        menuPrinicpal.add(menuRelatorios);

        setJMenuBar(menuPrinicpal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        this.cadastroUser();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void brnSairSplashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnSairSplashActionPerformed
        this.sairSplash();
    }//GEN-LAST:event_brnSairSplashActionPerformed

    private void menuArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArquivoActionPerformed

    }//GEN-LAST:event_menuArquivoActionPerformed

    private void menuFilesSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFilesSairActionPerformed
        this.sairSplash();
    }//GEN-LAST:event_menuFilesSairActionPerformed

    private void menuUsersCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsersCadastroActionPerformed
        this.cadastroUser();
    }//GEN-LAST:event_menuUsersCadastroActionPerformed

    private void btnAcessarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarSistemaActionPerformed
        this.loginDialog();
        this.desativaBtnAcessoSistema();
        this.ativaTudo();
    }//GEN-LAST:event_btnAcessarSistemaActionPerformed

    private void menuProdCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdCadastroActionPerformed
        this.cadastroProduto();
    }//GEN-LAST:event_menuProdCadastroActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormSplashNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSplashNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSplashNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSplashNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSplashNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnSairSplash;
    private javax.swing.JButton btnAcessarSistema;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnVendas;
    private javax.swing.JPanel jpnBarraBotoes;
    private javax.swing.JPanel jpnBase;
    private javax.swing.JPanel jpnBody;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuFilesSair;
    private javax.swing.JMenuBar menuPrinicpal;
    private javax.swing.JMenuItem menuProdCadastro;
    private javax.swing.JMenu menuProdutos;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenuItem menuRepCliente;
    private javax.swing.JMenuItem menuUsersCadastro;
    private javax.swing.JMenu menuUsuarios;
    // End of variables declaration//GEN-END:variables

    private void loginDialog() {
        FormLoginJdialog dialoglogin = new FormLoginJdialog(new javax.swing.JFrame(), true);
        dialoglogin.setVisible(true);
    }

   
    private void cadastroUser() {
        FormCadUserDef dialogCad = new FormCadUserDef(new javax.swing.JFrame(), true);
        dialogCad.setVisible(true);        
    }
    
    private void cadastroProduto() {
        FormCadProdutoDef dialogProd = new FormCadProdutoDef(new javax.swing.JFrame(), true);
        dialogProd.setVisible(true);        
    }


    private void sairSplash() {
        Object[] options = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null, "Deseja realmente sair do sistema?", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);
        if (i == 0) {
            System.exit(0);
        }
    }

    private void desativaTudo() {
        btnCadastro.setEnabled(false);
        btnPesquisa.setEnabled(false);
        btnVendas.setEnabled(false);
        btnRelatorio.setEnabled(false);
        menuArquivo.setEnabled(false);
        menuUsuarios.setEnabled(false);
        menuProdutos.setEnabled(false);
        menuRelatorios.setEnabled(false);
    }

    private void desativaBtnAcessoSistema() {
        btnAcessarSistema.setEnabled(false);
    }

    private void ativaTudo() {
        btnCadastro.setEnabled(true);
        btnPesquisa.setEnabled(true);
        btnVendas.setEnabled(true);
        btnRelatorio.setEnabled(true);
        menuArquivo.setEnabled(true);
        menuUsuarios.setEnabled(true);
        menuProdutos.setEnabled(true);
        menuRelatorios.setEnabled(true);
    }

}
