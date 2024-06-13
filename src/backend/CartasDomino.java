package backend;

import console.Console;
import cores.StringColorida;
import mecanicas.Carta;

public class CartasDomino extends Carta {

    private int esq;
    private int dir;
    //fundo

    public CartasDomino(int esq, int dir) {

        super(new StringColorida(esq + "" + dir, "Azul"),new StringColorida(dir + "" + esq, "Azul"));
    }

}
