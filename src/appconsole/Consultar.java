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


import util.Util;

public class Consultar {
	private ObjectContainer manager;

	public Consultar() {
		Util.conectar();
		manager = Util.getManager();
		
		consultar();
		Util.desconectar();
		System.out.println("\n\n aviso: feche sempre o plugin OME antes de executar aplica��o");
	}

	public void consultar() {
		
	}

	public static void main(String[] args) {
		new Consultar();
	}
}

