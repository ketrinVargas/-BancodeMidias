/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bancodemidias;

import bancodemidias.ListaDeMidias;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author rafae
 */
public class ListaX {

    private static ListaDeMidias listaOrigem;
    private List<Object> lista;
    private Class tipo;
    List<Integer> idsPertencentes;
    
    public ListaX(Class tipo) throws IOException{
        this.listaOrigem = new ListaDeMidias();
        this.lista = new ArrayList<>();
        this.tipo = tipo;
    }
    
    public void iniciaListaOrigem(){
        //listaOrigem.inicia();
    }
    
    public void iniciaListaX(){
        idsPertencentes = listaOrigem.pertenceAClasse(tipo);
        for (int i : idsPertencentes){
            
        }
    }

    public List getIds(){
        return idsPertencentes;
    }
   
    
    public String getDado(int id){
        Midia midia = getObject(id);
        return midia.toString();
    }
    
    private Midia getObject(int id){
        for (Iterator<Object> it = lista.iterator(); it.hasNext();) {
            Midia m = (Midia) it.next();
            if (id == m.getId()){
                return m;
            }
        }
           return null;
    }
}
