package school.sptech.projetofilmebidirecional.dto.filme;

import school.sptech.projetofilmebidirecional.entity.Diretor;

public class FilmeListagemDto {

    private int id;
    private String titulo;
    private String genero;
    private Integer anolancamento;
    private String sinopse;
    private FilmeDiretorListagemDto diretor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAnolancamento() {
        return anolancamento;
    }

    public void setAnolancamento(Integer anolancamento) {
        this.anolancamento = anolancamento;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public FilmeDiretorListagemDto getDiretor() {
        return diretor;
    }

    public void setDiretor(FilmeDiretorListagemDto diretor) {
        this.diretor = diretor;
    }
}
