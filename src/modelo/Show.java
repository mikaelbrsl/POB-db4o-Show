package modelo;
import java.util.Date;


public class Show {
    private int id;
    private Date data;
    private Cidade cidade;
    private Artista artista;


    public Show(int id, Date data, Cidade cidade, Artista artista) {
        this.id = id;
        this.data = data;
        this.cidade = cidade;
        this.artista = artista;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    public Artista getArtista() {
        return artista;
    }
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    
}