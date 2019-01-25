/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 *
 * @author Ali Hassan
 */
public class Card {
    private String suit;
    private int value;

    public Card(String suit, int value) {
        if(suit.toUpperCase().equals("HEARTS")||suit.toUpperCase().equals("DIAMOND")||suit.toUpperCase().equals("CLUBS")||suit.toUpperCase().equals("SPADES")){
        this.suit = suit;
        }else{
            System.out.println("That is not a type of card!");
        }
        if(value>= 1 && value<=13){
        this.value = value;
        }else{
            System.out.println("That is not a type of card number!");
        }
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
}
