package appconsole;

import modelo.Artista;
import modelo.Cidade;
import modelo.Show;
import util.ControleID;
import util.Util;

public class Resetar {
    public static void main(String[] args) {
        Util.conectar();

        ControleID.resetarRegistroID(Show.class, 0);
        ControleID.resetarRegistroID(Artista.class, 0);
        ControleID.resetarRegistroID(Cidade.class, 0);

        Util.desconectar();

        System.out.println("IDs resetados com sucesso");
    }
}