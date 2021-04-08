/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import bancodemidias.Filme;
import bancodemidias.ListaDeMidias;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

public class CadastroFilmesFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroFilmesFrame
     */
    private ListaDeMidias listFilme;

    public CadastroFilmesFrame() {
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
        jComboBoxGenero = new javax.swing.JComboBox<>();
        jComboBoxIdioma = new javax.swing.JComboBox<>();
        jTextFieldAutores = new javax.swing.JTextField();
        jTextFieldInterpretes = new javax.swing.JTextField();
        jTextFieldDuracao = new javax.swing.JTextField();
        jTextFieldAno = new javax.swing.JTextField();
        botaoConfirmaFilmes = new javax.swing.JButton();
        Arquivo = new javax.swing.JToggleButton();
        txtFile = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Cadastro de Filmes");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Filmes");

        jLabel2.setText("Título");

        jLabel3.setText("Descrição");

        jLabel4.setText("Gênero");

        jLabel5.setText("Idioma");

        jLabel6.setText("Autores");

        jLabel7.setText("Interpretes");

        jLabel8.setText("Duração");

        jLabel9.setText("Ano");

        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o Gênero>", "Comédia", "Cult", "Infantil", "Romance", "Suspense", "Terror" }));

        jComboBoxIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o Idioma>", "Espanhol", "Inglês", "Português" }));

        jTextFieldAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnoActionPerformed(evt);
            }
        });

        botaoConfirmaFilmes.setText("Confirma");
        botaoConfirmaFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmaFilmesActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxIdioma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldAutores)
                                    .addComponent(jTextFieldInterpretes)
                                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDescricao)
                                    .addComponent(jComboBoxGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botaoConfirmaFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Arquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFile)))))
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(36, 36, 36)
                .addComponent(botaoConfirmaFilmes)
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

    private void jTextFieldAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnoActionPerformed

    private void botaoConfirmaFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmaFilmesActionPerformed
      /*   if (jTextFieldTitulo.getText().equals("")
                || jTextFieldDescricao.getText().equals("")
                || jComboBoxGenero.getSelectedItem().equals("")
                || jComboBoxIdioma.getSelectedItem().equals("")
                || jTextFieldAutores.getText().equals("")
                || jTextFieldInterpretes.getText().equals("")
                || jTextFieldDuracao.getText().equals("")
                || jTextFieldAno.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe todos os campos!");
        } else {
            Filme film = new Filme(jTextFieldTitulo.getText().trim(),
                    jTextFieldDescricao.getText().trim(),
                    jComboBoxGenero.getSelectedItem(),
                    jComboBoxIdioma.getSelectedItem(),
                    jTextFieldAutores.getText().trim(),
                    jTextFieldInterpretes.getText().trim(),
                    Integer.parseInt(jTextFieldDuracao.getText().trim()),
                    getDate()); 
            
            if (listFilme.adiciona(film) == false) {
                JOptionPane.showMessageDialog(null, "Não foi possível salvar.");
            } else {
           JOptionPane.showMessageDialog(null, "Cadastro Efetuado!");
                try { 
                    listFilme.salvar();
                } catch (IOException ex) {
                    Logger.getLogger(CadastroFilmesFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            
         }*/
             
        
        
    }//GEN-LAST:event_botaoConfirmaFilmesActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Arquivo;
    private javax.swing.JButton botaoConfirmaFilmes;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JComboBox<String> jComboBoxIdioma;
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
}
