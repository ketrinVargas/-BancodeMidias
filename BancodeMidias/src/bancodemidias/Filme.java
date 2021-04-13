
package bancodemidias;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author marin
 */
public class Filme extends Reproduzivel implements Serializable {
    private String[] diretor;
    private String[] atores;
    private String[] principais;

    /**
     *
     * @param caminhoDoArquivo
     * @param titulo
     * @param descricao
     * @param genero
     * @param idioma
     * @param duracao
     * @param ano
     * @param diretor
     * @param atores
     * @param principais
     */
    public Filme(String caminhoDoArquivo, String titulo, String descricao, String genero, String idioma, int duracao,
            Date ano, String[] diretor, String[] atores, String[] principais) {
        super(caminhoDoArquivo, titulo, descricao, genero, idioma, duracao, ano);
        this.diretor = diretor;
        this.atores = atores;
        this.principais = principais;
    }

    public String[] getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String[] diretor) {
        this.diretor = diretor;
    }

    public String[] getAtores() {
        return this.atores;
    }

    public void setAtores(String[] atores) {
        this.atores = atores;
    }

    public String[] getPrincipais() {
        return this.principais;
    }

    public void setPrincipais(String[] principais) {
        this.principais = principais;
    }

    @Override
    public String toString() {
        return super.toString() + "{" + " diretor='" + getDiretor() + "'" + ", atores='" + getAtores() + "'" + ", principais='"
                + getPrincipais() + "'" + "}";
    }

}
