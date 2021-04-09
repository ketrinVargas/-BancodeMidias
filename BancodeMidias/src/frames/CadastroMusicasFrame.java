/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;


import bancodemidias.ListaDeMidias;
import bancodemidias.Midia;
import bancodemidias.Musica;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author marin
 */

public class CadastroMusicasFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroMusicasFrame
     */
    
    private ListaDeMidias listMidias ;
    
    
    
    DateFormat df = new SimpleDateFormat("dd/MM/yy");

    public CadastroMusicasFrame(ListaDeMidias midias) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jTextFieldIdioma = new javax.swing.JTextField();
        jTextFieldAutores = new javax.swing.JTextField();
        jTextFieldInterpretes = new javax.swing.JTextField();
        jTextFieldDuracao = new javax.swing.JTextField();
        jTextFieldAno = new javax.swing.JTextField();
        botaoConfirmaMusicas = new javax.swing.JButton();
        Arquivo = new javax.swing.JToggleButton();
        txtFile = new javax.swing.JTextField();
        jTextFieldGenero = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Cadastro de Músicas");
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Músicas");

        jLabel2.setText("Título");

        jLabel3.setText("Descrição");

        jLabel4.setText("Gênero");

        jLabel5.setText("Idioma");

        jLabel6.setText("Autores");

        jLabel7.setText("Intérpretes");

        jLabel8.setText("Duração");

        jLabel9.setText("Ano");

        jTextFieldTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTituloActionPerformed(evt);
            }
        });

        jTextFieldDuracao.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldDuracao.setText("hh:mm:ss");
        jTextFieldDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDuracaoActionPerformed(evt);
            }
        });

        botaoConfirmaMusicas.setText("Confirma");
        botaoConfirmaMusicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmaMusicasActionPerformed(evt);
            }
        });

        Arquivo.setText("Arquivo");
        Arquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArquivoActionPerformed(evt);
            }
        });

        txtFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(botaoConfirmaMusicas, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldTitulo)
                                        .addComponent(jTextFieldDescricao)
                                        .addComponent(jTextFieldIdioma)
                                        .addComponent(jTextFieldAutores)
                                        .addComponent(jTextFieldInterpretes)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextFieldDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(62, 62, 62)
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldAno, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                                        .addComponent(jTextFieldGenero))
                                    .addGap(17, 17, 17)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(Arquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFile)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldInterpretes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Arquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(botaoConfirmaMusicas)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTituloActionPerformed

    private void botaoConfirmaMusicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmaMusicasActionPerformed

       if (txtFile.getText().equals("")
            ||jTextFieldTitulo.getText().equals("")
            || jTextFieldDescricao.getText().equals("")
            || jTextFieldGenero.getText().equals("")
            || jTextFieldIdioma.getText().equals("")
            || jTextFieldAutores.getText().equals("")
            || jTextFieldInterpretes.getText().equals("")
            || jTextFieldDuracao.getText().equals("")
            || jTextFieldAno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe todos os campos!");
        } else {
            Musica music = new Musica(
                    txtFile.getText().trim(),
                    jTextFieldTitulo.getText().trim(),
                    jTextFieldDescricao.getText().trim(),
                    jTextFieldGenero.getText().trim(),
                    jTextFieldIdioma.getText().trim(),
                    Integer.parseInt(jTextFieldDuracao.getText().trim()),
                    getDate(),
                    jTextFieldInterpretes.getText().toString(),
                    jTextFieldAutores.getText().toString());
           
  
            if (listMidias.adiciona(music) == false) {
                JOptionPane.showMessageDialog(null, "Não foi possível salvar.");
            } else {
           JOptionPane.showMessageDialog(null, "Cadastro Efetuado!");
                try {
                    listMidias.salvar();
                } catch (IOException ex) {
                    Logger.getLogger(CadastroMusicasFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
      
            }
       
       }
       
   
   
               
    }//GEN-LAST:event_botaoConfirmaMusicasActionPerformed

    private void ArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArquivoActionPerformed
        // TODO add your handling code here:

        JFileChooser fc = new  JFileChooser();
        fc.setDialogTitle("Buscar Arquivo");
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int retorno = fc.showOpenDialog(this);

        if(retorno == JFileChooser.APPROVE_OPTION ){

            File file = fc.getSelectedFile();
            txtFile.setText(file.getPath());

        }

    }//GEN-LAST:event_ArquivoActionPerformed

    private void txtFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFileActionPerformed

    private void jTextFieldDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDuracaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Arquivo;
    private javax.swing.JButton botaoConfirmaMusicas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldAutores;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldDuracao;
    private javax.swing.JTextField jTextFieldGenero;
    private javax.swing.JTextField jTextFieldIdioma;
    private javax.swing.JTextField jTextFieldInterpretes;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JTextField txtFile;
    // End of variables declaration//GEN-END:variables

  /**
  * Retorna a data já convertida para Date 
  * @return O conteúdo da JDateTextField em formato java.util.Date
  */
public Date getDate() {
  
         String dataStr = jTextFieldAno.getText().substring(0, 8);
         if (jTextFieldAno.equals("  /  /  ")) return null;
       
         df.setLenient(false);
         try {
                 return df.parse(dataStr);
         }
         catch(ParseException e) {
                 e.printStackTrace();
                 return null;
         }                

 }




}
