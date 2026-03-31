package modelo;

import java.util.ArrayList;

public class Artista{
    private String nomeArtistico;
    private ArrayList<Show> listaDeShow;

    public Artista(String nomeArstitico, ArrayList<Show> listaDeShow) {
        this.nomeArtistico = nomeArstitico;
        this.listaDeShow = listaDeShow;
    }

    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public void setNomeArtistico(String nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
    }

    public ArrayList<Show> getListaDeShow() {
        return listaDeShow;
    }

    public void setListaDeShow(ArrayList<Show> listaDeShow) {
        this.listaDeShow = listaDeShow;
    }

    public void adicionar(Show show){
        listaDeShow.add(show);
    }
    

    public void remover(Show show){
    	listaDeShow.remove(show);
        
    }
    
    @Override
    public String toString() {
    	String texto = "Nome: "+nomeArtistico + " | Shows agendados: "; 
    	if(listaDeShow.isEmpty())
    		texto += "Sem Shows";
    	else
    		for (Show s : listaDeShow)
    			if (s != null)
    				texto += s.getId() + ", ";
    	
    	return texto;
    }
}