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
 * @author marin
 */
public class Imagem extends Midia implements Serializable {
    private String fotografo;
    private String[] pessoas;
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
    public Imagem(String caminhoDoArquivo, String titulo, String descricao, String fotografo, String[] pessoas,
            String local, Date data) {
        super(caminhoDoArquivo, titulo, descricao);
        this.fotografo = fotografo;
        this.pessoas = pessoas;
        this.local = local;
        this.data = data;
    }

    public String getFotografo() {
        return this.fotografo;
    }

    public void setFotografo(String fotografo) {
        this.fotografo = fotografo;
    }

    public String[] getPessoas() {
        return this.pessoas;
    }

    public void setPessoas(String[] pessoas) {
        this.pessoas = pessoas;
    }

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

}
