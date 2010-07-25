package jogo.classescomum;

import javax.swing.JOptionPane;
import jogo.freecell.Freecell;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrameCardGame.java
 * Interface gráfica do jogo de FreeCell
 *
 * Created on 30/05/2010, 17:08:38
 */
/**
 *
 * @author fernanda & Igo Amauri
 */
public class FrameCardGame extends javax.swing.JFrame {

    Freecell freecell;

    /** Creates new form FrameCardGame */
    public FrameCardGame() {
        initComponents();
        this.startGame();

    }

    private void startGame() {

        freecell = new Freecell();
        freecell.iniciarJogo();
        this.mostrarCartasFileiras();


    }

    private void mostrarCartasFundacoes() {

        String cards = "";
        String value = "";
        String nipe = "";
        String prefixoBlack = "<font color='#000000'>";
        String prefixoRed = "<font color='#CD0000'>";

        for (int j = 0 ; j <= freecell.fundacao1.getPilha().size() - 1; j++) {

            value = String.valueOf(freecell.fundacao1.getPilha().get(j).getNumero());
            nipe = freecell.fundacao1.getPilha().get(j).getNipe();

            painelF1.setContentType("text/html");

            if (nipe.equals("OURO") || nipe.equals("COPAS")) {
                cards += prefixoRed + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            } else {
                cards += prefixoBlack + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            }

        }

        painelF1.setText(cards);
        cards = "";

        for (int j = 0 ; j <= freecell.fundacao2.getPilha().size() - 1; j++) {

            value = String.valueOf(freecell.fundacao2.getPilha().get(j).getNumero());
            nipe = freecell.fundacao2.getPilha().get(j).getNipe();

            painelF2.setContentType("text/html");

            if (nipe.equals("OURO") || nipe.equals("COPAS")) {
                cards += prefixoRed + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            } else {
                cards += prefixoBlack + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            }

        }

        painelF2.setText(cards);
        cards = "";


        for (int j = 0 ; j <= freecell.fundacao3.getPilha().size() - 1; j++) {

            value = String.valueOf(freecell.fundacao3.getPilha().get(j).getNumero());
            nipe = freecell.fundacao3.getPilha().get(j).getNipe();

            painelF3.setContentType("text/html");

            if (nipe.equals("OURO") || nipe.equals("COPAS")) {
                cards += prefixoRed + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            } else {
                cards += prefixoBlack + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            }

        }

        painelF3.setText(cards);
        cards = "";



        for (int j = 0 ; j <= freecell.fundacao4.getPilha().size() - 1; j++) {

            value = String.valueOf(freecell.fundacao4.getPilha().get(j).getNumero());
            nipe = freecell.fundacao4.getPilha().get(j).getNipe();

            painelF4.setContentType("text/html");

            if (nipe.equals("OURO") || nipe.equals("COPAS")) {
                cards += prefixoRed + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            } else {
                cards += prefixoBlack + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            }

        }

        painelF4.setText(cards);
        cards = "";



    }

    private void mostrarCartasFileiras() {


        String cards = "";
        String value = "";
        String nipe = "";
        String prefixoBlack = "<font color='#000000'>";
        String prefixoRed = "<font color='#CD0000'>";

        for (int j = 0; j <= freecell.fileira1.getPilha().size() - 1; j++) {

            value = String.valueOf(freecell.fileira1.getPilha().get(j).getNumero());
            nipe = freecell.fileira1.getPilha().get(j).getNipe();

            painelR1.setContentType("text/html");

            if (nipe.equals("OURO") || nipe.equals("COPAS")) {
                cards += prefixoRed + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            } else {
                cards += prefixoBlack + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            }

        }

        painelR1.setText(cards);
        cards = "";

        for (int j = 0; j <= freecell.fileira2.getPilha().size() - 1; j++) {

            value = String.valueOf(freecell.fileira2.getPilha().get(j).getNumero());
            nipe = freecell.fileira2.getPilha().get(j).getNipe();

            painelR2.setContentType("text/html");

            if (nipe.equals("OURO") || nipe.equals("COPAS")) {
                cards += prefixoRed + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            } else {
                cards += prefixoBlack + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            }

        }

        painelR2.setText(cards);
        cards = "";


        for (int j = 0; j <= freecell.fileira3.getPilha().size() - 1; j++) {

            value = String.valueOf(freecell.fileira3.getPilha().get(j).getNumero());
            nipe = freecell.fileira3.getPilha().get(j).getNipe();

            painelR3.setContentType("text/html");

            if (nipe.equals("OURO") || nipe.equals("COPAS")) {
                cards += prefixoRed + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            } else {
                cards += prefixoBlack + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            }

        }

        painelR3.setText(cards);
        cards = "";



        for (int j = 0; j <= freecell.fileira4.getPilha().size() - 1; j++) {

            value = String.valueOf(freecell.fileira4.getPilha().get(j).getNumero());
            nipe = freecell.fileira4.getPilha().get(j).getNipe();

            painelR4.setContentType("text/html");

            if (nipe.equals("OURO") || nipe.equals("COPAS")) {
                cards += prefixoRed + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            } else {
                cards += prefixoBlack + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            }

        }

        painelR4.setText(cards);
        cards = "";

        for (int j = 0; j <= freecell.fileira5.getPilha().size() - 1; j++) {

            value = String.valueOf(freecell.fileira5.getPilha().get(j).getNumero());
            nipe = freecell.fileira5.getPilha().get(j).getNipe();

            painelR5.setContentType("text/html");

            if (nipe.equals("OURO") || nipe.equals("COPAS")) {
                cards += prefixoRed + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            } else {
                cards += prefixoBlack + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            }

        }

        painelR5.setText(cards);
        cards = "";


        for (int j = 0; j <= freecell.fileira6.getPilha().size() - 1; j++) {

            value = String.valueOf(freecell.fileira6.getPilha().get(j).getNumero());
            nipe = freecell.fileira6.getPilha().get(j).getNipe();

            painelR6.setContentType("text/html");

            if (nipe.equals("OURO") || nipe.equals("COPAS")) {
                cards += prefixoRed + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            } else {
                cards += prefixoBlack + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            }

        }

        painelR6.setText(cards);
        cards = "";

        for (int j = 0; j <= freecell.fileira7.getPilha().size() - 1; j++) {

            value = String.valueOf(freecell.fileira7.getPilha().get(j).getNumero());
            nipe = freecell.fileira7.getPilha().get(j).getNipe();

            painelR7.setContentType("text/html");

            if (nipe.equals("OURO") || nipe.equals("COPAS")) {
                cards += prefixoRed + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            } else {
                cards += prefixoBlack + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            }

        }

        painelR7.setText(cards);
        cards = "";


        for (int j = 0; j <= freecell.fileira8.getPilha().size() - 1; j++) {

            value = String.valueOf(freecell.fileira8.getPilha().get(j).getNumero());
            nipe = freecell.fileira8.getPilha().get(j).getNipe();

            painelR8.setContentType("text/html");

            if (nipe.equals("OURO") || nipe.equals("COPAS")) {
                cards += prefixoRed + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            } else {
                cards += prefixoBlack + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            }

        }

        painelR8.setText(cards);
        cards = "";



    }

    private void mostrarCartasCelulas() {

        String cards = "";
        String value = "";
        String nipe = "";
        String prefixoBlack = "<font color='#000000'>";
        String prefixoRed = "<font color='#CD0000'>";

        for (int j = freecell.celula1.getPilha().size() - 1; j >= 0; j--) {

            value = String.valueOf(freecell.celula1.getPilha().get(j).getNumero());
            nipe = freecell.celula1.getPilha().get(j).getNipe();

            painelC1.setContentType("text/html");

            if (nipe.equals("OURO") || nipe.equals("COPAS")) {
                cards += prefixoRed + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            } else {
                cards += prefixoBlack + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            }

        }

        painelC1.setText(cards);
        cards = "";

        for (int j = freecell.celula2.getPilha().size() - 1; j >= 0; j--) {

            value = String.valueOf(freecell.celula2.getPilha().get(j).getNumero());
            nipe = freecell.celula2.getPilha().get(j).getNipe();

            painelC2.setContentType("text/html");

            if (nipe.equals("OURO") || nipe.equals("COPAS")) {
                cards += prefixoRed + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            } else {
                cards += prefixoBlack + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            }

        }

        painelC2.setText(cards);
        cards = "";


        for (int j = freecell.celula3.getPilha().size() - 1; j >= 0; j--) {

            value = String.valueOf(freecell.celula3.getPilha().get(j).getNumero());
            nipe = freecell.celula3.getPilha().get(j).getNipe();

            painelC3.setContentType("text/html");

            if (nipe.equals("OURO") || nipe.equals("COPAS")) {
                cards += prefixoRed + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            } else {
                cards += prefixoBlack + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            }

        }

        painelC3.setText(cards);
        cards = "";



        for (int j = freecell.celula4.getPilha().size() - 1; j >= 0; j--) {

            value = String.valueOf(freecell.celula4.getPilha().get(j).getNumero());
            nipe = freecell.celula4.getPilha().get(j).getNipe();

            painelC4.setContentType("text/html");

            if (nipe.equals("OURO") || nipe.equals("COPAS")) {
                cards += prefixoRed + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            } else {
                cards += prefixoBlack + value + nipe + "</font>" + this.fillLineofTextPane(value + nipe);
            }

        }

        painelC4.setText(cards);
        cards = "";



    }


    public String fillLineofTextPane(String valueENipe) {


        String retorno = "";
        int delimitador = 0;

        if (valueENipe.length() == 1) {
            delimitador = 13;
        }


        if (valueENipe.length() == 9) {
            delimitador = 4;
        }

        //ok
        if (valueENipe.length() == 8) {
            delimitador = 6;
        }

        if (valueENipe.length() == 7) {
            delimitador = 8;
        }

        //ok
        if (valueENipe.length() == 6) {
            delimitador = 10;
        }


        if (valueENipe.length() == 5) {
            delimitador = 12;
        }


        for (int i = 0; i < delimitador; i++) {
            retorno += "&nbsp;";

        }


        return retorno;

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        painelF1 = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelF2 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        painelF4 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        painelF3 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        painelC1 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        painelR7 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        painelR5 = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        painelR4 = new javax.swing.JTextPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        painelR1 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        painelR2 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        painelR3 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        painelR6 = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        painelR8 = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        painelC2 = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        painelC3 = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        painelC4 = new javax.swing.JTextPane();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        value = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        combo1 = new javax.swing.JComboBox();
        combo2 = new javax.swing.JComboBox();
        nipe = new javax.swing.JComboBox();
        mensagem = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patience Game");
        setBackground(new java.awt.Color(115, 170, 114));

        jPanel1.setBackground(new java.awt.Color(27, 121, 95));

        painelF1.setEditable(false);
        painelF1.setForeground(new java.awt.Color(15, 17, 14));
        jScrollPane13.setViewportView(painelF1);

        painelF2.setEditable(false);
        jScrollPane1.setViewportView(painelF2);

        painelF4.setEditable(false);
        jScrollPane2.setViewportView(painelF4);

        painelF3.setEditable(false);
        jScrollPane3.setViewportView(painelF3);

        painelC1.setEditable(false);
        jScrollPane4.setViewportView(painelC1);

        painelR7.setEditable(false);
        jScrollPane5.setViewportView(painelR7);

        painelR5.setEditable(false);
        jScrollPane7.setViewportView(painelR5);

        painelR4.setEditable(false);
        painelR4.setForeground(new java.awt.Color(15, 17, 14));
        jScrollPane14.setViewportView(painelR4);

        painelR1.setEditable(false);
        painelR1.setForeground(new java.awt.Color(15, 17, 14));
        jScrollPane15.setViewportView(painelR1);

        painelR2.setEditable(false);
        jScrollPane8.setViewportView(painelR2);

        painelR3.setEditable(false);
        jScrollPane9.setViewportView(painelR3);

        jLabel1.setText("Fi1");

        jLabel2.setText("Fi2");

        jLabel3.setText("Fi3");

        jLabel4.setText("Fi4");

        jLabel5.setText("Fi5");

        jLabel6.setText("Fi6");

        jLabel8.setText("Fund1");

        jLabel9.setText("Fund3");

        jLabel10.setText("Fund2");

        jLabel11.setText("Fund4");

        jLabel12.setText("Cel1");

        painelR6.setEditable(false);
        jScrollPane6.setViewportView(painelR6);

        painelR8.setEditable(false);
        jScrollPane10.setViewportView(painelR8);

        painelC2.setEditable(false);
        jScrollPane11.setViewportView(painelC2);

        painelC3.setEditable(false);
        jScrollPane12.setViewportView(painelC3);

        painelC4.setEditable(false);
        jScrollPane16.setViewportView(painelC4);

        jLabel17.setText("Cel2");

        jLabel18.setText("Cel3");

        jLabel19.setText("Cel4");

        jLabel7.setText("Fi7");

        jLabel16.setText("Fi8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel12)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel17)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel18)
                                .addGap(39, 39, 39)))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel19)
                        .addGap(45, 45, 45)))
                .addGap(227, 227, 227)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel8)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel10)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel9)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel11)
                        .addGap(58, 58, 58)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(92, 92, 92)
                .addComponent(jLabel2)
                .addGap(107, 107, 107)
                .addComponent(jLabel3)
                .addGap(94, 94, 94)
                .addComponent(jLabel4)
                .addGap(96, 96, 96)
                .addComponent(jLabel5)
                .addGap(90, 90, 90)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel16)
                            .addComponent(jLabel7))))
                .addGap(33, 33, 33))
        );

        jLabel13.setText("Card");

        jLabel14.setText("From");

        jLabel15.setText("To");

        jButton1.setText("Move");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        combo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cel1", "Cel2", "Cel3", "Cel4", "Fi1", "Fi2", "Fi3", "Fi4", "Fi5", "Fi6", "Fi7", "Fi8", "Fund1", "Fund2", "Fund3", "Fund4" }));

        combo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fi1", "Fi2", "Fi3", "Fi4", "Fi5", "Fi6", "Fi7", "Fi8", "Fund1", "Fund2", "Fund3", "Fund4", "Cel1", "Cel2", "Cel3", "Cel4" }));

        nipe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ESPADA", "PAUS", "COPAS", "OURO", " " }));

        jMenuBar1.setBackground(new java.awt.Color(115, 170, 114));

        jMenu1.setText("Game");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem1.setText("New Game");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jButton1)
                    .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (!freecell.moveCard(Integer.parseInt(value.getText()), nipe.getSelectedItem().toString(), combo1.getSelectedItem().toString(), combo2.getSelectedItem().toString())) {
            mensagem.setText("Movimento inválido!");
        } else {
            mensagem.setText("");
        }

        this.mostrarCartasFundacoes();
        this.mostrarCartasCelulas();
        this.mostrarCartasFileiras();


        if (freecell.fileira1.getPilha().size() + freecell.fileira2.getPilha().size()
                + freecell.fileira3.getPilha().size() + freecell.fileira4.getPilha().size()
                + freecell.fileira5.getPilha().size() + freecell.fileira6.getPilha().size()
                + freecell.fileira7.getPilha().size() + freecell.fileira8.getPilha().size()
                + freecell.celula1.getPilha().size() + freecell.celula2.getPilha().size()
                + freecell.celula3.getPilha().size() + freecell.celula4.getPilha().size() == 0) {
            JOptionPane.showMessageDialog(this, "             Você ganhou!!!", "Parabéns", DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.startGame();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed
//    /**
//    * @param args the command line arguments
//    */
//    public static void main(String args[]) {
//
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo1;
    private javax.swing.JComboBox combo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField mensagem;
    private javax.swing.JComboBox nipe;
    private javax.swing.JTextPane painelC1;
    private javax.swing.JTextPane painelC2;
    private javax.swing.JTextPane painelC3;
    private javax.swing.JTextPane painelC4;
    public static javax.swing.JTextPane painelF1;
    private javax.swing.JTextPane painelF2;
    private javax.swing.JTextPane painelF3;
    private javax.swing.JTextPane painelF4;
    public static javax.swing.JTextPane painelR1;
    private javax.swing.JTextPane painelR2;
    private javax.swing.JTextPane painelR3;
    public static javax.swing.JTextPane painelR4;
    private javax.swing.JTextPane painelR5;
    private javax.swing.JTextPane painelR6;
    private javax.swing.JTextPane painelR7;
    private javax.swing.JTextPane painelR8;
    private javax.swing.JTextField value;
    // End of variables declaration//GEN-END:variables
}
