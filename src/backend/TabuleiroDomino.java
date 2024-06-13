package backend;

import cores.StringColorida;
import mecanicas.Carta;
import mecanicas.Tabuleiro;

public class TabuleiroDomino extends Tabuleiro {


    //Fundo do Tabuleiro
    static final StringColorida fundoTabuleiro2 = new StringColorida(" ▣" , "Verde");
    static final StringColorida deckDomino = new StringColorida(" ⍁" , "Verde");
    static final StringColorida vazio = new StringColorida("  ", "Branco");


    //Cordenadas Numeros
    static final StringColorida zero = new StringColorida(" 0", "Branco");
    static final StringColorida um = new StringColorida(" 1", "Branco");
    static final StringColorida dois = new StringColorida(" 2", "Branco");
    static final StringColorida tres = new StringColorida(" 3", "Branco");
    static final StringColorida quatro = new StringColorida(" 4", "Branco");
    static final StringColorida cinco = new StringColorida(" 5", "Branco");
    static final StringColorida seis = new StringColorida(" 6", "Branco");
    static final StringColorida sete = new StringColorida(" 7", "Branco");
    static final StringColorida oito = new StringColorida(" 8", "Branco");
    static final StringColorida nove = new StringColorida(" 9", "Branco");
    static final StringColorida dez = new StringColorida("10", "Branco");
    static final StringColorida onze = new StringColorida("11", "Branco");
    static final StringColorida doze = new StringColorida("12", "Branco");
    static final StringColorida treze = new StringColorida("13", "Branco");
    static final StringColorida quatorze = new StringColorida("14", "Branco");
    static final StringColorida quinze = new StringColorida("15", "Branco");
    static final StringColorida dezesseis = new StringColorida("16", "Branco");
    static final StringColorida dezessete = new StringColorida("17", "Branco");
    static final StringColorida dezoito = new StringColorida("18", "Branco");
    static final StringColorida dezenove = new StringColorida("19", "Branco");



    static final Carta fundo = new FundoTabuleiro(fundoTabuleiro2);



    //Tabuleiro
    public TabuleiroDomino () {
        super(15, 20, fundo);


        //Colunas do Tabuleiro
        setFundo(0, 0, new FundoTabuleiro(vazio));
        setFundo(0, 1, new FundoTabuleiro(um));
        setFundo(0, 2, new FundoTabuleiro(dois));
        setFundo(0, 3, new FundoTabuleiro(tres));
        setFundo(0, 4, new FundoTabuleiro(quatro));
        setFundo(0, 5, new FundoTabuleiro(cinco));
        setFundo(0, 6, new FundoTabuleiro(seis));
        setFundo(0, 7, new FundoTabuleiro(sete));
        setFundo(0, 8, new FundoTabuleiro(oito));
        setFundo(0, 9, new FundoTabuleiro(nove));
        setFundo(0, 10, new FundoTabuleiro(dez));
        setFundo(0, 11, new FundoTabuleiro(onze));
        setFundo(0, 12, new FundoTabuleiro(doze));
        setFundo(0, 13, new FundoTabuleiro(treze));
        setFundo(0, 14, new FundoTabuleiro(quatorze));
        setFundo(0, 15, new FundoTabuleiro(quinze));
        setFundo(0, 16, new FundoTabuleiro(dezesseis));
        setFundo(0, 17, new FundoTabuleiro(dezessete));
        setFundo(0, 18, new FundoTabuleiro(dezoito));
        setFundo(0, 19, new FundoTabuleiro(dezenove));



        //Linhas numéricas do tabuleiro
        setFundo(1, 0, new FundoTabuleiro(um));
        setFundo(2, 0, new FundoTabuleiro(dois));
        setFundo(3, 0, new FundoTabuleiro(tres));
        setFundo(4, 0, new FundoTabuleiro(quatro));
        setFundo(5, 0, new FundoTabuleiro(cinco));
        setFundo(6, 0, new FundoTabuleiro(seis));
        setFundo(7, 0, new FundoTabuleiro(sete));
        setFundo(8, 0, new FundoTabuleiro(oito));
        setFundo(9, 0, new FundoTabuleiro(nove));
        setFundo(13, 0, new FundoTabuleiro(treze));
        setFundo(14, 0, new FundoTabuleiro(quatorze));

        //Tabuleiro jogador
        setFundo(10, 0, new FundoTabuleiro(vazio));
        setFundo(10, 1, new FundoTabuleiro(vazio));
        setFundo(10, 2, new FundoTabuleiro(vazio));
        setFundo(10, 3, new FundoTabuleiro(vazio));
        setFundo(10, 4, new FundoTabuleiro(vazio));
        setFundo(10, 5, new FundoTabuleiro(vazio));
        setFundo(10, 6, new FundoTabuleiro(vazio));
        setFundo(10, 7, new FundoTabuleiro(vazio));
        setFundo(10, 8, new FundoTabuleiro(vazio));
        setFundo(10, 9, new FundoTabuleiro(vazio));
        setFundo(10, 10, new FundoTabuleiro(vazio));
        setFundo(10, 11, new FundoTabuleiro(vazio));
        setFundo(10, 12, new FundoTabuleiro(vazio));
        setFundo(10, 13, new FundoTabuleiro(vazio));
        setFundo(10, 14, new FundoTabuleiro(vazio));
        setFundo(10, 15, new FundoTabuleiro(vazio));
        setFundo(10, 16, new FundoTabuleiro(vazio));
        setFundo(10, 17, new FundoTabuleiro(vazio));
        setFundo(10, 18, new FundoTabuleiro(vazio));
        setFundo(10, 19, new FundoTabuleiro(vazio));

        setFundo(11, 0, new FundoTabuleiro(vazio));
        setFundo(11, 1, new FundoTabuleiro(vazio));
        setFundo(11, 2, new FundoTabuleiro(vazio));
        setFundo(11, 3, new FundoTabuleiro(vazio));
        setFundo(11, 4, new FundoTabuleiro(vazio));
        setFundo(11, 5, new FundoTabuleiro(vazio));
        setFundo(11, 6, new FundoTabuleiro(vazio));
        setFundo(11, 7, new FundoTabuleiro(vazio));
        setFundo(11, 8, new FundoTabuleiro(vazio));
        setFundo(11, 9, new FundoTabuleiro(vazio));
        setFundo(11, 10, new FundoTabuleiro(vazio));
        setFundo(11, 11, new FundoTabuleiro(vazio));
        setFundo(11, 12, new FundoTabuleiro(vazio));
        setFundo(11, 13, new FundoTabuleiro(vazio));
        setFundo(11, 14, new FundoTabuleiro(vazio));
        setFundo(11, 15, new FundoTabuleiro(vazio));
        setFundo(11, 16, new FundoTabuleiro(vazio));
        setFundo(11, 17, new FundoTabuleiro(vazio));
        setFundo(11, 18, new FundoTabuleiro(vazio));
        setFundo(11, 19, new FundoTabuleiro(vazio));

        setFundo(12, 0, new FundoTabuleiro(vazio));
        setFundo(12, 1, new FundoTabuleiro(vazio));
        setFundo(12, 2, new FundoTabuleiro(vazio));
        setFundo(12, 3, new FundoTabuleiro(vazio));
        setFundo(12, 4, new FundoTabuleiro(vazio));
        setFundo(12, 5, new FundoTabuleiro(vazio));
        setFundo(12, 6, new FundoTabuleiro(vazio));
        setFundo(12, 7, new FundoTabuleiro(vazio));
        setFundo(12, 8, new FundoTabuleiro(vazio));
        setFundo(12, 9, new FundoTabuleiro(vazio));
        setFundo(12, 10, new FundoTabuleiro(vazio));
        setFundo(12, 11, new FundoTabuleiro(vazio));
        setFundo(12, 12, new FundoTabuleiro(vazio));
        setFundo(12, 13, new FundoTabuleiro(vazio));
        setFundo(12, 14, new FundoTabuleiro(vazio));
        setFundo(12, 15, new FundoTabuleiro(vazio));
        setFundo(12, 16, new FundoTabuleiro(vazio));
        setFundo(12, 17, new FundoTabuleiro(vazio));
        setFundo(12, 18, new FundoTabuleiro(vazio));
        setFundo(12, 19, new FundoTabuleiro(vazio));




        //Cartas de dominó
        CartasDomino cartaDomino0 = new CartasDomino(0,0);
        CartasDomino cartaDomino1 = new CartasDomino (0,1);
        CartasDomino cartaDomino2 = new CartasDomino(0,2);
        CartasDomino cartaDomino3 = new CartasDomino(0,3);
        CartasDomino cartaDomino4 = new CartasDomino(0,4);
        CartasDomino cartaDomino5 = new CartasDomino(0,5);
        CartasDomino cartaDomino6 = new CartasDomino(0,6);
        CartasDomino cartaDomino11 = new CartasDomino(1,1);
        CartasDomino cartaDomino12 = new CartasDomino(1,2);
        CartasDomino cartaDomino13 = new CartasDomino(1,3);
        CartasDomino cartaDomino14 = new CartasDomino(1,4);
        CartasDomino cartaDomino15 = new CartasDomino(1,5);
        CartasDomino cartaDomino16 = new CartasDomino(1,6);
        CartasDomino cartaDomino22 = new CartasDomino(2,2);
        CartasDomino cartaDomino23 = new CartasDomino(2,3);
        CartasDomino cartaDomino24 = new CartasDomino(2,4);
        CartasDomino cartaDomino25 = new CartasDomino(2,5);
        CartasDomino cartaDomino26 = new CartasDomino(2,6);
        CartasDomino cartaDomino33 = new CartasDomino(3,3);
        CartasDomino cartaDomino34 = new CartasDomino(3,4);
        CartasDomino cartaDomino35 = new CartasDomino(3,5);
        CartasDomino cartaDomino36 = new CartasDomino(3,6);
        CartasDomino cartaDomino44 = new CartasDomino(4,4);
        CartasDomino cartaDomino45 = new CartasDomino(4,5);
        CartasDomino cartaDomino46 = new CartasDomino(4,6);
        CartasDomino cartaDomino55 = new CartasDomino(5,5);
        CartasDomino cartaDomino56 = new CartasDomino(5,6);
        CartasDomino cartaDomino66 = new CartasDomino(6,6);



        //PilhaDeDomino

        setFundo(9, 19, new FundoTabuleiro(deckDomino));
        colocaCarta(9,19, cartaDomino0);
        colocaCarta(9, 19, cartaDomino1);
        colocaCarta(9, 19, cartaDomino2);
        colocaCarta(9, 19, cartaDomino3);
        colocaCarta(9, 19, cartaDomino4);
        colocaCarta(9, 19, cartaDomino5);
        colocaCarta(9, 19, cartaDomino6);
        colocaCarta(9, 19, cartaDomino11);
        colocaCarta(9, 19, cartaDomino12);
        colocaCarta(9, 19, cartaDomino13);
        colocaCarta(9, 19, cartaDomino14);
        colocaCarta(9, 19, cartaDomino15);
        colocaCarta(9, 19, cartaDomino16);
        colocaCarta(9, 19, cartaDomino22);
        colocaCarta(9, 19, cartaDomino23);
        colocaCarta(9, 19, cartaDomino24);
        colocaCarta(9, 19, cartaDomino25);
        colocaCarta(9, 19, cartaDomino26);
        colocaCarta(9, 19, cartaDomino33);
        colocaCarta(9, 19, cartaDomino34);
        colocaCarta(9, 19, cartaDomino35);
        colocaCarta(9, 19, cartaDomino36);
        colocaCarta(9, 19, cartaDomino44);
        colocaCarta(9, 19, cartaDomino45);
        colocaCarta(9, 19, cartaDomino46);
        colocaCarta(9, 19, cartaDomino55);
        colocaCarta(9, 19, cartaDomino56);
        colocaCarta(9, 19, cartaDomino66);

    }

}