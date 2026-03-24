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


import util.Util;

public class Deletar {
	private ObjectContainer manager;

	public Deletar() {
		Util.conectar();
		manager = Util.getManager();
		

		
		Util.desconectar();
		System.out.println("\n\n aviso: feche sempre o plugin OME antes de executar aplica��o");
	}


	// =================================================
	public static void main(String[] args) {
		new Deletar();
	}
}
