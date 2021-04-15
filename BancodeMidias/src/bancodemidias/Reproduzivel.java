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
public abstract class Reproduzivel extends Midia implements Serializable {
    private String genero;
    private String idioma;
    private int duracao;
    private Date ano;

    public Reproduzivel(String caminhoDoArquivo, String titulo, String descricao, String genero, String idioma,
            int duracao, Date ano) {
        super(caminhoDoArquivo, titulo, descricao);
        this.genero = genero;
        this.idioma = idioma;
        this.duracao = duracao;
        this.ano = ano;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return this.idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }
    
    @Override
    public Date getAno(){
        return this.ano;
    }

    @Override
    public String getGenero() {
        return this.genero;
    }

    public Date getData() {
        return this.ano;
    }
    
    @Override
    public  String getFotografo(){
        return null;
    }
    
    @Override
    public  String getPessoas(){
        return null;
    }
    
    @Override
    public  String getLocal(){
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "{" + " genero='" + getGenero() + "'" + ", idioma='" + getIdioma() + "'" + ", duracao='" + getDuracao()
                + "'" + ", ano='" + getData() + "'" + "}";
    }

    @Override
    public abstract String getAutores();

    @Override
    public abstract String getInterpretes();

    @Override
    public abstract String getDiretores();

   

}
