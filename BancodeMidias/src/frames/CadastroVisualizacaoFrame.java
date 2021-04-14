/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marin
 */
public class CadastroVisualizacaoFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroVisualizacaoFrame
     */
    public CadastroVisualizacaoFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jBotaoConfirmaV = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFilmesCadastrados = new javax.swing.JTable();
        jBotaoExclui = new javax.swing.JButton();
        jButtonEDIT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        FTitulo = new javax.swing.JTextField();
        FDescricao = new javax.swing.JTextField();
        FAutores = new javax.swing.JTextField();
        FInterpretes = new javax.swing.JTextField();
        FDiretores = new javax.swing.JTextField();
        FDuracao = new javax.swing.JTextField();
        FAno = new javax.swing.JTextField();
        jFCaminho = new javax.swing.JTextField();
        FGeneros = new javax.swing.JTextField();
        FIdioma = new javax.swing.JTextField();

        setClosable(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Itens Cadastrados");

        jBotaoConfirmaV.setText("Confirma");
        jBotaoConfirmaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoConfirmaVActionPerformed(evt);
            }
        });

        jTFilmesCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Gênero", "Idioma", "Duração", "Ano"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTFilmesCadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFilmesCadastradosMouseClicked(evt);
            }
        });
        jTFilmesCadastrados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFilmesCadastradosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTFilmesCadastrados);

        jBotaoExclui.setText("Excluir");
        jBotaoExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoExcluiActionPerformed(evt);
            }
        });

        jButtonEDIT.setText("Editar");
        jButtonEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEDITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBotaoConfirmaV, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jBotaoExclui, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotaoExclui)
                    .addComponent(jButtonEDIT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBotaoConfirmaV)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Visualização", jPanel1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro Filmes");

        jButton2.setText("Confirma");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Título");

        jLabel4.setText("Descrição");

        jLabel5.setText("Gênero");

        jLabel6.setText("Idioma");

        jLabel7.setText("Autores");

        jLabel8.setText("Intérpretes");

        jLabel9.setText("Diretores");

        jLabel10.setText("Duração");

        jLabel11.setText("Ano");

        jButton3.setText("Arquivo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        FTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTituloActionPerformed(evt);
            }
        });

        jFCaminho.setText("jTextField8");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(FDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(133, 133, 133)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(FAno))
                                            .addComponent(FAutores)
                                            .addComponent(FInterpretes)
                                            .addComponent(FDiretores)
                                            .addComponent(FIdioma)
                                            .addComponent(FTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FDescricao)
                                            .addComponent(FGeneros)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFCaminho)))))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(FIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(FAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(FInterpretes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(FDiretores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(FAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jFCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Cadastro", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotaoConfirmaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoConfirmaVActionPerformed
      this.jTabbedPane1.setSelectedIndex(1);
      DefaultTableModel dtmFilmes = (DefaultTableModel) jTFilmesCadastrados.getModel();      
      Object [] dados = {FTitulo.getText(), FGeneros.getText(), FIdioma.getText(), FDuracao.getText(), FAno.getText()};
      dtmFilmes.addRow(dados);
    }//GEN-LAST:event_jBotaoConfirmaVActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.jTabbedPane1.setSelectedIndex(1);
      DefaultTableModel dtmFilmes = (DefaultTableModel) jTFilmesCadastrados.getModel();      
      Object [] dados = {FTitulo.getText(), FGeneros.getText(), FIdioma.getText(), FDuracao.getText(), FAno.getText()};
      dtmFilmes.addRow(dados);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void FTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FTituloActionPerformed

    private void jBotaoExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoExcluiActionPerformed
     jTFilmesCadastrados.getSelectedRow();
     if (jTFilmesCadastrados.getSelectedRow() != -1){
        DefaultTableModel dtmFilmes = (DefaultTableModel) jTFilmesCadastrados.getModel();      
        dtmFilmes.removeRow(jTFilmesCadastrados.getSelectedRow());  
     }else{
         JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
     } 
    }//GEN-LAST:event_jBotaoExcluiActionPerformed

    private void jTFilmesCadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFilmesCadastradosMouseClicked
        if (jTFilmesCadastrados.getSelectedRow() != -1){
            FTitulo.setText(jTFilmesCadastrados.getValueAt(jTFilmesCadastrados.getSelectedRow(), 0).toString());
            FGeneros.setText(jTFilmesCadastrados.getValueAt(jTFilmesCadastrados.getSelectedRow(), 1).toString());
            FIdioma.setText(jTFilmesCadastrados.getValueAt(jTFilmesCadastrados.getSelectedRow(), 2).toString());
            FDuracao.setText(jTFilmesCadastrados.getValueAt(jTFilmesCadastrados.getSelectedRow(), 3).toString());
            FAno.setText(jTFilmesCadastrados.getValueAt(jTFilmesCadastrados.getSelectedRow(), 4).toString());         
     }else{
         JOptionPane.showMessageDialog(null, "Selecione um produto para editar.");
     } 
    }//GEN-LAST:event_jTFilmesCadastradosMouseClicked

    private void jTFilmesCadastradosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFilmesCadastradosKeyReleased
        if (jTFilmesCadastrados.getSelectedRow() != -1){
            FTitulo.setText(jTFilmesCadastrados.getValueAt(jTFilmesCadastrados.getSelectedRow(), 0).toString());
            FGeneros.setText(jTFilmesCadastrados.getValueAt(jTFilmesCadastrados.getSelectedRow(), 1).toString());
            FIdioma.setText(jTFilmesCadastrados.getValueAt(jTFilmesCadastrados.getSelectedRow(), 2).toString());
            FDuracao.setText(jTFilmesCadastrados.getValueAt(jTFilmesCadastrados.getSelectedRow(), 3).toString());
            FAno.setText(jTFilmesCadastrados.getValueAt(jTFilmesCadastrados.getSelectedRow(), 4).toString());         
     }else{
         JOptionPane.showMessageDialog(null, "Selecione um produto para editar.");
        }
    }//GEN-LAST:event_jTFilmesCadastradosKeyReleased

    private void jButtonEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEDITActionPerformed
        
        if (jTFilmesCadastrados.getSelectedRow() != -1){
            jTFilmesCadastrados.setValueAt(FTitulo.getText(), jTFilmesCadastrados.getSelectedRow(), 0);
            jTFilmesCadastrados.setValueAt(FGeneros.getText(), jTFilmesCadastrados.getSelectedRow(), 1);
            jTFilmesCadastrados.setValueAt(FIdioma.getText(), jTFilmesCadastrados.getSelectedRow(), 2);
            jTFilmesCadastrados.setValueAt(FDuracao.getText(), jTFilmesCadastrados.getSelectedRow(), 3);
            jTFilmesCadastrados.setValueAt(FAno.getText(), jTFilmesCadastrados.getSelectedRow(), 4);
     }
        
        
    }//GEN-LAST:event_jButtonEDITActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FAno;
    private javax.swing.JTextField FAutores;
    private javax.swing.JTextField FDescricao;
    private javax.swing.JTextField FDiretores;
    private javax.swing.JTextField FDuracao;
    private javax.swing.JTextField FGeneros;
    private javax.swing.JTextField FIdioma;
    private javax.swing.JTextField FInterpretes;
    private javax.swing.JTextField FTitulo;
    private javax.swing.JButton jBotaoConfirmaV;
    private javax.swing.JButton jBotaoExclui;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonEDIT;
    private javax.swing.JTextField jFCaminho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTFilmesCadastrados;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}