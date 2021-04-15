/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodemidias;

import frames.TelaPrincipalFrame;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author marin
 */
public class BancodeMidias {

    /**
     * @param args the command line arguments
     */
    
    private static ListaDeMidias listaDeMidias;
    
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        TelaPrincipalFrame tela = new TelaPrincipalFrame();        
        tela.setVisible(true);
    }
    
}
