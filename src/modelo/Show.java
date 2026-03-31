package modelo;




public class Show {
    private int id;
    private String data;
    private Cidade cidade;
    private Artista artista;


    public Show(String data, Cidade cidade, Artista artista) {
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
    
    public void adicionar(Artista a) {
    	artista = a;
    	a.adicionar(this);
    	
    }
    
    public void remover(Artista a) {
    	artista = null;
    	a.remover(this);
    }
    
    public void adicionar(Cidade c) {
    	cidade = c;
    	c.adicionar(this);
    }
    
    public void remover(Cidade c) {
    	cidade = null;
    	c.remover(this);
    }
    
    public Artista getArtista() {
        return artista;
    }
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    @Override
    public String toString() {
        String texto = "Show [ID=" + id + "] | Data: " + data + " | ";

        if (artista == null) {
            texto += "Sem artista";
        } else {
            texto += "Artista: " + artista.toString(); 
        }

        texto += " | ";

        if (cidade == null) {
            texto += "Sem cidade";
        } else {
            texto += "Cidade: " + cidade.toString();
        }

        return texto;
    }

    
}