import console.Console;
import console.Tecla;

import static console.Console.getTecla;
import static console.Console.saiDoPrograma;

public class Principal {
    public static void main(String[] args) {
        Menu();

    }

    public static void Menu() {
        Jogo jogo = new Jogo();
        TabuleiroDomino tabuleiro1 = new TabuleiroDomino();

        int numero = 0;
        boolean escolha = true;

        while (escolha) {
            Console.limpaTela();
            Tecla atual = null;
            switch (numero) {
                case 0:
                    Console.println("  |----------------------------------------------------|");
                    Console.println("  |----█▀▀▀▀▄  █▀▀▀▀█  █▀▄ ▄▀█   ▀  █ ▄   █  █▀▀▀▀█----|");
                    Console.println("  |----█    █  █    █  █ ▀▄▀ █   █  █  ▀▄ █  █    █----|");
                    Console.println("  |----█    █  █    █  █     █   █  █ ▄   █  █    █----|");
                    Console.println("  |----█▄▄▄▄▀  █▄▄▄▄█  █     █   █  █  ▀▄ █  █▄▄▄▄█----|");
                    Console.println("  |----------------------------------------------------|");
                    Console.println("  |-----------------█▀▀▀▀▀▀▀█▀▀▀▀▀▀▀█------------------|");
                    Console.println("  |-----------------█ ● ● ● █ ● ● ● █------------------|");
                    Console.println("  |-----------------█ ● ● ● █ ● ● ● █------------------|");
                    Console.println("  |-----------------█▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█------------------|");
                    Console.println("  |----------------------------------------------------|");
                    Console.println("  |***************|---> Novo Jogo <---|****************| \n  |***************|   Carregar Jogo   |****************| \n  |***************|    Sair do Jogo   |****************| ");
                    Console.println("  |----------------------------------------------------|");
                    Console.println("  |-----------------█▀▀▀▀▀▀▀█▀▀▀▀▀▀▀█------------------|");
                    Console.println("  |-----------------█ ●     █ ● ● ● █------------------|");
                    Console.println("  |-----------------█     ● █ ● ● ● █------------------|");
                    Console.println("  |-----------------█▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█------------------|");
                    Console.println("  |----------------------------------------------------|");
                    atual = getTecla();

                    if (atual == Tecla.DOWN)
                        numero = (numero + 1) % 3;
                    else if (atual == Tecla.UP)
                        numero = (numero - 1 + 3) % 3;
                    else if (atual == Tecla.ENTER) {
                        Console.println(tabuleiro1);
                        jogo.RodandoJogo();

                        escolha = false;

                    }
                    break;

                case 1:
                    Console.println("  |----------------------------------------------------|");
                    Console.println("  |----█▀▀▀▀▄  █▀▀▀▀█  █▀▄ ▄▀█   ▀  █ ▄   █  █▀▀▀▀█----|");
                    Console.println("  |----█    █  █    █  █ ▀▄▀ █   █  █  ▀▄ █  █    █----|");
                    Console.println("  |----█    █  █    █  █     █   █  █ ▄   █  █    █----|");
                    Console.println("  |----█▄▄▄▄▀  █▄▄▄▄█  █     █   █  █  ▀▄ █  █▄▄▄▄█----|");
                    Console.println("  |----------------------------------------------------|");
                    Console.println("  |-----------------█▀▀▀▀▀▀▀█▀▀▀▀▀▀▀█------------------|");
                    Console.println("  |-----------------█ ●   ● █ ●   ● █------------------|");
                    Console.println("  |-----------------█ ●   ● █ ●   ● █------------------|");
                    Console.println("  |-----------------█▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█------------------|");
                    Console.println("  |----------------------------------------------------|");
                    Console.println("  |***************|     Novo Jogo     |****************| \n  |***************|-->Carregar Jogo<--|****************| \n  |***************|    Sair do Jogo   |****************| ");
                    Console.println("  |----------------------------------------------------|");
                    Console.println("  |-----------------█▀▀▀▀▀▀▀█▀▀▀▀▀▀▀█------------------|");
                    Console.println("  |-----------------█ ●     █ ●   ● █------------------|");
                    Console.println("  |-----------------█     ● █ ●   ● █------------------|");
                    Console.println("  |-----------------█▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█------------------|");
                    Console.println("  |----------------------------------------------------|");
                    atual = getTecla();

                    if (atual == Tecla.DOWN)
                        numero = (numero + 1) % 3;
                    else if (atual == Tecla.UP)
                        numero = (numero - 1 + 3) % 3;
                    else if (atual == Tecla.ENTER) {
                        Console.println(tabuleiro1);
                        jogo.RodandoJogo();

                        escolha = false;

                    }
                    break;

                case 2:
                    Console.println("  |----------------------------------------------------|");
                    Console.println("  |----█▀▀▀▀▄  █▀▀▀▀█  █▀▄ ▄▀█   ▀  █ ▄   █  █▀▀▀▀█----|");
                    Console.println("  |----█    █  █    █  █ ▀▄▀ █   █  █  ▀▄ █  █    █----|");
                    Console.println("  |----█    █  █    █  █     █   █  █ ▄   █  █    █----|");
                    Console.println("  |----█▄▄▄▄▀  █▄▄▄▄█  █     █   █  █  ▀▄ █  █▄▄▄▄█----|");
                    Console.println("  |----------------------------------------------------|");
                    Console.println("  |-----------------█▀▀▀▀▀▀▀█▀▀▀▀▀▀▀█------------------|");
                    Console.println("  |-----------------█       █       █------------------|");
                    Console.println("  |-----------------█       █       █------------------|");
                    Console.println("  |-----------------█▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█------------------|");
                    Console.println("  |----------------------------------------------------|");
                    Console.println("  |***************|     Novo Jogo     |****************| \n  |***************|   Carregar Jogo   |****************| \n  |***************| -> Sair do Jogo <-|****************| ");
                    Console.println("  |----------------------------------------------------|");
                    Console.println("  |-----------------█▀▀▀▀▀▀▀█▀▀▀▀▀▀▀█------------------|");
                    Console.println("  |-----------------█       █ ●   ● █------------------|");
                    Console.println("  |-----------------█       █ ●   ● █------------------|");
                    Console.println("  |-----------------█▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█------------------|");
                    Console.println("  |----------------------------------------------------|");
                    atual = getTecla();

                    if (atual == Tecla.DOWN)
                        numero = (numero + 1) % 3;
                    else if (atual == Tecla.UP)
                        numero = (numero - 1 /*+ 3*/) % 3;
                    else if (atual == Tecla.ENTER) {
                        Console.println("  |----------------------------------------------------|");
                        Console.println("  |--------──────▄▌▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌-------|");
                        Console.println("  |------ -───▄▄██▌█░░ O obrigado por jogar! ░░▌.------|");
                        Console.println("  |------- ▄▄▄▌▐██▌█░░  Creditos: Amon-Rá    ░░▌.------|");
                        Console.println("  |--------███████▌█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌-------|");
                        Console.println("  |------- ▀❍▀▀▀▀▀▀▀❍❍▀▀▀▀▀▀❍❍▀❍❍▀▀▀▀▀▀▀▀▀▀❍❍-------|");
                        saiDoPrograma();
                        escolha = false;

                    }
                    break;



            }


        }


    }
}