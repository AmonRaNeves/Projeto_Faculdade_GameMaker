import console.Console;
import console.Tecla;

import static console.Console.saiDoPrograma;

public class Principal {
    public static void main(String[] args) {
        Menu();

}

public static void Menu() {
    Jogo jogo = new Jogo();

    int numero = 0;
    boolean escolha = true;
    Tecla atual;

    while (escolha) {
        Console.limpaTela();
        switch (numero) {
            case 0:
                Console.println("|----Jogador (P1)----|\n \n Jogador (P2)\n Sair do jogo");
                if (Console.getTecla() == Tecla.DOWN)
                    numero = (numero + 1) % 3;
                else if (Console.getTecla() == Tecla.UP)
                    numero = (numero - 1 + 3) % 3;
                else if (Console.getTecla() == Tecla.ESPACO) {
                    jogo.RodandoJogo();
                    escolha = false;

                }
                break;

            case 1:
                Console.println("|Jogador (P1)|\n \n ----Jogador (P2)----\n Sair do jogo");
                if (Console.getTecla() == Tecla.DOWN)


                    break;


            case 2:
                Console.println("|Jogador (P1)|\n \n Jogador (P2)\n ----Sair do jogo----");
                Console.println("Até logo!");
                saiDoPrograma();
                break;


        }


    }


}
}