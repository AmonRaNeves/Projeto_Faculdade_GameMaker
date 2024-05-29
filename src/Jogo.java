import console.Console;
import console.Tecla;
import mecanicas.Carta;
import mecanicas.Tabuleiro;

public class Jogo {
    int linha = 0, coluna = 0;
    int numero = 0;

    public void RodandoJogo() {
        Tabuleiro tabuleiroDomino = new TabuleiroDomino();
        Tabuleiro tabuleiroplayer = new TabuleiroPlayer();
        CartasDomino cartaDomino1 = new CartasDomino(CartasDomino.CartaDomino);
        CartasDomino cartaDomino2 = new CartasDomino(CartasDomino.CartaDomin00);


        while (true) {
            Console.limpaTela();
            Console.println(tabuleiroDomino);
            Console.println(tabuleiroplayer);
            Console.println("Você esta na posição (" + linha + "," + coluna + ")");
            Tecla atual = Console.getTecla();

            if (atual == Tecla.ESC) Console.saiDoPrograma();
            else if (atual == Tecla.RIGHT) coluna = (coluna + 1) %tabuleiroDomino.getTotalColunas();
            else if (atual == Tecla.LEFT) coluna = (coluna - 1 +tabuleiroDomino.getTotalColunas()) %tabuleiroDomino.getTotalColunas();
            else if (atual == Tecla.DOWN) linha = (linha + 1) %tabuleiroDomino.getTotalLinhas();
            else if (atual == Tecla.UP) linha = (linha - 1 + tabuleiroDomino.getTotalLinhas()) % tabuleiroDomino.getTotalLinhas();
            else if (atual == Tecla.ENTER) tabuleiroDomino.colocaCarta(linha,coluna,cartaDomino2);
            else if (coluna == 0) coluna = 1;
            else if (linha == 0) linha = 1;


        }

    }




}
