/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import bancodemidias.ListaDeMidias;
import bancodemidias.Musica;
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
 * @author ketrim
 */
public class CadastroVisualizacaoMusica extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroVisualizacaoMusica
     */
    private ListaDeMidias listMidia;
    public CadastroVisualizacaoMusica(ListaDeMidias midias) {
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
        jTMusicasCadastrados = new javax.swing.JTable();
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
        FAutores = new javax.swing.JTextField();
        FDuracao = new javax.swing.JTextField();
        txtFile = new javax.swing.JTextField();
        FGenero = new javax.swing.JTextField();
        FIdioma = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        FInterpretes = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        FAno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Itens Cadastrados");

        jBotaoConfirmaV.setText("Confirma");
        jBotaoConfirmaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoConfirmaVActionPerformed(evt);
            }
        });

        jTMusicasCadastrados.setModel(new javax.swing.table.DefaultTableModel(
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
        jTMusicasCadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTMusicasCadastradosMouseClicked(evt);
            }
        });
        jTMusicasCadastrados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTMusicasCadastradosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTMusicasCadastrados);

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
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
        jLabel1.setText("Cadastro Música");

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

        jLabel8.setText("Ano");

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

        jLabel9.setText("Intérpretes");

        FInterpretes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FInterpretesActionPerformed(evt);
            }
        });

        jLabel10.setText("Duração");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFile))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(FDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(FAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel5)
                                                            .addComponent(jLabel6))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(FGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                                                            .addComponent(FIdioma)))))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(FTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(FInterpretes, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(FDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(FAno, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 14, Short.MAX_VALUE))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(FIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(FAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FInterpretes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(FDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(FAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        DefaultTableModel dtmMusica = (DefaultTableModel) jTMusicasCadastrados.getModel();
        Object [] dados = {FTitulo.getText(), FGenero.getText(), FIdioma.getText(), FDuracao.getText(), FAno.getText()};
        dtmMusica.addRow(dados);

    }//GEN-LAST:event_jBotaoConfirmaVActionPerformed

    private void jTMusicasCadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTMusicasCadastradosMouseClicked
        if (jTMusicasCadastrados.getSelectedRow() != -1){
            FTitulo.setText(jTMusicasCadastrados.getValueAt(jTMusicasCadastrados.getSelectedRow(), 0).toString());
            FGenero.setText(jTMusicasCadastrados.getValueAt(jTMusicasCadastrados.getSelectedRow(), 1).toString());
            FIdioma.setText(jTMusicasCadastrados.getValueAt(jTMusicasCadastrados.getSelectedRow(), 2).toString());
            FDuracao.setText(jTMusicasCadastrados.getValueAt(jTMusicasCadastrados.getSelectedRow(), 3).toString());
            FAno.setText(jTMusicasCadastrados.getValueAt(jTMusicasCadastrados.getSelectedRow(), 4).toString());
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um produto para editar.");
        }
    }//GEN-LAST:event_jTMusicasCadastradosMouseClicked

    private void jTMusicasCadastradosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMusicasCadastradosKeyReleased
        if (jTMusicasCadastrados.getSelectedRow() != -1){
            FTitulo.setText(jTMusicasCadastrados.getValueAt(jTMusicasCadastrados.getSelectedRow(), 0).toString());
            FGenero.setText(jTMusicasCadastrados.getValueAt(jTMusicasCadastrados.getSelectedRow(), 1).toString());
            FIdioma.setText(jTMusicasCadastrados.getValueAt(jTMusicasCadastrados.getSelectedRow(), 2).toString());
            FDuracao.setText(jTMusicasCadastrados.getValueAt(jTMusicasCadastrados.getSelectedRow(), 3).toString());
            FAno.setText(jTMusicasCadastrados.getValueAt(jTMusicasCadastrados.getSelectedRow(), 4).toString());
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um produto para editar.");
        }
    }//GEN-LAST:event_jTMusicasCadastradosKeyReleased

    private void jBotaoExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoExcluiActionPerformed
        jTMusicasCadastrados.getSelectedRow();
        if (jTMusicasCadastrados.getSelectedRow() != -1){
            DefaultTableModel dtmMusicas = (DefaultTableModel) jTMusicasCadastrados.getModel();
            dtmMusicas.removeRow(jTMusicasCadastrados.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_jBotaoExcluiActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.jTabbedPane1.setSelectedIndex(1);
        DefaultTableModel dtmMusica = (DefaultTableModel) jTMusicasCadastrados.getModel();
        Object [] dados = {FTitulo.getText(), FGenero.getText(), FIdioma.getText(), FDuracao.getText(), FAno.getText()};
        dtmMusica.addRow(dados);
        
        if (txtFile.getText().equals("")
            ||FTitulo.getText().equals("")
            || FDescricao.getText().equals("")
            || FGenero.getText().equals("")
            || FIdioma.getText().equals("")
            || FAutores.getText().equals("")
            || FInterpretes.getText().equals("")
            || FDuracao.getText().equals("")
            || FAno.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Informe todos os campos!");
        } else {
            Musica music = new Musica(
                    txtFile.getText().trim(),
                    FTitulo.getText().trim(),
                    FDescricao.getText().trim(),
                    FGenero.getText().toString(),
                    FIdioma.getText().toString(),
                    Integer.parseInt(FDuracao.getText().trim()),
                    getDate(),
                    getInterprete(),
                    getAutor());
  
            if (listMidia.adiciona(music) == false) {
                JOptionPane.showMessageDialog(null, "Não foi possível salvar.");
            } else {
                JOptionPane.showMessageDialog(null, "Cadastro Efetuado!");
                try {
                    listMidia.salvar();
                } catch (IOException ex) {
                    Logger.getLogger(CadastroVisualizacaoMusica.class.getName()).log(Level.SEVERE, null, ex);
                }
      
            }
       
       }     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void FTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FTituloActionPerformed

    private void FInterpretesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FInterpretesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FInterpretesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
            if (jTMusicasCadastrados.getSelectedRow() != -1){
            jTMusicasCadastrados.setValueAt(FTitulo.getText(), jTMusicasCadastrados.getSelectedRow(), 0);
            jTMusicasCadastrados.setValueAt(FGenero.getText(), jTMusicasCadastrados.getSelectedRow(), 1);
            jTMusicasCadastrados.setValueAt(FIdioma.getText(), jTMusicasCadastrados.getSelectedRow(), 2);
            jTMusicasCadastrados.setValueAt(FDuracao.getText(), jTMusicasCadastrados.getSelectedRow(), 3);
            jTMusicasCadastrados.setValueAt(FAno.getText(), jTMusicasCadastrados.getSelectedRow(), 4);
     }else{
         JOptionPane.showMessageDialog(null, "Selecione um produto para editar.");
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FAno;
    private javax.swing.JTextField FAutores;
    private javax.swing.JTextField FDescricao;
    private javax.swing.JTextField FDuracao;
    private javax.swing.JTextField FGenero;
    private javax.swing.JTextField FIdioma;
    private javax.swing.JTextField FInterpretes;
    private javax.swing.JTextField FTitulo;
    private javax.swing.JButton jBotaoConfirmaV;
    private javax.swing.JButton jBotaoExclui;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTable jTMusicasCadastrados;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtFile;
    // End of variables declaration//GEN-END:variables

  /**
  * Retorna a data já convertida para Date 
  * @return O conteúdo da JDateTextField em formato java.util.Date
  */
public Date getDate() {
       
         String dataStr = FAno.getText().substring(0, 8);
         if (FAno.equals("  /  /  ")) return null;
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

public String [] getInterprete(){
    
    try{ 
        String interprete =  FInterpretes.getText().trim();
        }
        catch(Exception e) {
                 return null;    
     }  
        return null;
}
public String [] getAutor(){
    try{ 
        String autor = FAutores.getText().trim();
       }
        catch(Exception e) {
                 return null;    
     }  
        return null;
}



}
