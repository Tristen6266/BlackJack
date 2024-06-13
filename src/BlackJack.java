
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
    int cardWidth = 110; 
    int cardHeight = 154;

    JFrame frame = new JFrame("Black Jack");
    JPanel gamePanel = new JPanel() {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
        }
         {
           
            Image hiddenCardImg = new ImageIcon(getClass().getResource("./cards/BACK.png")).getImage();
            if (!stayButton.isEnabled()) {
                hiddenCardImg = new ImageIcon(getClass().getResource(hiddenCard.getImagePath())).getImage();
            }
            g.drawImage(hiddenCardImg, 20, 20, cardWidth, cardHeight, null);
    }
    for (int i = 0; i < dealerHand.size(); i++) {
        Card card = dealerHand.get(i);
        Image cardImg = new ImageIcon(getClass().getResource(card.getImagePath())).getImage();
        g.drawImage(cardImg, cardWidth + 25 + (cardWidth + 5)*i, 20, cardWidth, cardHeight, null);
    }
    for (int i = 0; i < playerHand.size(); i++) {
        Card card = playerHand.get(i);
        Image cardImg = new ImageIcon(getClass().getResource(card.getImagePath())).getImage();
        g.drawImage(cardImg, 20 + (cardWidth + 5)*i, 320, cardWidth, cardHeight, null);
    }
    };
    if (!stayButton.isEnabled()) {
        dealerSum = reduceDealerAce();
        playerSum = reducePlayerAce();
        System.out.println("STAY: ");
        System.out.println(dealerSum);
        System.out.println(playerSum);
        String message = "";
        if (playerSum > 21) {
            message = "You Lose!";
        }
        else if (dealerSum > 21) {
            message = "You Win!";
        }
        else if (playerSum == dealerSum) {
            message = "Tie!";
        }
        else if (playerSum > dealerSum) {
            message = "You Win!";
        }
        else if (playerSum < dealerSum) {
            message = "You Lose!";
        }

g.setFont(new Font("Arial", Font.PLAIN, 30));
g.setColor(Color.white);
g.drawString(message, 220, 250);

} catch (Exception e) {
e.printStackTrace();
}
};
