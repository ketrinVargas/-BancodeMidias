/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import bancodemidias.ListaDeMidias;
import javax.swing.JOptionPane;

/**
 *
 * @author marin
 */

public class TelaPrincipalFrame extends javax.swing.JFrame {

    private ListaDeMidias listMidia;
    /**
     * Creates new form TelaPrincipalFrame
     */
    
    public TelaPrincipalFrame() {
        initComponents();
        try{
            listMidia = new ListaDeMidias();
        }catch(Exception e){
        System.out.println(e.getMessage()); 
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadastroFilmesP = new javax.swing.JMenuItem();
        cadastroImagensP = new javax.swing.JMenuItem();
        CadastroMusicasInicial = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        verFilmes = new javax.swing.JMenuItem();
        verImagens = new javax.swing.JMenuItem();
        verMusicas = new javax.swing.JMenuItem();
        ajuda = new javax.swing.JMenu();
        comoUsar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        sobreOSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco de Mídias");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastros");

        cadastroFilmesP.setText("Filmes");
        cadastroFilmesP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFilmesPActionPerformed(evt);
            }
        });
        jMenu1.add(cadastroFilmesP);

        cadastroImagensP.setText("Imagens");
        cadastroImagensP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroImagensPActionPerformed(evt);
            }
        });
        jMenu1.add(cadastroImagensP);

        CadastroMusicasInicial.setText("Músicas");
        CadastroMusicasInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroMusicasInicialActionPerformed(evt);
            }
        });
        jMenu1.add(CadastroMusicasInicial);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mídias");

        verFilmes.setText("Filmes");
        verFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verFilmesActionPerformed(evt);
            }
        });
        jMenu2.add(verFilmes);

        verImagens.setText("Imagens");
        verImagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verImagensActionPerformed(evt);
            }
        });
        jMenu2.add(verImagens);

        verMusicas.setText("Musicas");
        verMusicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verMusicasActionPerformed(evt);
            }
        });
        jMenu2.add(verMusicas);

        jMenuBar1.add(jMenu2);

        ajuda.setText("Ajuda");

        comoUsar.setText("Como Usar");
        comoUsar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comoUsarActionPerformed(evt);
            }
        });
        ajuda.add(comoUsar);

        jMenuBar1.add(ajuda);

        jMenu4.setText("Sobre");

        sobreOSistema.setText("Informações do Sistema");
        sobreOSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreOSistemaActionPerformed(evt);
            }
        });
        jMenu4.add(sobreOSistema);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroFilmesPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFilmesPActionPerformed
      CadastroVisualizacaoFilme Filme = new CadastroVisualizacaoFilme(listMidia);
      jDesktopPane1.add(Filme);
      Filme.setVisible(true);
    }//GEN-LAST:event_cadastroFilmesPActionPerformed

    private void CadastroMusicasInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroMusicasInicialActionPerformed
      CadastroVisualizacaoMusica Musica = new CadastroVisualizacaoMusica(listMidia);
      jDesktopPane1.add(Musica);
      Musica.setVisible(true);
    }//GEN-LAST:event_CadastroMusicasInicialActionPerformed

    private void verImagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verImagensActionPerformed
     
    }//GEN-LAST:event_verImagensActionPerformed

    private void cadastroImagensPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroImagensPActionPerformed
       CadastroVisualizacaoImagem Imagem = new CadastroVisualizacaoImagem(listMidia);
      jDesktopPane1.add(Imagem);
      Imagem.setVisible(true);
    }//GEN-LAST:event_cadastroImagensPActionPerformed

    private void verFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verFilmesActionPerformed
       
    }//GEN-LAST:event_verFilmesActionPerformed

    private void verMusicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verMusicasActionPerformed
        
    }//GEN-LAST:event_verMusicasActionPerformed

    private void comoUsarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comoUsarActionPerformed
        JOptionPane.showMessageDialog(jMenu1, "Acesse as abas do menu superior Cadastros para realizar o cadastro de mídias."
                + "\nAcesse as abas do menu superior Mídias para visualizar as mídias cadastradas."
                + "\nPara saber mais sobre o sistema acesse a aba Sobre");
    }//GEN-LAST:event_comoUsarActionPerformed

    private void sobreOSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreOSistemaActionPerformed
        JOptionPane.showMessageDialog(jMenu1, "Bem-Vindo ao  Sistema Banco de Mídias"
                + "\nO presente sistema tem como propósito cadastrar, alterar, excluir e visualizar mídias."
                + "\nVocê pode consultar suas mídias por: Título ou Data."
                + "\nEm casos de filmes e músicas a busca também pode ser feita por Gênero."
                + "\nQuaisquer dúvidas entre em contato com a equipe de desenvolvimento :D");
    }//GEN-LAST:event_sobreOSistemaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadastroMusicasInicial;
    private javax.swing.JMenu ajuda;
    private javax.swing.JMenuItem cadastroFilmesP;
    private javax.swing.JMenuItem cadastroImagensP;
    private javax.swing.JMenuItem comoUsar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem sobreOSistema;
    private javax.swing.JMenuItem verFilmes;
    private javax.swing.JMenuItem verImagens;
    private javax.swing.JMenuItem verMusicas;
    // End of variables declaration//GEN-END:variables
}
