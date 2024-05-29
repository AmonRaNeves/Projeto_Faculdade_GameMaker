import cores.StringColorida;
import mecanicas.Tabuleiro;

public class TabuleiroPlayer extends Tabuleiro {

    static final StringColorida fundoTabuleiro = new StringColorida("▣", "Verde");
    static final StringColorida vazio = new StringColorida(" ", "Branco");

    static final CartasDomino fundo = new CartasDomino(fundoTabuleiro);
    public TabuleiroPlayer () {
        super(2, 15, fundo);

        setFundo(1, 1, new CartasDomino(fundoTabuleiro));

    }
}
