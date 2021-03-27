/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodemidias;

import java.util.Date;

/**
 *
 * @author marin
 */
public class Musica extends Reproduzivel {
    private String[] interpretes;
    private String[] autores;

    public Musica(String caminhoDoArquivo, String titulo, String descricao, String genero, String idioma, int duracao, Date ano, String[] interpretes, String[] autores) {
        super( caminhoDoArquivo,  titulo,  descricao,  genero,  idioma,  duracao, ano);
        this.interpretes = interpretes;
        this.autores = autores;
    }

    public String[] getInterpretes() {
        return this.interpretes;
    }

    public void setInterpretes(String[] interpretes) {
        this.interpretes = interpretes;
    }

    public String[] getAutores() {
        return this.autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }
}
