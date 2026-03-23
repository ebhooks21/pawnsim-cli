/**
 * Filename: Player.java
 * Author: Eric Hooks, 2026
 * Purpose: To define the Player.
 */
public class Player {
    //Variable for the player's name
    private String playerName;

    //Variable for the player's shop name
    private String pawnShopName;

    //Variable for the player's money
    private double shopMoney;

    /**
     * Main constructor for the player class.
     */
    public Player(String pName, String sName) {
        playerName = pName;
        pawnShopName = sName;
        shopMoney = 0.00;
    }

    /**
     * Method to get the player's name.
     */
    public String getPlayerName() {
        return playerName;
    }
}
