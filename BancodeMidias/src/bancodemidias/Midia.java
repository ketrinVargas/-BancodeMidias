/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodemidias;

import java.io.Serializable;
import java.util.Date;

public abstract class Midia implements Serializable{
    private static ListaDeMidias listaDeMidias;
    private int id;
    private String caminhoDoArquivo;
    private String titulo;
    private String descricao;

    public Midia(String caminhoDoArquivo, String titulo, String descricao){
        this.id = listaDeMidias.quantidadeDeMidias();
        this.caminhoDoArquivo = caminhoDoArquivo;
        this.titulo = titulo;
        this.descricao = descricao;
    }
    
    public int getId(){
        return id;
    }

    public String getCaminhoDoArquivo() {
        return this.caminhoDoArquivo;
    }

    public void setCaminhoDoArquivo(String caminhoDoArquivo) {
        this.caminhoDoArquivo = caminhoDoArquivo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public abstract String getGenero(String genero);
    
    public abstract Date getData();
      
}
