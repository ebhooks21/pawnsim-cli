/**
 * Filename: Game.java
 * Author: Eric Hooks, 2026
 * Purpose: Main class for the Game.
 */

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Game {
	//Variable for the game window
	private Window win;

	//Variable for the player
	private Player player;

	/**
	 * Main constructor for the Game class.
	 */
	public Game() throws IOException {
		//Start the game
		win = new Window(800, 600);

		player = new Player("Burlus", "Burlus' Shop");

		win.drawPlayerInfoArea(player);
	}

	/**
	 * Method to get the window object.
	 */
	public Window getWindow() {
		return win;
	}
}
