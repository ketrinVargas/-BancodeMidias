/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import bancodemidias.Filme;
import bancodemidias.Imagem;
import bancodemidias.ListaDeMidias;
import bancodemidias.Midia;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marin
 */
public class CadastroVisualizacaoImagem extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroVisualizacaoFrame
     */
     private ListaDeMidias listMidias;
    public CadastroVisualizacaoImagem(ListaDeMidias midias) {
        initComponents();
        listMidias = midias;
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
        Pesquisar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
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
        jLabel2.setText("Imagens Cadastradas");

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
                "Caminho", "Título", "Descrição", "Fotógrafo", "Pessoas", "Data", "Local"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        Pesquisar.setText("Pesquisar");
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Título", "Data" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jBotaoExclui, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218)
                .addComponent(jBotaoConfirmaV, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(356, 356, 356)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(286, 286, 286)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotaoExclui)
                    .addComponent(jButton1)
                    .addComponent(jBotaoConfirmaV))
                .addGap(24, 24, 24))
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
                        .addGap(191, 191, 191)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(FTitulo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(FDescricao))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(FFotografo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FData, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(FLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(FPessoas))
                            .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(195, 195, 195))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(388, 388, 388))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FFotografo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
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
       Object [] dados = {txtFile.getText(), FTitulo.getText(), FDescricao.getText(), FFotografo.getText(),FPessoas.getText(), FData.getText(),FLocal.getText()};
        dtmImagens.addRow(dados);
                                
    }//GEN-LAST:event_jBotaoConfirmaVActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         JFileChooser fc = new  JFileChooser();
        fc.setDialogTitle("Buscar Arquivo");
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagem", "jpg", "png");
        
        fc.setFileFilter(filter);
        int retorno = fc.showOpenDialog(this);
        
        if(retorno == JFileChooser.APPROVE_OPTION ){
            
            File file = fc.getSelectedFile();
            txtFile.setText(file.getPath());
           
         } else {
                JOptionPane.showMessageDialog(null, "Erro no arquivo");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.jTabbedPane1.setSelectedIndex(1);
      DefaultTableModel dtmImagens = (DefaultTableModel) jTImagensCadastrados.getModel();
      Object [] dados = {txtFile.getText(), FTitulo.getText(), FDescricao.getText(), FFotografo.getText(),FPessoas.getText(), FData.getText(),FLocal.getText()};
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
            
            if (!(listMidias.adiciona(img) == false)) {
                JOptionPane.showMessageDialog(null, "Não foi possível salvar.");
            } else {
           JOptionPane.showMessageDialog(null, "Cadastro Efetuado!");
                try { 
                    listMidias.salvar();
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
            txtFile.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 0).toString());
            FTitulo.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 1).toString());
            FDescricao.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 2).toString());
            FFotografo.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 3).toString());
            FPessoas.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 4).toString());   
             FData.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 5).toString()); 
            FLocal.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 6).toString());            
     }else{
         JOptionPane.showMessageDialog(null, "Selecione um produto para editar.");
     } 
    }//GEN-LAST:event_jTImagensCadastradosMouseClicked

    private void jTImagensCadastradosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTImagensCadastradosKeyReleased
        if (jTImagensCadastrados.getSelectedRow() != -1){
            txtFile.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 0).toString());
            FTitulo.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 1).toString());
            FDescricao.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 2).toString());
            FFotografo.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 3).toString());
            FPessoas.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 4).toString()); 
            FData.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 5).toString()); 
            FLocal.setText(jTImagensCadastrados.getValueAt(jTImagensCadastrados.getSelectedRow(), 6).toString());   
                    
     }else{
         JOptionPane.showMessageDialog(null, "Selecione um produto para editar.");
        }
    }//GEN-LAST:event_jTImagensCadastradosKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if (jTImagensCadastrados.getSelectedRow() != -1){
            jTImagensCadastrados.setValueAt(txtFile.getText(), jTImagensCadastrados.getSelectedRow(), 0);
            jTImagensCadastrados.setValueAt(FTitulo.getText(), jTImagensCadastrados.getSelectedRow(), 1);
            jTImagensCadastrados.setValueAt(FDescricao.getText(), jTImagensCadastrados.getSelectedRow(), 2);
           jTImagensCadastrados.setValueAt(FFotografo.getText(), jTImagensCadastrados.getSelectedRow(), 3);
            jTImagensCadastrados.setValueAt(FPessoas.getText(), jTImagensCadastrados.getSelectedRow(), 4);
            jTImagensCadastrados.setValueAt(FData.getText(), jTImagensCadastrados.getSelectedRow(), 5);
            jTImagensCadastrados.setValueAt(FLocal.getText(), jTImagensCadastrados.getSelectedRow(), 6);
            


     }else{
         JOptionPane.showMessageDialog(null, "Selecione um produto para editar.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        // TODO add your handling code here:
        String indice = jComboBox1.getSelectedItem().toString();
        switch (indice) {
            case "Título":
          break;
            case "Data":
               
               
                break;
           
        }      
    }//GEN-LAST:event_PesquisarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FData;
    private javax.swing.JTextField FDescricao;
    private javax.swing.JTextField FFotografo;
    private javax.swing.JTextField FLocal;
    private javax.swing.JTextField FPessoas;
    private javax.swing.JTextField FTitulo;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JButton jBotaoConfirmaV;
    private javax.swing.JButton jBotaoExclui;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
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




