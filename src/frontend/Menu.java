package frontend;

import backend.Jogo;
import backend.TabuleiroDomino;
import console.Console;
import console.Tecla;

import static console.Console.getTecla;
import static console.Console.saiDoPrograma;

public class Menu {

    public static void Menu() {
        int numeroVar = 0;
        boolean escolha = true;

        Jogo jogo = new Jogo();



        while (escolha) {
            Console.limpaTela();
            Tecla atual = null;
            int pontuacao1 = 0;
            int pontuacao2 = 0;
            TabuleiroDomino tabuleiro1 = new TabuleiroDomino();
            switch (numeroVar) {
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
                    Console.println("  |----------------Selecione com Shift-----------------|");
                    atual = getTecla();

                    if (atual == Tecla.DOWN)
                        numeroVar = (numeroVar + 1) % 3;
                    else if (atual == Tecla.UP)
                        numeroVar = (numeroVar - 1 + 3) % 3;
                    else if (atual == Tecla.SHIFT) {
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
                    Console.println("  |----------------Selecione com Shift-----------------|");
                    atual = getTecla();

                    if (atual == Tecla.DOWN)
                        numeroVar = (numeroVar + 1) % 3;
                    else if (atual == Tecla.UP)
                        numeroVar = (numeroVar - 1 + 3) % 3;
                    else if (atual == Tecla.SHIFT) {
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
                    Console.println("  |----------------Selecione com Shift-----------------|");
                    atual = getTecla();

                    if (atual == Tecla.DOWN)
                        numeroVar = (numeroVar + 1) % 3;
                    else if (atual == Tecla.UP)
                        numeroVar = (numeroVar - 1 /*+ 3*/) % 3;
                    else if (atual == Tecla.SHIFT) {
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
