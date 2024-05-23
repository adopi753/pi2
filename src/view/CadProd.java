package view;

import controller.ConectarDaoFinal;
import controller.ProdutoDaoFinal;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ProdutoModFinal;

public final class CadProd extends javax.swing.JInternalFrame {

    public ResultSet resul;
    ConectarDaoFinal conecta = new ConectarDaoFinal();
    ProdutoDaoFinal dao = new ProdutoDaoFinal();
    ProdutoModFinal mod = new ProdutoModFinal();

    public CadProd() {
        initComponents();
        camposBotoesInicioCadastro();
        //Define o limite
        textId.setDocument(new LimitaCaracteres(10));
        textProduto.setDocument(new LimitaCaracteres(100));
        textTipoProd.setDocument(new LimitaCaracteres(10));
        textQtProd.setDocument(new LimitaCaracteres(10));
        textVlCompra.setDocument(new LimitaCaracteres(20));
        textIcms.setDocument(new LimitaCaracteres(10));
        textVlVenda.setDocument(new LimitaCaracteres(20));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIdProd = new javax.swing.JLabel();
        lblCategoriaProd = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        lblProduto = new javax.swing.JLabel();
        textProduto = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        lblQtProd = new javax.swing.JLabel();
        textQtProd = new javax.swing.JTextField();
        lblVlCompraProd = new javax.swing.JLabel();
        textIcms = new javax.swing.JTextField();
        lblIcms = new javax.swing.JLabel();
        lblVlVendaProd = new javax.swing.JLabel();
        textVlVenda = new javax.swing.JTextField();
        btnUserNew = new javax.swing.JButton();
        btnUserRegister = new javax.swing.JButton();
        btnUserSearch = new javax.swing.JButton();
        btnUserEdit = new javax.swing.JButton();
        btnUserDel = new javax.swing.JButton();
        lblCpObrigatorios = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        textId = new javax.swing.JTextField();
        textTipoProd = new javax.swing.JTextField();
        textVlCompra = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Produtos");
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(740, 610));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 68, 111));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(728, 579));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIdProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdProd.setForeground(new java.awt.Color(255, 255, 255));
        lblIdProd.setText("ID");
        jPanel1.add(lblIdProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 35, -1, -1));

        lblCategoriaProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCategoriaProd.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoriaProd.setText("*CATEGORIA");
        jPanel1.add(lblCategoriaProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 35, -1, -1));

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alvenaria", "Elétrica", "Hidráulica", "Pintura", "Pisos" }));
        jPanel1.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 50, 144, 25));

        lblProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProduto.setForeground(new java.awt.Color(255, 255, 255));
        lblProduto.setText("*PRODUTO:");
        jPanel1.add(lblProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 90, -1, -1));

        textProduto.setToolTipText("Não permitido letra minúscula");
        textProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textProdutoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textProdutoKeyTyped(evt);
            }
        });
        jPanel1.add(textProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 105, 330, 25));

        lblTipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("*TIPO:");
        jPanel1.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 90, -1, -1));

        lblQtProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQtProd.setForeground(new java.awt.Color(255, 255, 255));
        lblQtProd.setText("*QUANTIDADE:");
        lblQtProd.setRequestFocusEnabled(false);
        jPanel1.add(lblQtProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 145, -1, -1));

        textQtProd.setToolTipText("Permitido apenas número");
        textQtProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textQtProdActionPerformed(evt);
            }
        });
        textQtProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textQtProdKeyTyped(evt);
            }
        });
        jPanel1.add(textQtProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 130, 25));

        lblVlCompraProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVlCompraProd.setForeground(new java.awt.Color(255, 255, 255));
        lblVlCompraProd.setText("*VL COMPRA:");
        lblVlCompraProd.setRequestFocusEnabled(false);
        jPanel1.add(lblVlCompraProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 145, -1, -1));

        textIcms.setToolTipText("Permitido apenas número");
        textIcms.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textIcmsKeyTyped(evt);
            }
        });
        jPanel1.add(textIcms, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 215, 130, 25));

        lblIcms.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIcms.setForeground(new java.awt.Color(255, 255, 255));
        lblIcms.setText("*ICMS:");
        jPanel1.add(lblIcms, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 200, -1, -1));

        lblVlVendaProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVlVendaProd.setForeground(new java.awt.Color(255, 255, 255));
        lblVlVendaProd.setText("*VL VENDA");
        jPanel1.add(lblVlVendaProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        textVlVenda.setToolTipText("Permitido apenas números");
        textVlVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textVlVendaKeyTyped(evt);
            }
        });
        jPanel1.add(textVlVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 215, 144, 25));

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
        lblCpObrigatorios.setText("*Campos Obrigatórios");
        lblCpObrigatorios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblCpObrigatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 725, -1));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblProduto.setAutoCreateRowSorter(true);
        tblProduto.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Categoria", "Produto", "Tipo", "Qtd", "Vl Compra", "ICMS", "Vl Venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduto.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblProduto.setAutoscrolls(false);
        tblProduto.setColumnSelectionAllowed(true);
        tblProduto.setGridColor(new java.awt.Color(255, 255, 255));
        tblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutoMouseClicked(evt);
            }
        });
        tblProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblProdutoKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblProduto);
        tblProduto.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblProduto.getColumnModel().getColumnCount() > 0) {
            tblProduto.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblProduto.getColumnModel().getColumn(1).setPreferredWidth(75);
            tblProduto.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblProduto.getColumnModel().getColumn(4).setPreferredWidth(40);
            tblProduto.getColumnModel().getColumn(5).setPreferredWidth(90);
            tblProduto.getColumnModel().getColumn(6).setPreferredWidth(60);
            tblProduto.getColumnModel().getColumn(7).setPreferredWidth(90);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 710, 200));

        textId.setToolTipText("Permitido letra Maiúscula e número");
        textId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textIdKeyTyped(evt);
            }
        });
        jPanel1.add(textId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 130, 25));

        textTipoProd.setToolTipText("Permitido apenas letra Maiúscula");
        textTipoProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTipoProdKeyTyped(evt);
            }
        });
        jPanel1.add(textTipoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 105, 144, 25));

        textVlCompra.setToolTipText("Permitido apenas número");
        textVlCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textVlCompraKeyTyped(evt);
            }
        });
        jPanel1.add(textVlCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 160, 144, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.getAccessibleContext().setAccessibleName("");

        setBounds(0, 0, 740, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserSearchActionPerformed
        pesquisarProd();
    }//GEN-LAST:event_btnUserSearchActionPerformed

    private void textQtProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textQtProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textQtProdActionPerformed

    private void btnUserNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserNewMouseClicked

    }//GEN-LAST:event_btnUserNewMouseClicked

    private void btnUserEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserEditActionPerformed
        alterarProd();//altera cadastro existente        
    }//GEN-LAST:event_btnUserEditActionPerformed

    private void btnUserDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserDelActionPerformed
        excluirProd();
    }//GEN-LAST:event_btnUserDelActionPerformed

    private void textProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textProdutoKeyTyped
        String caracter = "ABCÇDEFGHIJKLMNOPQRSTUVXZWY_-ÁÂÃÉÊÍÓÔÕÚ 0123456789,'";
        if (!caracter.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_textProdutoKeyTyped

    private void textQtProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textQtProdKeyTyped
        String caracter = "0123456789";
        if (!caracter.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_textQtProdKeyTyped

    private void textIcmsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIcmsKeyTyped
        String caracter = ",0123456789";
        if (!caracter.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_textIcmsKeyTyped

    private void textVlVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textVlVendaKeyTyped
        String caracter = ",0123456789";
        if (!caracter.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_textVlVendaKeyTyped

    private void btnUserRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserRegisterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUserRegisterMouseClicked

    private void btnUserNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserNewActionPerformed
        btnProdNew();
    }//GEN-LAST:event_btnUserNewActionPerformed

    private void btnUserRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserRegisterActionPerformed
        cadastrarProd(); //realiza o cadastro incial
    }//GEN-LAST:event_btnUserRegisterActionPerformed

    private void textProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textProdutoKeyPressed
        //desativa botão btnUserSearch
    }//GEN-LAST:event_textProdutoKeyPressed

    private void tblProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProdutoKeyPressed
        clickJtable();
    }//GEN-LAST:event_tblProdutoKeyPressed

    private void tblProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutoMouseClicked
        clickJtable();
    }//GEN-LAST:event_tblProdutoMouseClicked

    private void textVlCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textVlCompraKeyTyped
        String caracter = ",0123456789";
        if (!caracter.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_textVlCompraKeyTyped

    private void textIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIdKeyTyped
        String caracter = "ABCDEFGHIJKLMNOPQRSTUVXZWY_- 0123456789,";
        if (!caracter.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_textIdKeyTyped

    private void textTipoProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTipoProdKeyTyped
        String caracter = "ABCDEFGHIJKLMNOPQRSTUVXZWY";
        if (!caracter.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_textTipoProdKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnUserDel;
    public static javax.swing.JButton btnUserEdit;
    private javax.swing.JButton btnUserNew;
    private javax.swing.JButton btnUserRegister;
    private javax.swing.JButton btnUserSearch;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCategoriaProd;
    private javax.swing.JLabel lblCpObrigatorios;
    private javax.swing.JLabel lblIcms;
    private javax.swing.JLabel lblIdProd;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQtProd;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblVlCompraProd;
    private javax.swing.JLabel lblVlVendaProd;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField textIcms;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textProduto;
    private javax.swing.JTextField textQtProd;
    private javax.swing.JTextField textTipoProd;
    private javax.swing.JTextField textVlCompra;
    private javax.swing.JTextField textVlVenda;
    // End of variables declaration//GEN-END:variables

    private void btnProdNew() {
        limparCampos();
        todosCamposAtivos();
        botoesBtnProdNew();
        textId.grabFocus();
    }

    private void carregarProd() {
        DefaultTableModel jtablemodel = (DefaultTableModel) tblProduto.getModel();
        resul = dao.buscartodos();
        try {
            while (tblProduto.getModel().getRowCount() > 0) {
                ((DefaultTableModel) tblProduto.getModel()).removeRow(0);
            }
            while (resul.next()) {
                Object[] linhas = {
                    resul.getString("idProduto"),
                    resul.getString("categoria"),
                    resul.getString("produto"),
                    resul.getString("tipo"),
                    resul.getInt("quantidade"),
                    resul.getFloat("vlCompra"),
                    resul.getFloat("icms"),
                    resul.getFloat("vlVenda")
                };

                jtablemodel.addRow(linhas);
            }

            textId.grabFocus();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Modulo carregarProd/view\nErro ao carregar Produto\n" + err.getMessage());
        }
    }

    private void clickJtable() {
        int linhasel = tblProduto.getSelectedRow();
        int colunachave = 0;
        Object chave = tblProduto.getModel().getValueAt(linhasel, colunachave);

        mod.setIdProduto((String) chave);
        resul = dao.buscar(mod);
        try {
            if (resul.next()) {
                this.textId.setText(resul.getString("idProduto"));
                this.cmbCategoria.setSelectedItem(resul.getString("Categoria"));
                this.textProduto.setText(resul.getString("produto"));
                this.textTipoProd.setText(resul.getString("tipo"));
                this.textQtProd.setText(String.valueOf(resul.getInt("quantidade")));
                this.textVlCompra.setText(String.valueOf(resul.getFloat("vlCompra")));
                this.textIcms.setText(String.valueOf(resul.getFloat("icms")));
                this.textVlVenda.setText(String.valueOf(resul.getFloat("vlVenda")));

                todosCamposAtivos();

                btnUserNew.setEnabled(true);
                btnUserRegister.setEnabled(false);
                btnUserSearch.setEnabled(false);
                btnUserEdit.setEnabled(true);
                btnUserDel.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "Registro não encontrado!");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao navegar na Jtable! ");
        }
    }

    private void cadastrarProd() {
        mod.setIdProduto(textId.getText());
        mod.setCategoria(cmbCategoria.getSelectedItem().toString());
        mod.setProduto(textProduto.getText());
        mod.setTipo(textTipoProd.getText());
        mod.setQuantidade(Integer.parseInt(textQtProd.getText()));
        mod.setVlCompra(Float.parseFloat(textVlCompra.getText()));
        mod.setIcms(Float.parseFloat(textIcms.getText()));
        mod.setVlVenda(Float.parseFloat(textVlVenda.getText()));

        if (textId.getText().isEmpty() || textProduto.getText().isEmpty() || textTipoProd.getText().isEmpty()
                || textQtProd.getText().isEmpty() || textVlCompra.getText().isEmpty() || textIcms.getText().isEmpty()
                || textVlVenda.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!");

        } else {
            dao.incluir(mod);
            camposBotoesInicioCadastro();
        }
    }

    private void alterarProd() {
        mod.setIdProduto(textId.getText());
        mod.setCategoria(cmbCategoria.getSelectedItem().toString());
        mod.setProduto(textProduto.getText());
        mod.setTipo(textTipoProd.getText());
        mod.setQuantidade(Integer.parseInt(textQtProd.getText()));
        mod.setVlCompra(Float.parseFloat(textVlCompra.getText()));
        mod.setIcms(Float.parseFloat(textIcms.getText()));
        mod.setVlVenda(Float.parseFloat(textVlVenda.getText()));

        conecta.rs = dao.buscar(mod);
        try {
            if (conecta.rs.next()) {
                if (textId.getText().isEmpty() || textProduto.getText().isEmpty() || textTipoProd.getText().isEmpty()
                        || textQtProd.getText().isEmpty() || textVlCompra.getText().isEmpty() || textIcms.getText().isEmpty()
                        || textVlVenda.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!");

                } else {
                    dao.alterar(mod);
                    camposBotoesInicioCadastro();
                }
            } else {
                Object[] options = {"Sim", "Não"};
                int exUser = JOptionPane.showOptionDialog(null, "Modulo alterarProd\nProduto não cadastrado!\nDeseja fazer o cadastro?", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, options, options[0]);
                if (exUser == 0) {
                    carregarProd();
                    todosCamposAtivos();
                    botoesBtnUserRegister();
                    textId.grabFocus();

                }
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null,
                    "Modulo alterarProd/CadUserProd/view\nErro ao Alterar Produto!\n" + err.getMessage());

            camposBotoesInicioCadastro();
        }
    }

    private void excluirProd() {
        Object[] options = {"Sim", "Não"};
        int exUser = JOptionPane.showOptionDialog(null, "Deseja realmente excluir o registro?", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);
        if (exUser == 0) {
            dao.excluir(textId.getText());
            camposBotoesInicioCadastro();
        }
    }

    private void pesquisarProd() {
        mod.setIdProduto(textId.getText());

        conecta.rs = dao.buscar(mod);
        try {
            if (conecta.rs.next()) {
                cmbCategoria.setSelectedItem(conecta.rs.getString("categoria"));
                textProduto.setText(conecta.rs.getString("produto"));
                textTipoProd.setText(conecta.rs.getString("tipo"));
                textQtProd.setText(String.valueOf(conecta.rs.getInt("quantidade")));
                textVlCompra.setText(String.valueOf(conecta.rs.getFloat("vlCompra")));
                textIcms.setText(String.valueOf(conecta.rs.getFloat("icms")));
                textVlVenda.setText(String.valueOf(conecta.rs.getFloat("vlVenda")));

                btnUserNew.setEnabled(true);
                btnUserRegister.setEnabled(false);
                btnUserSearch.setEnabled(false);
                btnUserEdit.setEnabled(true);
                btnUserDel.setEnabled(true);

            } else {
                Object[] options = {"Sim", "Não"};
                int exUser = JOptionPane.showOptionDialog(null, "Produto não cadastrado!\nDeseja fazer o cadastro?", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, options, options[0]);
                if (exUser == 0) {
                    todosCamposAtivos();
                    botoesBtnProdNew();
                    textId.grabFocus();

                    btnUserSearch.setEnabled(false);
                }
                limparCampos();
                textId.grabFocus();
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }

    public void limparCampos() {
        textId.setText(null);
        textProduto.setText(null);
        textTipoProd.setText(null);
        textQtProd.setText(null);
        textVlCompra.setText(null);
        textIcms.setText(null);
        textVlVenda.setText(null);
    }

    public void todosCamposBotoesAtivos() {
        todosCamposAtivos();
        todosBotoesAtivos();

        textId.grabFocus();
    }

    public void camposBotoesInicioCadastro() {
        limparCampos();
        carregarProd();
        textId.setEnabled(false);
        cmbCategoria.setEnabled(false);
        textProduto.setEnabled(false);
        textTipoProd.setEnabled(false);
        textQtProd.setEnabled(false);
        textVlCompra.setEnabled(false);
        textIcms.setEnabled(false);
        textVlVenda.setEnabled(false);

        btnUserNew.setEnabled(true);
        btnUserRegister.setEnabled(false);
        btnUserSearch.setEnabled(false);
        btnUserEdit.setEnabled(false);
        btnUserDel.setEnabled(false);
    }

    public void todosCamposAtivos() {
        textId.setEnabled(true);
        cmbCategoria.setEnabled(true);
        textProduto.setEnabled(true);
        textTipoProd.setEnabled(true);
        textQtProd.setEnabled(true);
        textVlCompra.setEnabled(true);
        textIcms.setEnabled(true);
        textVlVenda.setEnabled(true);
    }

    public void todosBotoesAtivos() {
        btnUserNew.setEnabled(true);
        btnUserRegister.setEnabled(true);
        btnUserSearch.setEnabled(true);
        btnUserEdit.setEnabled(true);
        btnUserDel.setEnabled(true);
    }

    public void botoesBtnProdNew() {
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