package view;

import controller.ConectarDaoFinal;
import controller.UsuarioDaoFinal;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.UsuarioModFinal;

public final class CadUser extends javax.swing.JInternalFrame {

    public ResultSet resul;
    ConectarDaoFinal conecta = new ConectarDaoFinal();
    UsuarioDaoFinal dao = new UsuarioDaoFinal();
    UsuarioModFinal mod = new UsuarioModFinal();
    
    public CadUser() {
        initComponents();
        camposBotoesInicioCadastro();
        //Define o limite dos campos
        textNome.setDocument(new LimitaCaracteres(80));
        textEmail.setDocument(new LimitaCaracteres(50));
        textSenha.setDocument(new LimitaCaracteres(10));
        textRua.setDocument(new LimitaCaracteres(150));
        textNumRua.setDocument(new LimitaCaracteres(7));
        textComplemento.setDocument(new LimitaCaracteres(50));
        textBairro.setDocument(new LimitaCaracteres(80));
        textCidade.setDocument(new LimitaCaracteres(80));
        textEstado.setDocument(new LimitaCaracteres(2));        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCpf = new javax.swing.JLabel();
        textCpf = new javax.swing.JFormattedTextField();
        lblTpUser = new javax.swing.JLabel();
        cmbPerfil = new javax.swing.JComboBox<>();
        lblNome = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        textCelular = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        textSenha = new javax.swing.JPasswordField();
        textRua = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        lblNumRua = new javax.swing.JLabel();
        textNumRua = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        textComplemento = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        textBairro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        textCidade = new javax.swing.JTextField();
        lblUf = new javax.swing.JLabel();
        textEstado = new javax.swing.JTextField();
        btnUserNew = new javax.swing.JButton();
        btnUserRegister = new javax.swing.JButton();
        btnUserSearch = new javax.swing.JButton();
        btnUserEdit = new javax.swing.JButton();
        btnUserDel = new javax.swing.JButton();
        lblCpObrigatorios = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro Usu·rios");
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(740, 610));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 68, 111));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(728, 579));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(255, 255, 255));
        lblCpf.setText("*CPF:");
        jPanel1.add(lblCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 35, -1, -1));

        try {
            textCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(textCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 160, 25));

        lblTpUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTpUser.setForeground(new java.awt.Color(255, 255, 255));
        lblTpUser.setText("*PERFIL");
        jPanel1.add(lblTpUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 35, -1, -1));

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usu·rio" }));
        jPanel1.add(cmbPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 50, 144, 25));

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("*NOME:");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 90, -1, -1));

        textNome.setToolTipText("N„o permitido letra min˙scula");
        textNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textNomeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNomeKeyTyped(evt);
            }
        });
        jPanel1.add(textNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 105, 300, 25));

        lblCelular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(255, 255, 255));
        lblCelular.setText("*CELULAR:");
        jPanel1.add(lblCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 90, -1, -1));

        try {
            textCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(textCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 105, 144, 25));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("*EMAIL:");
        lblEmail.setRequestFocusEnabled(false);
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 145, -1, -1));

        textEmail.setToolTipText("N„o permitido letra Mai˙scula");
        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });
        textEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textEmailKeyTyped(evt);
            }
        });
        jPanel1.add(textEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 300, 25));

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("*SENHA:");
        lblSenha.setRequestFocusEnabled(false);
        jPanel1.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 145, -1, -1));
        jPanel1.add(textSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 160, 144, 25));

        textRua.setToolTipText("N„o permitido letra min˙scula");
        textRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textRuaKeyTyped(evt);
            }
        });
        jPanel1.add(textRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 215, 370, 25));

        lblRua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRua.setForeground(new java.awt.Color(255, 255, 255));
        lblRua.setText("*RUA");
        jPanel1.add(lblRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 200, -1, -1));

        lblNumRua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNumRua.setForeground(new java.awt.Color(255, 255, 255));
        lblNumRua.setText("*N∫");
        jPanel1.add(lblNumRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 200, -1, -1));

        textNumRua.setToolTipText("Permitido apenas n˙meros");
        textNumRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNumRuaKeyTyped(evt);
            }
        });
        jPanel1.add(textNumRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 215, 80, 25));

        lblComplemento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblComplemento.setForeground(new java.awt.Color(255, 255, 255));
        lblComplemento.setText("COMPLEMENTO");
        jPanel1.add(lblComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 255, -1, -1));

        textComplemento.setToolTipText("N„o permitido letra min˙scula");
        textComplemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textComplementoKeyTyped(evt);
            }
        });
        jPanel1.add(textComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 140, 25));

        lblBairro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(255, 255, 255));
        lblBairro.setText("*BAIRRO");
        jPanel1.add(lblBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 255, -1, -1));

        textBairro.setToolTipText("N„o permitido letra min˙scula");
        textBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textBairroKeyTyped(evt);
            }
        });
        jPanel1.add(textBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 310, 25));

        lblCidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(255, 255, 255));
        lblCidade.setText("*CIDADE");
        jPanel1.add(lblCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 310, -1, -1));

        textCidade.setToolTipText("N„o permitido letra min˙scula");
        textCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCidadeKeyTyped(evt);
            }
        });
        jPanel1.add(textCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 325, 320, 25));

        lblUf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUf.setForeground(new java.awt.Color(255, 255, 255));
        lblUf.setText("*ESTADO");
        jPanel1.add(lblUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 310, -1, -1));

        textEstado.setToolTipText("N„o permitido letra min˙scula nem n˙meros");
        textEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textEstadoKeyTyped(evt);
            }
        });
        jPanel1.add(textEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 325, 80, 25));

        btnUserNew.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUserNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/create_32X32.png"))); // NOI18N
        btnUserNew.setToolTipText("Novo");
        btnUserNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUserNew.setName(""); // NOI18N
        btnUserNew.setPreferredSize(new java.awt.Dimension(60, 60));
        btnUserNew.setRequestFocusEnabled(false);
        btnUserNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserNewMouseClicked(evt);
            }
        });
        btnUserNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnUserNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        btnUserRegister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUserRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save_32X32.png"))); // NOI18N
        btnUserRegister.setToolTipText("Cadastrar");
        btnUserRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUserRegister.setName(""); // NOI18N
        btnUserRegister.setPreferredSize(new java.awt.Dimension(60, 60));
        btnUserRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserRegisterMouseClicked(evt);
            }
        });
        btnUserRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnUserRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        btnUserSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUserSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/read_32X32.png"))); // NOI18N
        btnUserSearch.setToolTipText("Consultar");
        btnUserSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUserSearch.setPreferredSize(new java.awt.Dimension(60, 60));
        btnUserSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnUserSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        btnUserEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUserEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update_32x32.png"))); // NOI18N
        btnUserEdit.setToolTipText("Editar");
        btnUserEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUserEdit.setName(""); // NOI18N
        btnUserEdit.setPreferredSize(new java.awt.Dimension(60, 60));
        btnUserEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnUserEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        btnUserDel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUserDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete_32x32.png"))); // NOI18N
        btnUserDel.setToolTipText("Excluir");
        btnUserDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUserDel.setPreferredSize(new java.awt.Dimension(60, 60));
        btnUserDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserDelActionPerformed(evt);
            }
        });
        jPanel1.add(btnUserDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        lblCpObrigatorios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCpObrigatorios.setForeground(new java.awt.Color(255, 255, 255));
        lblCpObrigatorios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCpObrigatorios.setText("*Campos ObrigatÛrios");
        lblCpObrigatorios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblCpObrigatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 725, -1));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblCliente.setAutoCreateRowSorter(true);
        tblCliente.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "IdNivel", "Nome", "Celular", "Email", "Senha", "Rua", "N∫", "Compl", "Bairro", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblCliente.setAutoscrolls(false);
        tblCliente.setColumnSelectionAllowed(true);
        tblCliente.setGridColor(new java.awt.Color(255, 255, 255));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        tblCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblClienteKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblCliente);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 710, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.getAccessibleContext().setAccessibleName("");

        setBounds(0, 0, 740, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserSearchActionPerformed
        pesquisarUsers();
    }//GEN-LAST:event_btnUserSearchActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void btnUserNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserNewMouseClicked

    }//GEN-LAST:event_btnUserNewMouseClicked

    private void btnUserEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserEditActionPerformed
        alterarUsers();
    }//GEN-LAST:event_btnUserEditActionPerformed

    private void btnUserDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserDelActionPerformed
        excluirUsers();
    }//GEN-LAST:event_btnUserDelActionPerformed

    private void textNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNomeKeyTyped
        String caracter = "ABC«DEFGHIJKLMNOPQRSTUVXZWY_-¡¬√… Õ”‘’⁄ ";
        if (!caracter.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_textNomeKeyTyped

    private void textEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textEmailKeyTyped
        String caracter = "abcdefghijklmnopqrstuvxzwy_-.@0123456789";
        if (!caracter.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_textEmailKeyTyped

    private void textRuaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRuaKeyTyped
        String caracter = "ABC«DEFGHIJKLMNOPQRSTUVXZWY_-¡¬√… Õ”‘’⁄. 0123456789";
        if (!caracter.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_textRuaKeyTyped

    private void textNumRuaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNumRuaKeyTyped
        String caracter = "0123456789";
        if (!caracter.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_textNumRuaKeyTyped

    private void textComplementoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textComplementoKeyTyped
        String caracter = "ABC«DEFGHIJKLMNOPQRSTUVXZWY_-¡¬√… Õ”‘’⁄. 0123456789";
        if (!caracter.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_textComplementoKeyTyped

    private void textBairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBairroKeyTyped
        String caracter = "ABC«DEFGHIJKLMNOPQRSTUVXZWY_-¡¬√… Õ”‘’⁄. 0123456789";
        if (!caracter.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_textBairroKeyTyped

    private void textCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCidadeKeyTyped
        String caracter = "ABC«DEFGHIJKLMNOPQRSTUVXZWY_-¡¬√… Õ”‘’⁄. 0123456789";
        if (!caracter.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_textCidadeKeyTyped

    private void textEstadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textEstadoKeyTyped
        String caracter = "ABCDEFGHIJKLMNOPQRSTUVXZWY";
        if (!caracter.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_textEstadoKeyTyped

    private void btnUserRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserRegisterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUserRegisterMouseClicked

    private void btnUserNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserNewActionPerformed
        btnUserNew();
    }//GEN-LAST:event_btnUserNewActionPerformed

    private void btnUserRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserRegisterActionPerformed
        cadastrarUsers();
    }//GEN-LAST:event_btnUserRegisterActionPerformed

    private void textNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNomeKeyPressed

    }//GEN-LAST:event_textNomeKeyPressed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        clickJtable();
    }//GEN-LAST:event_tblClienteMouseClicked

    private void tblClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClienteKeyPressed
        clickJtable();
    }//GEN-LAST:event_tblClienteKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnUserDel;
    public static javax.swing.JButton btnUserEdit;
    private javax.swing.JButton btnUserNew;
    private javax.swing.JButton btnUserRegister;
    private javax.swing.JButton btnUserSearch;
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblCpObrigatorios;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumRua;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTpUser;
    private javax.swing.JLabel lblUf;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField textBairro;
    private javax.swing.JFormattedTextField textCelular;
    private javax.swing.JTextField textCidade;
    private javax.swing.JTextField textComplemento;
    private javax.swing.JFormattedTextField textCpf;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textEstado;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textNumRua;
    private javax.swing.JTextField textRua;
    private javax.swing.JPasswordField textSenha;
    // End of variables declaration//GEN-END:variables

    private void btnUserNew() {
        limparCampos();
        todosCamposAtivos();
        botoesBtnUserNew();
        textCpf.grabFocus();
    }

    private void carregarUsers() {
        DefaultTableModel jtablemodel = (DefaultTableModel) tblCliente.getModel();
        resul = dao.buscartodos();
        try {
            while (tblCliente.getModel().getRowCount() > 0) {
                ((DefaultTableModel) tblCliente.getModel()).removeRow(0);
            }
            while (resul.next()) {
                Object[] linhas = {
                    resul.getString("cpf"),
                    resul.getString("perfil"),
                    resul.getString("nome"),
                    resul.getString("celular"),
                    resul.getString("email"),
                    resul.getString("senha"),
                    resul.getString("rua"),
                    resul.getString("numero"),
                    resul.getString("complemento"),
                    resul.getString("bairro"),
                    resul.getString("cidade"),
                    resul.getString("estado")};
                
                jtablemodel.addRow(linhas);
            }
            
            textCpf.grabFocus();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Modulo carregarUsers\nErro ao carregar Users\n" + err.getMessage());
        }
    }

    private void clickJtable() {
        int linhasel = tblCliente.getSelectedRow();
        int colunachave = 0;
        Object chave = tblCliente.getModel().getValueAt(linhasel, colunachave);

        mod.setCpf((String) chave);
        resul = dao.buscar(mod);
        try {
            if (resul.next()) {
                this.textCpf.setText(resul.getString("cpf"));
                this.cmbPerfil.setSelectedItem(resul.getString("perfil"));
                this.textNome.setText(resul.getString("nome"));
                this.textCelular.setText(resul.getString("celular"));
                this.textEmail.setText(resul.getString("email"));
                this.textSenha.setText(resul.getString("senha"));
                this.textRua.setText(resul.getString("rua"));
                this.textNumRua.setText(resul.getString("numero"));
                this.textComplemento.setText(resul.getString("complemento"));
                this.textBairro.setText(resul.getString("bairro"));
                this.textCidade.setText(resul.getString("cidade"));
                this.textEstado.setText(resul.getString("estado"));

                todosCamposAtivos();

                btnUserNew.setEnabled(true);
                btnUserRegister.setEnabled(false);
                btnUserSearch.setEnabled(false);
                btnUserEdit.setEnabled(true);
                btnUserDel.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "Registro n„o encontrado!");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Modulo clickJtable/Caduser/view\nErro ao navegar na Jtable! ");
        }
    }

    private void cadastrarUsers() {
        /*usa o objeto "objMod" para adiconar os valores na classe "UsuarioModFinal" - Pacote "Model"*/
        mod.setCpf(textCpf.getText());
        mod.setPerfil(cmbPerfil.getSelectedItem().toString());
        mod.setNome(textNome.getText());
        mod.setCelular(textCelular.getText());
        mod.setEmail(textEmail.getText());
        mod.setSenha(textSenha.getText());
        mod.setRua(textRua.getText());
        mod.setNumero(textNumRua.getText());
        mod.setComplemento(textComplemento.getText());
        mod.setBairro(textBairro.getText());
        mod.setCidade(textCidade.getText());
        mod.setEstado(textEstado.getText());

        if (textCpf.getText().isEmpty() || textNome.getText().isEmpty() || textCelular.getText().isEmpty()
                || textEmail.getText().isEmpty() || textSenha.getText().isEmpty() || textRua.getText().isEmpty()
                || textNumRua.getText().isEmpty() || textBairro.getText().isEmpty() || textCidade.getText().isEmpty()
                || textEstado.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatÛrios!");

        } else {
            dao.incluir(mod);

            camposBotoesInicioCadastro();
        }
    }

    private void alterarUsers() {
        mod.setCpf(textCpf.getText());
        mod.setPerfil(cmbPerfil.getSelectedItem().toString());
        mod.setNome(textNome.getText());
        mod.setCelular(textCelular.getText());
        mod.setEmail(textEmail.getText());
        mod.setSenha(textSenha.getText());
        mod.setRua(textRua.getText());
        mod.setNumero(textNumRua.getText());
        mod.setComplemento(textComplemento.getText());
        mod.setBairro(textBairro.getText());
        mod.setCidade(textCidade.getText());
        mod.setEstado(textEstado.getText());
        
        conecta.rs = dao.buscar(mod);
        try {
            if (conecta.rs.next()) {
                if (textCpf.getText().isEmpty() || textNome.getText().isEmpty() || textCelular.getText().isEmpty()
                        || textEmail.getText().isEmpty() || textSenha.getText().isEmpty() || textRua.getText().isEmpty()
                        || textNumRua.getText().isEmpty() || textBairro.getText().isEmpty() || textCidade.getText().isEmpty()
                        || textEstado.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha os campos obrigatÛrios!");

                } else { // caso exista chama a funÁ„o alterar()
                    dao.alterar(mod);
                    camposBotoesInicioCadastro();
                }
            } else {
                Object[] options = {"Sim", "N„o"};
                int exUser = JOptionPane.showOptionDialog(null, "Usu·rio n„o cadastrado!\nDeseja fazer o cadastro?", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, options, options[0]);
                if (exUser == 0) {
                    carregarUsers();
                    todosCamposAtivos();
                    botoesBtnUserRegister();
                    textCpf.grabFocus();

                }
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null,
                    "Modulo alterarUsers/CadUser/view\nErro ao Alterar Users!\n" + err.getMessage());

            camposBotoesInicioCadastro();
        }
    }

    private void excluirUsers() {
        Object[] options = {"Sim", "N„o"};
        int exUser = JOptionPane.showOptionDialog(null, "Deseja realmente excluir o registro?", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);
        if (exUser == 0) {
            dao.excluir(textCpf.getText());
            camposBotoesInicioCadastro();
        }
    }

    private void pesquisarUsers() {
        mod.setCpf(textCpf.getText());

        conecta.rs = dao.buscar(mod);
        try {
            if (conecta.rs.next()) {
                cmbPerfil.setSelectedItem(conecta.rs.getString("perfil"));
                textNome.setText(conecta.rs.getString("nome"));
                textCelular.setText(conecta.rs.getString("celular"));
                textEmail.setText(conecta.rs.getString("email"));
                textSenha.setText(conecta.rs.getString("senha"));
                textRua.setText(conecta.rs.getString("rua"));
                textNumRua.setText(conecta.rs.getString("numero"));
                textComplemento.setText(conecta.rs.getString("complemento"));
                textBairro.setText(conecta.rs.getString("bairro"));
                textCidade.setText(conecta.rs.getString("cidade"));
                textEstado.setText(conecta.rs.getString("estado"));

                btnUserNew.setEnabled(true);
                btnUserRegister.setEnabled(false);
                btnUserSearch.setEnabled(false);
                btnUserEdit.setEnabled(true);
                btnUserDel.setEnabled(true);

            } else {
                Object[] options = {"Sim", "N„o"};
                int exUser = JOptionPane.showOptionDialog(null, "Usu·rio n„o cadastrado!\nDeseja fazer o cadastro?", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, options, options[0]);
                if (exUser == 0) {
                    todosCamposAtivos();
                    botoesBtnUserNew();
                    textCpf.grabFocus();

                    btnUserSearch.setEnabled(false);
                    //this.carregarUsers();
                }
                limparCampos();
                textCpf.grabFocus();
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Modulo pesquisarUsers/CadUser/view\nErro ao pesquisar usu·rio\n" + err.getMessage());
        }
    }

    public void limparCampos() {
        textCpf.setText(null);
        textNome.setText(null);
        textCelular.setText(null);
        textEmail.setText(null);
        textSenha.setText(null);       
        textRua.setText(null);
        textNumRua.setText(null);
        textComplemento.setText(null);
        textBairro.setText(null);
        textCidade.setText(null);
        textEstado.setText(null);
    }

    public void todosCamposBotoesAtivos() {
        todosCamposAtivos();
        todosBotoesAtivos();
        textCpf.grabFocus();
    }

    public void camposBotoesInicioCadastro() {
        limparCampos();
        carregarUsers();
        textCpf.setEnabled(false);
        cmbPerfil.setEnabled(false);
        textNome.setEnabled(false);
        textCelular.setEnabled(false);
        textEmail.setEnabled(false);
        textSenha.setEnabled(false);
        textRua.setEnabled(false);
        textNumRua.setEnabled(false);
        textComplemento.setEnabled(false);
        textBairro.setEnabled(false);
        textCidade.setEnabled(false);
        textEstado.setEnabled(false);
        
        btnUserNew.setEnabled(true);
        btnUserRegister.setEnabled(false);
        btnUserSearch.setEnabled(false);
        btnUserEdit.setEnabled(false);
        btnUserDel.setEnabled(false);
    }

    public void todosCamposAtivos() {
        textCpf.setEnabled(true);
        cmbPerfil.setEnabled(true);
        textNome.setEnabled(true);
        textCelular.setEnabled(true);
        textEmail.setEnabled(true);
        textSenha.setEnabled(true);
        textRua.setEnabled(true);
        textNumRua.setEnabled(true);
        textComplemento.setEnabled(true);
        textBairro.setEnabled(true);
        textCidade.setEnabled(true);
        textEstado.setEnabled(true);
    }

    public void todosBotoesAtivos() {
        btnUserNew.setEnabled(true);
        btnUserRegister.setEnabled(true);
        btnUserSearch.setEnabled(true);
        btnUserEdit.setEnabled(true);
        btnUserDel.setEnabled(true);
    }

    public void botoesBtnUserNew() {
        btnUserNew.setEnabled(true);
        btnUserRegister.setEnabled(true);
        btnUserSearch.setEnabled(true);
        btnUserEdit.setEnabled(false);
        btnUserDel.setEnabled(false);
    }

    public void botoesBtnUserRegister() {
        btnUserNew.setEnabled(true);
        btnUserRegister.setEnabled(true);
        btnUserSearch.setEnabled(false);
        btnUserEdit.setEnabled(false);
        btnUserDel.setEnabled(false);
    }

    public void botoesBtnUserEdit() {
        btnUserNew.setEnabled(false);
        btnUserRegister.setEnabled(false);
        btnUserSearch.setEnabled(false);
        btnUserEdit.setEnabled(true);
        btnUserDel.setEnabled(true);
    }
}
