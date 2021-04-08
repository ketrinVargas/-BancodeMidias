
package bancodemidias;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author marin
 */
public class Musica extends Reproduzivel implements Serializable {
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
