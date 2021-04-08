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
 * @author rafae
 */
public class Reproduzivel extends Midia implements Serializable{
    private String genero;
    private String idioma;
    private int duracao;
    private Date ano;


    public Reproduzivel(String caminhoDoArquivo, String titulo, String descricao, String genero, String idioma, int duracao, Date ano) {
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

    public Date getAno() {
        return this.ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    @Override
    public String getGenero(String genero) {
        return this.genero;
    }
}
