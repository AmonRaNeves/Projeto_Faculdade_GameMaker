import cores.StringColorida;
import mecanicas.Carta;

public class CartasDomino extends Carta {

    static final StringColorida CartasDomino1 = new StringColorida("\uD83C\uDC32", "Azul");
    static final StringColorida CartasDomino2 = new StringColorida("🀱", "Azul");
    static final StringColorida fundo = new StringColorida("▣","Verde");

    public CartasDomino(StringColorida frente) {
        super(frente);
    }
}
