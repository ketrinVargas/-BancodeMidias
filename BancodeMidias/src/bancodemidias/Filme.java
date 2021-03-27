
package bancodemidias;

import java.util.Date;

/**
 *
 * @author marin
 */
public class Filme extends Reproduzivel{
    private String[] diretor;
    private String[] atores;
    private String[] principais;  

    public Filme(String caminhoDoArquivo, String titulo, String descricao, String genero, String idioma, int duracao, Date ano, String[] diretor, String[] atores, String[] principais) {
        super( caminhoDoArquivo,  titulo,  descricao,  genero,  idioma,  duracao, ano);
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

}
