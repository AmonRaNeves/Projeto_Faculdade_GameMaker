import cores.StringColorida;
import mecanicas.Carta;

public class CartasDomino extends Carta {

    static final StringColorida CartaDomino1 = new StringColorida("\uD83C\uDC31", "Azul");
    static final StringColorida CartaDomino2 = new StringColorida("🀱", "Azul");
    static final StringColorida fundo = new StringColorida("▣","Verde");

    public CartasDomino(StringColorida frente) {
        super(frente);
    }
}
