package modelo;




public class Show {
    private int id;
    private String data;
    private Cidade cidade;
    private Artista artista;


    public Show(int id, String data, Cidade cidade, Artista artista) {
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
    public String getData() {
        return data;
    }
    public void setData(String data) {
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
    
    @Override
    public String toString() {
        return String.format("Show [ID: %d] | Data: %s | Artista: %s | Local: %s", 
            id, 
            data, 
            artista.getNomeArstitico(),
            cidade.getNome());
    }

    
}