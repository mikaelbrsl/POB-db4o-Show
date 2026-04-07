package appconsole;

import java.util.List;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import modelo.Artista;
import modelo.Cidade;
import modelo.Show;
import util.ControleID;
import util.Util;

public class Resetar {
	
		private ObjectContainer manager;
	
	   public Resetar() {
	        Util.conectar();
	        manager = Util.getManager();


			Query q = manager.query();
			q.constrain(Artista.class);  				
			List<Artista> resultados = q.execute();
			for (Artista art : resultados ) {
				manager.delete(art);
			}
			
			q = manager.query();
			q.constrain(Cidade.class);  				
			List<Cidade> resultados2 = q.execute();
			for (Cidade cid : resultados2 ) {
				manager.delete(cid);
			}
			
			q = manager.query();
			q.constrain(Show.class);  				
			List<Show> resultados3 = q.execute();
			for (Show show : resultados3 ) {
				manager.delete(show);
			}

	        ControleID.resetarRegistroID(Show.class, 0);
	        ControleID.resetarRegistroID(Artista.class, 0);
	        ControleID.resetarRegistroID(Cidade.class, 0);

	        Util.desconectar();

	        System.out.println("Banco resetado com sucesso");
	    }
	   
	   public static void main(String[] args) {
	        new Resetar();
	    }
}