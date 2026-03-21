/**
 * Filename: Game.java
 * Author: Eric Hooks, 2026
 * Purpose: Main class for the Game.
 */

import com.googlecode.lanterna.terminal.Terminal;

public class Game {
	//Variable for the game window
	private Window win;

	/**
	 * Main constructor for the Game class.
	 */
	public Game() {
		//Start the game
		win = new Window(800, 600);
	}

	/**
	 * Method to get the window object.
	 */
	public Window getWindow() {
		return win;
	}
}
