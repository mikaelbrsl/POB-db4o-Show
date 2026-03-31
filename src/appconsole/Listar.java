package appconsole;

/**
 * ********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet POB - Persistencia de
 * Objetos Prof. Fausto Ayres
 *
 */

import java.util.List;
import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import modelo.Artista;
import modelo.Cidade;
import modelo.Show;
import util.Util;

public class Listar {

    private ObjectContainer manager;

    public Listar() {
        Util.conectar();
        manager = Util.getManager();


        System.out.println("\n--- LISTAGEM DE CIDADES ---");
        Query q = manager.query();
        q.constrain(Cidade.class);
        List<Cidade> cidades = q.execute();
        for (Cidade c : cidades) {
            System.out.println(c); 
        }


        System.out.println("\n--- LISTAGEM DE ARTISTAS ---");
        q = manager.query();
        q.constrain(Artista.class);
        List<Artista> artistas = q.execute();
        for (Artista a : artistas) {
            System.out.println(a); 
        }

        System.out.println("\n--- LISTAGEM DE SHOWS ---");
        q = manager.query();
        q.constrain(Show.class);
        List<Show> shows = q.execute();
        for (Show s : shows) {
            System.out.println(s);
        }


        Util.desconectar();

        System.out.println("\n\n aviso: feche sempre o plugin OME antes de executar aplica��o");
    }

    //=================================================
    public static void main(String[] args) {
        new Listar();
    }
}