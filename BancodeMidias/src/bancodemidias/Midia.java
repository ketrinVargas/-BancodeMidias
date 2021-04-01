/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodemidias;

import java.io.Serializable;

public abstract class Midia implements Serializable{
    private String caminhoDoArquivo;
    private String titulo;
    private String descricao;

    public Midia(String caminhoDoArquivo, String titulo, String descricao) {
        this.caminhoDoArquivo = caminhoDoArquivo;
        this.titulo = titulo;
        this.descricao = descricao;
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

      
}
