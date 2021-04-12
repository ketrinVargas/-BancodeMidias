/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bancodemidias;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import bancodemidias.Reproduzivel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class ListaDeMidias {
    
    private static Arquivo arquivo = new Arquivo();  
    private static List<Midia> listaMidias;
    
    public ListaDeMidias(){       
    }
    
    public void inicia(){
        arquivo.verificaExistenciaArquivo();
        try {
            listaMidias = arquivo.leArquivo();
        } catch (IOException ex) {
            Logger.getLogger(ListaDeMidias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean salvar() throws IOException{
       return arquivo.escreveArquivo(listaMidias);
   }
        
    public boolean adiciona(Midia midia){
        return listaMidias.add(midia);
    }
    
    public void editar(int id, Midia midiaNova){
       for (Midia m : listaMidias){
          if (id == m.getId()){
             int index = listaMidias.indexOf(m);
             listaMidias.set(index, midiaNova);
          }
       }
   }
    
    public boolean remove(int id){
       for (Midia m : listaMidias){
          if (id == m.getId()){
              listaMidias.remove(m);
              return true;
          }
       }
       return false;
    }
    
    public int quantidadeDeMidias(){
        return listaMidias.size();
    }
    
    public List pertenceAClasse( Class classe){
        List<Integer> listaDeIds;
        listaDeIds = new ArrayList();
        for (Midia m : listaMidias){
               if (classe == m.getClass()){
                   int id = m.getId();
                   listaDeIds.add(id);
               }
           }
        return listaDeIds;
    }
    
    
    //////////////////////////////////////////
   public static class getMidia{
       public static Midia porId(int id){
           for (Midia m : listaMidias){
               if (id == m.getId()){
                   return m;
               }
           }
           return null;
       }   
       public static List contemNoTitulo(String texto){
           List<Midia> lista = new ArrayList();
           for (Midia m : listaMidias){
               if (m.getTitulo().trim().toLowerCase().contains(texto.toLowerCase().trim())){
                   lista.add(m);
               }
           }
           return lista;
       }
       public static List contemNoGenero(String genero){
           List<Midia> lista = new ArrayList();
           for (Midia m : listaMidias){
               String generoEncontrado = m.getGenero(genero);
               if(generoEncontrado != null){
                   if (generoEncontrado.trim().toLowerCase().contains(genero.toLowerCase().trim())){
                       lista.add(m);
                   }
               }
           }
           return lista;
       }
   }
   
   
   
   public void ordenaAlfabeticamente(){
       Collections.sort(listaMidias, Comparator.comparing(Midia::getTitulo));
   }
   
   public void ordenaData(){
       Collections.sort(listaMidias, Comparator.comparing(Midia::getData));
   }
   
   

}
