package modelo;

import java.util.ArrayList;

public class Artista{
    private String nomeArstitico;
    private ArrayList<Show> listaDeShow;

    public Artista(String nomeArstitico, ArrayList<Show> listaDeShow) {
        this.nomeArstitico = nomeArstitico;
        this.listaDeShow = listaDeShow;
    }

    public String getNomeArstitico() {
        return nomeArstitico;
    }

    public void setNomeArstitico(String nomeArstitico) {
        this.nomeArstitico = nomeArstitico;
    }

    public ArrayList<Show> getListaDeShow() {
        return listaDeShow;
    }

    public void setListaDeShow(ArrayList<Show> listaDeShow) {
        this.listaDeShow = listaDeShow;
    }

    public void addShow(Show show){
        listaDeShow.add(show);
    }

    public void removeShow(Show show){
        if(listaDeShow.contains(show)){
            listaDeShow.remove(show);
        } else{
            throw new NullPointerException("Artista não marcado para esse show");
        }
        
    }
    
    @Override
    public String toString() {
    	String ids = "[";
        for (Show s : listaDeShow) {
            ids += s.getId() + " ";
        }
        ids = ids.trim() + "]";
        
        return "Artista: " + nomeArstitico + " (Shows: " + ids + ")";
    }
}