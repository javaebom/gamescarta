/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FreeCell;

import jogo.classescomum.Carta;
import jogo.classescomum.Fileira;
import jogo.classescomum.Fundacao;
import jogo.freecell.Celula;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe de Teste para validar movimentação de cartas cujo destino é uma pilha fileira
 * @author Fernanda e Igo
 */
public class TesteRegrasFileiras {

    Fileira fileira1 = new Fileira();
    Fileira fileira2 = new Fileira();
    Fundacao fundacao1 = new Fundacao();
    Celula celula1 = new Celula();
    Celula celula2 = new Celula();
    Celula celula3 = new Celula();

    public TesteRegrasFileiras() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    /**
     * Método que testa movimentação de carta entre fileiras, sendo a carta da pilha de origem
     * com valor MENOR que a carta da pilha de destino e com CORES ALTERNADAS: MOVIMENTAÇÃO DEVE SER VALIDADA
     */
    @Test
    public void testeMoverCartaDescendenteDeCorAlternada() {


        //Montando fileira 1
        Carta carta3Ouro = new Carta();
        Carta carta11Espada = new Carta();
        Carta carta1Paus = new Carta();
        Carta carta3Paus = new Carta();
        carta3Ouro.setCarta(3, "OURO");
        carta11Espada.setCarta(11, "ESPADA");
        carta1Paus.setCarta(1, "PAUS");
        carta3Paus.setCarta(3, "PAUS");
        //Esta fileira tem como topo: 3 Paus e Base: 3 Ouro
        fileira1.getPilha().push(carta3Ouro);
        fileira1.getPilha().push(carta11Espada);
        fileira1.getPilha().push(carta1Paus);
        fileira1.getPilha().push(carta3Paus);


        //Montando fileira 2
        Carta carta3Copas = new Carta();
        Carta carta10Espada = new Carta();
        Carta carta5Paus = new Carta();
        Carta carta2Copas = new Carta();
        carta3Copas.setCarta(3, "COPAS");
        carta10Espada.setCarta(10, "ESPADA");
        carta5Paus.setCarta(5, "PAUS");
        carta2Copas.setCarta(2, "COPAS");
        //Esta fileira tem como topo: 2 Copas e Base: 3 Copas
        fileira2.getPilha().push(carta3Copas);
        fileira2.getPilha().push(carta10Espada);
        fileira2.getPilha().push(carta5Paus);
        fileira2.getPilha().push(carta2Copas);


        /*
         * Movendo carta2Copas da fileira2 para fileira1, que possui no topo carta3Paus
        MOVIMENTACAO VÁLIDA pois 2 < 3 e Copas e Paus possuem corem alternadas
         */
        assertTrue(fileira1.verifyRule(2, "COPAS", fileira2));




    }

    /**
     * Método que testa a movimentação de carta da fundação para fileira, sendo a carta da pilha de origem
     * com valor MENOR que a carta da pilha de destino e ambas com MESMA COR: MOVIMENTAÇÃO DEVE SER INVALIDADA
     */
    @Test
    public void testeMoverCartaDescendenteDeMesmaCor() {


        //Montando fileira 1
        Carta carta3Ouro = new Carta();
        Carta carta11Espada = new Carta();
        Carta carta7Paus = new Carta();
        Carta carta3Paus = new Carta();
        carta3Ouro.setCarta(3, "OURO");
        carta11Espada.setCarta(11, "ESPADA");
        carta7Paus.setCarta(7, "PAUS");
        carta3Paus.setCarta(3, "PAUS");

        //Esta fileira tem como topo: 3 Paus e Base: 3 Ouro
        fileira1.getPilha().push(carta3Ouro);
        fileira1.getPilha().push(carta11Espada);
        fileira1.getPilha().push(carta7Paus);
        fileira1.getPilha().push(carta3Paus);


        //Montando fundacao
        Carta carta1Paus = new Carta();
        Carta carta2Paus = new Carta();
        carta1Paus.setCarta(1, "PAUS");
        carta2Paus.setCarta(2, "PAUS");

        //Esta fundacao tem como topo: 2 Paus e Base: 1 Paus
        fundacao1.getPilha().push(carta1Paus);
        fundacao1.getPilha().push(carta2Paus);


        /*
        Movendo carta2Paus da fileira2 para fileira1, que possui no topo carta3Paus
        MOVIMENTACAO INVÁLIDA, pois apesar de 2<3, ambas são de Paus (possuindo mesma cor)
         *
         */
        assertFalse(fileira1.verifyRule(2, "PAUS", fundacao1));




    }

    /**
     * Método que testa movimentação de carta de uma celula para uma fileira, sendo a carta da pilha de origem
     * com valor MAIOR que a carta da pilha de destino: MOVIMENTAÇÃO DEVE SER INVALIDADA
     */
    @Test
    public void testeMoverCartaAscendente() {

        //Montando fileira 1
        Carta carta3Ouro = new Carta();
        Carta carta11Espada = new Carta();
        Carta carta1Paus = new Carta();
        Carta carta3Paus = new Carta();
        carta3Ouro.setCarta(3, "OURO");
        carta11Espada.setCarta(11, "ESPADA");
        carta1Paus.setCarta(1, "PAUS");
        carta3Paus.setCarta(3, "PAUS");

        //Esta fileira tem como topo: 3 Paus e Base: 3 Ouro
        fileira1.getPilha().push(carta3Ouro);
        fileira1.getPilha().push(carta11Espada);
        fileira1.getPilha().push(carta1Paus);
        fileira1.getPilha().push(carta3Paus);


        //Montando celula ocupada
        Carta carta8Ouro = new Carta();
        carta8Ouro.setCarta(8, "OURO");

        //Esta celula tem como topo: 8 Ouro
        celula1.getPilha().push(carta8Ouro);


        /*
        Movendo carta8Ouro da fileira2 para fileira1, que possui no topo carta3Paus
        MOVIMENTACAO INVÁLIDA, pois apesar de 8>3
         *
         */
        assertFalse(fileira1.verifyRule(8, "OURO", celula1));
    }

    /**
     * Método que testa movimentação de mais de uma carta de uma fileira para outra
     */
    @Test
    public void testeMoverCartas() {
        //Montando fileira 1
        Carta carta3Ouro = new Carta();
        Carta carta11Espada = new Carta();
        Carta carta1Paus = new Carta();
        Carta carta9Copas = new Carta();
        carta3Ouro.setCarta(3, "OURO");
        carta11Espada.setCarta(11, "ESPADA");
        carta1Paus.setCarta(1, "PAUS");
        carta9Copas.setCarta(9, "COPAS");

        //Esta fileira tem como topo: 9 Copas e Base: 3 Ouro
        fileira1.getPilha().push(carta3Ouro);
        fileira1.getPilha().push(carta11Espada);
        fileira1.getPilha().push(carta1Paus);
        fileira1.getPilha().push(carta9Copas);


        //Montando fileira 2
        Carta carta3Espada = new Carta();
        Carta carta7Ouro = new Carta();
        Carta carta6Paus = new Carta();
        Carta carta8Paus = new Carta();
        carta3Espada.setCarta(3, "ESPADAS");
        carta8Paus.setCarta(8, "PAUS");
        carta7Ouro.setCarta(7, "OURO");
        carta6Paus.setCarta(6, "PAUS");

        //Esta fileira tem como topo: 8 Paus e Base: 3 Espada
        fileira2.getPilha().push(carta3Espada);
        fileira2.getPilha().push(carta8Paus);
        fileira2.getPilha().push(carta7Ouro);
        fileira2.getPilha().push(carta6Paus);



        /*
        Movendo carta8Paus, carta7Ouro e carta6Paus da fileira2 para fileira1, que possui no topo carta9Copas
        MOVIMENTACAO VÁLIDA, pois apesar de 6<7<8<9 e as cartas em sequência estão com cores alternadas
         *
         */
        assertTrue(fileira1.verifyRule(8, "PAUS", fileira2));

    }

    /*
     * Método que testa a movimentação de cartas entre fileiras, a depender do número de células livres
     * Sabe-se que o numero máximo de cartas que podem ser movidas entre fileiras, depende do número
     * de celulas livres
     * 4 celulas livres -> 5 cartas podem ser movidas
     * 3 celulas livres -> 4 cartas podem ser movidas
     * 2 celulas livres -> 3 cartas podem ser movidas
     * 1 celulas livres -> 2 cartas podem ser movidas
     * 0 celulas livre -> 1 carta podem ser movida
     *
     */
    @Test
    public void testeMoverCartasQuandoCelulasOcupadas() {
        //Montando fileira 1
        Carta carta3Ouro = new Carta();
        Carta carta11Espada = new Carta();
        Carta carta1Paus = new Carta();
        Carta carta9Copas = new Carta();
        carta3Ouro.setCarta(3, "OURO");
        carta11Espada.setCarta(11, "ESPADA");
        carta1Paus.setCarta(1, "PAUS");
        carta9Copas.setCarta(9, "COPAS");

        //Esta fileira tem como topo: 9 Copas e Base: 3 Ouro
        fileira1.getPilha().push(carta3Ouro);
        fileira1.getPilha().push(carta11Espada);
        fileira1.getPilha().push(carta1Paus);
        fileira1.getPilha().push(carta9Copas);


        //Montando fileira 2
        Carta carta3Espada = new Carta();
        Carta carta7Ouro = new Carta();
        Carta carta6Paus = new Carta();
        Carta carta8Paus = new Carta();
        carta3Espada.setCarta(3, "ESPADAS");
        carta8Paus.setCarta(8, "PAUS");
        carta7Ouro.setCarta(7, "OURO");
        carta6Paus.setCarta(6, "PAUS");

        //Esta fileira tem como topo: 8 Paus e Base: 3 Espada
        fileira2.getPilha().push(carta3Espada);
        fileira2.getPilha().push(carta8Paus);
        fileira2.getPilha().push(carta7Ouro);
        fileira2.getPilha().push(carta6Paus);


        //Montando celulas ocupadas
        Carta carta2Espada = new Carta();
        Carta carta6Ouro = new Carta();
        Carta carta12Espada = new Carta();
        carta2Espada.setCarta(2, "ESPADA");
        carta6Ouro.setCarta(6, "OURO");
        carta12Espada.setCarta(12, "ESPADA");

        celula1.getPilha().push(carta2Espada);
        celula2.getPilha().push(carta6Ouro);
        celula3.getPilha().push(carta12Espada);




        //Avisando à fileira que há somente 1 carta livre
        fileira2.setQtdMaxCartasMover(1);


        /*
        Movendo carta8Paus, carta7Ouro e carta6Paus da fileira2 para fileira1, que possui no topo carta9Copas
        MOVIMENTACAO INVÁLIDA, pois apesar de 6<7<8<9 e as cartas em sequência estarem com cores alternadas,
         * a quantidade de células livre é 1, o que implica que apenas 2 cartas podem ser movidas
         *
         */
        assertFalse(fileira1.verifyRule(8, "PAUS", fileira2));
    }

}
