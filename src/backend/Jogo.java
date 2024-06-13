package backend;

import console.Console;
import console.Tecla;
import mecanicas.Carta;
import mecanicas.PilhaDeCartas;
import mecanicas.Tabuleiro;

import static console.Console.getTecla;
import static frontend.Menu.Menu;

public class Jogo {
    //Variaveis
    int Jogador1 = 1, Jogador2 = 2;
    int estadoAtual = 1;

    int pontuacao1 = 0;
    int pontuacao2 = 0;

    int linha;
    int coluna;
    int numeroVar = 0;


    int compra = 0;
    int compra2 = 0;
    int escolha = 1;
    int acrescenta1 = 2;
    int acrescenta2 = 2;
    int acrescenta3 = 2;
    int acrescenta4 = 2;

    int peca = 0;

    int acrescentapossicao1player2 = 1;
    int acrescentaponto = 1;
    int numero = 0;

    Carta mao1 = null;
    Carta pilha1 = null;

    Carta mao2 = null;
    Carta pilha2 = null;

    Tabuleiro tabuleiro1 = new TabuleiroDomino();

    PilhaDeCartas pilhaDeDomino = new PilhaDecartas(0);


    public void RodandoJogo() {



        // Estado for 0 coloca Player1 para jogar

        //While para me mover no tabuleiro
        while (true) {

            Vencedor(pontuacao1, pontuacao2);

            //Tabuleiro no console e indicações e opções
            Console.limpaTela();
            Console.println(tabuleiro1);
            Console.println("Use as setas para mover e espaço para jogar");
            Console.println("Regra: Vence aquele que ter menos peças na sua linha: 13 player=1, 14 = player2 e a pilha de carta estiver 0 dominós");
            Console.println("Player 1 começa");
            Console.println("Coloque as peças na posição correta e não ROUBE!!!");
            Console.println("|---------------------------------------|");
            Console.println("Na pilha de compra tem: "+ tabuleiro1.getPilha(9,19).getTamanho()+" Peças");
            Console.println("Você esta na posição(" + coluna + "," + linha + ")");
            Console.println("Pontuação do jogador 1: " + pontuacao1);
            Console.println("Pontuação do jogador 2: " + pontuacao2);
            Console.println("Mecânicas para os dois Player:");
            Console.println("Aperte B para embaralhar a pilha de dominó");
            Console.println("Aperte V para virar a peça do dominó");
            Tecla atual = Console.getTecla();



            //Sair do programa
            if (atual == Tecla.ESC) Console.saiDoPrograma();

            //Embaralha pilha de dominó
            if (atual == Tecla.B) tabuleiro1.getPilha(9, 19).embaralha();

            //Comando de movimentar pelo console
            if (atual == Tecla.RIGHT) coluna = (coluna + 1) % tabuleiro1.getTotalColunas();
            if (atual == Tecla.LEFT) coluna = (coluna - 1 + tabuleiro1.getTotalColunas()) % tabuleiro1.getTotalColunas();
            if (atual == Tecla.DOWN) linha = (linha + 1) % tabuleiro1.getTotalLinhas();
            if (atual == Tecla.UP) linha = (linha - 1 + tabuleiro1.getTotalLinhas()) % tabuleiro1.getTotalLinhas();
            if (atual == Tecla.V) tabuleiro1.getPilha(linha,coluna).verTopo().vira();
            if (coluna == 0) coluna = 1;
            if (linha == 0) linha = 1;
            if (coluna >= 19) coluna = 1;
            if (linha == 10) linha = 13;
            if (linha == 12) linha = 9;



            //Pause do jogo
            if (atual == Tecla.P) Pausa(linha, coluna, tabuleiro1, pontuacao1, pontuacao2);

            if (atual == Tecla.ESPACO){
                if (estadoAtual == 1){
                    Player1(tabuleiro1);
                }
                else{
                    Player2(tabuleiro1);

                }
            }
        }
    }



    public void Player1(Tabuleiro tabuleiro1){

        Tecla atual = null;
        Console.println("|---------------------------------------|");
        Console.println("Jogador 1 sua vez!" + "\n Espaço - Comprar peça" + "\n L - Passa vez" + "\n R - Pega peça" + "\n E - Colocar peça " + "\n P - Pausa ");
        Console.println("Ultima carta na mão: "+ mao1);
        atual = Console.getTecla();

        // Quando aperta ESPACO você compra a carta é colocada na "mão"
        if (atual == Tecla.ESPACO) {

                if (compra <= 10) {
                    pilha1 = tabuleiro1.pegaCarta(9, 19);
                    pontuacao1 = pontuacao1 + 1;
                    tabuleiro1.colocaCarta(13, 1 + ++acrescenta1, pilha1);
                    compra = compra + 1;
                    estadoAtual = 2;
                }
                else if (compra >= 11) {
                    pilha1 = tabuleiro1.pegaCarta(9, 19);
                    tabuleiro1.colocaCarta(13, 1 + ++acrescenta2, pilha1);
                    pontuacao1 = pontuacao1 + 1;
                    compra = compra + 1;
                    estadoAtual = 2;
                }

                RodandoJogo();

        }

        //Quando ele aperta L passa a vez.
        else if (atual == Tecla.L){
            estadoAtual = 2;
        }

        //Quando ele aperta R passa a vez.
        else if(atual == Tecla.R){
            mao1 = tabuleiro1.pegaCarta(linha, coluna);

        }
        //Quando ele aperta E coloca a carta no tabuleiro.
        else if(atual == Tecla.E){
            tabuleiro1.colocaCarta(linha,coluna,mao1);
            pontuacao1 = pontuacao1 - 1;
            estadoAtual = 2;

        }

    }

    public void Player2(Tabuleiro tabuleiro1){
        Console.println("|---------------------------------------|");
        Console.println("Jogador 2 sua vez!" + "\n Numero 0 - Comprar peça " + "\n Numero 1 - Passe vez" + "\n Numero 2 - Pega peça" + "\n Numero 3 - Coloca peça" + "\n P - Pausa");
        Console.println("Ultima carta na mão: "+ mao2);
        Tecla atual = null;
        atual = Console.getTecla();

        // Quando aperte 2 você compra a carta é colocada na "mão"
        if (estadoAtual == 2) {
            if (atual == Tecla.NUM_0) {
                if (compra2 <= 10) {
                    pilha2 = tabuleiro1.pegaCarta(9, 19);
                    pontuacao2 = pontuacao2 + 1;
                    tabuleiro1.colocaCarta(14, 1 + ++acrescenta3, pilha2);
                    compra2 = compra2 + 1;
                    estadoAtual = 1;
                }
                else if (compra2 >= 11) {
                    pilha1 = tabuleiro1.pegaCarta(9, 19);
                    tabuleiro1.colocaCarta(14, 1 + ++acrescenta4, pilha1);
                    pontuacao1 = pontuacao1 + 1;
                    compra = compra + 1;
                    estadoAtual = 1;
                }
                RodandoJogo();

            }
            //Quando ele aperta 1 passa a vez.
            else if (atual == Tecla.NUM_1){
                estadoAtual = 1;
            }
            //Quando ele aperta 2 passa a vez.
            else if(atual == Tecla.NUM_2){
                mao2 = tabuleiro1.pegaCarta(linha, coluna);

            }
            //Quando ele aperta 3 coloca a carta no tabuleiro.
            else if(atual == Tecla.NUM_3) {
                tabuleiro1.colocaCarta(linha, coluna, mao2);
                pontuacao2 = pontuacao2 - 1;
                estadoAtual = 1;
            }

        }

    }

    public void Pausa (int linha, int coluna, Tabuleiro tabuleiro1, int pontuacao1,int pontuacao2){
                //Variaveis
                boolean running = true;
                //Instanciando Classe backend.Jogo
                Jogo jogo = new Jogo();

                //While Rodando o frontend.Menu Principal
                while (running) {
                    Console.limpaTela();
                    //Principal principal = new Principal();
                    Tecla tecla = null;
                    switch (numero) {

                        //Opção Retoma para o jogo atual
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
                            Console.println("  |----------------------------------------------------|");
                            Console.println("  |-----------------█▀▀▀▀▀▀▀█▀▀▀▀▀▀▀█------------------|");
                            Console.println("  |-----------------█ ●     █ ● ● ● █------------------|");
                            Console.println("  |-----------------█     ● █ ● ● ● █------------------|");
                            Console.println("  |-----------------█▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█------------------|");
                            Console.println("  |----------------------------------------------------|");

                            Console.println("               -->Retomar Jogo"
                                    + "\n               Carregar Jogo"
                                    + "\n               Salvar Jogo"
                                    + "\n               Novo Jogo"
                                    + "\n               Menu Principal"
                                    + "\n               Sair Jogo");
                            tecla = getTecla();
                            if (tecla == Tecla.DOWN)
                                numero = (numero + 1) % 6;
                            else if (tecla == Tecla.UP)
                                numero = (numero - 1 + 6) % 6;
                            else if (tecla == Tecla.SHIFT) {
                                jogo.RodandoJogo();
                                running = false;
                            }
                            break;

                        //Opção Carregar backend.Jogo Salvo
                        case 1:
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
                            Console.println("  |----------------------------------------------------|");
                            Console.println("  |-----------------█▀▀▀▀▀▀▀█▀▀▀▀▀▀▀█------------------|");
                            Console.println("  |-----------------█ ●     █ ● ● ● █------------------|");
                            Console.println("  |-----------------█     ● █ ● ● ● █------------------|");
                            Console.println("  |-----------------█▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█------------------|");
                            Console.println("  |----------------------------------------------------|");

                            Console.println("               Retomar Jogo"
                                    + "\n               -->Carregar Jogo"
                                    + "\n               Salvar Jogo"
                                    + "\n               Novo Jogo"
                                    + "\n               Menu Principal"
                                    + "\n               Sair Jogo");
                            tecla = getTecla();
                            if (tecla == Tecla.DOWN)
                                numero = (numero + 1) % 6;
                            else if (tecla == Tecla.UP)
                                numero = (numero - 1 + 6) % 6;
                            break;

                        //Opção Salva Jogo atual
                        case 2:
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
                            Console.println("  |----------------------------------------------------|");
                            Console.println("  |-----------------█▀▀▀▀▀▀▀█▀▀▀▀▀▀▀█------------------|");
                            Console.println("  |-----------------█ ●     █ ● ● ● █------------------|");
                            Console.println("  |-----------------█     ● █ ● ● ● █------------------|");
                            Console.println("  |-----------------█▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█------------------|");
                            Console.println("  |----------------------------------------------------|");

                            Console.println("               Retomar Jogo"
                                    + "\n               Carregar Jogo"
                                    + "\n               -->Salvar Jogo"
                                    + "\n               Novo Jogo"
                                    + "\n               Menu Principal"
                                    + "\n               Sair Jogo");
                            tecla = getTecla();
                            if (tecla == Tecla.DOWN)
                                numero = (numero + 1) % 6;
                            else if (tecla == Tecla.UP)
                                numero = (numero - 1 + 6) % 6;
                            break;

                        //Opção Iniciar novo jogo
                        case 3:
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
                            Console.println("  |----------------------------------------------------|");
                            Console.println("  |-----------------█▀▀▀▀▀▀▀█▀▀▀▀▀▀▀█------------------|");
                            Console.println("  |-----------------█ ●     █ ● ● ● █------------------|");
                            Console.println("  |-----------------█     ● █ ● ● ● █------------------|");
                            Console.println("  |-----------------█▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█------------------|");
                            Console.println("  |----------------------------------------------------|");

                            Console.println("               Retomar Jogo"
                                    + "\n               Carregar Jogo"
                                    + "\n               Salvar Jogo"
                                    + "\n               -->Novo Jogo"
                                    + "\n               Menu Principal"
                                    + "\n               Sair Jogo");
                            tecla = getTecla();
                            if (tecla == Tecla.DOWN)
                                numero = (numero + 1) % 6;
                            else if (tecla == Tecla.UP)
                                numero = (numero - 1 + 6) % 6;
                            else if (tecla == Tecla.SHIFT) {
                                Console.limpaTela();
                                Console.println("\n\n\n\n       O progresso atual sera perdido!!!"
                                        + "\n              Tem certeza???"
                                        + "\n                 S     N");
                                tecla = getTecla();
                                if (tecla == Tecla.S) {
                                    Tabuleiro tabuleiro2 = new TabuleiroDomino();
                                    jogo.RodandoJogo();
                                } else jogo.Pausa(linha, coluna, tabuleiro1, pontuacao1,pontuacao2);
                            }
                            break;

                        //Opção Volta para o menu principal
                        case 4:
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
                            Console.println("  |----------------------------------------------------|");
                            Console.println("  |-----------------█▀▀▀▀▀▀▀█▀▀▀▀▀▀▀█------------------|");
                            Console.println("  |-----------------█ ●     █ ● ● ● █------------------|");
                            Console.println("  |-----------------█     ● █ ● ● ● █------------------|");
                            Console.println("  |-----------------█▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█------------------|");
                            Console.println("  |----------------------------------------------------|");
                            Console.println("               Retomar Jogo"
                                    + "\n               Carregar Jogo"
                                    + "\n               Salvar Jogo"
                                    + "\n               Novo Jogo"
                                    + "\n               -->Menu Principal"
                                    + "\n               Sair Jogo");
                            tecla = getTecla();
                            if (tecla == Tecla.DOWN)
                                numero = (numero + 1) % 6;
                            else if (tecla == Tecla.UP)
                                numero = (numero - 1 + 6) % 6;
                            else if (tecla == Tecla.SHIFT) {
                                Console.limpaTela();
                                Console.println("\n\n\n\n       Voltar para o Menu fara com que o progresso atual seja perdido!!!"
                                        + "\n                           Deseja Continuar????"
                                        + "\n                               S       N");
                                tecla = getTecla();
                                if (tecla == Tecla.S) Menu();
                                else jogo.Pausa(linha, coluna, tabuleiro1,pontuacao1,pontuacao2);
                            }
                            break;

                        //Opção Sair do backend.Jogo
                        case 5:
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
                            Console.println("  |----------------------------------------------------|");
                            Console.println("  |-----------------█▀▀▀▀▀▀▀█▀▀▀▀▀▀▀█------------------|");
                            Console.println("  |-----------------█ ●     █ ● ● ● █------------------|");
                            Console.println("  |-----------------█     ● █ ● ● ● █------------------|");
                            Console.println("  |-----------------█▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█------------------|");
                            Console.println("  |----------------------------------------------------|");

                            Console.println("               Retomar Jogo"
                                    + "\n               Carregar Jogo"
                                    + "\n               Salvar Jogo"
                                    + "\n               Novo Jogo"
                                    + "\n               Menu Principal"
                                    + "\n               -->Sair Jogo");
                            tecla = getTecla();
                            if (tecla == Tecla.DOWN)
                                numero = (numero + 1) % 6;
                            else if (tecla == Tecla.UP)
                                numero = (numero - 1 + 6) % 6;
                            else if (tecla == Tecla.SHIFT) {
                                running = false;
                                Console.saiDoPrograma();
                            }
                            break;

                    }

                }
    }

    public void Vencedor(int pontuacao1, int pontuacao2) {
        if (tabuleiro1.getPilha(9,19).getTamanho() == 0) {
            if (pontuacao1 < pontuacao2) {
                Console.limpaTela();
                Console.println("Jogador 1 Vencedor!!!");
                Console.saiDoPrograma();
            } else {
                Console.limpaTela();
                Console.println("Jogador 2 Vencedor!!!");
                Console.saiDoPrograma();
            }
        }

    }
}



