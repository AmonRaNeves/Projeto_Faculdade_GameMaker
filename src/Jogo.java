import console.Console;
import console.Tecla;
import mecanicas.Carta;
import mecanicas.Tabuleiro;

public class Jogo {
    int linha = 0, coluna = 0;
    int numero = 0;

    public void RodandoJogo() {
        Tabuleiro tabuleiroDomino = new TabuleiroDomino();
        CartasDomino cartaDomino1 = new CartasDomino(CartasDomino.CartaDomino1);
        CartasDomino cartaDomino2 = new CartasDomino(CartasDomino.CartaDomino2);


        while (true) {
            Console.limpaTela();
            Console.println(tabuleiroDomino);
            Console.println("Você esta na posição (" + linha + "," + coluna + ")");
            Tecla atual = Console.getTecla();

            if (atual == Tecla.ESC) Console.saiDoPrograma();
            if (atual == Tecla.RIGHT) coluna = (coluna + 1) %tabuleiroDomino.getTotalColunas();
            if (atual == Tecla.LEFT) coluna = (coluna - 1 +tabuleiroDomino.getTotalColunas()) %tabuleiroDomino.getTotalColunas();
            if (atual == Tecla.DOWN) linha = (linha + 1) %tabuleiroDomino.getTotalLinhas();
            if (atual == Tecla.UP) linha = (linha - 1 + tabuleiroDomino.getTotalLinhas()) % tabuleiroDomino.getTotalLinhas();
            //if (atual == Tecla.ENTER) tabuleiroDomino[linha][coluna] = cartaDomino2;
            if (coluna == 0) coluna = 1;
            if (linha == 0) linha = 1;
        }


    }




}
