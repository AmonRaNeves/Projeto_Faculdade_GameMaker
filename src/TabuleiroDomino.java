import cores.StringColorida;
import mecanicas.Tabuleiro;

public class TabuleiroDomino extends Tabuleiro {


    //Fundo do Tabuleiro
    static final StringColorida fundoTabuleiro = new StringColorida("▣", "Verde");
    static final StringColorida vazio = new StringColorida(" ", "Branco");


    //Cordenadas Numeros
    static final StringColorida um = new StringColorida("1", "Branco");
    static final StringColorida dois = new StringColorida("2", "Branco");
    static final StringColorida tres = new StringColorida("3", "Branco");
    static final StringColorida quatro = new StringColorida("4", "Branco");
    static final StringColorida cinco = new StringColorida("5", "Branco");
    static final StringColorida seis = new StringColorida("6", "Branco");
    static final StringColorida sete = new StringColorida("7", "Branco");
    static final StringColorida oito = new StringColorida("8", "Branco");
    static final StringColorida nove = new StringColorida("9", "Branco");
    static final StringColorida dez = new StringColorida("10", "Branco");
    static final StringColorida onze = new StringColorida("11", "Branco");
    static final StringColorida doze = new StringColorida("12", "Branco");
    static final StringColorida treze = new StringColorida("13", "Branco");
    static final StringColorida quatroze = new StringColorida("14", "Branco");

    //Cartas de Domino
    static final CartasDomino fundo = new CartasDomino(fundoTabuleiro);


    //Tabuleiro
    public TabuleiroDomino() {
        super(10, 15, fundo);

        setFundo(1, 0, new CartasDomino (fundoTabuleiro));
        setFundo(1, 1, new CartasDomino (fundoTabuleiro));
        setFundo(1, 2, new CartasDomino (fundoTabuleiro));
        setFundo(1, 3, new CartasDomino (fundoTabuleiro));
        setFundo(1, 4, new CartasDomino (fundoTabuleiro));


        setFundo(0, 1, new CartasDomino(vazio));
        setFundo(0, 2, new CartasDomino(um));
        setFundo(0, 3, new CartasDomino(dois));
        setFundo(0, 4, new CartasDomino(tres));
        setFundo(0, 5, new CartasDomino(quatro));
        setFundo(0, 6, new CartasDomino(cinco));
        setFundo(0, 7, new CartasDomino(seis));
        setFundo(0, 8, new CartasDomino(sete));
        setFundo(0, 9, new CartasDomino(oito));
        setFundo(0, 10, new CartasDomino(nove));
        setFundo(0, 11, new CartasDomino(dez));
        setFundo(0, 12, new CartasDomino(onze));
        setFundo(0, 13, new CartasDomino(doze));
        setFundo(0, 14, new CartasDomino(treze));
        setFundo(0, 15, new CartasDomino(quatroze));


    }

}