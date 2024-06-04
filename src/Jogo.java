import console.Console;
import console.Tecla;
import cores.Cor;
import cores.StringColorida;
import mecanicas.Carta;
import mecanicas.PilhaDeCartas;
import mecanicas.Tabuleiro;

public class Jogo {
    int linha = 0, coluna = 0;
    int numero = 0;
    Tabuleiro tabuleiroDomino = new TabuleiroDomino();
    PilhaDeCartas mao = null;



    public void RodandoJogo() {
        PilhaDecartas pilhadecartas = new PilhaDecartas();
        CartasDomino cartaDomino1 = new CartasDomino(CartasDomino.CartaDomino01);
        CartasDomino cartaDomino2 = new CartasDomino(CartasDomino.CartaDomino02);
        CartasDomino cartaDomino3 = new CartasDomino(CartasDomino.CartaDomino03);
        CartasDomino cartaDomino4 = new CartasDomino(CartasDomino.CartaDomino04);
        CartasDomino cartaDomino5 = new CartasDomino(CartasDomino.CartaDomino05);
        CartasDomino cartaDomino6 = new CartasDomino(CartasDomino.CartaDomino06);
        CartasDomino cartaDomino10 = new CartasDomino(CartasDomino.CartaDomino10);
        CartasDomino cartaDomino11 = new CartasDomino(CartasDomino.CartaDomino11);
        CartasDomino cartaDomino12 = new CartasDomino(CartasDomino.CartaDomino12);
        CartasDomino cartaDomino13 = new CartasDomino(CartasDomino.CartaDomino13);
        CartasDomino cartaDomino14 = new CartasDomino(CartasDomino.CartaDomino14);
        CartasDomino cartaDomino15 = new CartasDomino(CartasDomino.CartaDomino15);
        CartasDomino cartaDomino16 = new CartasDomino(CartasDomino.CartaDomino16);
        CartasDomino cartaDomino20 = new CartasDomino(CartasDomino.CartaDomino20);
        CartasDomino cartaDomino21 = new CartasDomino(CartasDomino.CartaDomino21);
        CartasDomino cartaDomino22 = new CartasDomino(CartasDomino.CartaDomino22);
        CartasDomino cartaDomino23 = new CartasDomino(CartasDomino.CartaDomino23);
        CartasDomino cartaDomino24 = new CartasDomino(CartasDomino.CartaDomino24);
        CartasDomino cartaDomino25 = new CartasDomino(CartasDomino.CartaDomino25);
        CartasDomino cartaDomino26 = new CartasDomino(CartasDomino.CartaDomino26);
        CartasDomino cartaDomino30 = new CartasDomino(CartasDomino.CartaDomino30);
        CartasDomino cartaDomino31 = new CartasDomino(CartasDomino.CartaDomino31);
        CartasDomino cartaDomino32 = new CartasDomino(CartasDomino.CartaDomino32);
        CartasDomino cartaDomino33 = new CartasDomino(CartasDomino.CartaDomino33);
        CartasDomino cartaDomino34 = new CartasDomino(CartasDomino.CartaDomino34);
        CartasDomino cartaDomino35 = new CartasDomino(CartasDomino.CartaDomino35);
        CartasDomino cartaDomino36 = new CartasDomino(CartasDomino.CartaDomino36);
        CartasDomino cartaDomino40 = new CartasDomino(CartasDomino.CartaDomino40);
        CartasDomino cartaDomino41 = new CartasDomino(CartasDomino.CartaDomino41);
        CartasDomino cartaDomino42 = new CartasDomino(CartasDomino.CartaDomino42);
        CartasDomino cartaDomino43 = new CartasDomino(CartasDomino.CartaDomino43);
        CartasDomino cartaDomino44 = new CartasDomino(CartasDomino.CartaDomino44);
        CartasDomino cartaDomino45 = new CartasDomino(CartasDomino.CartaDomino45);
        CartasDomino cartaDomino46 = new CartasDomino(CartasDomino.CartaDomino46);
        CartasDomino cartaDomino50 = new CartasDomino(CartasDomino.CartaDomino50);
        CartasDomino cartaDomino51 = new CartasDomino(CartasDomino.CartaDomino51);
        CartasDomino cartaDomino52 = new CartasDomino(CartasDomino.CartaDomino52);
        CartasDomino cartaDomino53 = new CartasDomino(CartasDomino.CartaDomino53);
        CartasDomino cartaDomino54 = new CartasDomino(CartasDomino.CartaDomino54);
        CartasDomino cartaDomino55 = new CartasDomino(CartasDomino.CartaDomino55);
        CartasDomino cartaDomino56 = new CartasDomino(CartasDomino.CartaDomino56);
        CartasDomino cartaDomino60 = new CartasDomino(CartasDomino.CartaDomino60);
        CartasDomino cartaDomino61 = new CartasDomino(CartasDomino.CartaDomino61);
        CartasDomino cartaDomino62 = new CartasDomino(CartasDomino.CartaDomino62);
        CartasDomino cartaDomino63 = new CartasDomino(CartasDomino.CartaDomino63);
        CartasDomino cartaDomino64 = new CartasDomino(CartasDomino.CartaDomino64);
        CartasDomino cartaDomino65 = new CartasDomino(CartasDomino.CartaDomino65);
        CartasDomino cartaDomino66 = new CartasDomino(CartasDomino.CartaDomino66);


        //Pilha de Dominó

        tabuleiroDomino.colocaCarta(9,9,cartaDomino1);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino2);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino3);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino4);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino5);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino6);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino10);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino11);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino12);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino13);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino14);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino15);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino16);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino20);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino21);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino22);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino23);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino24);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino25);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino26);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino30);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino31);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino32);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino33);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino34);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino35);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino36);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino40);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino41);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino42);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino43);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino44);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino45);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino46);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino50);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino51);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino52);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino53);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino54);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino55);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino56);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino60);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino61);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino62);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino63);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino64);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino65);
        tabuleiroDomino.colocaCarta(9,9,cartaDomino66);


        while (true) {
            Console.limpaTela();
            Console.println(tabuleiroDomino);
            Console.println(pilhadecartas);
            Console.println("Você esta na posição (" + linha + "," + coluna + ")");
            Console.println("Na compra á: "+ pilhadecartas.getTamanho());
            Console.println("Comprar carta com E: " );
            Tecla atual = Console.getTecla();

            //Mecânicas
            if (atual == Tecla.ESC) Console.saiDoPrograma();
            else if (atual == Tecla.RIGHT) coluna = (coluna + 1) %tabuleiroDomino.getTotalColunas();
            else if (atual == Tecla.LEFT) coluna = (coluna - 1 +tabuleiroDomino.getTotalColunas()) %tabuleiroDomino.getTotalColunas();
            else if (atual == Tecla.DOWN) linha = (linha + 1) %tabuleiroDomino.getTotalLinhas();
            else if (atual == Tecla.UP) linha = (linha - 1 + tabuleiroDomino.getTotalLinhas()) % tabuleiroDomino.getTotalLinhas();
            else if (atual == Tecla.ENTER) tabuleiroDomino.colocaCarta(linha,coluna,cartaDomino1);
            else if (atual == Tecla.R) tabuleiroDomino.pegaCarta(linha,coluna);
            else if (atual == Tecla.L) tabuleiroDomino.getPilha(9,9).embaralha();
            else if (coluna == 0) coluna = 1;
            else if (linha == 0) linha = 1;
            pausa(50);






        }

    }

    public void ArmazenaCarta(int linha, int coluna, Tabuleiro TabuleiroDomino){
        boolean opcao = true;

        while(opcao){
                Jogo jogo = new Jogo();

                int mao = 0;
                Tecla atual = Console.getTecla();

                Console.limpaTela();
                Console.println(TabuleiroDomino);

                switch (numero){
                    case 1:
                    if (atual == Tecla.B)
                        mao = tabuleiroDomino.getPilha(9,9).compra(1).getTamanho();

                    //tabuleiroDomino.colocaCarta(9,2,mao);

                }
                break;



        }

    }

    public static void pausa(int tempo) {
        Tecla atual = Console.getTecla();
       // Console.limpaTela();



            if (atual == Tecla.P) Thread.sleep(tempo);
            Console.println("jogo pausado");
            Console.limpaTela();
            if (atual == Tecla.O)
            Console.println("A pausa foi interrompida");
            Thread.currentThread().interrupt();
        /* catch (InterruptedException e) {
            // Trata a interrupção, se ocorrer
            Console.println("A pausa foi interrompida");
            Thread.currentThread().interrupt();*/
        }
    }
}



