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
public class Imagem extends Midia implements Serializable {
    private String fotografo;
    private String pessoas;
    private String local;
    private Date data;

    /**
     *
     * @param caminhoDoArquivo
     * @param titulo
     * @param descricao
     * @param fotografo
     * @param pessoas
     * @param local
     * @param data
     */
    public Imagem(String caminhoDoArquivo, String titulo, String descricao, String fotografo, String pessoas,
            String local, Date data) {
        super(caminhoDoArquivo, titulo, descricao);
        this.fotografo = fotografo;
        this.pessoas = pessoas;
        this.local = local;
        this.data = data;
    }

    @Override
    public String getFotografo() {
        return this.fotografo;
    }

    public void setFotografo(String fotografo) {
        this.fotografo = fotografo;
    }
    
    @Override
    public String getPessoas() {
        return this.pessoas;
    }

    public void setPessoas(String pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String getGenero( ) {
        return null;
    }

    public Date getData() {
        return this.data;
    }


    @Override
    public String toString() {
        return super.toString() + "{" +
            " fotografo='" + getFotografo() + "'" +
            ", pessoas='" + getPessoas() + "'" +
            ", local='" + getLocal() + "'" +
            ", data='" + getData() + "'" +
            "}";
    }

    @Override
    public String getIdioma() {
        return null;
    }

    @Override
    public String getAutores() {
        return null;
        }

    @Override
    public String getInterpretes() {
        return null;
    }

    @Override
    public String getDiretores() {
        return null;
    }

    @Override
    public int getDuracao() {
        return 0;
    }

    @Override
    public Date getAno() {
        return null;
    }

}
