/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import bancodemidias.Filme;
import bancodemidias.Imagem;
import bancodemidias.ListaDeMidias;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marin
 */
public class CadastroVisualizacaoImagem extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroVisualizacaoFrame
     */
     private ListaDeMidias listMidia;
    public CadastroVisualizacaoImagem(ListaDeMidias midias) {
        initComponents();
        listMidia = midias;
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
        jTImagensCadastrados = new javax.swing.JTable();
        jBotaoExclui = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        FTitulo = new javax.swing.JTextField();
        FDescricao = new javax.swing.JTextField();
        FLocal = new javax.swing.JTextField();
        FData = new javax.swing.JTextField();
        txtFile = new javax.swing.JTextField();
        FFotografo = new javax.swing.JTextField();
        FPessoas = new javax.swing.JTextField();

        setClosable(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Itens Cadastrados");

        jBotaoConfirmaV.setText("Confirma");
        jBotaoConfirmaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoConfirmaVActionPerformed(evt);
            }
        });

        jTImagensCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Descrição", "Fotógrafo", "Local", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTImagensCadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTImagensCadastradosMouseClicked(evt);
            }
        });
        jTImagensCadastrados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTImagensCadastradosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTImagensCadastrados);

        jBotaoExclui.setText("Excluir");
        jBotaoExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoExcluiActionPerformed(evt);
            }
        });

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBotaoConfirmaV)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Visualização", jPanel1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro Imagem");

        jButton2.setText("Confirma");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Título");

        jLabel4.setText("Descrição");

        jLabel5.setText("Fotógrafo");

        jLabel6.setText("Pessoas");

        jLabel7.setText("Local");

        jLabel8.setText("Data");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel6)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addGap(1, 1, 1))))
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(FPessoas)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(FTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(FData, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(FLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFile)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FFotografo, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(FDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FFotografo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(FPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(FLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(FData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
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
        DefaultTableModel dtmImagens = (DefaultTableModel) jTImagensCadastrados.getModel();
        Object [] dados = {FTitulo.getText(), FDescricao.getText(), FFotografo.getText(), FLocal.getText(), FData.getText()};
        dtmImagens.addRow(dados);
                                
    }//GEN-LAST:event_jBotaoConfirmaVActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.jTabbedPane1.setSelectedIndex(1);
      DefaultTableModel dtmImagens = (DefaultTableModel) jTImagensCadastrados.getModel();
      Object [] dados = {FTitulo.getText(), FDescricao.getText(), FFotografo.getText(), FLocal.getText(), FData.getText()};
      dtmImagens.addRow(dados);
      
      if (txtFile.getText().equals("")
                || FTitulo.getText().equals("")
                || FDescricao.getText().equals("")
                || FFotografo.getText().equals("")
                || FPessoas.getText().equals("")
                || FLocal.getText().equals("")
                || FData.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe todos os campos!");
        } else {
            Imagem img = new Imagem(
                    txtFile.getText().trim(),
                    FTitulo.getText().trim(),
                    FDescricao.getText().trim(),
                    FFotografo.getText().trim(),
                    getPessoas(),
                    FLocal.getText().trim(),
                    getDate()); 
            
            if (listMidia.adiciona(img) == false) {
                JOptionPane.showMessageDialog(null, "Não foi possível salvar.");
            } else {
           JOptionPane.showMessageDialog(null, "Cadastro Efetuado!");
                try { 
                    listMidia.salvar();
                } catch (IOException ex) {
                    Logger.getLogger(CadastroVisualizacaoImagem.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            
         }
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void FTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FTituloActionPerformed

    private void jBotaoExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoExcluiActionPerformed
     jTImagensCadastrados.getSelectedRow();
     if (jTImagensCadastrados.getSelectedRow() != -1){
        DefaultTableModel dtmImagens = (DefaultTableModel) jTImagensCadastrados.getModel();      
        dtmImagens.removeRow(jTImagensCadastrados.getSelectedRow());  
     }else{
         JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
     } 
    }//GEN-LAST:event_jBotaoExcluiActionPerformed

    private void jTImagensCadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTImagensCadastradosMouseClicked
        if (jTImagensCadastrados.getSelectedRow() != -1){
            FTitulo.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 0).toString());
            FDescricao.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 1).toString());
            FFotografo.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 2).toString());
            FLocal.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 3).toString());
            FData.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 4).toString());         
     }else{
         JOptionPane.showMessageDialog(null, "Selecione um produto para editar.");
     } 
    }//GEN-LAST:event_jTImagensCadastradosMouseClicked

    private void jTImagensCadastradosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTImagensCadastradosKeyReleased
        if (jTImagensCadastrados.getSelectedRow() != -1){
            FTitulo.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 0).toString());
            FDescricao.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 1).toString());
            FFotografo.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 2).toString());
            FLocal.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 3).toString());
            FData.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 4).toString());         
     }else{
         JOptionPane.showMessageDialog(null, "Selecione um produto para editar.");
        }
    }//GEN-LAST:event_jTImagensCadastradosKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if (jTImagensCadastrados.getSelectedRow() != -1){
            jTImagensCadastrados.setValueAt(FTitulo.getText(), jTImagensCadastrados.getSelectedRow(), 0);
            jTImagensCadastrados.setValueAt(FDescricao.getText(), jTImagensCadastrados.getSelectedRow(), 1);
            jTImagensCadastrados.setValueAt(FFotografo.getText(), jTImagensCadastrados.getSelectedRow(), 2);
            jTImagensCadastrados.setValueAt(FLocal.getText(), jTImagensCadastrados.getSelectedRow(), 3);
            jTImagensCadastrados.setValueAt(FData.getText(), jTImagensCadastrados.getSelectedRow(), 4);
     }else{
         JOptionPane.showMessageDialog(null, "Selecione um produto para editar.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FData;
    private javax.swing.JTextField FDescricao;
    private javax.swing.JTextField FFotografo;
    private javax.swing.JTextField FLocal;
    private javax.swing.JTextField FPessoas;
    private javax.swing.JTextField FTitulo;
    private javax.swing.JButton jBotaoConfirmaV;
    private javax.swing.JButton jBotaoExclui;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTImagensCadastrados;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtFile;
    // End of variables declaration//GEN-END:variables
/**
  * Retorna a data já convertida para Date 
  * @return O conteúdo da JDateTextField em formato java.util.Date
  */
public Date getDate() {

         String dataStr = FData.getText().substring(0, 8);
         if (FData.equals("  /  /  ")) return null;
         DateFormat df = new SimpleDateFormat("dd/MM/yy");
         df.setLenient(false);
         try {
                 return df.parse(dataStr);
         }
         catch(ParseException e) {
                 e.printStackTrace();
                 return null;
         }                

 }
public String [] getPessoas(){
    
    try{ 
        String pessoa =  FPessoas.getText().trim();
        }
        catch(Exception e) {
                 return null;    
     }  
        return null;
}
}




