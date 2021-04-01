/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bancodemidias;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafae
 */
public class Arquivos {
    
    File arquivoMidias = new File("C:/Windows/Temp/customers.txt");
    List<Midia> midias = new ArrayList<>();
    
    public Arquivos() throws FileNotFoundException, IOException{    
    
        verificaExistenciaArquivo(arquivoMidias);        
        
        // user
        Imagem img1 = new Imagem("a1", "a2", "a3", "a4", null, "a1", null);
        
        midias.add(img1);
        
        escreveArquivo(midias, arquivoMidias);
        
        midias = leArquivo(arquivoMidias);
        
        Midia aa = midias.get(0);
        
        System.out.println(aa.toString());
        System.out.println("chegou");
        
        
        
    }
    
    
    private static void verificaExistenciaArquivo(File arquivo){
        try {
          if (!arquivo.exists()) {
            arquivo.createNewFile();
          }
        } catch (IOException e) {
          System.out.println(e.getMessage());
        }
    }
    
    private static List leArquivo(File arquivo) throws FileNotFoundException, IOException{
        ObjectInputStream entrada;
        List lista = null;
        entrada = new ObjectInputStream( new FileInputStream(arquivo));

        try {          
            lista = (ArrayList<Midia>) entrada.readObject();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        entrada.close();
        
        return lista;
    }
    
    private static void escreveArquivo(List midia, File arquivo) throws IOException {
        ObjectOutputStream saida;
        
        FileOutputStream a = new FileOutputStream(arquivo);
  
        saida = new ObjectOutputStream( a);
        
        saida.writeObject(midia);
        saida.close();
    }
    
}
