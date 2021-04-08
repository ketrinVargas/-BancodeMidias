/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bancodemidias;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class Arquivo {
    
    File arquivo = new File("/customers.bin");
    
    public void verificaExistenciaArquivo(){
        try {
          if (!arquivo.exists()) {
            arquivo.createNewFile();
          }
        } catch (IOException e) {
          System.out.println(e.getMessage());
        }
    }
    
    public List leArquivo() throws FileNotFoundException, IOException{
        ObjectInputStream entrada;
        List lista = null;
        entrada = new ObjectInputStream( new FileInputStream(arquivo));
     
        try {          
            lista = (ArrayList<Midia>) entrada.readObject();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        entrada.close();
        
        return lista;
    }
    
    public boolean escreveArquivo(List lista ){
        try {
            ObjectOutputStream saida;
            FileOutputStream a; 
            a = new FileOutputStream(arquivo);          
            saida = new ObjectOutputStream( a);  
            saida.writeObject(lista);
            saida.close();
            return true;
         } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
         } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    

}
