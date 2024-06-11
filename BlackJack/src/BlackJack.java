
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class BlackJack {
   
    private class Card {
        String value;
        String type;



public String toString() {
    return value + "-" + type;
}

public int getValue() {
    if ("AJQK".contains(value)) { //A J Q K
        if (value == "A") {
            return 11;
        }
        return 10;
    }
    return Integer.parseInt(value); //2-10
}
public Boolean isAce(){
    return value=="A";
}
public String getImage(){
    return "./cards/" + toString() + ".png";
       
}
    
}
ArrayList<Card> deck;
    Random random = new Random();

    Card hiddenCard;
    ArrayList<Card> dealerHand;
    int dealerSum;
    int dealerAceCount;

    ArrayList<Card> playerHand;
    int playerSum;
    int playerAceCount;

    int boardWidth = 600;
    int boardHeight = boardWidth;
}