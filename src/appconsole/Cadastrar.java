package appconsole;

/**
 * ********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet POB - Persistencia de
 * Objetos Prof. Fausto Ayres
 *
 */

import java.util.ArrayList;
import com.db4o.ObjectContainer;
import modelo.Artista;
import modelo.Cidade;
import modelo.Show;
import util.Util;

public class Cadastrar {

    private ObjectContainer manager;

    public Cadastrar() {
        Util.conectar();
        manager = Util.getManager();
        System.out.println("Cadastrando cidades, artistas e shows...");

   
        Cidade c1 = new Cidade("João Pessoa", new ArrayList<Show>());
        Cidade c2 = new Cidade("Campina Grande", new ArrayList<Show>());
        Cidade c3 = new Cidade("Recife", new ArrayList<Show>());
        Cidade c4 = new Cidade("Natal", new ArrayList<Show>());

     
        Artista a1 = new Artista("Alok", new ArrayList<Show>());
        Artista a2 = new Artista("Anitta", new ArrayList<Show>());
        Artista a3 = new Artista("Anderson Neiff", new ArrayList<Show>());
        Artista a4 = new Artista("Ivete Sangalo", new ArrayList<Show>());
        Artista a5 = new Artista("Luan Santana", new ArrayList<Show>());
        

        Show s1 = new Show("20/05/2026", c1, a1);
		a1.addShow(s1); c1.addShow(s1);

		Show s2 = new Show("21/05/2026", c1, a2);
		a2.addShow(s2); c1.addShow(s2);

		Show s3 = new Show("10/06/2026", c2, a1);
		a1.addShow(s3); c2.addShow(s3);

		Show s4 = new Show("12/06/2026", c2, a4);
		a4.addShow(s4); c2.addShow(s4);

		Show s5 = new Show("05/07/2026", c3, a3);
		a3.addShow(s5); c3.addShow(s5);

		Show s6 = new Show("05/07/2026", c3, a2);
		a2.addShow(s6); c3.addShow(s6);

		Show s7 = new Show("15/08/2026", c4, a4);
		a4.addShow(s7); c4.addShow(s7);

		Show s8 = new Show("16/08/2026", c4, a3);
		a3.addShow(s8); c4.addShow(s8);
		
		Show s9 = new Show("17/08/2026", c4, a5);
		a5.addShow(s9); c4.addShow(s9);
		
		Show s10 = new Show("18/08/2026", c4, a5);
		a5.addShow(s10); c4.addShow(s10);

        manager.store(s1); 
        manager.store(s2); 
        manager.store(s3); 
        manager.store(s4);
        manager.store(s5); 
        manager.store(s6); 
        manager.store(s7); 
        manager.store(s8);

        manager.store(a1); 
        manager.store(a2); 
        manager.store(a3); 
        manager.store(a4);
        manager.store(c1); 
        manager.store(c2); 
        manager.store(c3); 
        manager.store(c4);

        manager.commit();
        Util.desconectar();
        System.out.println("fim da appconsole");
    }

    //=================================================
    public static void main(String[] args) {
        new Cadastrar();
    }
}
