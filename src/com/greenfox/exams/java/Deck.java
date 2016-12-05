package com.greenfox.exams.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Rita on 2016.12.05..
 */
public class Deck {
    ArrayList<String> colors = new ArrayList<>(Arrays.asList("karo","kor","treff","pikk"));
    ArrayList<Integer> values = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    String color;
    int value;

    ArrayList<Card> cards;
    Random random = new Random();

    public void newDeck() {
        cards = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            color = colors.get(random.nextInt(colors.size()));
            value = values.get(random.nextInt(values.size()));
            cards.add(i,new Card(color, value));
//            System.out.println(Card.toString(cards.get(i)));
        }
        Collections.shuffle(cards);
    }
}
