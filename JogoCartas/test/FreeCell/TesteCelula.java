/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FreeCell;

import jogo.freecell.Celula;

import jogo.classescomum.Carta;
import jogo.classescomum.Fileira;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe de Teste para validar metodos da classe Celular
 * @author Fernanda e Igo
 */
public class TesteCelula {

    Celula celula1 = new Celula();
    Celula celula2 = new Celula();
    Celula celula3 = new Celula();
    Celula celula4 = new Celula();
    Fileira fileiraTeste = new Fileira();

    public TesteCelula() {
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

    /*
     *Metodo que testa o envio de uma carta para celula vazia: MOVIMENTACAO VALIDA
     */
    @Test
    public void testeEnviarCartaParaCelulaVazia() {

        Carta carta6Copas = new Carta();
        Carta carta3Espada = new Carta();
        Carta carta4Espada = new Carta();
        Carta carta10Ouro = new Carta();
        Carta carta2Paus = new Carta();
        Carta carta3Ouro = new Carta();

        carta6Copas.setCarta(6, "COPAS");
        carta3Espada.setCarta(3, "ESPADA");
        carta4Espada.setCarta(4, "ESPADA");
        carta10Ouro.setCarta(10, "OURO");
        carta2Paus.setCarta(2, "PAUS");
        carta3Ouro.setCarta(3, "OURO");


        /*Montado pilha de onde vai ser retirada carta do topo
         *  para ser enviada a uma celula vazia -> Topo: carta6Copas / Base: carta3Ouro
         */
        fileiraTeste.getPilha().push(carta3Ouro);
        fileiraTeste.getPilha().push(carta2Paus);
        fileiraTeste.getPilha().push(carta10Ouro);
        fileiraTeste.getPilha().push(carta4Espada);
        fileiraTeste.getPilha().push(carta3Espada);
        fileiraTeste.getPilha().push(carta6Copas);

        /*Enviando topo da pilha de fileira para a celula vazia celula2
         * valor:6, nipe: copas, pilhaOrigem:fileiraTeste, pilhaDestino:celula2
         */
        celula2.verifyRule(6, "COPAS", fileiraTeste);

        //Agora celula2 possui carta6Copas
        assertEquals(carta6Copas, celula2.getPilha().get(0));

        //Observe que agora a fileiraTeste tem somente 5 cartas
        assertEquals(5, fileiraTeste.getPilha().size());


    }

    /*
     *Metodo que testa o envio de mais de uma carta para celula vazia: MOVIMENTACAO INVÁLIDA
     */
    @Test
    public void testeEnviarCartasParaCelulaVazia() {


        Carta carta6Copas = new Carta();
        Carta carta3Espada = new Carta();
        Carta carta4Espada = new Carta();
        Carta carta10Ouro = new Carta();
        Carta carta2Paus = new Carta();
        Carta carta3Ouro = new Carta();

        carta6Copas.setCarta(6, "COPAS");
        carta3Espada.setCarta(3, "ESPADA");
        carta4Espada.setCarta(4, "ESPADA");
        carta10Ouro.setCarta(10, "OURO");
        carta2Paus.setCarta(2, "PAUS");
        carta3Ouro.setCarta(3, "OURO");


        /*Montado pilha de onde vai ser retirada carta do topo
         *  para ser enviada a uma celula vazia -> Topo: carta6Copas / Base: carta3Ouro
         */
        fileiraTeste.getPilha().push(carta3Ouro);
        fileiraTeste.getPilha().push(carta2Paus);
        fileiraTeste.getPilha().push(carta10Ouro);
        fileiraTeste.getPilha().push(carta4Espada);
        fileiraTeste.getPilha().push(carta3Espada);
        fileiraTeste.getPilha().push(carta6Copas);

        /*Enviando 3 cartas de fileira para a celula vazia celula2
         * valor:6, nipe: copas
         * valor:3, nipe: espada
         * valor:4, nipe: espada
         * MOVIMENTACAO INVÁLIDA
         */
        assertFalse(celula2.verifyRule(4, "ESPADA", fileiraTeste));

        //Não foi inserida nenhuma carta na celula2
        assertEquals(0, celula2.getPilha().size());

        //Observe que a fileiraTeste continua com 6 cartas
        assertEquals(6, fileiraTeste.getPilha().size());
    }

    /*
     *Metodo que testa o envio de uma carta para celula ocupada: MOVIMENTACAO INVÁLIDA
     */
    @Test
    public void testeEnviarCartaParaCelulaOcupada() {


        Carta carta6Copas = new Carta();
        Carta carta3Espada = new Carta();
        Carta carta4Espada = new Carta();
        Carta carta10Ouro = new Carta();
        Carta carta2Paus = new Carta();
        Carta carta3Ouro = new Carta();

        carta6Copas.setCarta(6, "COPAS");
        carta3Espada.setCarta(3, "ESPADA");
        carta4Espada.setCarta(4, "ESPADA");
        carta10Ouro.setCarta(10, "OURO");
        carta2Paus.setCarta(2, "PAUS");
        carta3Ouro.setCarta(3, "OURO");

        Carta carta7Paus = new Carta();
        carta7Paus.setCarta(7, "Paus");

        //Celula de destino ja possui uma carta
        celula2.getPilha().push(carta7Paus);


        /*Montado pilha de onde vai ser retirada carta do topo
         *  para ser enviada a uma celula vazia -> Topo: carta6Copas / Base: carta3Ouro
         */
        fileiraTeste.getPilha().push(carta3Ouro);
        fileiraTeste.getPilha().push(carta2Paus);
        fileiraTeste.getPilha().push(carta10Ouro);
        fileiraTeste.getPilha().push(carta4Espada);
        fileiraTeste.getPilha().push(carta3Espada);
        fileiraTeste.getPilha().push(carta6Copas);

        /*Enviando carta de fileira para a celula ocupada celula2
         * valor:6, nipe: copas
         * MOVIMENTACAO INVÁLIDA
         */
        assertFalse(celula2.verifyRule(6, "COPAS", fileiraTeste));

        //Não foi inserida nenhuma carta na celula2
        assertEquals(1, celula2.getPilha().size());

        //Observe que a fileiraTeste continua com 6 cartas
        assertEquals(6, fileiraTeste.getPilha().size());
    }
}
