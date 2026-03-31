package modelo;


import java.util.ArrayList;

public class Cidade{
    private String nome;
    private ArrayList<Show> listaDeShow;
    
    public Cidade(String nome, ArrayList<Show> listaDeShow) {
        this.nome = nome;
        this.listaDeShow = listaDeShow;
    }

//    public void addShow(Show show){
//        listaDeShow.add(show);
//    }
//
//    public void removeShow(Show show){
//        if(listaDeShow.contains(show)){
//            listaDeShow.remove(show);
//        } else{
//            throw new NullPointerException("Não tem esse show na cidade");
//        }
//        
//    }
    
    public void adicionar(Show show) {
    	listaDeShow.add(show);
    	
    }
    
    public void remover(Show show) {
    	listaDeShow.remove(show);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList getListaDeShow() {
        return listaDeShow;
    }

    public void setListaDeShow(ArrayList<Show> listaDeShow) {
        this.listaDeShow = listaDeShow;
    }

    @Override
    public String toString() {
    	String texto = "Nome: "+nome + " | Shows agendados: "; 
    	if(listaDeShow.isEmpty())
    		texto += "Sem Shows";
    	else
    		for (Show s : listaDeShow)
    			if(s != null)
    				texto += +s.getId() + ", ";
    	
    	return texto;
    }
}