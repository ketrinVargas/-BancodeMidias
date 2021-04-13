/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodemidias;

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
        // TODO code application logic here
        listaDeMidias = new ListaDeMidias();
        List<Filme> filme = criaListDeFilme();
        
        for (int i = 0; i <filme.size(); i++){
            System.out.println(filme.get(i).toString());
        }
        for (int i = 0; i< ListaDeMidias.quantidadeDeMidias(); i++){
            System.out.println(listaDeMidias.getMidiaPorId(i+1));
 
        }
        listaDeMidias.salvar();          
    }
    
    public static int quantidadeDeMidias(){
        
        return ListaDeMidias.quantidadeDeMidias();
    }
    
    public static List criaListDeFilme(){
        List<Filme> filme = new ArrayList();
        String[] diretor= new String[10];
        String[] atores= new String[10];
        String[] principais= new String[10];        
        Date data = new Date();
        for (int i = 0; i<10; i++){
            diretor[i] = "diretor"+i;
            atores[i] = "atores"+i;
            principais[i] = "principais"+i;
            
            Filme filmeX = new Filme(
              "caminhoDoArquivo" +i,
              "titulo" +i,
              "descricao" +i,
              "genero" +i,
              "idioma" +i,
              i,
              data,
              diretor,
              atores,
              principais);
             filme.add(filmeX);
        }
        return filme;
    }
    
}
