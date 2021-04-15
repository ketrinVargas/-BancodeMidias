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
 * @author Ketrin d. Vargas, Marina B. Otokovieski, Rafael Souza
 */
public class Arquivo {
    
    private File arquivo;
    
    public Arquivo(){
        arquivo = new File("C:/Users/rafae/Documents/Faculdade/SEGUNDO_SEMESTRE/POO/TP2-BancodeMidias/customers.txt");
    }
    
    public boolean temConteudo(){
        if (arquivo.length()>0){
            return true;
        }else{
            return false;
        }
    }
    
    public void iniciaArquivo(){
        try {
          if (!arquivo.exists()) {
            arquivo.createNewFile();
          }
        } catch (IOException e) {
          System.out.println(e.getMessage());
        }
    }
    
    public List leArquivo(){
        ObjectInputStream entrada = null;
        List lista = null;
        try {
            entrada = new ObjectInputStream( new FileInputStream(arquivo));
        } catch (IOException ex) {
            System.out.println("arquivo vazio");
        }
        
        try {
            lista = (ArrayList<Midia>) entrada.readObject();
        } catch (IOException ex) {
            lista = null;
            System.out.println("2");
        } catch (ClassNotFoundException ex) {
            System.out.println("3");
        }
        
        try {
            entrada.close();
        } catch (IOException ex) {
                System.out.println("4");
        }
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
