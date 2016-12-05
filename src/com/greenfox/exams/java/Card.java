package com.greenfox.exams.java;

/**
 * Created by Rita on 2016.12.05..
 */
public class Card {

    private String color;
    private int value;


    public Card(String color, int value) {
        this.color = color;
        this.value = value;
    }

    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Card{" +
                "color='" + color + '\'' +
                ", value=" + value +
                '}';
    }
}
