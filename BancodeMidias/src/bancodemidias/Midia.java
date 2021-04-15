/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodemidias;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Ketrin d. Vargas, Marina B. Otokovieski, Rafael Souza
 */

public abstract class Midia implements Serializable {
    private static int numDeMidias = 0;
    private int id;
    private String caminhoDoArquivo;
    private String titulo;
    private String descricao;

    public Midia(String caminhoDoArquivo, String titulo, String descricao) {
        this.id = numDeMidias++;
        this.caminhoDoArquivo = caminhoDoArquivo;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getCaminhoDoArquivo() {
        return this.caminhoDoArquivo;
    }

    public void setCaminhoDoArquivo(String caminhoDoArquivo) {
        if (caminhoDoArquivo == null) {
            throw new NullPointerException("Caminho vazio.");
        }
        this.caminhoDoArquivo = caminhoDoArquivo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null) {
            throw new IllegalArgumentException("Título vazio.");
        }
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getGenero();

    public abstract Date getData();
    
    public abstract String getFotografo();
    public abstract String getPessoas();
    public abstract String getLocal();
    public abstract String getIdioma();
    public abstract String getAutores();
    public abstract String getInterpretes();
    public abstract String getDiretores();
    public abstract int getDuracao();
    public abstract Date getAno();

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", caminhoDoArquivo='" + getCaminhoDoArquivo() + "'" + ", titulo='"
                + getTitulo() + "'" + ", descricao='" + getDescricao() + "'" + "}";
    }

}
