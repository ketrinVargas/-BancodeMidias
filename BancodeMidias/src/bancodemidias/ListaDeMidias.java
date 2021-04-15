/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bancodemidias;

import bancodemidias.Reproduzivel;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ketrin d. Vargas, Marina B. Otokovieski, Rafael Souza
 */
public class ListaDeMidias {
    
    private static Arquivo arquivo = new Arquivo();  
    private static List<Midia> listaMidias;
    private static List<Midia> ultimaLista;

    
    public ListaDeMidias(){
        arquivo.iniciaArquivo();
        if(arquivo.temConteudo()){
            listaMidias = arquivo.leArquivo();
        }else{
            listaMidias = new ArrayList();
        }
        
    }

    public static boolean salvar() throws IOException{
       return arquivo.escreveArquivo(listaMidias);
   }
        
    public boolean adiciona(Midia midia){
        return listaMidias.add(midia);
    }
    
    public boolean editar(int id, Midia midiaNova){
      boolean result = false;
      for (Midia m : listaMidias){
          if (id == m.getId()){
             int index = listaMidias.indexOf(m);
             listaMidias.set(index, midiaNova);
             result = true;
         }
       }
      return result;
   }
    
     // public void alterar(Midia antigo, Midia novo) {
      //  listaMidias.set(listaMidias.indexOf(antigo), novo);
    //}
    
    public static boolean remove(int id){
       for (Midia m : listaMidias){
          if (id == m.getId()){
              listaMidias.remove(m);
              return true;
          }
       }
       return false;
    }
    
    public static int quantidadeDeMidias(){
        return listaMidias.size();
    }
    
        //////////////////////////////////////////
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
       public Midia getMidiaPorId(int id){
           for (Midia m : listaMidias){
               if (id == m.getId()){
                   return m;
               }
           }
           return null;
       }   
       public List getMidiaContemNoTitulo(String texto){
           List<Midia> lista = new ArrayList();
           for (Midia m : listaMidias){
               if (m.getTitulo().trim().toLowerCase().contains(texto.toLowerCase().trim())){
                   lista.add(m);
               }
           }
           return lista;
       }
       public List getMidiaContemNoGenero(String genero){
           List<Midia> lista = new ArrayList();
           for (Midia m : listaMidias){
               String generoEncontrado = m.getGenero();
               if(generoEncontrado != null){
                   if (generoEncontrado.trim().toLowerCase().contains(genero.toLowerCase().trim())){
                       lista.add(m);
                   }
               }
           }
           return lista;
       }
   ////////////////////////////////////////////
   
   
   
   public static void ordenaAlfabeticamente(){
       Collections.sort(listaMidias, Comparator.comparing(Midia::getTitulo));
   }
   
   public static void ordenaData(){
       Collections.sort(listaMidias, Comparator.comparing(Midia::getData));
   }
   
   public static String getltimaLista(){
        return ultimaLista.toString();
    }
   
    /**
     *
     * @param obj classe a ser procuradada
     * @param procura o q foi pesquisado
     * @param metodo onde será pesquisado,  ex: Midia.class.getDeclaredMethod("getTitulo")
     * @return
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException
     */
    public static List<Midia> getLista(Object obj, String procura, Method metodo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
       ultimaLista = new ArrayList();
       for(Midia m : listaMidias){
           if (obj.getClass().isInstance(m)){
               if (procura==null){
                   ultimaLista.add(m);
               }else{
                   if (String.valueOf(metodo.invoke(m)).trim().toLowerCase().contains(procura.toLowerCase().trim())){
                       ultimaLista.add(m);
                   }
               }
           }
       }
       return ultimaLista;
   }

}
