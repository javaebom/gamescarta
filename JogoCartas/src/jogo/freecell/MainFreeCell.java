/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.freecell;

import jogo.classescomum.FrameCardGame;

/**
 *
 * @author Fernanda
 */
public class MainFreeCell {

    public static void main(String[] args) {
        // TODO code application logic here

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrameCardGame().setVisible(true);


            }
        });




    }
}
