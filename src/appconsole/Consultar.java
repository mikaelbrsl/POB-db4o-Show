package appconsole;

/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * POB - Persistencia de Objetos
 * Prof. Fausto Ayres
 *
 */

import java.util.List;

import com.db4o.ObjectContainer;
import com.db4o.query.Candidate;
import com.db4o.query.Evaluation;
import com.db4o.query.Query;

import modelo.Artista;
import modelo.Show;
import util.Util;

public class Consultar {
	private ObjectContainer manager;

	public Consultar() {
		Util.conectar();
		manager = Util.getManager();
		
		System.out.println("\n---quais os shows na data 05/07/2026");
		Query q = manager.query();
		q.constrain(Show.class);
		q.descend("data").constrain("05/07/2026");
		List<Show> resultados = q.execute();
		
		for (Show show : resultados) {
			System.out.println(show);
		}
		
		System.out.println("\n---quais os artistas que vao se apresentar na cidade de nome 'João Pessoa'");
		q = manager.query();
		q.constrain(Show.class);
		q.descend("cidade").descend("nome").constrain("João Pessoa");
		resultados = q.execute();
		
		for (Show show : resultados) {
			Artista artista = show.getArtista();
			System.out.println(artista);
		}
		
		System.out.println("\n---quais os artistas que tem mais de 1 shows na cidade 'Natal'");
		q = manager.query();
		q.constrain(Artista.class);
		q.constrain(new Filtro1(1));
		List<Artista> artistas = q.execute();
		
		for (Artista artista : artistas) {
			System.out.println(artista);
		}
		
		
		Util.desconectar();
		System.out.println("\n\n aviso: feche sempre o plugin OME antes de executar aplica��o");
	}
	

	public static void consultar(String[] args) {
		new Consultar();
		
	}
	
	public static void main(String[] args) {
		new Consultar();
	}
}


class Filtro1 implements Evaluation{
	private int n;
	public Filtro1(int n) {
		this.n = n;
	}
	
	public void evaluate(Candidate candidate) {
		Artista a = (Artista) candidate.getObject();
		List<Show> shows = a.getListaDeShow();
		int cont = 0;
		for (Show s : shows) {
			if(s.getCidade().getNome().equals("Natal")) {
				cont++;	
			}
		}
		if(cont > n) {
			candidate.include(true);
		} else {
			candidate.include(false);
		}
	}
	
}

