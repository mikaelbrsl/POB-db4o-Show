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


public class Alterar {
	private ObjectContainer manager;

	public Alterar(){
		Util.conectar();
		manager = Util.getManager();
		
		// removendo relacionamento entre Show 1 e artista 1
		
//		Query q = manager.query();
//		q.constrain(Show.class);
//		q.descend("id").constrain(1);
//		List<Show> resultados = q.execute();
//		
//		
//		if (resultados.size() > 0) {
//			Show show = resultados.getFirst();
//			
//			System.out.println("Show " + show.getId() + " encontrado." );
//			
//			Cidade cidade = show.getCidade();
//			Artista artista = show.getArtista();
//			show.remover(artista);
//			show.remover(cidade);
//						
//			if(artista.getListaDeShow().isEmpty()) {
//				manager.delete(artista);
//				System.out.println("Artista apagado por não ter Shows agendados -- Órfão");
//			} else
//				manager.store(artista);
//			manager.delete(show);
//			
//			manager.commit();
//			System.out.println("Show cancelado.");
//			} else
//				System.out.println("Artista não encontrado no Show.");
		
		// alterando cidade do show 1 para Recife
		
		Query q = manager.query();
		q.constrain(Show.class);
		q.descend("id").constrain(1);
		List<Show> resultados = q.execute();
		
		if (resultados.size() > 0) {
			Show show = resultados.getFirst();
			
			System.out.println("Show " + show.getId() + " encontrado." );
			
			Cidade cidade = show.getCidade();
			
			q = manager.query();
			q.constrain(Cidade.class);
			q.descend("nome").constrain("Recife");
			List<Cidade> resultados2 = q.execute();
			
			if (resultados2.size() > 0) {
				Cidade novaCidade = resultados2.getFirst();
				show.remover(cidade);
				show.adicionar(novaCidade);
				
			manager.store(show);
				
				manager.store(show);
				System.out.println("Show " + show.getId() + " alterado para cidade " + novaCidade.getNome());
			} else
				System.out.println("Cidade 'Recife' não encontrada.");
		
		
		Util.desconectar();
		System.out.println("\n\n aviso: feche sempre o plugin OME antes de executar aplica��o");
	}
	}
	//=================================================
	public static void main(String[] args) {
		new Alterar();
	}
}

