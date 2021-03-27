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
public class Imagem extends Midia {
    private String fotografo;
    private String[] pessoas;
    private String local;
    private Date data;

    public Imagem(String caminhoDoArquivo, String titulo, String descricao, String fotografo, String[] pessoas, String local, Date data) {
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

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
   
}