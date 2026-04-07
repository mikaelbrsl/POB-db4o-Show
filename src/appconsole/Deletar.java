package appconsole;

/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * POB - Persistencia de Objetos
 * Prof. Fausto Ayres
 *
 */

import java.util.List;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import modelo.Artista;
import modelo.Cidade;
import modelo.Show;
import util.Util;

public class Deletar {
	private ObjectContainer manager;

	public Deletar() {
		Util.conectar();
		manager = Util.getManager();
		
		// OBS: Deletando todos os objetos do banco para retestes
		
//		Query q = manager.query();
//		q.constrain(Artista.class);  				
//		List<Artista> resultados = q.execute();
//		for (Artista art : resultados ) {
//			manager.delete(art);
//		}
//		
//		q = manager.query();
//		q.constrain(Cidade.class);  				
//		List<Cidade> resultados2 = q.execute();
//		for (Cidade cid : resultados2 ) {
//			manager.delete(cid);
//		}
//		
//		q = manager.query();
//		q.constrain(Show.class);  				
//		List<Show> resultados3 = q.execute();
//		for (Show show : resultados3 ) {
//			manager.delete(show);
//		}
		
		// finaliza aqui
		// ...
		
		
		
		Query q = manager.query();
		q.constrain(Cidade.class);
		q.descend("nome").constrain("Natal");
		List<Cidade> cidade = q.execute();
		Cidade c = cidade.getFirst();
		
		List<Show> show = c.getListaDeShow();
		
		if (!show.isEmpty()) {
			for(Show s : show) {
				manager.delete(s);
				
			}
		}
		manager.delete(c);
		manager.commit();
		
		
		
		Util.desconectar();
		System.out.println("\n\n aviso: feche sempre o plugin OME antes de executar aplica��o");
	}


	// =================================================
	public static void main(String[] args) {
		new Deletar();
	}
}
