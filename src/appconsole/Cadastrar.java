package appconsole;
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * POB - Persistencia de Objetos
 * Prof. Fausto Ayres
 *
 */

import com.db4o.ObjectContainer;


import util.Util;

public class Cadastrar {
	private ObjectContainer manager;

	public Cadastrar(){
		Util.conectar();
		manager = Util.getManager();
		
		Util.desconectar();
		System.out.println("fim da appconsole");
	}

	//=================================================
	public static void main(String[] args) {
		new Cadastrar();
	}
}


