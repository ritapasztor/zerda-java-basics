package com.greenfox.exams.java;

import javax.swing.*;

/**
 * Created by Rita on 2016.12.05..
 */
public class BlackJack extends JFrame{
    private JButton reset, drawCard;
    private JLabel userLabel, houseLabel;

    private int userCards, houseCards;

    public BlackJack(){
        setUpPanel();

        setTitle("BlackJack application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setResizable(false);
        setVisible(true);
    }

    private void setUpPanel() {
        JPanel panel = new JPanel();
        this.add(panel);

        userLabel = new JLabel("User played: ");
        panel.add(userLabel);
        houseLabel = new JLabel("House played: ");
        panel.add(houseLabel);

        reset = new JButton("New Game");
        panel.add(reset);

        drawCard = new JButton("Draw a drawcard");
        panel.add(drawCard);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BlackJack();
            }
        });
    }

}
